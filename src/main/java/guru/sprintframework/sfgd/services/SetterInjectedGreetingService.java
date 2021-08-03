package guru.sprintframework.sfgd.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String SayGreeting() {
        return "Hello world - setter";
    }
}
