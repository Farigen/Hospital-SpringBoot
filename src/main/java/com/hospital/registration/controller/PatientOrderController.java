package com.hospital.registration.controller;

import com.alibaba.fastjson.JSONObject;
import com.hospital.registration.entities.PatientOrder;
import com.hospital.registration.entities.Record;
import com.hospital.registration.services.PatientOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: registration
 * @description: PatientOrderController
 * @author: Lucas
 * @create: 2019/07/14 16:21
 */
@RestController
public class PatientOrderController {
    @Autowired
    PatientOrderService patientOrderService;

    @RequestMapping("/addPatientOrder")
    public String addPatientOrder(Integer registerId, Integer userId){
        JSONObject jsonObject = new JSONObject();
        PatientOrder patientOrder = new PatientOrder(registerId, userId, 1);
        try{
            if (patientOrderService.addPatientOrder(patientOrder) > 0){
                jsonObject.put("flag", "success");
            }else{
                jsonObject.put("flag", "failure");
            }
        }catch (Exception e){
            jsonObject.put("flag", "failure");
        }
        return jsonObject.toString();
    }

    @RequestMapping("/getRecordsByPatientId")
    public List<Record> getRecordsByPatientId(Integer userId){
        return patientOrderService.getRecordsByPatientId(userId);
    }
}
