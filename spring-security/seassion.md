# ⏳ Seassion

A **session** in web applications is a mechanism to store data specific to a user across multiple requests during their interaction with a website. Since HTTP is **stateless** (meaning it doesn't remember information between requests), a session allows a web server to maintain state across multiple interactions with a user.

#### Key Concepts of Sessions

1. **Session Definition**:
   * A session is a way to associate a sequence of requests from the same user with a persistent state (like authentication status, user preferences, shopping cart contents, etc.).
   * It is created when a user logs in or interacts with the website and continues until the user logs out, closes the browser, or the session expires.
2. **How a Session Works**:
   * **Session ID**:
     * When a session is created, the server generates a unique identifier called a **session ID**. This ID is used to link the user’s subsequent requests to their session data.
     * This session ID is typically stored as a **cookie** in the user's browser (though it can also be passed as a URL parameter or stored in other ways).
   * **Session Storage**:
     * The session data (like user information, preferences, or temporary data) is stored on the server side. The browser only keeps the session ID, which it sends to the server with each request.
     * When the server receives a request, it looks up the session ID and retrieves the corresponding session data to determine the user’s state (e.g., whether they are logged in, what permissions they have).
3. **Session Lifecycle**:
   * **Session Creation**:
     * A session is usually created when the user performs an action that requires the server to keep track of their state. For example, when they log in, add items to a cart, or navigate to a page requiring authentication.
   * **Session Management**:
     * After the session is created, each request the user makes will include the session ID, allowing the server to retrieve the user’s session data.
   * **Session Expiry**:
     * Sessions typically have a **timeout period**. If the user doesn’t interact with the server within this time, the session is invalidated.
     * The server may also manually end (or "invalidate") a session, such as when the user logs out or when an application decides that a session should no longer be valid (e.g., for security reasons).
4. **Session Storage on the Server**:
   * **In-Memory**: By default, many application servers store session data in memory. This is quick, but can be inefficient for large-scale applications or when multiple servers are used (as the session data is not shared between them).
   * **Persistent Storage**: To handle large-scale applications or distributed systems, sessions can be stored in databases (e.g., **Redis**, **MySQL**), allowing for session persistence across multiple servers.
   * **Spring Session**: In Spring applications, **Spring Session** can be used to store session information in a distributed store like Redis, enabling the session to survive server restarts or be shared across different servers in a clustered environment.
