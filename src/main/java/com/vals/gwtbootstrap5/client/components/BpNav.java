package com.vals.gwtbootstrap5.client.components;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.vals.gwtbootstrap5.client.misc.BpComponent;
import com.vals.gwtbootstrap5.client.misc.StyleUtl;

public class BpNav implements BpComponent<BpNav> {
	
	public static final String NAVBAR = "navbar";
	public static final String NAVBAR_EXPAND_LG = "navbar-expand-lg";
	public static final String NAVBAR_LIGHT = "navbar-light";
	public static final String BG_LIGHT = "bg-light";
	public static final String NAV = "nav";
	public static final String NAV_TABS = "nav-tabs";
	
	private Element e;
	
	public BpNav(String cssClass) {
		e = Document.get().createElement("nav");
		StyleUtl.cssClass(e, cssClass);
	}
	
	@Override
	public Element getElement() {
		return e;
	}
	
	public static BpNav create(String cssClass) {
		return new BpNav(cssClass);
	}

}
