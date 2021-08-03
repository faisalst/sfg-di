package guru.sprintframework.sfgd.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreeetingService implements GreetingService{
    @Override
    public String SayGreeting() {
        return "Primary Greeting";
    }
}
