package com.vals.gwtbootstrap5.client.sample.ui;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

import com.google.gwt.dom.client.ParagraphElement;
import com.vals.gwtbootstrap5.client.components.BpButton;
import com.vals.gwtbootstrap5.client.components.BpHeader;
import com.vals.gwtbootstrap5.client.misc.BpFactory;
import com.vals.gwtbootstrap5.client.sample.event.BpElementListener;

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
public class BpConfirmCancelModal extends BpModal {
	
	private BpButton buttonConfirm, buttonCancel;
	
	public BpConfirmCancelModal(String id, String headerText, String confirmButtonStyle, Consumer<Void> confirmButtonAction, String... messageTextLines) {
		super(id);
		
		getHeader().with(BpHeader.create(5, BpHeader.MODAL_TITLE , headerText));
		
		List<ParagraphElement> textLines = new LinkedList<>();
		
		for (String textLine: messageTextLines) {
			textLines.add(BpFactory.TEXT.getParagraphElement(textLine));
		}
		
		getBody().with(
				textLines.toArray()
		);
		
		getFooter().with(
			buttonConfirm = BpButton.create(confirmButtonStyle, "Confirm").asModalButton(),
			buttonCancel = BpButton.create(BpButton.BTN_BTN_SECONDARY, "Cancel").asModalButton()
		);
		
		BpElementListener.onClick(buttonConfirm.getElement(), (evt) -> {
			if(confirmButtonAction != null) {
				confirmButtonAction.accept(null);
			}
		});
	}

	public BpButton getButtonConfirm() {
		return buttonConfirm;
	}

	public void setButtonConfirm(BpButton buttonConfirm) {
		this.buttonConfirm = buttonConfirm;
	}

	public BpButton getButtonCancel() {
		return buttonCancel;
	}

	public void setButtonCancel(BpButton buttonCancel) {
		this.buttonCancel = buttonCancel;
	}
	
}
