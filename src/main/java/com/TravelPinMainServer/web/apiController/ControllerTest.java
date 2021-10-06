package com.TravelPinMainServer.web.apiController;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerTest {


    @GetMapping("/test")
    public String joinUsser(){
        System.out.println("asd");
        return "asd";
    }
}
