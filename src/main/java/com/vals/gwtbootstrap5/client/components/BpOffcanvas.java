package com.vals.gwtbootstrap5.client.components;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Widget;
import com.vals.gwtbootstrap5.client.misc.BpCnst;
import com.vals.gwtbootstrap5.client.misc.BpComponent;
import com.vals.gwtbootstrap5.client.misc.StyleUtl;

public class BpOffcanvas extends BpDiv  {
	
	public static final String OFFCANVAS = "offcanvas";
	public static final String OFFCANVAS_START = "offcanvas-start";
	public static final String OFFCANVAS_HEADER = "offcanvas-header";
	public static final String OFFCANVAS_TITLE = "offcanvas-title";
	public static final String OFFCANVAS_BODY = "offcanvas-body";
	
	public static final String SHOW = "show";
	public static final String DARK = SHOW + " " + BpCnst.TEXT_BG.TEXT_BG_DARK;
	
	private static final String ARIA_LABEL = "aria-label";
	private static final String ARIA_LABELLEDBY = "aria-labelledby";
	private static final String ARIA_CONTROLS = "aria-controls";
	private static final String DATA_BS_TARGET = "data-bs-target";
	private static final String DATA_BS_TOGGLE = "data-bs-toggle";
	private static final String DATA_BS_DISMISS = "data-bs-dismiss";
	
	private BpHeader headerText;
	protected BpDiv body = BpDiv.create(OFFCANVAS_BODY);
	private BpDiv header = BpDiv.create(OFFCANVAS_HEADER);
	private BpButton buttonClose;
	/**
	 * 
	 * @param id f.e. offcanvasExample
	 * @param title 
	 */
	public BpOffcanvas(String id, String title) {
		super(StyleUtl.concat(OFFCANVAS, OFFCANVAS_START));
		String label = id + "Label";
		
		headerText = BpHeader.create(6, null, title);
		headerText.getElement().setId(label);
		buttonClose = BpButton.create(BpButton.BTN_CLOSE)
				.attr(DATA_BS_TOGGLE, OFFCANVAS, 
						     DATA_BS_TARGET, "#" + id,
						     ARIA_LABEL, "Close",
						     DATA_BS_DISMISS, OFFCANVAS
						     );
		
		getElement().setId(id);
		getElement().setPropertyString("tabindex", "-1");
		
		withAttribute(ARIA_LABELLEDBY, label);
		
		with(header.with(headerText, buttonClose), body);
	}
	
	public void setBodyElement(Element element) {
		body.clear();
		addBodyElement(element);
	}
	
	public void addBodyElement(Element element) {
		body.with(element);
	}
	
	public void setupActivateElement(Widget button) {
		StyleUtl.attribs(button, 
				ARIA_CONTROLS, getElement().getId(),
				DATA_BS_TOGGLE, OFFCANVAS,
				DATA_BS_TARGET, "#" + getElement().getId()
			);
	}

	public void show() { 
		StyleUtl.addCssClass(this, BpOffcanvas.SHOW);
	}
	
}
