package com.vals.gwtbootstrap5.client.misc;

import com.google.gwt.dom.client.Element;

/**
 * 
 * We cannot extend Element and this
 * interface helps to alleviate this
 * and if an object implements this interface
 * getElement method will be called to get a handle
 * to the element.
 * 
 */
public interface HasElement {

	public Element getElement();

}
