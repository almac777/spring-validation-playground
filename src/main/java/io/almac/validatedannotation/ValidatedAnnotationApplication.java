package io.almac.validatedannotation;

import io.almac.validatedannotation.service.GreetingService;
import io.almac.validatedannotation.service.HelloGreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ValidatedAnnotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ValidatedAnnotationApplication.class, args);
    }

}
