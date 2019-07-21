package com.hospital.registration.entities;

import lombok.Data;

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

    public Patient() {
    }

    public Patient(String phoneNumber, String password) {
        this.phoneNumber = phoneNumber;
        this.password = password;
    }
}
