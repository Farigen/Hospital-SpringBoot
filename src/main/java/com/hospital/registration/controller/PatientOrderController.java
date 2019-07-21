package com.hospital.registration.controller;

import com.hospital.registration.entities.PatientOrder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: registration
 * @description: PatientOrderController
 * @author: Lucas
 * @create: 2019/07/14 16:21
 */
@Controller
public class PatientOrderController {

    @RequestMapping("/addPatientOrder")
    public boolean addPatientOrder(){

        return false;
    }

    @RequestMapping("/getPatientOrder")
    public PatientOrder getPatientOrder(){

        return null;
    }
}
