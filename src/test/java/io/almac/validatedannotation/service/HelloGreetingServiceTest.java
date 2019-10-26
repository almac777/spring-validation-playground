package io.almac.validatedannotation.service;

import io.almac.validatedannotation.ValidatedAnnotationApplication;
import io.almac.validatedannotation.config.BeanConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import javax.validation.ConstraintViolationException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@Import(BeanConfig.class)
class HelloGreetingServiceTest {

    @Autowired
    private GreetingService helloGreetingService;

    @Test
    void whenGreetWithStringInput_shouldDisplayGreeting() {
        String input = "alex";
        assertEquals("hello alex", helloGreetingService.greet(input));
    }

    @Test
    void whenGreetWithNullInput_shouldThrowException() {
        assertThrows(ConstraintViolationException.class, () -> helloGreetingService.greet(null));
    }

    @Test
    void whenGreetWithBlankInput_shouldThrowException() {
        assertThrows(ConstraintViolationException.class, () -> helloGreetingService.greet(""));
    }

}