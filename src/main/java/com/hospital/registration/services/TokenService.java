package com.hospital.registration.services;

import com.hospital.registration.entities.Patient;

/**
 * @program: registration
 * @description:
 * @author: Lucas
 * @create: 2019/07/27 21:03
 */
public interface TokenService {
    /**
     * @author Lucas
     * @date 2019/7/27
     * @param [patient]
     * @return java.lang.String
     * @des
     */
    String getToken(Patient patient);
}
