package com.zhiyou100.mapper;

import java.util.List;

import com.zhiyou100.model.ChargeManager;
import com.zhiyou100.model.PayItems;

public interface ChargeManagerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ChargeManager record);

    int insertSelective(ChargeManager record);

    ChargeManager selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChargeManager record);

    int updateByPrimaryKey(ChargeManager record);
    
    List<ChargeManager> findAllCharge(ChargeManager charge);
    
    ChargeManager findChargeById(int id);
    
    void addCharge(ChargeManager charge);
    
    void addPayItems(PayItems pay);
    
    List<PayItems> findAllPay();
    
}