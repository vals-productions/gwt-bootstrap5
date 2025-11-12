package com.vals.gwtbootstrap5.client.sample.ui;

import com.vals.gwtbootstrap5.client.components.BpButton;
import com.vals.gwtbootstrap5.client.components.BpDiv;
import com.vals.gwtbootstrap5.client.jsinterop.BpUtilsJs;
import com.vals.gwtbootstrap5.client.misc.BpFactory;
import com.vals.gwtbootstrap5.client.misc.StyleUtl;

public abstract class BpAbsToast extends BpDiv {
	
	public static final String DATA_BS_DISMISS = "data-bs-dismiss";
	public static final String BTN_CLOSE = "btn-close";
	
	public static final String TOAST_CONTAINER = "toast-container";
	public static final String POSITION_FIXED = "position-fixed";
	
	public static final String TOAST = "toast"; 
	public static final String TOP_0 = "top-0"; 
	public static final String END_0 = "end-0"; 
	public static final String TOP_50 = "top-50"; 
	public static final String START_50 = "start-50"; 
	
	protected BpDiv toast, dFlex, toastBody;
	protected BpButton closeButton;
	protected String id ;
	protected int timeMs = 5000;
	
	public BpAbsToast(String cssClass) {
		super(cssClass);
	}

	protected void init(String text, String id) {
		this.id = id;
		toast = BpDiv.create("toast");
		toast.getElement().setId(id);
		StyleUtl.attribs(toast, "role", "alert");
		StyleUtl.attribs(toast, "area-live", "assertive");
		StyleUtl.attribs(toast, "area-atomic", "true");
		
		dFlex = BpDiv.create("d-flex");
		
		toastBody = BpDiv.create("toast-body");
		
		toast.with(
			dFlex.with(
				toastBody.with(
					BpFactory.TEXT.getTextElement(text)
				)
			)
		);
		
		this.with(toast);
	}
	
	public BpAbsToast withTime(int timeMs) {
		this.timeMs = timeMs;
		return this;
	}
	
	public void show() {
		BpUtilsJs.showToast(id, timeMs);
	}
	
}
