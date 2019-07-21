package com.hospital.registration.entities;

import lombok.Getter;
import lombok.Setter;

/**
 * @program: registration
 * @description: 用户实体
 * @author: Lucas
 * @create: 2019/06/25 15:29
 */
public class User {
    @Getter@Setter
    private Long id;
    @Getter@Setter
    private String userName;
    @Getter@Setter
    private String password;
    @Getter@Setter
    private String name;

}
