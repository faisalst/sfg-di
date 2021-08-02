package guru.sprintframework.sfgd.controllers;

import org.springframework.stereotype.Controller;

import java.net.SocketOption;
import java.sql.SQLOutput;

@Controller
public class MyController {


    public String sayHello(){
        System.out.println("Hello world!!");

        return "Hi Folks!";
    }
}
