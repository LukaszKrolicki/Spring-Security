# 🛂 Security context

* The **SecurityContext** stores security information for the **current authenticated user** and is not a global store for all users.
* It is typically stored in memory (via `ThreadLocal` for a request or HTTP session for multiple requests).
* By default, it is not stored in the database, but you can use a persistent session store (like Redis or a relational database) if necessary.
* The server's capacity to handle authenticated users is more dependent on its memory and session management than on the `SecurityContext` itself.
