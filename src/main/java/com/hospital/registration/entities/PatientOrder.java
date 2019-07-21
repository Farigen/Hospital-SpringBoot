package com.hospital.registration.entities;

import lombok.Data;

import java.util.Date;

/**
 * @program: registration
 * @description: 患者订单
 * @author: Lucas
 * @create: 2019/07/13 22:34
 */
@Data
public class PatientOrder {
    private Integer id;
    private Integer registerId;
    private Integer patientId;
    private Integer status;
    private Date cancelDate;
}
