package com.hospital.registration.controller;

import com.hospital.registration.entities.Register;
import com.hospital.registration.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: registration
 * @description: RegisterController
 * @author: Lucas
 * @create: 2019/07/18 20:38
 */
@Controller
public class RegisterController {

    @Autowired
    RegisterService registerService;

    @ResponseBody
    @RequestMapping("/getRegisterByDocName")
    public List<Register> getRegistersByDocName(String docName){
        return registerService.getRegisterByDocName(docName);
    }
}
