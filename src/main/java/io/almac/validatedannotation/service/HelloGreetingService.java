package io.almac.validatedannotation.service;

import org.springframework.stereotype.Service;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Service
public class HelloGreetingService implements GreetingService {

    public String greet(@NotNull @NotBlank String greeting) {
        return "hello " + greeting;
    }

}
