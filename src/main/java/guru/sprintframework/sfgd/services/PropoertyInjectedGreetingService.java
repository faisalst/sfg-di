package guru.sprintframework.sfgd.services;

import org.springframework.stereotype.Service;

@Service
public class PropoertyInjectedGreetingService implements GreetingService {
    @Override
    public String SayGreeting() {
        return "Hello world - Property";
    }
}
