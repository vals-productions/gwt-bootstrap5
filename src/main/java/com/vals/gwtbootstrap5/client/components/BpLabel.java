package com.vals.gwtbootstrap5.client.components;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.LabelElement;
import com.google.gwt.dom.client.Text;
import com.vals.gwtbootstrap5.client.misc.BpFactory;
import com.vals.gwtbootstrap5.client.misc.BpComponent;
import com.vals.gwtbootstrap5.client.misc.StyleUtl;

public class BpLabel implements BpComponent<BpLabel> {
	
	public static final String FORM_LABEL = "form-label";
	public static final String FORM_CHECK_LABEL = "form-check-label";
	public static final String FORM_TEXT = "form-text";

	private LabelElement label = Document.get().createLabelElement();
	private Text textEl;
	
	public BpLabel(String style, String text) {
		if (style != null) {
			StyleUtl.cssClass(label, style);
		}
		if (text != null) {
		    textEl = BpFactory.TEXT.getTextElement(text);
		    label.appendChild(textEl);
		}
	}

	public void setText(String text) {
		if (textEl != null) {
			textEl.removeFromParent();
		    textEl = BpFactory.TEXT.getTextElement(text);
		    label.appendChild(textEl);
		}
	}
	
	@Override
	public Element getElement() {
		return label;
	}
	
	public static BpLabel create(String style, String text) {
		return new BpLabel(style, text);
	}
	
	public static BpLabel create(String style) {
		return new BpLabel(style, null);
	}

}
