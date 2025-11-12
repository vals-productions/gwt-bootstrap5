package com.vals.gwtbootstrap5.client.components;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Widget;
import com.vals.gwtbootstrap5.client.misc.AssemblyUtl;
import com.vals.gwtbootstrap5.client.misc.BpComponent;
import com.vals.gwtbootstrap5.client.misc.StyleUtl;

/**
 * Anchor element
 */
public class BpA extends Anchor implements BpComponent<BpA> {
	
	public static final String CARD_LINK = "card-link";
	public static final String NAVBAR_BRAND = "navbar-brand";
	public static final String NAV_ITEM = "nav-item";
	public static final String NAV_LINK = "nav-link";
	public static final String ACTIVE = "active";
	public static final String DISABLED = "disabled";
	public static final String DROPDOWN_TOGGLE = "dropdown-toggle";
	public static final String DROPDOWN_ITEM = "dropdown-item";
	public static final String DROPDOWN = "dropdown";
	public static final String DATA_BS_TOGGLE = "data-bs-toggle";
	public static final String AREA_EXPANDED = "area-expanded";
	
	public BpA(String cssStyle) {
		super(false);
		this.getElement().removeAttribute("href");
		StyleUtl.cssClass(this, cssStyle);
	}
	
	public BpA(String cssStyle, String text) {
		super(text);
		this.getElement().removeAttribute("href");
		StyleUtl.cssClass(this, cssStyle);
	}
	
	public BpA(String cssStyle, BpI icon, Widget textElement) {
		super(false);
		this.getElement().removeAttribute("href");
		AssemblyUtl.tree(this, icon, textElement);
		StyleUtl.cssClass(this, cssStyle);
	}

	public BpA(String cssStyle, BpI icon, Element textElement) {
		super(false);
		this.getElement().removeAttribute("href");
		AssemblyUtl.tree(this, icon, textElement);
		StyleUtl.cssClass(this, cssStyle);
	}
	
	public static BpA create(String cssStyle) {
		return new BpA(cssStyle);
	}
	
	public static BpA create(String cssStyle, String text) {
		return new BpA(cssStyle, text);
	}
	
	public static BpA create(String cssStyle, BpI icon, Widget textElement) {
		return new BpA(cssStyle, icon, textElement);
	}

}
