package com.vals.gwtbootstrap5.client.misc;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

import elemental2.dom.HTMLElement;
import jsinterop.base.Js;

/**
 * This Utility class manages adding GWT widgets and
 * Elements.
 * 
 */
public class AssemblyUtl {
	
	/** 
	 * Adds leafObjects to the rootObject.
	 * 
	 * <pre>
	 * Root
	 *  Leaf 1
	 *  Leaf 2
	 *  ...
	 * </pre>
	 * 
	 * @param rootObject
	 * @param leafObjects
	 * @return
	 */
	public static Object tree(Object rootObject, Object...leafObjects) {
		Object returnObject = rootObject;
		for (int i = 0; i < leafObjects.length; i++) {
			add(returnObject, leafObjects[i]);
		}
		return returnObject;
	}
	
	/**
	 * Nests object in the below way: 
	 * <pre>
	 * First
	 *   Second
	 *     Third
	 *        ....
	 * </pre>
	 */
	public static Object nest(Object...objects) {
		Object returnObject = objects[0];
		for (int i = 0; i < objects.length - 1; i++) {
			Object obj1 = objects[i];
			Object obj2 = objects[i + 1];
			add(obj1, obj2);
		}
		return returnObject;
	}
	
	/**
	 * @param container1
	 * @param container2
	 * @return
	 */
	private static Object add(Object container1, Object container2) {
		if (container2 instanceof Element || container2 instanceof HasElement) {
			/**
			 * If 2nd param is a container, we 
			 * use appendChild way.
			 */
			Element e1 = getElement(container1);
			Element e2 = getElement(container2);
			e1.appendChild(e2);
			return container1;
		} 
		
		if (container1 instanceof HasWidgets && container2 instanceof Widget) {
			HasWidgets p1 = (HasWidgets) container1;
			p1.add((Widget)container2);
			return container1;
		}
				
		if (container1 instanceof Element || container1 instanceof HasElement) {
			Element e1 = getElement(container1);
			Element e2 = getElement(container2);
			e1.appendChild(e2);
			return container1;
		}
		
		return container1;
	}
	
	private static Element getElement(Object o) {
		if (o instanceof Element) {
			return (Element)o;
		} else if (o instanceof Widget) {
			Widget p = (Widget)o;
			return p.getElement();
		} else if (o instanceof HasElement) {
			return ((HasElement) o).getElement();
		}
		return null;
	}
	
	public static Element asElement(HTMLElement e2) {
		return Js.<com.google.gwt.dom.client.Element>uncheckedCast(e2);
	}
	
	public static boolean hasChild(Element parent, Element child) {
		for (int i = 0; i < parent.getChildCount(); i++) {
			Node node = parent.getChild(i);
			if (node.equals(child)) {
				return true;
			}
		}
		return false;
	}

}
