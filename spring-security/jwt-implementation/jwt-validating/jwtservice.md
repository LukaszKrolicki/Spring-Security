# JwtService

Additional functions:

<figure><img src="../../../.gitbook/assets/image (32).png" alt=""><figcaption></figcaption></figure>

#### 1. **`extractUserName(String token)`**

* **What it does**: Extracts the username from the JWT token.
* **How**: It calls `extractClaim(token, Claims::getSubject)` which gets the "subject" field from the token. In JWTs, the subject field often stores the username.
* `Claims::getSubject` is a method reference that points to `getSubject()` method from the `Claims` object. This method pulls out the value labeled as "subject" in the token.

#### 2. **`extractClaim(String token, Function<Claims, T> claimResolver)`**

* **What it does**: This method helps to extract any specific piece of information (called a "claim") from the JWT.
* **How**:
  * It first retrieves all claims (all the data) from the token by calling `extractAllClaims(token)`.
  * Then it uses the `claimResolver` (which can be any function that gets a particular piece of data) to return the value you want from the claims.

#### 3. **`extractAllClaims(String token)`**

* **What it does**: Retrieves all the data (claims) from the JWT token.
* **How**:
  * The `Jwts.parser()` starts a process to read the token.
  * `verifyWith(getKey())` means it checks the token's signature using a key (your secret key) to ensure the token hasn't been tampered with.
  * `build().parseSignedClaims(token).getPayload()` completes the parsing and extracts the claims (all the information stored in the token).

#### 4. **`validateToken(String token, UserDetails userDetails)`**

* **What it does**: Checks if the token is valid for the given user.
* **How**:
  * First, it extracts the username from the token using `extractUserName(token)`.
  * Then it checks two things:
    1. If the username from the token matches the username in the `userDetails` object (usually the currently logged-in user).
    2. If the token has not expired by calling `!isTokenExpired(token)`.

#### 5. **`isTokenExpired(String token)`**

* **What it does**: Checks if the token has expired.
* **How**: It extracts the expiration date from the token using `extractExpiration(token)` and compares it with the current date (`new Date()`). If the token’s expiration date is before the current date, the token has expired.

#### 6. **`extractExpiration(String token)`**

* **What it does**: Extracts the expiration date from the JWT.
* **How**: It uses the `extractClaim(token, Claims::getExpiration)` to pull the expiration date (the `exp` claim) from the token. The process is similar to how `extractUserName()` works but instead of the "subject," it's retrieving the expiration date
