package com.vals.gwtbootstrap5.client.sample.ui;

import com.vals.gwtbootstrap5.client.components.BpButton;
import com.vals.gwtbootstrap5.client.misc.BpCnst;
import com.vals.gwtbootstrap5.client.misc.StyleUtl;

public class BpInfoToast extends BpAbsToast {
	

	public BpInfoToast(String id, String css, String text) {
		super(css);
		init(text, id);
		
		closeButton = BpButton.create(StyleUtl.concat(BTN_CLOSE, BpCnst.MAR.END_2, "m-auto"));
		StyleUtl.attribs(closeButton.getElement(), DATA_BS_DISMISS, "toast");
		StyleUtl.attribs(closeButton.getElement(), "aria-label", "Close");

		dFlex.with(closeButton);
	}
	
}
