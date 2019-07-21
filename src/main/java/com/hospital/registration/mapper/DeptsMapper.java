package com.hospital.registration.mapper;

import com.hospital.registration.entities.Department;
import com.hospital.registration.entities.DepartmentType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface DeptsMapper {

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
    Integer addDept(@Param("dept") Department department);

    /**
     * @author Lucas
     * @date 2019/7/17
     * @param [departmentType]
     * @return void
     * @des
     */
    Integer addDeptsType(@Param("departmentType")DepartmentType departmentType);
}
