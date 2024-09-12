# JWT key Generation

<figure><img src="../../.gitbook/assets/image (27).png" alt=""><figcaption></figcaption></figure>

#### **What the Code Does**

1.  **Secret Key Generation**:

    * In the constructor of `JWTservice`, you're generating a **secret key** using `HmacSHA256` (a secure hashing algorithm). This secret key will be used to sign the JWTs, ensuring their integrity and authenticity.
    * The secret key is generated via a cryptographic library (`KeyGenerator`), and it is base64-encoded so that it can be used in the JWT generation process.
    * If the key generation fails, an exception is caught, and an error is printed.


2.  **Generating JWT** (`generateToken` method):

    * The `generateToken` method creates a JWT for a specific user (using their username).
    * A map of claims (`claims`) can be added to the token if additional data is needed (e.g., roles, permissions, etc.). Right now, it's just an empty map.
    * The **subject** of the token is set to the `username` provided.
    * **IssuedAt** is the current timestamp when the token is created.
    * **Expiration** is set to 30 hours from the current time, which means the token is valid for 30 hours.
    * The token is **signed** using the secret key that was generated.
    * Finally, the JWT is **compact()**'d, which means it is encoded and returned as a compact string (the actual token).

    <figure><img src="../../.gitbook/assets/image (28).png" alt=""><figcaption></figcaption></figure>

    Now when we log in we receive JWT token, lets check jwt.io to see what this token contains

    <figure><img src="../../.gitbook/assets/image (29).png" alt=""><figcaption></figcaption></figure>

