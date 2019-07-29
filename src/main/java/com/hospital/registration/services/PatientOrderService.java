package com.hospital.registration.services;

import com.hospital.registration.entities.PatientOrder;
import com.hospital.registration.entities.Record;
import com.hospital.registration.entities.Register;

import java.util.List;

public interface PatientOrderService {
    /**
     * @author Lucas
     * @date 2019/7/18
     * @param [patientOrder]
     * @return java.lang.Integer
     * @des
     */
    Integer addPatientOrder(PatientOrder patientOrder);

    /**
     * @author Lucas
     * @date 2019/7/28
     * @param [patientId]
     * @return java.util.List<com.hospital.registration.entities.Record>
     * @des
     */
    List<Record> getRecordsByPatientId(Integer patientId);
}
