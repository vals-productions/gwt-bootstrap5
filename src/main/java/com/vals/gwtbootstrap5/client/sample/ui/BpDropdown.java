package com.vals.gwtbootstrap5.client.sample.ui;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.HRElement;
import com.google.gwt.dom.client.LIElement;
import com.google.gwt.dom.client.UListElement;
import com.vals.gwtbootstrap5.client.components.BpButton;
import com.vals.gwtbootstrap5.client.components.BpDiv;
import com.vals.gwtbootstrap5.client.misc.AssemblyUtl;
import com.vals.gwtbootstrap5.client.misc.BpFactory;
import com.vals.gwtbootstrap5.client.misc.HasElement;
import com.vals.gwtbootstrap5.client.misc.StyleUtl;

public class BpDropdown implements HasElement  {
	
	private static final String DROPDOWN = "dropdown";
	
	public static final String DROPDOWN_TOGGLE = "dropdown-toggle";
	public static final String DROPDOWN_MENU = "dropdown-menu";
	public static final String DROPDOWN_ITEM = "dropdown-item";

	private BpDiv btnGroupDiv = BpDiv.create(DROPDOWN);
	private UListElement menuList;
	private BpButton actionElement;
	
	public BpDropdown(String dropdownIconName, String buttonStyle) {
		btnGroupDiv = BpDiv.create(DROPDOWN);
		
		actionElement = BpButton.create(
				StyleUtl.concat(buttonStyle, BpButton.BTN_SM , DROPDOWN_TOGGLE), 
				null, dropdownIconName);
		
		StyleUtl.attribs(actionElement, 
				"type", "button", 
				"data-bs-toggle", DROPDOWN,
				"aria-expanded", "false");
		
		menuList = BpFactory.LI.getUlElement(DROPDOWN_MENU);
		
		btnGroupDiv.with(actionElement, menuList);
	}

	public void addItem(Element item) {
		StyleUtl.addCssClass(item, DROPDOWN_ITEM);
		
		LIElement listEl = BpFactory.LI.getLiElement();
		
		AssemblyUtl.nest(listEl, item);
		AssemblyUtl.nest(menuList, listEl);
		
	}
	
	public void addDivider() {
		LIElement listEl = BpFactory.LI.getLiElement();
		
		HRElement hr = Document.get().createHRElement();
		
		StyleUtl.cssClass(hr, "dropdown-divider");
		
		AssemblyUtl.nest(listEl, hr);
		AssemblyUtl.nest(menuList, listEl);
	}
	
	public void setIcon(String iconName) {
		StyleUtl.cssClass(actionElement.getIcon().getElement(), iconName);
	}
	
	public void clearItems() {
		menuList.removeAllChildren();
	}
	
	@Override
	public Element getElement() {
		return btnGroupDiv.getElement();
	}

}
