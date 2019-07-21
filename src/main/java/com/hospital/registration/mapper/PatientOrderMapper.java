package com.hospital.registration.mapper;

import com.hospital.registration.entities.PatientOrder;
import com.hospital.registration.entities.Record;
import com.hospital.registration.entities.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PatientOrderMapper {

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
     * @date 2019/7/18
     * @param [phoneNumber]
     * @return com.hospital.registration.entities.Record
     * @des
     */
    Record getRecord(String phoneNumber);
}
