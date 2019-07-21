package com.hospital.registration.mapper;

import com.hospital.registration.entities.Patient;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PatientMapper {

    /**
     * @author Lucas
     * @date 2019/7/13
     * @param [phoneNumber]
     * @return java.lang.String
     * @des 用于验证登录
     */
    String getPasswordByPhoneNumber(String phoneNumber);

    /**
     * @author Lucas
     * @date 2019/7/13
     * @param [phoneNumber]
     * @return com.hospital.registration.entities.Patient
     * @des 用于获取和修改个人信息
     */
    Patient getPatientInfo(String phoneNumber);

    /**
     * @author Lucas
     * @date 2019/7/14
     * @param [patient]
     * @return void
     * @des 注册时添加用户
     */
    Integer addPatient(@Param("patient") Patient patient);

    /**
     * @author Lucas
     * @date 2019/7/17
     * @param [patient]
     * @return java.lang.Integer
     * @des
     */
    Integer updatePatient(@Param("patient") Patient patient);
}
