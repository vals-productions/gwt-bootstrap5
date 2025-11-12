package com.vals.gwtbootstrap5.client.components;

import com.google.gwt.user.client.ui.FlowPanel;
import com.vals.gwtbootstrap5.client.misc.BpComponent;
import com.vals.gwtbootstrap5.client.misc.StyleUtl;

/**
 * div for various bootstrap containers
 */
public class BpDiv extends FlowPanel implements BpComponent<BpDiv> {

	public static final String ROW = "row";
	public static final String COL = "col";
	public static final String COL_1 = "col-1";
	public static final String COL_2 = "col-2";
	public static final String COL_3 = "col-3";
	public static final String COL_4 = "col-4";
	public static final String COL_5 = "col-5";
	public static final String COL_6 = "col-6";
	public static final String COL_7 = "col-7";
	public static final String COL_8 = "col-8";
	public static final String COL_9 = "col-9";
	public static final String COL_10 = "col-10";
	public static final String COL_11 = "col-11";
	public static final String COL_12 = "col-12";
	public static final String COL_AUTO = "col-auto";
	public static final String CONTAINER = "container";
	public static final String CONTAINER_FLUID = "container-fluid";
	public static final String JUMBOTRON = "p-5 mb-4 bg-light border rounded-3";
	public static final String DIV_FORM_CHECK = "form-check";
	public static final String CARD = "card";
	public static final String CARD_BODY = "card-body";
	public static final String CARD_BODY_TEXT_CENTER = "card-body text-center";
	public static final String TEXT_CENTER = "text-center";
	public static final String COLLAPSE = "collapse";
	public static final String NAVBAR_COLLAPSE = "navbar-collapse";
	public static final String NAVBAR_NAV = "navbar-nav";
	public static final String MS_AUTO = "ms-auto";
	public static final String NAV_ITEM = "nav-item";
	public static final String NAV_LINK = "nav-link";
	public static final String DROPDOWN = "dropdown";
	public static final String DROPDOWN_MENU = "dropdown-menu";
	public static final String INPUT_GROUP = "input-group";
	public static final String FORM_FLOATING = "form-floating";
	public static final String MODAL_DIALOG = "modal-dialog";
	public static final String MODAL_DIALOG_CENTERED = "modal-dialog-centered";
	public static final String MODAL_CONTENT = "modal-content";
	public static final String MODAL_HEADER = "modal-header";
	public static final String MODAL_BODY = "modal-body";
	public static final String MODAL_FOOTER = "modal-footer";
	public static final String D_FLEX = "d-flex";
	public static final String D_GRID = "d-grid";
	public static final String FLEX_WRAP = "flex-wrap";
	public static final String ALERT = "alert";
	public static final String ALERT_SECONDARY = "alert-secondary";
	public static final String ALERT_DANGER = "alert-danger";
	public static final String ALERT_SUCCESS = "alert-success";
	@Deprecated
	public static final String FORM_CHECK = "form-check";
	@Deprecated
	public static final String FORM_TEXT = "form-text";
	
	public static final String JUSTIFY_CONTENT_END = "justify-content-end";

	public static final String BORDER_TOP = "border-top";

	public BpDiv(String cssClass) {
		super();
		if (cssClass != null) {
			StyleUtl.cssClass(this, cssClass);
		}
	}
	
	public static BpDiv create() {
		return new BpDiv(null);
	}
	
	public static BpDiv create(String cssClass) {
		return new BpDiv(cssClass);
	}
	
}
