package com.vals.gwtbootstrap5.client.sample.ui;

import java.util.function.Consumer;

import com.vals.gwtbootstrap5.client.components.BpButton;
import com.vals.gwtbootstrap5.client.components.BpHeader;
import com.vals.gwtbootstrap5.client.misc.BpFactory;
import com.vals.gwtbootstrap5.client.sample.event.BpElementListener;

/**
 * 
 * Add the function below to your html page or included scripts
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
public class BpWarningModal extends BpModal {
	
	private BpButton okButton;
	
	public BpWarningModal(String id, String headerText, String messageText, String okButtonText, String okButtonStyle, Consumer<Void> okButtonAction) {
		super(id);
		
		getHeader().with(BpHeader.create(5, BpHeader.MODAL_TITLE , headerText));
		
		getBody().with(
				BpFactory.TEXT.getParagraphElement(messageText)
		);
		
		getFooter().with(
			okButton = BpButton.create(okButtonStyle, okButtonText == null ? "Ok": okButtonText).asModalButton()
		);
		
		BpElementListener.onClick(okButton.getElement(), (evt) -> {
				if(okButtonAction != null) {
					okButtonAction.accept(null);
				}
		});
		
	}
	
}
