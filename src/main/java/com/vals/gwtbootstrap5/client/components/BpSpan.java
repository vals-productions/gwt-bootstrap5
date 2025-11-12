package com.vals.gwtbootstrap5.client.components;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.SpanElement;
import com.vals.gwtbootstrap5.client.misc.AssemblyUtl;
import com.vals.gwtbootstrap5.client.misc.BpComponent;
import com.vals.gwtbootstrap5.client.misc.StyleUtl;

public class BpSpan implements BpComponent<BpSpan> {

	public static final String INPUT_GROUP_TEXT = "input-group-text";
	
	private SpanElement e;
	
	public BpSpan(String cssStyle, String text) {
		super();
		e = Document.get().createSpanElement();
		if (text != null) {
			com.google.gwt.dom.client.Text tn = Document.get().createTextNode(text).cast();
			AssemblyUtl.tree(e,  tn);
		}
		StyleUtl.cssClass(e, cssStyle);
	}

	@Override
	public Element getElement() {
		return e;
	}
	
	public static BpSpan create(String style, String text) {
		return new BpSpan(style, text);
	}
	
}
