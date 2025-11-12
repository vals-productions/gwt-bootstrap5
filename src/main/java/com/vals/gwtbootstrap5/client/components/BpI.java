package com.vals.gwtbootstrap5.client.components;

import static com.vals.gwtbootstrap5.client.misc.AssemblyUtl.tree;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Text;
import com.vals.gwtbootstrap5.client.misc.BpComponent;
import com.vals.gwtbootstrap5.client.misc.StyleUtl;

public class BpI implements BpComponent<BpI> {
	
	public static final String ARROW_BAR_UP = "bi bi-arrow-bar-up";
	public static final String ARROW_BAR_DOWN = "bi bi-arrow-bar-down";
	public static final String ARROW_UP = "bi bi-arrow-up";
	public static final String ARROW_DOWN = "bi bi-arrow-down";
	public static final String ARROW_UP_SHORT = "bi bi-arrow-up-short";
	public static final String ARROW_UP_RIGHT = "bi bi-arrow-up-right";
	public static final String ARROW_DOWN_SHORT = "bi bi-arrow-down-short";
	public static final String ARROW_CLOCKWISE = "bi bi-arrow-clockwise";
	public static final String ARROW_RIGHT_CIRCLE_FILL = "bi bi-arrow-right-circle-fill";
	public static final String ACTIVITY = "bi bi-activity";
	
	public static final String BROADCAST = "bi bi-broadcast";
	public static final String BROADCAST_PIN = "bi bi-broadcast-pin";
	public static final String BUG_FILL = "bi bi-bug-fill";

	public static final String CALENDAR2_X = "bi bi-calendar2-x";
	public static final String CALENDAR_DATE = "bi bi-calendar-date";
	public static final String CALENDAR_DAY = "bi bi-calendar-day";
	public static final String CALENDAR_MONTH = "bi bi-calendar-month";
	public static final String CALENDAR4_WEEK = "bi bi-calendar4-week";
	public static final String CALENDAR_FILL = "bi bi-calendar-fill";
	public static final String CARD_LIST = "bi bi-card-list";
	public static final String CLOUD = "bi bi-cloud";
	public static final String CHECK_CIRCLE = "bi bi-check-circle";
	public static final String CHECK_CIRCLE_FILL = "bi bi-check-circle-fill";
	public static final String CHECK2 = "bi bi-check2";
	public static final String CLOCK_HISTORY = "bi bi-clock-history";
	public static final String CIRCLE = "bi bi-circle";
	public static final String CIRCLE_FILL = "bi bi-circle-fill";
	public static final String CHAT_HEART = "bi bi-chat-heart";
	public static final String CHAT_LEFT_TEXT = "bi bi-chat-left-text";
	public static final String CHAT_LEFT = "bi bi-chat-left";

	public static final String DISPLAY = "bi bi-display";
	public static final String DROPLET_FILL = "bi bi-droplet-fill";
	public static final String DROPLET = "bi bi-droplet";

	public static final String ENVELOPE = "bi bi-envelope";
	public static final String ENVELOPE_OPEN = "bi bi-envelope-open";
	public static final String ENVELOPE_PAPER = "bi bi-envelope-paper";
	public static final String EYE_SLASH = "bi bi-eye-slash";
	public static final String ENVELOPE_FILL = "bi bi-envelope-fill";
	public static final String EXCLAMATION_CIRCLE = "bi bi-exclamation-circle";
	public static final String EMOJI_SMILE = "bi bi-emoji-smile";
	public static final String EMOJI_SMILE_FILL = "bi bi-emoji-smile-fill";
	public static final String EMOJI_TEAR = "bi bi-emoji-tear";
	public static final String EMOJI_FROWN = "bi bi-emoji-frown";
	public static final String EMOJI_FROWN_FILL = "bi bi-emoji-frown-fill";
	public static final String EJECT = "bi-eject";
	public static final String EJECT_FILL = "bi-eject-fill";
	
	public static final String FILE_PERSON = "bi bi-file-person";
	public static final String FILE_PERSON_FILL = "bi bi-file-person-fill";

	public static final String GEAR = "bi bi-gear";
	
	public static final String HEART = "bi bi-heart";
	public static final String HEART_FILL = "bi bi-heart-fill";
	public static final String HOURGLASS_SPLIT = "bi bi-hourglass-split";
	public static final String HOUSE_DOOR = "bi-house-door";
	public static final String HAND_THUMBS_UP_FILL = "bi bi-hand-thumbs-up-fill";
	public static final String HAND_THUMBS_DOWN_FILL =  "bi bi-hand-thumbs-down-fill";
	public static final String HAND_THUMBS_UP = "bi bi-hand-thumbs-up";
	public static final String HAND_THUMBS_DOWN =  "bi bi-hand-thumbs-down";

	public static final String IMAGES = "bi bi-images";
	public static final String IMAGE  = "bi bi-image";
	
	public static final String INBOXES_FILL = "bi bi-inboxes-fill";
	public static final String INBOX = "bi bi-inbox";
	public static final String INBOX_FILL = "bi bi-inbox-fill";
	public static final String INFO_CIRCLE = "bi bi-info-circle";
	public static final String INFO_CIRCLE_FILL = "bi bi-info-circle-fill";
	public static final String INFO_LG = "bi bi-info-lg";
	public static final String INFO_SQUARE = "bi bi-info-square";
	
	public static final String KEY = "bi bi-key";
	
	public static final String LAPTOP = "bi bi-laptop";
	public static final String LAPTOP_FILL = "bi bi-laptop-fill";
	public static final String LOCK = "bi bi-lock";
	public static final String LOCK_FILL = "bi bi-lock-fill";
	public static final String LIGHTNING_CHARGE = "bi bi-lightning";
	public static final String LIGHTNING_CHARGE_FILL = "bi bi-lightning-fill";
	public static final String LIST_OL = "bi bi-list-ol";
	
	public static final String NEWSPAPER = "bi bi-newspaper";
	
	public static final String PATCH_EXCLAIMATION = "bi bi-patch-exclamation";
	public static final String PLUS = "bi bi-plus";
	public static final String PLUS_CIRCLE = "bi bi-plus-circle";
	public static final String PHONE = "bi bi-phone";
	public static final String PHONE_FILL = "bi bi-phone-fill";
	public static final String PERSON = "bi bi-person";
	public static final String PERSON_FILL = "bi bi-person-fill";
	public static final String PERSON_FILL_CHECK = "bi bi-person-fill-check";
	public static final String PERSON_CHECK = "bi bi-person-check";
	public static final String PERSON_PLUS = "bi bi-person-plus";
	public static final String PERSON_BOUNDING_BOX = "bi bi-person-bounding-box";
	public static final String PEOPLE_FILL = "bi bi-people-fill";
	public static final String PIN_ANGLE = "bi bi-pin-angle";
	public static final String PIN_ANGLE_FILL = "bi bi-pin-angle-fill";

	public static final String QUESTION = "bi bi-question";
	public static final String QUESTION_CIRCLE = "bi bi-question-circle";
	
	public static final String SEARCH = "bi bi-search";
	public static final String SEND = "bi bi-send";
	public static final String SEND_FILL = "bi bi-send-fill";
	public static final String SEND_CHECK = "bi bi-send-check";
	public static final String SEND_CHECK_FILL = "bi bi-send-check-fill";
	public static final String SEND_STASH = "bi bi-send-slash";
	public static final String SHIELD_EXCLAMATION = "bi bi-shield-exclamation";
	public static final String SHIELD_SLASH = "bi bi-shield-slash";
	public static final String SHIELD_LOCK = "bi bi-shield-lock";
	
	public static final String TEXT_LEFT = "bi bi-text-left";
	public static final String TABLET = "bi bi-tablet";
	public static final String TABLET_FILL = "bi bi-tablet-fill";
	public static final String TRASH = "bi bi-trash";
	public static final String THREE_DOTS_VERTICAL = "bi bi-three-dots-vertical";
	
	public static final String UNLOCK = "bi bi-unlock";
	
	public static final String VOLUME_MUTE = "bi bi-volume-mute";
	
	public static final String X_CIRCLE = "bi bi-x-circle";
	
	private Element e;
	private String text;
	private String iconClass;

	public BpI(String text) {
		super();
		this.text = text;
		e = Document.get().createElement("i");
		if(text != null) {
			Text tn = Document.get().createTextNode(text);
			tree(e, tn);
		}
	}

	@Override
	public Element getElement() {
		return e;
	}
	
	public static BpI create(String text) {
		return new BpI(text);
	}
	
	public static BpI createIcon(String iconClass) {
		BpI icon = new BpI(null);
		StyleUtl.cssClass(icon.getElement(), iconClass);
		icon.setIconClass(iconClass);
		return icon;
	}

	public String getText() {
		return text;
	}

	public String getIconClass() {
		return iconClass;
	}

	public void setIconClass(String iconClass) {
		this.iconClass = iconClass;
	}

}
