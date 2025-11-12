package com.vals.gwtbootstrap5.client.components;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.HeadingElement;
import com.google.gwt.dom.client.Text;
import com.vals.gwtbootstrap5.client.misc.AssemblyUtl;
import com.vals.gwtbootstrap5.client.misc.BpFactory;
import com.vals.gwtbootstrap5.client.misc.BpComponent;
import com.vals.gwtbootstrap5.client.misc.StyleUtl;

public class BpHeader implements BpComponent<BpHeader> {
	
	public static final String CARD_TITLE = "card-title";
	public static final String CARD_SUBTITLE = "card-subtitle";
	public static final String MODAL_TITLE = "modal-title";
	
	private HeadingElement e;
	
	public BpHeader(int size, String cssStyle, String text) {
		e = Document.get().createHElement(size);
		if (text != null) {
			setText(text);
		}
		if (cssStyle != null) {
			StyleUtl.cssClass(e, cssStyle);
		}
	}
	
	@Override
	public Element getElement() {
		return e;
	}
	
	public static BpHeader create(int size, String cssClass, String text) {
		return new BpHeader(size, cssClass, text);
	}

	public void setText(String text) {
		e.removeAllChildren();
		Text textEl = BpFactory.TEXT.getTextElement(text);
		AssemblyUtl.tree(e, textEl);
	}

}
