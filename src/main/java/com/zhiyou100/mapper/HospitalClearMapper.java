package com.zhiyou100.mapper;

import com.zhiyou100.model.HospitalClear;

public interface HospitalClearMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HospitalClear record);

    int insertSelective(HospitalClear record);

    HospitalClear selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HospitalClear record);

    int updateByPrimaryKey(HospitalClear record);
}