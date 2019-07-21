package com.hospital.registration.controller;

import com.hospital.registration.entities.Doctor;
import com.hospital.registration.services.DoctorService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class DocControllerTest {

    @Autowired
    DoctorService doctorService;

    @Test
    public void getDocsByDept() {

    }
}