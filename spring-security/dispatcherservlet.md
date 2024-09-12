# 🛣️ DispatcherServlet

#### **DispatcherServlet**

* **What is it?**
  * The **`DispatcherServlet`** is the central part of the **Spring MVC framework**. It acts as a **front controller** that handles all incoming HTTP requests and dispatches them to the appropriate handlers (controllers) based on the request's URL, HTTP method, and other factors.
*   **How does it work?**

    * When a request is received, the **`DispatcherServlet`** checks which controller method should handle the request by consulting the **Handler Mappings**.
    * After processing the request, it either returns a **Model and View** for rendering or a direct response (like JSON).



    **Steps in Request Flow**:

    1. Request enters the **`DispatcherServlet`**.
    2. It consults the **HandlerMapping** to find the correct controller.
    3. The controller processes the request and returns a response.
    4. The response is either sent to the **ViewResolver** to render a view (like an HTML page) or directly returned (for API responses).
