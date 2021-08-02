package guru.sprintframework.sfgd;

import guru.sprintframework.sfgd.controllers.ConstructorInjectedController;
import guru.sprintframework.sfgd.controllers.MyController;
import guru.sprintframework.sfgd.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDApplication {

	public static void main(String[] args) {

		// by defualt sprint creates the controller object and adds it to the context
		ApplicationContext ctx = SpringApplication.run(SfgDApplication.class, args);
		// so here I'm getting a referance for the context.
		MyController myController = (MyController) ctx.getBean("myController");
		String str = myController.sayHello();
		System.out.println(str);
		//
		SetterInjectedController setterInjectedController  = (SetterInjectedController) ctx.getBean("setterInjectedController");
		setterInjectedController.getGreeting();

	}

}
