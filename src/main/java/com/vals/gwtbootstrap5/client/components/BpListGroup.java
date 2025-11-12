package com.vals.gwtbootstrap5.client.components;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.LIElement;
import com.google.gwt.dom.client.UListElement;
import com.vals.gwtbootstrap5.client.misc.AssemblyUtl;
import com.vals.gwtbootstrap5.client.misc.BpFactory;
import com.vals.gwtbootstrap5.client.misc.BpComponent;
import com.vals.gwtbootstrap5.client.misc.HasElement;
import com.vals.gwtbootstrap5.client.misc.StyleUtl;

public class BpListGroup implements HasElement, BpComponent<BpListGroup> {
	
	public static final String LIST_GROUP = "list-group";
	public static final String LIST_GROUP_ITEM = "list-group-item";
	
	public static final String LIST_GROUP_ITEM_WARNING = "list-group-item-warning";
	public static final String LIST_GROUP_ITEM_DANGER = "list-group-item-danger";
	public static final String LIST_GROUP_ITEM_SUCCESS = "list-group-item-success";
	
	private UListElement listElement;
	
	private List<LIElement> listItems = new LinkedList<>();
	private Map<String, List<LIElement>> elementsByText = new HashMap<>();
	
	public BpListGroup(String cssClass) {
		listElement = BpFactory.LI.getUlElement(cssClass);
	}
	
	public LIElement addItem(String titleText, String... cssClass) {
		LIElement li = BpFactory.LI.getLiElement(StyleUtl.concat(cssClass));
		AssemblyUtl.tree(li, BpFactory.TEXT.getTextElement(titleText));
		AssemblyUtl.tree(listElement, li);
		listItems.add(li);
		elementsByText.computeIfAbsent(titleText, (key) -> new LinkedList<>()).add(li);
		return li;
	}
	
	public void clearItems() {
		listItems.clear();
		listElement.removeAllChildren();
		elementsByText.clear();
	}

	@Override
	public Element getElement() {
		return listElement;
	}

	public Map<String, List<LIElement>> getElementsByText() {
		return elementsByText;
	}

	public List<LIElement> getListItems() {
		return listItems;
	}
	
}
