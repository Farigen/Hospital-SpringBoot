package com.hospital.registration.mapper;

import com.hospital.registration.entities.Doctor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DocMapper {

    /**
     * @author Lucas
     * @date 2019/7/13
     * @param [Department]
     * @return java.util.List<com.hospital.registration.entities.Doctor>
     * @des 获取医生列表
     */
    List<Doctor> getDoctorList(@Param("deptName") String deptName);

    /**
     * @author Lucas
     * @date 2019/7/14
     * @param [doctor]
     * @return void
     * @des 添加doctor
     */
    Integer addDoc(@Param("doc") Doctor doctor);
}
