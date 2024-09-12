# 🔐 Spring Security

This project is about learning the fundamentals of Java Spring Security, implementig working JWT

Spring Security is a powerful and customizable framework for securing Java applications, primarily used for authentication and authorization. It offers various out-of-the-box configurations and allows customization for more complex scenarios.

#### Key Concepts of Spring Security

1. **Authentication**: Verifying the identity of a user or system trying to access resources.
2. **Authorization**: Determining what resources a user can access based on their roles or privileges.

#### Spring Security Flow

1. **Request Interception**: Every incoming request is intercepted by a filter, usually the **`SecurityFilterChain`**, which processes the security logic.
2. **Authentication**: The `AuthenticationManager` checks the user's credentials (username/password or tokens) using an **`AuthenticationProvider`**. If successful, an **`Authentication`** object is created and stored in the **SecurityContext**.
3. **Authorization**: Once authenticated, the user's access to resources (e.g., endpoints, methods) is determined by their roles or authorities using **AccessDecisionManager** or annotations like `@PreAuthorize`.
4. **Response**: If the user is authorized, the application continues its process and sends a response. If the user is not authorized, Spring Security returns an appropriate error (403 Forbidden, etc.).



1. [Spring Security](./)
   1. [Main components](spring-security/main-components.md)
   2. [Flow of security](spring-security/flow-of-security.md)
   3. [Possibilites](spring-security/what-are-possibilites.md)
2. [DispatcherServlet](spring-security/dispatcherservlet.md)
3. [Security context](spring-security/security-context.md)
4. [Seassion](spring-security/seassion.md)
5. [Security Filters](spring-security/security-filters/)
   1. [How Filters work](spring-security/security-filters/how-filters-work.md)
   2. [Authentication](spring-security/security-filters/authentication.md)
   3. [Authorization](spring-security/security-filters/authorization.md)
6. [CSRF](spring-security/csrf.md)
7. [Spring security configuration](spring-security/spring-security-configuration/)
   1. [Stateless](spring-security/spring-security-configuration/stateless.md)
8. [REST API PRINICPLES](spring-security/rest-api-principles.md)
9. [Spring Security User from DB](spring-security/spring-security-user-from-db/)
   1. [Security config](spring-security/spring-security-user-from-db/securityconfig.md)
   2. [Security filter chain](spring-security/spring-security-user-from-db/securityfilterchain.md)
   3. [Authentication Provider](spring-security/spring-security-user-from-db/authenticationprovider.md)
   4. [UserDetailsService](spring-security/spring-security-user-from-db/userdetailsservice/)
      1. [UserDetails](spring-security/spring-security-user-from-db/userdetailsservice/userdetails.md)
   5. [Password/Username handling flow](spring-security/spring-security-user-from-db/password-username-handling-flow.md)
   6. [Result](spring-security/spring-security-user-from-db/result.md)
10. [Password Encryption](spring-security/password-encryption/)
    1. [Code implementation](spring-security/password-encryption/code-implementation.md)
11. [JWT](spring-security/jwt/)
    1. [SecretKey](spring-security/jwt/secretkey.md)
    2. [Drawbacks](spring-security/jwt/drawbacks.md)
12. [JWT Implementation](spring-security/jwt-implementation/)
    1. [Setup for JWT](spring-security/jwt-implementation/setup-for-jwt.md)
    2. [JWT Key generation](spring-security/jwt-implementation/jwt-key-generation.md)
    3. [JWT validation](spring-security/jwt-implementation/jwt-validating/)
       1. [JWT filter](spring-security/jwt-implementation/jwt-validating/jwt-filter.md)
       2. [JWT service](spring-security/jwt-implementation/jwt-validating/jwtservice.md)
    4. [Result](spring-security/spring-security-user-from-db/result.md)





