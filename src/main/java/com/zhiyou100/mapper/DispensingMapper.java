package com.zhiyou100.mapper;

import com.zhiyou100.model.Dispensing;

public interface DispensingMapper {
    int deleteByPrimaryKey(String medicalRecord);

    int insert(Dispensing record);

    int insertSelective(Dispensing record);

    Dispensing selectByPrimaryKey(String medicalRecord);

    int updateByPrimaryKeySelective(Dispensing record);

    int updateByPrimaryKey(Dispensing record);
}