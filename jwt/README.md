# 💎 JWT

A **JWT (JSON Web Token)** is a compact, URL-safe token used for securely transmitting information between parties. It’s commonly used for authentication and authorization in web applications.

<figure><img src="../.gitbook/assets/image (23).png" alt=""><figcaption></figcaption></figure>

#### Structure of JWT:

A JWT consists of three parts, separated by dots (`.`):

1. **Header**: Contains metadata, including the type of token (JWT) and the hashing algorithm (e.g., HMAC SHA256).
2. **Payload**: Contains the claims or data you want to transmit (e.g., user ID, roles). This is typically encoded, not encrypted, so it is readable.
3. **Signature**: Ensures the token wasn’t tampered with. It’s created by hashing the header and payload with a secret key.

#### How JWT Works:

1. **User Login**:
   * The user provides credentials (e.g., username and password) to the server.
   * The server verifies the credentials.
2. **Token Generation**:
   * Upon successful authentication, the server generates a JWT.
   * The JWT contains information about the user in its payload (like the user ID and roles).
3. **Token Sent to Client**:
   * The server sends the JWT to the client (usually in the response body or as an HTTP cookie).
   * The client stores the JWT (typically in local storage or a cookie).
4. **Client Sends JWT with Requests**:
   * For subsequent requests, the client includes the JWT in the `Authorization` header (`Bearer <token>`).
5. **Token Verification**:
   * The server receives the JWT, extracts the signature, and verifies it using a secret key.
   * If the signature is valid, the server reads the payload and grants access based on the user’s roles or claims.
6.  **Authorization**:

    * The server uses the information in the JWT payload to determine what actions the user is allowed to perform (e.g., access specific resources).



    #### Example of a JWT:

    ```
    JhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9
    .eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ
    .SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c
    ```



    * **Header**: `{"alg": "HS256", "typ": "JWT"}`
    * **Payload**: `{"sub": "1234567890", "name": "John Doe", "iat": 1516239022}`
    * **Signature**: Generated using the header, payload, and secret key.



    #### Why JWT is Used:

    1. **Stateless Authentication**: No need to store user sessions on the server, as the token itself contains all the required information.
    2. **Scalability**: Since there’s no need for server-side sessions, JWT is scalable for distributed systems and microservices.
    3. **Cross-Domain Authentication**: JWT can be easily passed between systems and APIs for authentication across domains.
