package com.hospital.registration.entities;

import lombok.Data;

import java.util.Date;

/**
 * @program: registration
 * @description:
 * @author: Lucas
 * @create: 2019/07/18 21:32
 */
@Data
public class Record {
    private Date date;
    private String docName;
    private String deptName;
    private String location;
}
