package com.hospital.registration.mapper;

import com.hospital.registration.entities.Register;
import com.hospital.registration.entities.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RegisterMapper {

    /**
     * @author Lucas
     * @date 2019/7/18
     * @param [docName]
     * @return java.util.List<com.hospital.registration.entities.Register>
     * @des
     */
    List<Register> getRegisterByDoc(@Param("docName") String docName);
}
