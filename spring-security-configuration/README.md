# 📼 Spring security configuration

Creating our own settings, we want to create our own filter chain

1.Create config package

2.Create SecurityConfig file

<figure><img src="../.gitbook/assets/image (7).png" alt=""><figcaption></figcaption></figure>

**`@Configuration`**: Marks the class as a configuration class in Spring, which means it's used to define beans and configuration settings.

**`@EnableWebSecurity`**: Enables Spring Security’s web security features, which will ensure that security filters are applied to incoming HTTP requests.

**`@Bean`**: The `securityFilterChain` method is annotated with `@Bean`, meaning Spring will manage and create the `SecurityFilterChain` bean, which is critical for configuring the security settings.

**`HttpSecurity http`**: `HttpSecurity` is used to configure web-based security for specific HTTP requests.

**`return http.build()`**: This method finalizes the configuration and builds the security filter chain.

This piece of code simply tells spring to not follow the default spring security chain, instead use our own security chain, we defined nothig, so now we can acces our endpoints without any authentication

