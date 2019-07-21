package com.hospital.registration.services.impl;

import com.hospital.registration.entities.Patient;
import com.hospital.registration.mapper.PatientMapper;
import com.hospital.registration.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: registration
 * @description: PatientServicesImpl
 * @author: Lucas
 * @create: 2019/07/14 10:52
 */
@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientMapper patientMapper;

    @Override
    public String getPasswordByPhoneNumber(String phoneNumber) {
        return patientMapper.getPasswordByPhoneNumber(phoneNumber);
    }

    @Override
    public Patient getPatientInfo(String phoneNumber) {
        return patientMapper.getPatientInfo(phoneNumber);
    }

    @Override
    public void addPatient(Patient patient) {
        patientMapper.addPatient(patient);
    }

    @Override
    public Integer updatePatient(Patient patient) {
        return patientMapper.updatePatient(patient);
    }

}
