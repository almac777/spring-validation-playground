package io.almac.validatedannotation.config;

import io.almac.validatedannotation.service.GreetingService;
import io.almac.validatedannotation.service.HelloGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public GreetingService helloGreetingService() {
        return new HelloGreetingService();
    }

}
