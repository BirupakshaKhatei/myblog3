package com.myblog.myblog3;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass1 {
    public static void main(String[] args) {

        List<Login> logins = Arrays.asList(
                new Login("biru","testing"),
                new Login("mike","testing"),
                new Login("adam","tetsing")
        );

        List<LoginDto> dtos = logins.stream().map(login -> mapToDto(login)).collect(Collectors.toList());
        System.out.println(dtos);
    }

    static LoginDto mapToDto (Login login){
        LoginDto dto = new LoginDto();
        dto.setUserName(login.getUserName());
        dto.setPassword(login.getPassword());
        return dto;
    }

}
