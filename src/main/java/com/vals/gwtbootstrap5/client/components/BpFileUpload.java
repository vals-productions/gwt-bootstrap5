package com.vals.gwtbootstrap5.client.components;

import com.google.gwt.user.client.ui.FileUpload;
import com.vals.gwtbootstrap5.client.misc.StyleUtl;

public class BpFileUpload extends FileUpload {
	
	public static final String FORM_CONTROL = "form-control";
	
	public BpFileUpload() {
		super();
		StyleUtl.cssClass(this, FORM_CONTROL);
	}

}
