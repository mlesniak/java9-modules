package com.mlesniak.implementation;

import com.mlesniak.api.SimpleService;

public class HelloWorldService implements SimpleService {
    public static final String message = "Hello, world";

    @Override
    public String getMessage() {
        return message;
    }
}
