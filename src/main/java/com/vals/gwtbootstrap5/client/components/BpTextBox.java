package com.vals.gwtbootstrap5.client.components;

import java.util.function.Consumer;

import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.TextBox;
import com.vals.gwtbootstrap5.client.misc.StyleUtl;

public class BpTextBox extends TextBox {

	public static final String FORM_CONTROL = "form-control";

	public BpTextBox() {
		super();
		StyleUtl.cssClass(this, FORM_CONTROL);
	}
	
	public BpTextBox onChange(Consumer<Event> consumer) {
		return this;
	}
	
}
