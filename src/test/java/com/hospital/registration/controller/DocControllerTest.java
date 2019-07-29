package com.hospital.registration.controller;

import com.hospital.registration.entities.Doctor;
import com.hospital.registration.services.DoctorService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class DocControllerTest {

    @Autowired
    DoctorService doctorService;

    @Test
    public void getDocsByDept() throws Exception{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
        Date parse = simpleDateFormat.parse("1996-09-25T00:00:00.000+0000".substring(0,10)
                + " " + "1996-09-25T00:00:00.000+0000".substring(11,22));
        System.out.println(parse);
    }
}