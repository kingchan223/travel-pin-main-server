package com.TravelPinMainServer.web.apiController;

import com.TravelPinMainServer.domain.dto.JoinUserDTO;
import com.TravelPinMainServer.domain.dto.RespDTO;
import com.TravelPinMainServer.exception.AlreadyJoinedEmailException;
import com.TravelPinMainServer.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserService userService;

    @PostMapping("/api/user")
    public ResponseEntity<?> joinUser(@RequestBody JoinUserDTO joinUserDto) throws AlreadyJoinedEmailException {
        System.out.println("asd");
        userService.joinUser(joinUserDto);
        return new ResponseEntity<>(new RespDTO(200, "sucess", null), HttpStatus.OK);
    }
}
