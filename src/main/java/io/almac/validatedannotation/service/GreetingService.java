package io.almac.validatedannotation.service;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Validated
public interface GreetingService {

    String greet(@NotNull @NotBlank String greeting);

}
