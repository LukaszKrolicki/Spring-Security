# UserDetailsService

Us`erDetailsService` interface, is used by Spring Security to retrieve user-specific data. It is responsible for loading user details from the database based on the username provided during authentication.

<figure><img src="../../.gitbook/assets/image (15).png" alt=""><figcaption></figcaption></figure>

**Implementing `loadUserByUsername`**:

* **`loadUserByUsername(String username)`**: This method is defined by the `UserDetailsService` interface and is used to load user-specific data. It’s called by Spring Security during the authentication process.

**Fetching User Data**:

* **`userRepo.findByUsername(username)`**: Uses the repository to find a user by their username from the database.
* **Handling `null`**: If the user is not found in the database, it prints a message and throws a `UsernameNotFoundException`. This exception is handled by Spring Security to indicate that authentication has failed because the user does not exist.

**Returning UserDetails**:

* **`new UserPrincipal(user)`**: Creates and returns an instance of `UserPrincipal`, which implements `UserDetails`. This object contains user-specific information required by Spring Security, such as username, password, and authorities (roles or permissions).
