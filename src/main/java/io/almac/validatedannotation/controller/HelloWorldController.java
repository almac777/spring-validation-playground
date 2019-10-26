package io.almac.validatedannotation.controller;

import io.almac.validatedannotation.service.GreetingService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello-world")
@RequiredArgsConstructor
public class HelloWorldController {

    private final GreetingService helloGreetingService;

    @GetMapping("/{name}")
    public String hello(@PathVariable("name") String name) {
        return this.helloGreetingService.greet(name);
    }

}

