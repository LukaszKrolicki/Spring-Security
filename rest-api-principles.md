# 😇 REST API PRINCIPLES

R**EST Principles**: REST defines six architectural constraints:

1. **Client-Server**: Separation of concerns between the client (frontend) and the server (backend).
2. **Statelessness**: Each request from the client must contain all necessary information, as the server doesn’t maintain session state between requests.
3. **Cacheability**: Responses should explicitly indicate if they can be cached.
4. **Layered System**: The system is composed of hierarchical layers that may include intermediaries (such as proxies or gateways) between the client and server.
5. **Uniform Interface**: Resources are identified in requests (usually via URLs), and interactions are performed using standard HTTP methods (GET, POST, PUT, DELETE).
6. **Code on Demand** (optional): Servers can send executable code to clients for them to execute (though this is not commonly used).
