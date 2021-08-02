package guru.sprintframework.sfgd.controllers;

import guru.sprintframework.sfgd.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;


    public String getGreeting(){
        return greetingService.SayGreeting();
    }

}
