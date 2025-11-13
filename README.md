# gwt-bootstrap5
Integration of Bootstrap 5.3 with Google Web Toolkit (GWT) project. 

This project provides a lightweight wrapper over Bootstrap library for those using GWT. 
The goal is to provide simple and mostly elemental2 constructs to be able to follow 
Bootstrap documentation and follow their guides.

## Samples

### Bootstrap menu example

```html

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
      <button type="button" class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
          <span class="navbar-toggler-icon"></span>
      </button>
      <a class="navbar-brand" href="#">Gwt Bootstrap 5</a>
      <div class="collapse navbar-collapse" id="navbarCollapse">
          <div class="navbar-nav">
              <a href="#" class="nav-item nav-link active">Home</a>
              <a href="#" class="nav-item nav-link">Profile</a>
              <a href="#" class="nav-item nav-link">Messages</a>
              <a href="#" class="nav-item nav-link disabled" tabindex="-1">Reports</a>
          </div>
          <div class="navbar-nav ms-auto">
              <a href="#" class="nav-item nav-link">Login</a>
          </div>
      </div>
  </div>
</nav>

```
### Equivalent GWT code

Each element has common prefix Bp for a Bootstrap followed an actual Bootstrap tag.

For example ```nav``` will become ```BpNav```

```java

BpNav.create(concat(BpNav.NAVBAR, BpNav.NAVBAR_EXPAND_LG, BpNav.BG_LIGHT, BpNav.NAVBAR_LIGHT)).with(
  BpDiv.create(BpDiv.CONTAINER_FLUID).with(
    BpButton.create(BpButton.NAVBAR_TOGGLER).
     attr(BpButton.DATA_BS_TOGGLE, BpButton.COLLAPSE, BpButton.DATA_BS_TARGET, "#navbarCollapse").with(
            cssClass(Document.get().createSpanElement(), "navbar-toggler-icon")
           ),
    BpA.create(BpA.NAVBAR_BRAND, "Gwt Bootstrap 5"),
    BpDiv.create(concat(BpDiv.COLLAPSE, BpDiv.NAVBAR_COLLAPSE)).attr("id", "navbarCollapse").with(
      BpDiv.create(BpDiv.NAVBAR_NAV).with(
        BpA.create(concat(BpA.NAV_ITEM, BpA.NAV_LINK, BpA.ACTIVE), "Home"),
        BpA.create(concat(BpA.NAV_ITEM, BpA.NAV_LINK), "Profile"),
        BpA.create(concat(BpA.NAV_ITEM, BpA.NAV_LINK), "Messages"),
        BpA.create(concat(BpA.NAV_ITEM, BpA.NAV_LINK, BpA.DISABLED ), "Reports")
      )
      ),
    BpDiv.create(concat(BpDiv.NAVBAR_NAV, BpDiv.MS_AUTO)).with(
      loginBpA = BpA.create(concat(BpA.NAV_ITEM, BpA.NAV_LINK), "Login")
    )
      )
);

```
### Modal Popup example

This type of a widget needs a javaScript invocation which is a good opportunity to use JSInterop Google Web Toolkit feature.

#### Bootstrap

First, typical and simple Bootstrap popup sample featuring typical components:

* Header
* Body
* Footer

```html
<div class="modal" tabindex="-1">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">Modal title</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        <p>Modal body text goes here.</p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>
```
Bootstrap documentation mentions that this (and  some other widgets) require JavaScript interactions. Below we will demonstrate
the widget, the JSInterop class and JavaScript itself.

#### GWT

##### Java Widget

Sample class below offers a template implementation of popup's header, body and the footer. These containers are empty. You'll  use getters (hidden below) to get handle to those and populate them with desired content.


```java
package com.vals.gwtbootstrap5.client.sample.ui;
...
public class BpModal extends BpDiv {
...
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
...
	public void attachAndShow(Element parentElement) {
		Element prevElement = Document.get().getElementById(id);
		if (prevElement != null) {
			prevElement.removeFromParent();
		}
		parentElement.appendChild(this.getElement());
		BpUtilsJs.showModal(id);
	}
...	
``` 
##### JSInterop class

This class in your GWT module's database will provide the interface 
between the former and the JavaScript codebase.

```java
package com.vals.gwtbootstrap5.client.jsinterop;

@JsType(isNative = true, name="BpUtilsJs", namespace="misc")
public class BpUtilsJs {
	public static native void showModal(String modalIdStr);
}
```
##### JavaScript 

Below JavaScript needs to be included in your web page

```
 <script type="text/javascript" src="path/BpUtilsJs.js"></script>
```

BpUtilsJs.js:

```JavaScript
misc.BpUtilsJs = class {
	static showModal(idStr) {
		var modalById = new bootstrap.Modal(document.getElementById(idStr));
		modalById.show();
	}
}
```
That's it.

# About

This library is a byproduct of [Comunicatcha Private Messenger](https://comunicatcha.com) project  and does not claim to provide complete 
Bootstrap feature coverage initially.

It is a good start though and might grow with your contributions.
