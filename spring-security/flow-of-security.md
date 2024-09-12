# Flow of security

#### Flow Diagram Description

* **Client Request**: The client sends a request (e.g., HTTP request).
* **Security Filters**: Spring Security intercepts the request with a filter chain (authentication, CSRF, etc.).
* **Authentication**: The request is passed to `AuthenticationManager` and `AuthenticationProvider` to verify the user’s credentials.
* **UserDetailsService**: If necessary, the user details are fetched from the database (e.g., roles and permissions).
* **Authorization**: The authenticated user's roles/authorities are checked by `AccessDecisionManager` to determine if they can access the requested resource.
* **Response**: If successful, the application proceeds to serve the response. If not, Spring Security responds with an appropriate error.

<figure><img src="../.gitbook/assets/image (31).png" alt=""><figcaption></figcaption></figure>
