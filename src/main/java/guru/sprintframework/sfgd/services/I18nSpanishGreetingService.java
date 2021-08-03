package guru.sprintframework.sfgd.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Es")
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService{
    @Override
    public String SayGreeting() {
        return "Hola";
    }
}
