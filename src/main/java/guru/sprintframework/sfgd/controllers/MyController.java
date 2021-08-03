package guru.sprintframework.sfgd.controllers;

import guru.sprintframework.sfgd.services.GreetingService;
import org.springframework.stereotype.Controller;

import java.net.SocketOption;
import java.sql.SQLOutput;

@Controller
public class MyController {

    private final GreetingService greetingService ;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){

        return greetingService.SayGreeting();
    }
}
