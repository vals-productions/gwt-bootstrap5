package com.vals.gwtbootstrap5.client.components;

import com.google.gwt.dom.client.DListElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;

/**
 * Needs work
 *
 */
public class BpDefinitionList {
	
	private DListElement element;
	
	public BpDefinitionList() {
		element = Document.get().createDLElement();
	}
	
	public Element getElement() {
		return element;
	}

}
