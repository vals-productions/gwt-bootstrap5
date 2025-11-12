package com.vals.gwtbootstrap5.client.components;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.FormElement;
import com.vals.gwtbootstrap5.client.misc.BpComponent;
import com.vals.gwtbootstrap5.client.misc.StyleUtl;

public class BpForm implements BpComponent<BpForm> {
	
	private FormElement e;
	
	public BpForm() {
		e = Document.get().createFormElement();
	}
	
	public BpForm(String cssClass) {
		super();
		StyleUtl.cssClass(e, cssClass);
	}
	
	@Override
	public Element getElement() {
		return e;
	}
	
	public static BpForm create() {
		return new BpForm();
	}

}
