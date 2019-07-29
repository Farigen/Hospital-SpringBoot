package com.hospital.registration.controller;

import com.hospital.registration.utils.VerifyCodeUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.util.Map;

/**
 * @program: registration
 * @description:
 * @author: Lucas
 * @create: 2019/07/26 20:28
 */
@Controller
public class VerifyCodeController {

    @RequestMapping("/getVerifyCode")
    public void getVerifyCode(String name, HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");
        // 生成随机字串
        String verifyCode = VerifyCodeUtils.generateVerifyCode(6);
        // 存入会话session
        HttpSession session = request.getSession();
        // 覆盖以前的
        session.setAttribute(name, verifyCode.toLowerCase());
        // 生成图片
        int w = 100, h = 36;
        VerifyCodeUtils.outputImage(w, h, response.getOutputStream(), verifyCode);
    }

    @ResponseBody
    @RequestMapping("/checkVerifyCode")
    public String checkVerifyCode(String name, String code, HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        String value = (String)session.getAttribute(name);
        if(code!=null && code.equals(value)){
            return "{\"flag\":\"ok\",\"message\":\"验证码正确！\"}";
        }else {
            return "{\"flag\":\"no\",\"message\":\"输入的验证码错误！\"}";
        }
    }
}

