# Stateless

<figure><img src="../.gitbook/assets/image (8).png" alt=""><figcaption></figcaption></figure>

When you configure **`sessionCreationPolicy(SessionCreationPolicy.STATELESS)`** in Spring Security, you are telling the application to **not use HTTP sessions** at all for storing security information (like the user's authentication state). Instead, each request must be **fully self-contained**, meaning it must include all the necessary information to authenticate and authorize the user.

#### What is Stateless?

* **Stateless** means that the server does not store any user session information between requests.
* In a **stateless** setup, every single HTTP request is independent and contains all the required details for authentication and authorization.
* This is in contrast to **stateful** applications, where the server creates and stores a **session** (with a session ID) to track user information between multiple requests.

#### How Stateless Works:

1. **No Server-Side Session Storage**:
   * When `SessionCreationPolicy.STATELESS` is set, Spring Security does **not create or use an HTTP session** to store the user's authentication status.
   * Each request must authenticate the user independently (for example, by including a **JWT token** or **API key** in the request).
2. **Authentication Every Time**:
   * Since there is no session to remember that a user is authenticated, each request must include authentication details (e.g., a **Bearer token** in the `Authorization` header).
   * The server processes the request, verifies the token, and grants access if the token is valid.
3. **No New Session ID**:
   * In a stateless system, **no session ID is generated** at all. The server does not track the state of any user session.
   * Every request is treated as **completely new**, so there is no concept of maintaining a session ID or a session lifecycle.

#### Example of Stateless Setup:

* You might use **JWT (JSON Web Token)** for authentication in a stateless system:
  * The user logs in, and the server issues a JWT token that contains all necessary user information (such as roles, username, expiration date).
  * This token is stored on the **client side** (typically in the browser’s local storage or as a cookie).
  * On every subsequent request, the client sends the JWT token in the **Authorization header** (e.g., `Authorization: Bearer <token>`).
  * The server verifies the token and processes the request if the token is valid.

#### Why is Every Request Independent in Stateless Mode?

* Since there is **no session** stored on the server, each request has to carry **all the necessary information** to verify who the user is (authentication) and what they can do (authorization).
* **No session state** is maintained between requests, so the user’s identity needs to be verified fresh on each request, typically by a token in the request.

#### Is Stateless Authentication Secure?

Yes, **stateless authentication can be very secure**, provided you use secure methods like **JWT tokens** or **OAuth2 tokens**. Here’s how:

1. **No Session Hijacking**:
   * Since there’s no session ID stored on the server, **session hijacking attacks** (where an attacker steals a session ID) are not possible. There’s no session ID to steal.
2. **Secure Token-based Authentication**:
   * Stateless systems often use **JWTs** or other tokens that are signed and **encrypted** to ensure they can’t be tampered with.
   * These tokens have a limited **expiration time**, so even if an attacker gets hold of the token, they can only use it for a short time.
3. **Simplified Server-Side Logic**:
   * The server does not need to manage session storage, session expiration, or memory for storing active sessions.
   * **Scaling** the application is easier, as there’s no session data to synchronize across multiple servers in a distributed environment.

#### Potential Downsides of Stateless Sessions:

* **Token Size**: Since the authentication token (e.g., JWT) has to include all necessary information, it can become large. This can add overhead to each request.
* **Token Expiry**: If the token has a short expiration time, users may need to frequently re-authenticate (or the client needs to refresh the token).
* **Token Revocation**: Stateless tokens like JWT are **self-contained**, meaning once they’re issued, they can’t easily be revoked. If a token is compromised, it could be used until it expires.

#### Why Use Stateless Sessions?

* **API-based systems** (like REST APIs) benefit from stateless sessions because:
  * They allow each request to be handled independently, making the system more scalable and robust.
  * They enable easy integration with other services, especially in **microservices** architectures.
  * There's no need to manage session data, making it ideal for **distributed systems**.

#### Summary:

* **Stateless** means no server-side sessions. Every request contains all the information needed for authentication (usually in the form of a token).
* **SessionCreationPolicy.STATELESS** disables session storage, meaning Spring Security won’t create or use sessions for authentication.
* **Security**: Stateless authentication can be secure, especially when using token-based mechanisms like JWT, where the tokens are signed and encrypted.
* **No new session IDs** are generated because there are **no sessions**. Each request is treated as new, and authentication is handled independently for each request.
