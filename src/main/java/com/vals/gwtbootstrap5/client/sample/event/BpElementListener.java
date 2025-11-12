package com.vals.gwtbootstrap5.client.sample.event;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.EventListener;

/**
 * This is a sample class on how events could be handled.
 * 
 * Due to GWT level widgets as well as element low level
 * widgets allowed to be mixed / nested, this way of 
 * event intercept works best. 
 */
public class BpElementListener  {

	private boolean isListenerSet = false;
	private Map<Integer, List<Consumer<Event>>> eventMap = new HashMap<>();
	private int eventBits = 0;
	private Element e;
	private Date lastClickTime = null;
	public BpElementListener(Element e) {
		this.e = e;
	}

	public void add(int type, Consumer<Event> consumer) {
//		GWT.log("listener added: " + type);
		eventBits |= type;
		Event.sinkEvents(e, eventBits);
		if (!isListenerSet) {
			isListenerSet = true;
			Event.setEventListener(e, new EventListener() {
				
				@Override
				public void onBrowserEvent(Event event) {
					
//					GWT.log("event received: " + event.getType());
					if (eventMap.containsKey(event.getTypeInt())) {
						Date currentTime = new Date();
						if (lastClickTime == null || 
								currentTime.getTime() - lastClickTime.getTime() > 500) {
							lastClickTime = currentTime;
							List<Consumer<Event>> consumers = eventMap.get(event.getTypeInt());
	//						GWT.log("event propagated: " + event.getType() + "consumer count: " + consumers.size());
							consumers.forEach(c -> {
	//							GWT.log("event dispatched to consumer");
								c.accept(event);
							});
						}
					}
				}
			});
		}
		eventMap.computeIfAbsent(type, (key) -> new LinkedList<>()).add(consumer);
		
//		GWT.log("BpElementListener: listener added, for evt type: " + type + ", consumer count: " + eventMap.get(type).size());
	}
	
	
	/**
	 * Adds event listener to an element
	 *  
	 * @param e
	 * @param type com.google.gwt.user.client.Event
	 * @param consumer
	 * @return
	 */
	public static BpElementListener addEvent(Element e, int type, Consumer<Event> consumer) {
		BpElementListener listener = new BpElementListener(e);
		listener.add(type, (evt) -> consumer.accept(evt));
		return listener;
	}
	
	public static BpElementListener onClick(Element e, Consumer<Event> consumer) {
		BpElementListener listener = new BpElementListener(e);
		listener.add(Event.ONCLICK, (evt) -> consumer.accept(evt));
		return listener;
	}

}
