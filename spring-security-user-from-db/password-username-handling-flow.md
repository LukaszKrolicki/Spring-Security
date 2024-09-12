# Password/Username handling flow

#### **Password Handling Flow**:

1. **User Submits Credentials**:
   * The user submits their username and password (e.g., through a login form or an API request).
2. **Authentication Request**:
   * Spring Security creates an `Authentication` object containing the submitted credentials.
3. **AuthenticationManager**:
   * The `AuthenticationManager` is responsible for delegating the authentication request to the appropriate `AuthenticationProvider`.
4. **AuthenticationProvider**:
   * The `AuthenticationProvider` (e.g., `DaoAuthenticationProvider`) is used to perform the actual authentication.
