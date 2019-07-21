package com.hospital.registration.entities;

import lombok.Data;

/**
 * @program: registration
 * @description: 医院部门
 * @author: Lucas
 * @create: 2019/07/13 22:17
 */
@Data
public class Department {
    private Integer id;
    private String name;
    private String location;
    private Integer deptTypeId;
}
