package com.vals.gwtbootstrap5.client.components;

import com.google.gwt.user.client.ui.TextArea;
import com.vals.gwtbootstrap5.client.misc.StyleUtl;

public class BpTextArea extends TextArea {
	
	public static final String FORM_CONTROL = "form-control";
	
	public BpTextArea() {
		super();
		StyleUtl.cssClass(this, FORM_CONTROL);
	}

}
