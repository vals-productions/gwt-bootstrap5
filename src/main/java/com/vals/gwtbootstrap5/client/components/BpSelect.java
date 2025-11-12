package com.vals.gwtbootstrap5.client.components;

import java.util.Objects;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.dom.client.OptionElement;
import com.google.gwt.dom.client.SelectElement;
import com.vals.gwtbootstrap5.client.misc.HasElement;
import com.vals.gwtbootstrap5.client.misc.StyleUtl;

/**
 * 
 */
public class BpSelect implements HasElement {

	private SelectElement se = Document.get().createSelectElement();
	
	public BpSelect() {
		super();
		StyleUtl.cssClass(se, "form-select");
	}

	@Override
	public SelectElement getElement() {
		return se;
	}
	
	public void add(String label, boolean selected) {
		BuOption option = new BuOption(label, selected);
		se.add(option.getElement(), null);
	}
	
	public void add(BuOption option) {
		se.add(option.getElement(), null);
	}
	
	public void setDisabled(boolean disabled) {
		se.setDisabled(disabled);
	}

	public void clear() {
		se.removeAllChildren();
	}
	
	public OptionElement getSelected() {
		if (se.getSelectedIndex() != -1) {
			OptionElement el = se.getOptions().getItem(se.getSelectedIndex());
			return el;
		}
		return null;
	}
	
	public String getSelectedLabel() {
		OptionElement el = getSelected();
		if (el != null) {
			return el.getLabel();
		}
		return null;
	}
	
	public void setSelected(String label) {
		NodeList<OptionElement> elements = se.getOptions();
		for (int i = 0; i < elements.getLength(); i++) {
			OptionElement el = elements.getItem(i);
			el.setSelected(Objects.equals(label, el.getLabel()));
		}
	}
	
	public static class BuOption implements HasElement {

		private OptionElement so = Document.get().createOptionElement();

		public BuOption(String label, boolean selected) {
			super();
			so.setLabel(label);
			so.setSelected(selected);
		}

		@Override
		public OptionElement getElement() {
			return so;
		}
		
	}
	
}
