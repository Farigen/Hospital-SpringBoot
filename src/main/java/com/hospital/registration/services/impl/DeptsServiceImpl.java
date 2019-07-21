package com.hospital.registration.services.impl;

import com.hospital.registration.entities.Department;
import com.hospital.registration.entities.DepartmentType;
import com.hospital.registration.mapper.DeptsMapper;
import com.hospital.registration.services.DeptsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: registration
 * @description: DeptsServiceImpl
 * @author: Lucas
 * @create: 2019/07/17 15:02
 */
@Service
public class DeptsServiceImpl implements DeptsService {

    @Autowired
    DeptsMapper deptsMapper;

    @Override
    public List<Department> getDeptsByTypeName(String typeName) {
        return deptsMapper.getDeptsByTypeName(typeName);
    }

    @Override
    public void addDept(Department department) {
        deptsMapper.addDept(department);
    }

    @Override
    public void addDeptsType(DepartmentType  departmentType) {
        deptsMapper.addDeptsType(departmentType);
    }
}
