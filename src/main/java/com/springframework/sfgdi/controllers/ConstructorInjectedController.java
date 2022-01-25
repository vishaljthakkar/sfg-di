package com.springframework.sfgdi.controllers;

import com.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

// Most Preferred way of DI
@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    // @Autowired is optional here
    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // @Autowired is optional here
    // If you remove the qualifier about Primary Bean instance will be injected.
//    public ConstructorInjectedController(GreetingService greetingService) {
//        this.greetingService = greetingService;
//    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
