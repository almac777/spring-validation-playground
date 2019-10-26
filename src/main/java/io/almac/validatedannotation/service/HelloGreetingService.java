package io.almac.validatedannotation.service;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class HelloGreetingService implements GreetingService {

    public String greet(@NotNull @NotBlank String greeting) {
        return "hello " + greeting;
    }
}
