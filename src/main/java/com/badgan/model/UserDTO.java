package com.badgan.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class UserDTO {

    private Long id;
    private String name;
    private String cpfCnpj;
    private Date dateOfBirth;
    private String email;
    private String phone;
}
