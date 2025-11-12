package com.vals.gwtbootstrap5.client.components;

import static com.vals.gwtbootstrap5.client.misc.AssemblyUtl.*;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Text;
import com.vals.gwtbootstrap5.client.misc.AssemblyUtl;
import com.vals.gwtbootstrap5.client.misc.BpComponent;
import com.vals.gwtbootstrap5.client.misc.StyleUtl;

public class BpSmall implements BpComponent<BpSmall> {

	public static final String TEXT_MUTED = "text-muted";
	
	private Element e;
		
	public BpSmall(String cssClass, String text) {
		super();
		e = Document.get().createElement("small");
		StyleUtl.cssClass(e, cssClass);
		if (text != null) {
			Text tn = Document.get().createTextNode(text);
			tree(e, tn);
		}
	}

	@Override
	public Element getElement() {
		return e;
	}
	
	public static BpSmall create(String cssClass, String text) {
		return new BpSmall(cssClass, text);
	}

}
