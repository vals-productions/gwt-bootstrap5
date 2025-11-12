package com.vals.gwtbootstrap5.client.components;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.SpanElement;
import com.vals.gwtbootstrap5.client.misc.BpComponent;
import com.vals.gwtbootstrap5.client.misc.StyleUtl;

public class BpBadge implements BpComponent<BpBadge> {

	public static final String BADGE = "badge";
	
	public static final String ROUNDED_PILL = "rounded-pill";
	
	protected SpanElement e;
	
	public BpBadge(String cssStyle) {
		super();
		e = Document.get().createSpanElement();
		StyleUtl.cssClass(e, cssStyle);
	}
	
	public static BpBadge create(String... cssStyle) {
		return new BpBadge(StyleUtl.concat(cssStyle));
	}
	
	@Override
	public Element getElement() {
		return e;
	}

}
