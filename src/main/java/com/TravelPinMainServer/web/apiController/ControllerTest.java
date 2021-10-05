package com.TravelPinMainServer.web.apiController;

import com.TravelPinMainServer.domain.dto.JoinUserDTO;
import com.TravelPinMainServer.domain.dto.RespDTO;
import com.TravelPinMainServer.exception.AlreadyJoinedEmailException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ControllerTest {


    @PostMapping("/test")
    public String joinUsser(){
        System.out.println("asd");
        return "asd";
    }
}
