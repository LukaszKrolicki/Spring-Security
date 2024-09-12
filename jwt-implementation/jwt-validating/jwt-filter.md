# Jwt filter

<figure><img src="../../.gitbook/assets/image (30).png" alt=""><figcaption></figcaption></figure>

* **Class Declaration**: The class `JwtFilter` extends `OncePerRequestFilter`, which means it is a filter that will be executed once for every HTTP request.
* **JWT Token Extraction**: In the `doFilterInternal` method, the filter first checks the `Authorization` header in the incoming request. If the header is not `null` and starts with `"Bearer "`, it assumes the rest of the header is a JWT (token) and extracts the token by removing the "Bearer " part.
* **Username Extraction**: Using the `jwtService`, it extracts the username from the token
* **Check if User is Already Authenticated**: If the `username` is not `null` and the current request is not yet authenticated (checked via `SecurityContextHolder.getContext().getAuthentication()`), it proceeds to authenticate the user.
* **Load User Details**: It uses the `MyUserDetailsService` (a custom service implementing `UserDetailsService`) to load the user's details (like roles and authorities) based on the extracted username.
* **Token Validation**: The filter then validates the token by calling `jwtService.validateToken()`, which ensures the token is correct, not expired, and belongs to the loaded user.
* **Set Authentication**: If the token is valid, it creates a `UsernamePasswordAuthenticationToken`, which holds the user’s details (but no credentials are needed here). It also attaches the request's details (IP address, session, etc.) using `WebAuthenticationDetailsSource`.
* **Update Security Context**: The filter updates the security context (`SecurityContextHolder`) to mark the user as authenticated for the current request.
* **Continue Filter Chain**: Finally, the filter allows the request to proceed down the filter chain (`filterChain.doFilter(request, response)`), ensuring the user is now authenticated.
