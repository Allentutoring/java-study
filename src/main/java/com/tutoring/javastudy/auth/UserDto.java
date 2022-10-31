package com.tutoring.javastudy.auth;

import lombok.*;

@Data
@AllArgsConstructor
@ToString
public class UserDto {
    private String password;

    private String name;

    private String nickname;


}
