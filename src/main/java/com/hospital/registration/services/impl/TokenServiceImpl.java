package com.hospital.registration.services.impl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.hospital.registration.entities.Patient;
import com.hospital.registration.services.TokenService;
import org.springframework.stereotype.Service;

/**
 * @program: registration
 * @description:
 * @author: Lucas
 * @create: 2019/07/27 21:04
 */
@Service
public class TokenServiceImpl implements TokenService {
    @Override
    public String getToken(Patient patient) {
        String token="";
        token= JWT.create().withAudience(patient.getPhoneNumber())
                .sign(Algorithm.HMAC256(patient.getPassword()));
        return token;
    }
}
