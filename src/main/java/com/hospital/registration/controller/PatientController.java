package com.hospital.registration.controller;

import com.hospital.registration.entities.Patient;
import com.hospital.registration.services.impl.PatientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @program: registration
 * @description: PatientController
 * @author: Lucas
 * @create: 2019/07/14 10:41
 */

@Controller
public class PatientController {

    private String SUCCESS = "{\"flag\":\"success\"}";
    private String FAILURE = "{\"flag\":\"failure\"}";

    @Autowired
    PatientServiceImpl patientServices;


    @ResponseBody
    @RequestMapping("/doLogin")
    public String login( String userName, String password){
        if (patientServices.getPasswordByPhoneNumber(userName).equals(password)){
            return SUCCESS;
        }else {
            return FAILURE;
        }
    }
    @ResponseBody
    @RequestMapping("/doRegistration")
    public String register(String phoneNumber, String password){
        try {
            patientServices.addPatient(new Patient(phoneNumber, password));
            return SUCCESS;
        }catch (Exception e){
            e.printStackTrace();
            return FAILURE;
        }
    }

    @ResponseBody
    @RequestMapping("/getAccountInfo")
    public Patient getPatientInfo(String phoneNumber){
        return patientServices.getPatientInfo(phoneNumber);
    }

    @ResponseBody
    @RequestMapping("/updateAccountInfo")
    public String updatePatientInfo(String name, String idCard, Integer gender, String email, String phoneNumber){
        Patient patient = new Patient();
        patient.setEmail(email);
        patient.setGender(gender);
        patient.setIdCard(idCard);
        patient.setName(name);
        patient.setPhoneNumber(phoneNumber);
        if (patientServices.updatePatient(patient) != 0){
            return SUCCESS;
        }else{
            return FAILURE;
        }
    }

}
