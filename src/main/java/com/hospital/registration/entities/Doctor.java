package com.hospital.registration.entities;

import lombok.Data;

/**
 * @program: registration
 * @description: 医生
 * @author: Lucas
 * @create: 2019/07/09 19:55
 */
@Data
public class Doctor {
    private Integer id;
    private String name;
    private Integer gender;
    private Integer price;
    private String email;
    private String phoneNumber;
    private String imageUrl;
    private String title;
    private String des;
    private Integer available;
    private Integer deptId;

//    当存在有参构造函数时一定要加上无参构造函数，以供Mybatis使用
    public Doctor() {
    }

    public Doctor(String name, Integer gender, Integer price, String email, String phoneNumber, String imageUrl, String title, String des, Integer available, Integer deptId) {
        this.name = name;
        this.gender = gender;
        this.price = price;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.imageUrl = imageUrl;
        this.title = title;
        this.des = des;
        this.available = available;
        this.deptId = deptId;
    }
}
