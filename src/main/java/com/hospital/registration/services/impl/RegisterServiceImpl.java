package com.hospital.registration.services.impl;

import com.hospital.registration.entities.Register;
import com.hospital.registration.mapper.RegisterMapper;
import com.hospital.registration.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: registration
 * @description: RegisterServiceImpl
 * @author: Lucas
 * @create: 2019/07/18 20:41
 */
@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    RegisterMapper registerMapper;

    @Override
    public List<Register> getRegisterByDocName(String docName) {
        return registerMapper.getRegisterByDoc(docName);
    }
}
