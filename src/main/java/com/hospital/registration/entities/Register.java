package com.hospital.registration.entities;

import lombok.Data;

import java.util.Date;

/**
 * @program: registration
 * @description: 医院提供的可选的预定订单
 * @author: Lucas
 * @create: 2019/07/13 22:34
 */
@Data
public class Register {
    private Integer id;
    private Integer docId;
    private Date dateTime;
    private Integer timespan;
    private Integer availableNum;
    private Integer totalNum;
//    private String location;
}

