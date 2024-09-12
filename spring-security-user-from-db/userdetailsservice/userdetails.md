# UserDetails

`UserPrincipal` class provides an implementation of the `UserDetails` interface, which is used by Spring Security to encapsulate user details during authentication.

<figure><img src="../../.gitbook/assets/image (17).png" alt=""><figcaption></figcaption></figure>

**Overridden Methods**:

**`getAuthorities()`**:

* Returns a collection of authorities (roles or permissions) granted to the user

**`getPassword()`**:

* Returns the user’s password.

**`getUsername()`**:

* Returns the username of the user.

**`isAccountNonExpired()`**:

* Indicates whether the user’s account has expired.

**`isAccountNonLocked()`**:

* Indicates whether the user’s account is locked.

**`CredentialsNonExpired()`**:

* Indicates whether the user’s credentials (password) have expired.

**`isEnabled()`**:

* Indicates whether the user is enabled.

