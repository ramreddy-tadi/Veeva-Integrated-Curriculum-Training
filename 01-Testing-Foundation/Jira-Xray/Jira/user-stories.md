# Jira User Stories

Records exported: **17**

## SEQ-5 — As a user i want to register with full name,email and password so that my account will be registered
- **Type:** Story
- **Status:** Done
- **Parent:** SEQ-1 — Account And Login

### Description

h3. User story

As a user, when I register, I want to enter my full name, email, and password so that my account will be registered.

h3. Context

This issue is related to user registration.

h3. Acceptance criteria

* The registration form includes full name, email, and password fields.
* A user can register successfully with valid full name, email, and password

### Exported issue links

- **Outward issue link (Relates):** SEQ-27
- **Inward issue link (Test):** SEQ-22
- **Inward issue link (Test).1:** SEQ-24
- **Inward issue link (Test).2:** SEQ-25
- **Inward issue link (Test).3:** SEQ-26
- **Inward issue link (Test).4:** SEQ-28

---

## SEQ-6 — As a register user i want to log in with my email and password so that i will land on the home page
- **Type:** Story
- **Status:** In Progress
- **Parent:** SEQ-1 — Account And Login

### Description

h3. User story

As a registered user, when I want to log in, I want to use my email and password so that I land on the home page.

h3. Context

The issue is about the user login flow using email and password.

h3. Acceptance criteria

* The user can log in with a valid email and password.
* If the user logs in with invalid credentials, an error message is shown.
* After successful login, the user lands on the home page.

### Exported issue links

- **Outward issue link (Relates):** SEQ-36
- **Inward issue link (Test):** SEQ-29
- **Inward issue link (Test).1:** SEQ-30
- **Inward issue link (Test).2:** SEQ-31
- **Inward issue link (Test).3:** SEQ-32
- **Inward issue link (Test).4:** SEQ-33

---

## SEQ-8 — As a user when i forgot the password i want a reset link to be emailed to the registered email so that i will add new password
- **Type:** Story
- **Status:** Done
- **Parent:** SEQ-1 — Account And Login

### Description

h3. User story

As a user, when I forget my password, I want a reset link to be emailed to my registered email so that I can set a new password.

h3. Context

The issue is about password recovery for users who forget their password.

h3. Acceptance criteria

* A password reset link is emailed to the registered email address.
* The user can use the link to set a new password.

### Exported issue links

- **Inward issue link (Test):** SEQ-34

---

## SEQ-10 — As a user when i search for a product i want a list of 12 products per page with pagination and each product card should show image,name,price
- **Type:** Story
- **Status:** In Progress
- **Parent:** SEQ-2 — Browse and Search

### Description

h3. User story

As a user, when I search for a product, I want to see a list of 12 products per page with pagination so that I can browse results more easily.  
As a user, when I view a product card, I want it to show the image, name, and price so that I can quickly compare products.

h3. Context

The issue is about improving product search results display.

h3. Acceptance criteria

* Show 12 products per page in search results.
* Add pagination to the product list.
* Each product card should display:
** Image
** Name
** Price

---

## SEQ-11 — As a user when i search by keyword in the product name if nothing matches i want the message No products found
- **Type:** Story
- **Status:** In Progress
- **Parent:** SEQ-2 — Browse and Search

### Description

h3. User story

As a user, when I search by product name and get no matches, I want to see “No products found” so I know there are no matching products.

h3. Context

When a product-name search returns no matches, show a clear message.

This applies only to name-scoped searches, ensuring consistent feedback whenever such searches yield zero results.

h3. Acceptance criteria

* If a product-name keyword search returns no results, display “No products found”.
* Show the message in the same view where results appear, visible immediately after the search completes.

h3.

---

## SEQ-15 — As a user when i click the cart icon i want it to show the total no of items in the cart
- **Type:** Story
- **Status:** In Progress
- **Parent:** SEQ-3 — Cart

### Description

h3. User story

As a user, when I click the cart icon, I want it to show the total number of items in the cart so that I can quickly see how many items I have added.

h3. Context

The issue is about the cart icon display. The goal is to show the total number of items in the cart.

h3. Acceptance criteria

* The cart icon shows the total number of items in the cart.
* When I remove an item from the cart, the total number decreases.
* When I add an item to the cart, the total number increases.

---

## SEQ-16 — As a user i want each item could have a quantity from 1 to 10 and changing the quantity should update the line total
- **Type:** Story
- **Status:** Done
- **Parent:** SEQ-3 — Cart

### Description

h3. User story

As a user, when I view an item, I want to set its quantity from 1 to 10 so that the line total updates when the quantity changes.

h3. Context

The issue is about allowing each item to have a selectable quantity and recalculating the line total when that quantity is changed.

h3. Acceptance criteria

* Each item can have a quantity from 1 to 10.
* Changing the quantity updates the line total.

---

## SEQ-20 — As a user when the payment page is open i want the payment options like payment by card,UPI,cash on delivery so that i can pay by choosing any one option
- **Type:** Story
- **Status:** In Progress
- **Parent:** SEQ-4 — Payment and CheckOut

### Description

h3. User story

As a user, when the payment page is open, I want to see payment options like card, UPI, and cash on delivery so that I can pay by choosing one option.

h3. Context

The issue is about showing payment methods on the payment page.

h3. Acceptance criteria

* It should show different payment options.
* It should include a gift card payment option.

---

## SEQ-7 — As a user after 5 consecutive failed login attempts i want the account to be locked for 15 min
- **Type:** Story
- **Status:** To Do
- **Parent:** SEQ-1 — Account And Login

### Description

h3. User story

As a user, when I have 5 consecutive failed login attempts, I want my account to be locked for 15 minutes so that the account is protected.

h3. Context

The issue requests account locking after repeated failed login attempts.

h3. Acceptance criteria

* The account is locked after 5 consecutive failed login attempts.
* The lock lasts for 15 minutes.

### Exported issue links

- **Inward issue link (Test):** SEQ-35

---

## SEQ-9 — As a user when i click the logout button i want the session to be ended and when i press back button in the brower it should not show the account pages
- **Type:** Story
- **Status:** To Do
- **Parent:** SEQ-1 — Account And Login

### Description

h3. User story

As a user, when I click the logout button, I want the session to be ended so that when I press the back button in the browser, account pages are not shown.

h3. Context

The issue is about logout behavior in the browser after a user signs out.

h3. Acceptance criteria

* When the user clicks the logout button, the session is ended.
* After logout, pressing the browser back button does not show account pages.

---

## SEQ-12 — As a user when i filter by category and price range i want both filters should be used together
- **Type:** Story
- **Status:** To Do
- **Parent:** SEQ-2 — Browse and Search

### Description

h3. User story

As a user, when I filter by category and price range, I want both filters to be used together so that I can narrow down results more accurately.

h3. Context

The issue is about combining category and price range filters in the same search or listing view.

h3. Acceptance criteria

* Category and price range filters should work together.
* Applying one filter should not remove the other filter.
* Results should reflect both selected filters at the same time.

---

## SEQ-13 — As a user when i sort the products by price i want the product list in that sorted order
- **Type:** Story
- **Status:** To Do
- **Parent:** SEQ-2 — Browse and Search

### Description

h3. User story

As a user, when I sort the products by price, I want the product list to stay in that sorted order so that I can browse products more easily.

h3. Context

The issue is about keeping the product list sorted by price after the user applies a price sort.

h3. Acceptance criteria

* When I sort from price low to high, the products should be in ascending order.
* When I sort from price high to low, the products should be in descending order.

---

## SEQ-14 — As a user when i click on the product i want the product images,name,price and stock status so that i will decide whether to buy or not
- **Type:** Story
- **Status:** To Do
- **Parent:** SEQ-2 — Browse and Search

### Description

h3. User story

As a user, when I click on a product, I want to see the product images, name, price, and stock status so that I can decide whether to buy it or not.

h3. Context

The issue is about showing key product details after a user clicks on a product.

h3. Acceptance criteria

* Show whether the product is in stock or out of stock.
* Disable the add to cart button when the product is out of stock.

---

## SEQ-17 — As a user when i removed an item from the cart i want the cart total should be updated immediately and an empty cart should show a message
- **Type:** Story
- **Status:** To Do
- **Parent:** SEQ-3 — Cart

### Description

h3. User story

As a user, when I remove an item from the cart, I want the cart total to update immediately so that I can see the correct total.  
As a user, when the cart is empty, I want to see a message so that I know there are no items in the cart.

h3. Context

The issue is about updating the cart UI after an item is removed.

h3. Acceptance criteria

* The cart total is updated immediately after an item is removed.
* An empty cart shows a message.

---

## SEQ-18 — As a user when i apply a coupon code i want the cart value should be decreased according to the coupon dicount percentage and the cart should allow one coupon per order
- **Type:** Story
- **Status:** To Do
- **Parent:** SEQ-3 — Cart

### Description

h3. User story

As a user, when I apply a coupon code, I want the cart value to decrease according to the coupon discount percentage so that I can see the correct discounted total.

As a user, when I place an order, I want the cart to allow only one coupon per order so that I cannot apply multiple coupons.

h3. Context

The issue is about coupon code behavior in the cart. The cart total should update based on the coupon discount percentage.

h3. Acceptance criteria

* The cart value decreases according to the coupon discount percentage when a coupon code is applied.
* The cart allows only one coupon per order.

---

## SEQ-19 — As a user when i checkout i want the user to be logged in and shipping details are all mandatory
- **Type:** Story
- **Status:** To Do
- **Parent:** SEQ-4 — Payment and CheckOut

### Description

h3. User story

As a user, when I checkout, I want to be logged in so that I can complete the checkout process.

As a user, when I checkout, I want all shipping details to be mandatory so that my order has the required information.

h3. Context

The issue is about the checkout flow. It requires the user to be logged in before checkout. It also requires shipping details to be mandatory.

h3. Acceptance criteria

* The user must be logged in during checkout.
* All shipping details must be mandatory.

---

## SEQ-21 — As a user after placing the order i want a confirmation page shows a unique order id and a confirmation email is to be sent
- **Type:** Story
- **Status:** To Do
- **Parent:** SEQ-4 — Payment and CheckOut

### Description

h3. User story

As a user, when I place an order, I want to see a confirmation page with a unique order ID and receive a confirmation email so that I know my order was placed successfully.

h3. Context

The issue is about the order confirmation flow after a user places an order.

h3. Acceptance criteria

* A confirmation page is shown after the order is placed.
* The confirmation page includes a unique order ID.
* A confirmation email is sent after the order is placed.