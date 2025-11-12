package com.vals.gwtbootstrap5.client.misc;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Widget;
import com.vals.gwtbootstrap5.client.components.BpButton;

import elemental2.dom.HTMLElement;

/**
 * This facilitates CSS class and  
 * properties applications.
 */
public class StyleUtl {

	public static Element addCssClass(Element el, String... classes) {
		el.addClassName(String.join(" ", classes));
		return el;
	}

	public static HTMLElement addCssClass(HTMLElement el, String name) {
		el.classList.add(name);
		return el;
	}
		
	public static Widget addCssClass(Widget w, String... classes) {
		w.addStyleName(String.join(" ", classes));
		return w;
	}

	public static String concat(String... styles) {
		return String.join(" ", styles);
	}

	public static Element cssClass(Element el, String... classes) {
		el.setClassName(String.join(" ", classes));
		return el;
	}

	public static Widget cssClass(Widget w, String name) {
		w.setStyleName(name);
		return w;
	}

	public static Element delCssClass(Element el, String name) {
		el.removeClassName(name);
		return el;
	}

	public static Widget delCssClass(Widget w, String name) {
		w.removeStyleName(name);
		return w;
	}

	public static Element cssProp(Element el, String... styles) {
		for (int i = 0; i < styles.length; i+= 2) {
			el.getStyle().setProperty(styles[i], styles[i + 1]);			
		}
		return el;
	}

	public static HTMLElement cssProp(HTMLElement el, String... styles) {
		for (int i = 0; i < styles.length; i+= 2) {
			el.style.setProperty(styles[i], styles[i + 1]);			
		}
		return el;
	}

	public static Widget cssProp(Widget w, String... styles) {
		for (int i = 0; i < styles.length; i+= 2) {
			w.getElement().getStyle().setProperty(styles[i], styles[i + 1]);			
		}
		return w;
	}
	
	public static Element attribs(Element el, String... styles) {
		for (int i = 0; i < styles.length; i+= 2) {
			el.setAttribute(styles[i], styles[i + 1]);			
		}
		return el;
	}
	
	public static Widget attribs(Widget w, String... attribs) {
		for (int i = 0; i < attribs.length; i+= 2) {
			w.getElement().setAttribute(attribs[i], attribs[i + 1]);			
		}
		return w;
	}

}
