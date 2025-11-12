package com.vals.gwtbootstrap5.client.components;

import static com.vals.gwtbootstrap5.client.misc.AssemblyUtl.tree;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.InputElement;
import com.google.gwt.dom.client.LabelElement;
import com.vals.gwtbootstrap5.client.misc.BpCnst;
import com.vals.gwtbootstrap5.client.misc.StyleUtl;

public class BpCheckBox extends BpDiv {
	
	private static final String FORM_CHECK_INPUT = "form-check-input";
	private static final String FORM_CHECK_LABEL = "form-check-label";
	
	private InputElement inputElement;
	private LabelElement labelElement;
	
	public BpCheckBox(String text, String id) {
		super(StyleUtl.concat(BpCnst.FORM.FORM_CHECK, BpCnst.FORM.FORM_SWITCH));
		
		inputElement = Document.get().createCheckInputElement();
		StyleUtl.cssClass(inputElement, FORM_CHECK_INPUT);
		inputElement.setId(id);
		
		labelElement = Document.get().createLabelElement();
		StyleUtl.cssClass(labelElement, FORM_CHECK_LABEL);
		labelElement.setAttribute("for", id);
		
		tree(this, labelElement, inputElement);
		
		if (text != null) {
			setText(text);
		}
	}

	public void setText(String text) {
		labelElement.setInnerText(text);
	}
	
	public void setValue(boolean value) {
		inputElement.setChecked(value);
	}
	
	public boolean getValue() {
		return inputElement.isChecked();
	}
	
	public void setEnabled(boolean enabled) {
		inputElement.setDisabled(!enabled);
	}

	public boolean isEnabled() {
		return !inputElement.isDisabled();
	}

}

