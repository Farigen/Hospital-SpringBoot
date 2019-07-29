package com.hospital.registration.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * @program: registration
 * @description: 患者
 * @author: Lucas
 * @create: 2019/07/09 19:49
 */
@Data
public class Patient {
    private String id;
    private String name;
    private String idCard;
    private Integer gender;
    private String phoneNumber;
    private String email;
    private String password;
    private Date birthday;

    public Patient() {
    }

    public Patient(String phoneNumber, String password) {
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public Patient(String id, String name, String idCard, Integer gender, String phoneNumber, String email, Date birthday) {
        this.id = id;
        this.name = name;
        this.idCard = idCard;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.birthday = birthday;
    }
}
