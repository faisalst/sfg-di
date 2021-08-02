package guru.sprintframework.sfgd.controllers;

import guru.sprintframework.sfgd.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    // mimicking what the sprint controller would do. like creating the object etc.
    void setUp() {
        // it creates the controller
    propertyInjectedController = new PropertyInjectedController();
    // it injects the service we need to use.
    propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(propertyInjectedController.getGreeting());
    }
}