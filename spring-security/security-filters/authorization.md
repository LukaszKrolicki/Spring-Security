# Authorization

#### **Authorization**

* **What is it?**
  * **Authorization** is the process of verifying **what an authenticated user is allowed to do**.
  * Once a user is authenticated, the system determines if the user has the necessary permissions or roles to access certain resources or perform specific actions.
* **How does it work in Spring Security?**
  * After a user is authenticated, Spring Security checks if they have the appropriate roles or authorities to access a specific URL or function.
  * This is handled by the **`FilterSecurityInterceptor`**, which checks if the user's roles/authorities match the required permissions for accessing the resource.
