package com.springframework.sfgdi.controllers;

import com.springframework.sfgdi.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new ConstructorInjectedGreetingService());
    }

    @Test
    void getGreetingService() {
        System.out.println(setterInjectedController.getGreeting());
    }
}