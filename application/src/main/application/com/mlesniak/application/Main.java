package com.mlesniak.application;

import com.mlesniak.api.SimpleService;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        SimpleService service = ServiceLoader.load(SimpleService.class).findFirst().get();
        String message = service.getMessage();
        System.out.println("From service: " + message);
    }
}
