package com.zhiyou100.mapper;

import com.zhiyou100.model.PayItems;

public interface PayItemsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PayItems record);

    int insertSelective(PayItems record);

    PayItems selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayItems record);

    int updateByPrimaryKey(PayItems record);
}