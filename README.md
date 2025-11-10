# gwt-bootstrap5
Integration of Bootstrap 5.3 with Google Web Toolkit (GWT) project. 

This project provides a lightweight wrapper over Bootstrap library for those using GWT. 
The goal is to provide simple and mostly elemental2 constructs to be able to follow 
Bootstrap documentation and follow their guides.

## Quick Sample

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

# About

This project is a byproduct of work on a particular GWT project and does not claim to provide complete 
Bootstrap coverage initially.

It is a good start though and might grow with your contributions.
