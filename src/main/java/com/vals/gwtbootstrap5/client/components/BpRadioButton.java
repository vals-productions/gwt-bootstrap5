package com.vals.gwtbootstrap5.client.components;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.InputElement;
import com.google.gwt.dom.client.LabelElement;
import com.vals.gwtbootstrap5.client.misc.BpCnst;
import com.vals.gwtbootstrap5.client.misc.BpFactory;
import com.vals.gwtbootstrap5.client.misc.StyleUtl;

public class BpRadioButton extends BpDiv {

	private InputElement inputElement;
	private LabelElement labelElement = Document.get().createLabelElement();
	
	public BpRadioButton(String groupName, String labelName, String buttonId) {
		super(StyleUtl.concat(BpCnst.FORM.FORM_CHECK, BpCnst.FORM.FORM_SWITCH));
		inputElement = Document.get().createRadioInputElement(groupName);
		StyleUtl.cssClass(inputElement, BpCnst.FORM.FORM_CHECK_INPUT);
		inputElement.setId(buttonId);
		
		labelElement.appendChild(BpFactory.TEXT.getTextElement(labelName));
		StyleUtl.cssClass(labelElement, BpCnst.FORM.FORM_CHECK_LABEL);
		labelElement.setAttribute("for", buttonId);
		
		this.with(inputElement, labelElement);
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
