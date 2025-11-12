package com.vals.gwtbootstrap5.client.components;

import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.user.client.ui.Button;
import com.vals.gwtbootstrap5.client.misc.BpFactory;
import com.vals.gwtbootstrap5.client.misc.BpComponent;
import com.vals.gwtbootstrap5.client.misc.StyleUtl;

/**
 * Button with optional icon and spinner.
 */
public class BpButton extends Button implements BpComponent<BpButton>{
	
	private BpI icon;
	private SpanElement spinnerElement;

	public static final String BTN = "btn";
	public static final String BTN_SM = "btn-sm";
	public static final String BTN_LINK = "btn-link";
	public static final String BTN_CLOSE = "btn-close";
	public static final String BTN_PRIMARY = "btn-primary";
	public static final String BTN_SECONDARY = "btn-secondary";
	public static final String BTN_DANGER = "btn-danger";
	public static final String BTN_OUTLINE_PRIMARY = "btn-outline-primary";
	public static final String BTN_OUTLINE_SECONDARY = "btn-outline-secondary";
	public static final String BTN_OUTLINE_SUCCESS = "btn-outline-success";
	public static final String BTN_OUTLINE_WARNING = "btn btn-outline-warning";
	public static final String BTN_SUCCESS = "btn-success";
	public static final String BTN_OUTLINE_DANGER = "btn-outline-danger";
	public static final String BTN_BTN_PRIMARY = StyleUtl.concat(BpButton.BTN, BpButton.BTN_PRIMARY);
	public static final String BTN_BTN_SUCCESS = StyleUtl.concat(BpButton.BTN, BpButton.BTN_SUCCESS);
	public static final String BTN_BTN_DANGER = StyleUtl.concat(BpButton.BTN, BpButton.BTN_DANGER);
	public static final String BTN_BTN_OUTLINE_PRIMARY = StyleUtl.concat(BpButton.BTN, BpButton.BTN_OUTLINE_PRIMARY);
	public static final String BTN_BTN_OUTLINE_SUCCESS = StyleUtl.concat(BpButton.BTN, BpButton.BTN_OUTLINE_SUCCESS);
	public static final String BTN_BTN_SECONDARY = StyleUtl.concat(BpButton.BTN, BpButton.BTN_SECONDARY);
	public static final String BTN_BTN_OUTLINE_SECONDARY = StyleUtl.concat(BpButton.BTN, BpButton.BTN_OUTLINE_SECONDARY);
	public static final String BTN_BTN_OUTLINE_DANGER = StyleUtl.concat(BpButton.BTN, BpButton.BTN_OUTLINE_DANGER);
	public static final String NAVBAR_TOGGLER = "navbar-toggler";
	
	public static final String DATA_BS_TOGGLE = "data-bs-toggle";
	public static final String DATA_BS_TARGET = "data-bs-target";
	
	public static final String COLLAPSE = "collapse";
	
	// Popup related 
	public static final String DATA_BS_DISMISS = "data-bs-dismiss";
	public static final String MODAL = "modal";
	
	// Dropdown related
	public static final String BTN_GROUP = "btn-group";

	public BpButton(String cssClass, String text, String iconName) {
		super();
		StyleUtl.cssClass(this, cssClass);
		if (text != null) {
			setText(text);
		}
		if (iconName != null) {
			icon = BpI.createIcon(iconName);
			if (text != null) {
				StyleUtl.addCssClass(icon.getElement(), "ps-2");
			}
			with(icon.getElement());
		}
	}
	
	public BpButton(String cssClass, String text) {
		this(cssClass, text, null);
	}
	
	public BpButton(String cssClass) {
		this(cssClass, null);
	}
	
	public static BpButton create(String cssClass, String text, String iconName) {
		return new BpButton(cssClass, text, iconName);
	}
	
	public static BpButton create(String cssClass, String text) {
		return new BpButton(cssClass, text);
	}
	
	public static BpButton create(String cssClass) {
		return new BpButton(cssClass);
	}
	
	public BpButton asModalButton() {
		return attr(DATA_BS_DISMISS, MODAL);
	}
	
	public void changeIcon(String cssClass) {
		if (icon != null)
			StyleUtl.cssClass(icon.getElement(), cssClass);
	}
	
	public void setSpin(boolean isSpin) {
		if (spinnerElement == null) {
			initSpinner();
		}
		if (isSpin) {
			spinnerElement.removeAttribute("hidden");
		} else {
			spinnerElement.setAttribute("hidden", null);
		}
	}
	
	private void initSpinner() {
		spinnerElement = BpFactory.SPAN.getSpanElement(null, "spinner-grow spinner-grow-sm pe-2 ps-2");
		spinnerElement.setAttribute("aria-hidden", "true");
		spinnerElement.setAttribute("role", "status");
		spinnerElement.setAttribute("hidden", null);
		
		getElement().insertFirst(spinnerElement);
		
		with(spinnerElement);
	}

	public BpI getIcon() {
		return icon;
	}
	
}
