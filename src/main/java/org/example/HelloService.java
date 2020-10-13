package org.example;

import java.util.Optional;

class HelloService {
    static final String FALLBACK_NAME = "word";

    String prepareGreeting(String name) {
        return "Hello clear" +
                "" + Optional.ofNullable(name).orElse(FALLBACK_NAME) + "!";
    }
}
