# Setup for JWT

We change the flow of authentication, before AuthenticationManager behind the scenes was using Basic Auth now we changing it to us

#### Why Are We Doing This?

1. **Custom Authentication Flow**:
   * Instead of relying on default Basic Authentication (where credentials are sent with every request), you're handling the authentication manually. This is useful when you want to **issue a JWT** after successful authentication, which is typically used in **stateless** applications.
2. **JWT-Based Authentication**:
   * The goal here is to switch from **session-based authentication** (like Basic Auth) to **JWT-based authentication**.
   * The user provides their credentials, and if valid, they get a **JWT token**. This token can be used for subsequent requests, eliminating the need to send the username and password each time.

The **`AuthenticationManager`** is a central component in Spring Security responsible for authenticating a user. It acts as the orchestrator that processes authentication requests and delegates them to one or more **`AuthenticationProvider`** implementations. The `AuthenticationManager` decides whether an authentication attempt is valid or not based on the provided credentials.

#### How Authentication Works in Spring:

1. **Client submits credentials** (username and password).
2. The `AuthenticationManager` is called to authenticate the request.
3. The `AuthenticationManager` delegates the actual work to the configured **`AuthenticationProvider`**.
4. The `AuthenticationProvider` checks the user credentials (e.g., through the database, LDAP, etc.).
5. If successful, the `AuthenticationManager` returns an authenticated token.
6. If the authentication fails, an exception is thrown or the response indicates failure.

1.In SecurityConfig

<figure><img src="../../.gitbook/assets/image (24).png" alt=""><figcaption></figcaption></figure>

**What This Does**:

* This creates a Spring-managed bean of `AuthenticationManager` by getting it from the `AuthenticationConfiguration`.
* The `AuthenticationConfiguration` is part of Spring Security that automatically configures the security setup, including which `AuthenticationProvider` to use.
* By making `AuthenticationManager` a bean, you are allowing it to be injected and used elsewhere in your application for manual authentication logic.

2. In user service

<figure><img src="../../.gitbook/assets/image (25).png" alt=""><figcaption></figcaption></figure>

**What This Does**:

* **Manual Authentication**: Instead of using Spring Security's automatic filter-based authentication (like Basic or Form login), you are manually authenticating the user by calling the `authenticate()` method on the `AuthenticationManager`.
* **Creating an `Authentication` Object**: `UsernamePasswordAuthenticationToken` is an implementation of the `Authentication` interface that holds the username and password. It's used here to represent the user’s credentials.
* **Calling `authenticate()`**: This method sends the credentials to the `AuthenticationManager`, which checks if they are valid (usually by passing them to the appropriate `AuthenticationProvider`).
* **Check if Authenticated**: If the authentication is successful, `isAuthenticated()` returns `true`.
* **JWT Token Generation**: If the user is successfully authenticated, the method generates and returns a JWT using `jwtService.generateToken()`.
* **Failure Case**: If the authentication fails, it returns `"User is not authenticated"`
