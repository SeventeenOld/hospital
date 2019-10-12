package com.zhiyou100.mapper;

import java.util.List;
import java.util.Map;

import com.zhiyou100.model.Drug;

public interface DrugMapper {
    int deleteByPrimaryKey(String drugNum);

    int insert(Drug record);

    int insertSelective(Drug record);

    Drug selectByPrimaryKey(String drugNum);

    int updateByPrimaryKeySelective(Drug record);

    int updateByPrimaryKey(Drug record);
    
    List<Drug> findAllDrug(Drug drug);
    
    void addDrug(Drug drug);
    //查询出来已售数量
    int findNum(String drugNum);
    
    //修改剩余量
    void updateSurplus(Map<String,Object> map);
    
    Drug findOne(String drugNum);
    
    void updateDrug(Drug drug);
}