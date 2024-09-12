# How Filters work

#### How Filters Work:

* When Spring Security is added to the application, the request processing chain includes a **filter chain** of these security filters.
* Each HTTP request passes through these filters before reaching the **`DispatcherServlet`**.
* These filters handle **authentication** (determining if the user is who they claim to be) and **authorization** (determining if the user has permission to access a specific resource).

In summary, **Spring Security filters** ensure that security concerns (like authentication, authorization, and CSRF protection) are addressed before a request is handled by a controller or any other servlet in your application.
