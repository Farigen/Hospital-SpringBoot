package com.hospital.registration.services.impl;

import com.hospital.registration.entities.Doctor;
import com.hospital.registration.entities.Register;
import com.hospital.registration.mapper.DocMapper;
import com.hospital.registration.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: registration
 * @description: DoctorServiceImpl
 * @author: Lucas
 * @create: 2019/07/17 19:04
 */
@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    DocMapper docMapper;

    @Override
    public List<Doctor> getDocsByDeptName(String deptName) {
        return docMapper.getDoctorList(deptName);
    }

    @Override
    public List<Register> getRegisterByDoc(String docName) {
        return null;
    }

    @Override
    public void addDoc(Doctor doctor) {
        docMapper.addDoc(doctor);
    }
}
