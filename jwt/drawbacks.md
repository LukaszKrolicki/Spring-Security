# Drawbacks

* **JWT theft** can occur when someone gets access to the token, usually through methods like **XSS (Cross-Site Scripting)** or insecure transmission.
* **CSRF (Cross-Site Request Forgery)** is a different attack where the attacker tricks the user's browser into making authenticated requests without the user's knowledge. Storing JWTs in **HttpOnly cookies** and using **CSRF tokens** can help protect against this.

While JWT theft is a legitimate concern, there are several best practices to mitigate it, such as:

* Using HTTPS for all communications.
* Setting short token expiry times and using refresh tokens.
* Storing JWTs securely in HttpOnly cookies.
* Adding IP/device binding, multi-factor authentication, and rate limiting.
