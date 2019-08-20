package com.hospital.registration.controller;

import com.alibaba.fastjson.JSONObject;
import com.hospital.registration.annotation.UserLoginToken;
import com.hospital.registration.entities.Patient;
import com.hospital.registration.services.TokenService;
import com.hospital.registration.services.impl.PatientServiceImpl;
/*import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
    @Autowired
    TokenService tokenService;

    @ResponseBody
    @RequestMapping("/doLogin")
    public String login( String userName, String password){
        /*// 从SecurityUtils里边创建一个 subject
        Subject subject = SecurityUtils.getSubject();
        // 在认证提交前准备 token（令牌）
        UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
        // 执行认证登陆
        try {
            subject.login(token);
        } catch (UnknownAccountException uae) {
            return "未知账户";
        } catch (IncorrectCredentialsException ice) {
            return "密码不正确";
        } catch (LockedAccountException lae) {
            return "账户已锁定";
        } catch (ExcessiveAttemptsException eae) {
            return "用户名或密码错误次数过多";
        } catch (AuthenticationException ae) {
            return "用户名或密码不正确！";
        }
        if (subject.isAuthenticated()) {
            return "登录成功";
        } else {
            token.clear();
            return "登录失败";
        }*/

        /*if (patientServices.getPasswordByPhoneNumber(userName).equals(password)){
            return SUCCESS;
        }else {
            return FAILURE;
        }*/


        JSONObject jsonObject=new JSONObject();
        Patient patient = patientServices.getPatientInfoByPhoneNumber(userName);
//        String passwordByPhoneNumber = patientServices.getPasswordByPhoneNumber(userName);
        if(patient == null){
            jsonObject.put("message","登录失败,用户不存在");
            return jsonObject.toString();
        }else {
            if (!patient.getPassword().equals(password)){
                jsonObject.put("message","登录失败,密码错误");
                return jsonObject.toString();
            }else {
                String token = tokenService.getToken(patient);
                jsonObject.put("token", token);
                jsonObject.put("user", patient);
                jsonObject.put("message", "success");
                return jsonObject.toString();
            }
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
    public Patient getPatientInfo(Integer userId){
        return patientServices.getPatientInfoByPatientId(userId);
    }

    @ResponseBody
    @RequestMapping("/updateAccountInfo")
    public String updatePatientInfo(String userId, String name, String idCard, Integer gender, String phoneNumber, String email,  String birthday){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
        Date tempBirthday;
        try{
            tempBirthday = simpleDateFormat.parse(birthday.substring(0,10)+ " " + birthday.substring(11,22));
        }catch (Exception e){
            return FAILURE;
        }
/*
        /account/info 日期选择器
        选择日期如9.25时，提交的日期数据是9：24：16：00，导致数据库日期总是少一天
        下列方法是获取指定天数的第二天
        */
        Calendar c = Calendar.getInstance();
        c.setTime(tempBirthday);
        c.add(Calendar.DAY_OF_MONTH, 1);
        Date tomorrow = c.getTime();//这是明天

        Patient patient = new Patient(userId, name, idCard, gender, phoneNumber, email, tomorrow);
        if (patientServices.updatePatient(patient) != 0){
            return SUCCESS;
        }else{
            return FAILURE;
        }
    }

    @UserLoginToken
    @RequestMapping("/show")
    @ResponseBody
    public String showUser(){
        return "测试成功！";
    }
}
