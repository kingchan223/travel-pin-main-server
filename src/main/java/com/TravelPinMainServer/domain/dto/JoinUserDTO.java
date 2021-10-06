package com.TravelPinMainServer.domain.dto;

import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
public class JoinUserDTO {

    @NotBlank
    private String username;

    @NotBlank//이메일 형식
    @Pattern(regexp="/^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i\n")
    private String email;

    @NotBlank//특수문자/숫자/문자 포함 8~15자리
    @Pattern(regexp="/^.*(?=^.{8,15}$)(?=.*\\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*$/\n")
    private String password;

    @NotBlank//000-000-0000 이거나 000-0000-0000
    @Pattern(regexp="/^\\d{3}-\\d{3,4}-\\d{4}$/")
    private String phone;

    @NotBlank//TODO 정규표현식 추가하기 생년월일 6자리로.
    private String birth;

    @NotBlank//TODO 정규표현식 추가하기
    private char sex;

    private String profileImageId;
}
