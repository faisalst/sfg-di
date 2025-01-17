package guru.sprintframework.sfgd;

import guru.sprintframework.sfgd.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDApplication {

	public static void main(String[] args) {

		// by defualt sprint creates the controller object and adds it to the context
		ApplicationContext ctx = SpringApplication.run(SfgDApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("------- Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("------ Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------- Constructor" );
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	// I18nController

		System.out.println("-------- Profiles" );
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.getGreeting());

	}

}
