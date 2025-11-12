package com.vals.gwtbootstrap5.client.misc;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Widget;

public interface BpComponent<T> extends HasElement {
	
	/**
	 * Adds children to the element.
	 *  
	 * <pre>
	 * Root
	 *  Leaf 1
	 *  Leaf 2
	 *  ...
	 * </pre>
	 * 
	 * @param leafObjects
	 * @return
	 */
	@SuppressWarnings("unchecked")
	default  public T with(Object...leafObjects) {
		return (T) AssemblyUtl.tree(this, leafObjects);
	}
	
	/**
	 * Additive html construct. 
	 *  
	 * <pre>
	 * ... class="value" ...  
	 * <pre>
	 * 
	 * @param values - values will be space delimited
	 * 
	 * @return returns the html tag itself so that its configuration
	 * could be chained. 
	 */
	@SuppressWarnings("unchecked")
	default public T cls(String... values) {
		for (String value: values) {
			StyleUtl.addCssClass(this.getElement(), value);
		}
		return (T) this;
	}
	
	/**
	 * Use {@link #cls(String...)}
	 * 
	 * @param names
	 * @return
	 */
	@Deprecated
	default public T cssStyle(String... names) {
		return cls(names);
	}
	
	/**
	 * Style property setter
	 * 
	 * Html constuct:
	 * 
	 * <pre>
	 * ... style="display: none;" ...
	 * </pre>
	 * 
	 * @param name
	 * @param value
	 * @return
	 */
	@SuppressWarnings("unchecked")
	default public T stlPrp(String name, String value) {
		getElement().getStyle().setProperty(name, value);
		return (T) this;		
	}	
	
	/**
	 * User {@link #stlPrp(String, String)}
	 * 
	 * @param name
	 * @param value
	 * @return
	 */
	@Deprecated
	default public T withStyle(String name, String value) {
		return stlPrp(name, value);		
	}
	
	/**
	 * Attribute setter.
	 * 
	 * Html constuct:
	 * 
	 * <pre>
	 * ... name="value" 
	 * </pre>
	 * 
	 * @param name
	 * @param value
	 * @return
	 */
	@SuppressWarnings("unchecked")
	default public T attr(String... nameValues) {
		if (this instanceof Element)
			StyleUtl.attribs((Element)this, nameValues);
		else if (this instanceof Widget) 
			StyleUtl.attribs((Widget)this, nameValues);
		return (T) this;
	}
	
	/**
	 * Use {@link #attr(String, String)}
	 * 
	 * @param name
	 * @param value
	 * @return
	 */
	@Deprecated
	default public T withAttribute(String name, String value) {
		return attr(name, value);
	}

}
