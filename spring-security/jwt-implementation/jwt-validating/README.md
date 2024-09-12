# JWT validating

1. We must add filter before to our filter chain

<figure><img src="../../../.gitbook/assets/image (22).png" alt=""><figcaption></figcaption></figure>

#### `.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class)`

This part ensures that your `jwtFilter` is executed **before** the `UsernamePasswordAuthenticationFilter` in the Spring Security filter chain, meaning the JWT-based authentication happens first, and the usual username/password authentication is skipped if the JWT is valid.
