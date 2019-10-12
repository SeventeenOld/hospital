package com.zhiyou100.mapper;

import java.util.List;

import com.zhiyou100.model.Section;

public interface SectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Section record);

    int insertSelective(Section record);

    Section selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Section record);

    int updateByPrimaryKey(Section record);
    
    List<Section> findAllSection();
    
    
}