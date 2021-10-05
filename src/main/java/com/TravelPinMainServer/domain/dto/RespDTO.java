package com.TravelPinMainServer.domain.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RespDTO<T> {
    private int code;
    private String msg;
    private T member;
}
