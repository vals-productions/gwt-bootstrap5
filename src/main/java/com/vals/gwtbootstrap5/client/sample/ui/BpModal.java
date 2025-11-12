package com.vals.gwtbootstrap5.client.sample.ui;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.vals.gwtbootstrap5.client.components.BpDiv;
import com.vals.gwtbootstrap5.client.jsinterop.BpUtilsJs;
import com.vals.gwtbootstrap5.client.misc.StyleUtl;

/**
 * 
 * Add the function below to your html page.
 *  
 * <pre>
 *   <script>
 *		function showModal(idStr) {
 *       	var modalById = new bootstrap.Modal(document.getElementById(idStr));
 *       	modalById.show();
 *   	}
 *   </script>
 * </pre>
 * 
 */
public class BpModal extends BpDiv {
	
	public static final String MODAL_FADE = "modal fade";

	private String id;
	
	private BpDiv headerDiv, bodyDiv, footerDiv;
	
	public BpModal(String id) {
		super(MODAL_FADE);
		
		with(
			BpDiv.create(StyleUtl.concat(BpDiv.MODAL_DIALOG, BpDiv.MODAL_DIALOG_CENTERED)).with(
				BpDiv.create(BpDiv.MODAL_CONTENT).with(
					headerDiv = BpDiv.create(BpDiv.MODAL_HEADER),
					bodyDiv = BpDiv.create(BpDiv.MODAL_BODY),
					footerDiv  = BpDiv.create(BpDiv.MODAL_FOOTER)
				)
			)
		);
		
		withAttribute("id", this.id = id);
	}
	
	/**
	 * 
	 * This calls the JS function to show the modal.
	 * See class comment.
	 * 
	 */
	public void attachAndShow(Element parentElement) {
		Element prevElement = Document.get().getElementById(id);
		if (prevElement != null) {
			prevElement.removeFromParent();
		}
		parentElement.appendChild(this.getElement());
		BpUtilsJs.showModal(id);
	}

	public BpDiv getHeader() {
		return headerDiv;
	}
	
	public BpDiv getBody() {
		return bodyDiv;
	}
	
	public BpDiv getFooter() {
		return footerDiv;
	}
	
}
