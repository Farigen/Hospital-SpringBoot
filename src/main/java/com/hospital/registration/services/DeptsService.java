package com.hospital.registration.services;

import com.hospital.registration.entities.Department;
import com.hospital.registration.entities.DepartmentType;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: registration
 * @description: DeptsService
 * @author: Lucas
 * @create: 2019/07/14 16:55
 */
public interface DeptsService {

    /**
     * @author Lucas
     * @date 2019/7/17
     * @param [typeName]
     * @return java.util.List<com.hospital.registration.entities.Department>
     * @des
     */
    List<Department> getDeptsByTypeName(String typeName);

    /**
     * @author Lucas
     * @date 2019/7/17
     * @param [department]
     * @return void
     * @des
     */
    void addDept(Department department);

    /**
     * @author Lucas
     * @date 2019/7/17
     * @param [departmentType]
     * @return void
     * @des
     */
    void addDeptsType(DepartmentType departmentType);


}
