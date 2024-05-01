package com.proj.digilibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {


    private String id;
    private String name;
    private String password;
    private String role;
    private String email;
    private String phoneNumber;

}
