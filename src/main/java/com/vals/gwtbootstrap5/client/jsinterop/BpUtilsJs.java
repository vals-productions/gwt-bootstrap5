package com.vals.gwtbootstrap5.client.jsinterop;

import jsinterop.annotations.JsType;

/**
 * 
 * For this to work the below sample JavaScripts need to 
 * interact with this JsInterop class.
 * 
 */
@JsType(isNative = true, name="BpUtilsJs", namespace="misc")
public class BpUtilsJs {
	
	/**
	 * refer to Bootstrap docs if something does not work.
	 * 
	 * The following JS needs to be provided by your codebase
	 * and mapped to this method.
	 * 
	 * var modalById = new bootstrap.Modal(document.getElementById(modalIdStr));
	 * modalById.show();
	 * 
	 * @param modalId
	 */
	public static native void showModal(String modalIdStr);
	
	/**
	 * Refer to Bootstrap docs if something does not work.
	 * 
	 * The following JS needs to be provided by your codebase
	 * and mapped to this method.
	 * 
	 * 	var myAlert = document.getElementById(id);
	 *  var bsAlert = new bootstrap.Toast(myAlert, {
	 * 	  delay: timeMs
	 * 	});
	 *	bsAlert.show();
     *
	 * @param id
	 * @param timeSec
	 */
	public static native void showToast(String id, int timeMs);

}
