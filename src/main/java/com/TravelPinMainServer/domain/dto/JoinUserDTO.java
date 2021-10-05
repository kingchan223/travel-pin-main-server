package com.TravelPinMainServer.domain.dto;

import lombok.Getter;


@Getter
public class JoinUserDTO {
    private String username;
    private String email;
    private String password;
    private String phone;
    private String birth;
    private char sex;
    private String profileImageId;
}
