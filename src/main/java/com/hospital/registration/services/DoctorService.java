package com.hospital.registration.services;

import com.hospital.registration.entities.Doctor;
import com.hospital.registration.entities.Register;

import java.util.List;

public interface DoctorService {
    /**
     * @author Lucas
     * @date 2019/7/17
     * @param [deptName]
     * @return java.util.List<com.hospital.registration.entities.Doctor>
     * @des
     */
    List<Doctor> getDocsByDeptName(String deptName);

    /**
     * @author Lucas
     * @date 2019/7/17
     * @param [docName]
     * @return java.util.List<com.hospital.registration.entities.Register>
     * @des
     */
    List<Register> getRegisterByDoc(String docName);

    /**
     * @author Lucas
     * @date 2019/7/14
     * @param [doctor]
     * @return void
     * @des 添加Doctor
     */
    void addDoc(Doctor doctor);
}
