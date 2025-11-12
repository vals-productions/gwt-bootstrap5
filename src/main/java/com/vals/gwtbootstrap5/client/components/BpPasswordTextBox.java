package com.vals.gwtbootstrap5.client.components;

import com.google.gwt.user.client.ui.PasswordTextBox;
import com.vals.gwtbootstrap5.client.misc.StyleUtl;

public class BpPasswordTextBox extends PasswordTextBox {

	public BpPasswordTextBox() {
		super();
		StyleUtl.cssClass(this,  "form-control");
	}


}
