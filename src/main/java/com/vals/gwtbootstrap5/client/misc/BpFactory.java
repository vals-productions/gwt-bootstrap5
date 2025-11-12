package com.vals.gwtbootstrap5.client.misc;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.LIElement;
import com.google.gwt.dom.client.ParagraphElement;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.dom.client.Text;
import com.google.gwt.dom.client.UListElement;

/**
 * 
 * This facilitates Element creation
 *
 */
public class BpFactory {
	
	public static class LI {
		
		public static UListElement getUlElement(String styleName) {
			UListElement ul = Document.get().createULElement();
			if (styleName != null) {
				StyleUtl.addCssClass(ul, styleName);
			}
			return ul;
		}
		
		public static LIElement getLiElement() {
			LIElement li = Document.get().createLIElement();
			return li;
		}
		
		public static LIElement getLiElement(String styleName) {
			LIElement li = Document.get().createLIElement();
			StyleUtl.addCssClass(li, styleName);
			return li;
		}
		
	}
	
	public static class TEXT {
		
		public static final String CARD_TEXT = "card-text";
		
		public static ParagraphElement getParagraphElement(String textString) {
			return getParagraphElement(textString, null);
		}
		
		public static ParagraphElement getParagraphElement(String textString, String textClass) {
			ParagraphElement pe =  Document.get().createPElement();
			if (textClass != null) {
				pe.setClassName(textClass);
			}
			if (textString != null) {
				Text text = Document.get().createTextNode(textString);
				pe.appendChild(text);
			}
			return pe;
		}

		public static Text getTextElement(String text) {
			Text textElement = Document.get().createTextNode(text);
			return textElement;
		}
		
	}
	
	public static class INPUT {

	}
	
	public static class SPAN {
		
		public static SpanElement getSpanElement(String text, String cssClass) {
			SpanElement e = Document.get().createSpanElement();
			if (text != null) {
				e.setInnerText(text);
			}
			if (cssClass != null) {
				e.setClassName(cssClass);
			}
			return e;
		}

	}
}
