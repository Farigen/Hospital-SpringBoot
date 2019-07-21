package com.hospital.registration.services;


import com.hospital.registration.entities.Register;

import java.util.List;

public interface RegisterService {

    /**
     * @author Lucas
     * @date 2019/7/18
     * @param [docName]
     * @return java.util.List<com.hospital.registration.entities.Register>
     * @des
     */
    List<Register> getRegisterByDocName(String docName);

}
