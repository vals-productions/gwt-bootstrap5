package com.vals.gwtbootstrap5.client.sample.ui;

import com.google.gwt.user.client.Event;
import com.vals.gwtbootstrap5.client.components.BpButton;
import com.vals.gwtbootstrap5.client.components.BpDiv;
import com.vals.gwtbootstrap5.client.misc.BpCnst;
import com.vals.gwtbootstrap5.client.misc.StyleUtl;
import com.vals.gwtbootstrap5.client.sample.event.BpElementListener;

public class BpActionToast extends BpAbsToast {

	private BpDiv buttonsDiv;
	private BpButton actionButton;
	
	public BpActionToast(String id, String cssClass, 
			String text, String actionLabel, 
			String actionButtonStyle, Runnable onAction) {
		super(cssClass);
		init(text, id);
		
		buttonsDiv = BpDiv.create(StyleUtl.concat(BpCnst.MAR.TOP_2, BpCnst.PAD.TOP_2, BpDiv.BORDER_TOP));
		
		actionButton = BpButton.create(
				StyleUtl.concat(actionButtonStyle, BpButton.BTN_SM, BpCnst.MAR.END_2)
				, actionLabel);
		
		BpElementListener.addEvent(actionButton.getElement(), Event.ONCLICK, e -> onAction.run());
		
		StyleUtl.attribs(actionButton.getElement(), DATA_BS_DISMISS, "toast");
		
		closeButton = BpButton.create(
				StyleUtl.concat(BpButton.BTN_BTN_SECONDARY, BpButton.BTN_SM)
				, "Close");
		StyleUtl.attribs(closeButton.getElement(), DATA_BS_DISMISS, "toast");
		
		toastBody.with(buttonsDiv);
		
		buttonsDiv.with(actionButton, closeButton);
	}

}
