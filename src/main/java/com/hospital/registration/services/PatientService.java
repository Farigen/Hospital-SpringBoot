package com.hospital.registration.services;

import com.hospital.registration.entities.Patient;

public interface PatientService {
    /**
     * @author Lucas
     * @date 2019/7/14
     * @param [phoneNumber]
     * @return java.lang.String
     * @des
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
    void addPatient(Patient patient);

    /**
     * @author Lucas
     * @date 2019/7/17
     * @param [patient]
     * @return java.lang.Integer
     * @des
     */
    Integer updatePatient(Patient patient);
}
