# Main components

* **`SecurityFilterChain`**:
  * Core to Spring Security.
  * It consists of a chain of filters responsible for processing security-related tasks such as authentication, session management, and CSRF protection.
* **`AuthenticationManager`**:
  * Central interface to handle authentication.
  * It receives authentication requests and delegates to \*\*`AuthenticationProvider`\*\*s.
* **`AuthenticationProvider`**:
  * Performs the actual authentication.
  * This can be customized (e.g., using a database, LDAP, OAuth).
* **`UserDetailsService`**:
  * Loads user-specific data, such as credentials and roles, from a database or other sources.
  * Integrates with `AuthenticationProvider` to verify user information.
* **`SecurityContext`**:
  * Stores information about the authenticated user, such as roles and authorities.
  * Accessible via `SecurityContextHolder`.
* **`AccessDecisionManager`**:
  * Determines if a user has access to a specific resource based on their roles/authorities.
* **Annotations**:
  * `@EnableWebSecurity`: Enables Spring Security in the application.
  * `@PreAuthorize`: Secures methods by checking user roles before the method is executed.
  * `@Secured`, `@RolesAllowed`: Additional annotations for defining security at the method level.
