package com.vals.gwtbootstrap5.client.sample.ui;

import com.google.gwt.dom.client.Element;
import com.vals.gwtbootstrap5.client.components.BpButton;
import com.vals.gwtbootstrap5.client.components.BpDiv;
import com.vals.gwtbootstrap5.client.components.BpHeader;
import com.vals.gwtbootstrap5.client.misc.StyleUtl;

public class BpAccordion extends BpDiv {

	public BpAccordion() {
		super("accordion");
	}

	public void addItem(BpAccordion.Item item) {
		with(item);
	}
	
	public static class Item extends BpDiv {

		private BpHeader header = new BpHeader(2, "accordion-header", null);
		private BpButton button;
		private BpDiv accCollapse = BpDiv.create("accordion-collapse collapse"), 
			accBody = BpDiv.create("accordion-body");
		
		/**
		 * 
		 * @param order
		 * @param title
		 * @param content
		 */
		public Item(int order, String title, Element content) {
			super("accordion-item");
			button = BpButton.create("accordion-button collapsed", title);
			StyleUtl.attribs(button, "type", "button");
			StyleUtl.attribs(button, BpButton.DATA_BS_TOGGLE, "collapse");
			StyleUtl.attribs(button, BpButton.DATA_BS_TARGET, "#collapse" + order(order));
			StyleUtl.attribs(button, "aria-expanded", "false" + order(order));
			StyleUtl.attribs(button, "aria-controls", "collapse" + order(order));
			accCollapse.getElement().setId("collapse" + order(order));
			this.with(header.with(button));
			
			this.with(accCollapse.with(accBody.with(content)));
		}
		
		private String order(int order) {
			if (order == 1)
				return "One";
			if (order == 2)
				return "Two";
			if (order == 3)
				return "Three";
			if (order == 4)
				return "Four";
			if (order == 5)
				return "Five";
			if (order == 6)
				return "Sox";
			if (order == 7)
				return "Seven";
			if (order == 8)
				return "Eight";
			return "One";
		}
		
	}
}
