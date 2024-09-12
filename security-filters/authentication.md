# Authentication

#### **Authentication**

* **What is it?**
  * **Authentication** is the process of verifying **who the user is**.
  * It typically involves checking the user's credentials (like username and password, or a token) to determine if they are who they claim to be.
* **How does it work in Spring Security?**
  * When a user tries to log in, their credentials are passed to an **authentication provider** (like a `UsernamePasswordAuthenticationToken`).
  * If the credentials are valid, the user is considered authenticated, and their identity is stored in a **SecurityContext**.
