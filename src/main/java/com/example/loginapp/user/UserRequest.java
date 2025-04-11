package com.example.loginapp.user;

import lombok.Data;

public class UserRequest {

    @Data
    public static class JoinDTO {
        private String email;
        private String password;
        private String username;

        public User toEntity() {
            return User.builder()
                    .email(email)
                    .password(password)
                    .username(username)
                    .build();
        }
    }
}
