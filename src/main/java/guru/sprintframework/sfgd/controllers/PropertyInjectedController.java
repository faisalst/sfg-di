package guru.sprintframework.sfgd.controllers;

import guru.sprintframework.sfgd.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    @Qualifier("propoertyInjectedGreetingService")
    public GreetingService greetingService;


    public String getGreeting(){
        return greetingService.SayGreeting();
    }

}
