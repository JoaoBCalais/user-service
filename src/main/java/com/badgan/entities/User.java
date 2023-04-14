package com.badgan.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "user")
public class User {

    private Long id;
    private String name;
    private String cpfCnpj;
    private Date dateOfBirth;
    private String email;
    private String phone;
}
