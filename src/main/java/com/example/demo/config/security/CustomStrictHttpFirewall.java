package com.example.demo.config.security;

import org.springframework.http.HttpMethod;
import org.springframework.security.web.firewall.StrictHttpFirewall;

import java.util.Arrays;
import java.util.List;

public class CustomStrictHttpFirewall extends StrictHttpFirewall {

    private static final List<String> DEFAULT_ALLOWED_HTTP_METHODS = Arrays.asList(
            HttpMethod.GET.name(),
            HttpMethod.POST.name(),
            HttpMethod.PUT.name(),
            HttpMethod.DELETE.name()
    );

    public CustomStrictHttpFirewall() {
        super();
        setAllowedHttpMethods(DEFAULT_ALLOWED_HTTP_METHODS);
    }
}
