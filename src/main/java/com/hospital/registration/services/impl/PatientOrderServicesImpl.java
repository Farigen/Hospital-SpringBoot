package com.hospital.registration.services.impl;

import com.hospital.registration.entities.PatientOrder;
import com.hospital.registration.entities.Record;
import com.hospital.registration.mapper.PatientMapper;
import com.hospital.registration.mapper.PatientOrderMapper;
import com.hospital.registration.services.PatientOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: registration
 * @description:
 * @author: Lucas
 * @create: 2019/07/28 19:58
 */
@Service
public class PatientOrderServicesImpl implements PatientOrderService {
    @Autowired
    PatientOrderMapper patientOrderMapper;

    @Override
    public Integer addPatientOrder(PatientOrder patientOrder) {
        return patientOrderMapper.addPatientOrder(patientOrder);
    }

    @Override
    public List<Record> getRecordsByPatientId(Integer patientId) {
        return patientOrderMapper.getRecordsByPatientId(patientId);
    }
}
