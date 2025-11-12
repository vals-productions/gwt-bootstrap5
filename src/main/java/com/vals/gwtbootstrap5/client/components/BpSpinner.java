package com.vals.gwtbootstrap5.client.components;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.vals.gwtbootstrap5.client.misc.BpComponent;

public class BpSpinner implements BpComponent<BpSpinner> {
	
	private Element e;
	
	public BpSpinner() {
		super();
		e = Document.get().createDivElement();
		cls("spinner-border text-secondary spinner-border-sm");
	}

	public BpSpinner(String cls) {
		super();
		e = Document.get().createDivElement();
		cls(cls);
	}
	
	@Override
	public Element getElement() {
		return e;
	}
	
	public static BpSpinner create() {
		return new BpSpinner();
	}

}
