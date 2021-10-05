package com.TravelPinMainServer.exception;

public class AlreadyJoinedEmailException extends Exception{
    public AlreadyJoinedEmailException() {
        super("이미 가입된 이메일 입니다.");
    }
}
