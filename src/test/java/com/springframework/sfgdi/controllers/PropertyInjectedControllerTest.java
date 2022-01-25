package com.springframework.sfgdi.controllers;

import com.springframework.sfgdi.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {
    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new ConstructorInjectedGreetingService();
    }

    @Test
    void getGreetingService() {
        System.out.println(propertyInjectedController.getGreeting());
    }
}