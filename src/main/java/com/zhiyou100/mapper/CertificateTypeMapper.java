package com.zhiyou100.mapper;

import com.zhiyou100.model.CertificateType;

public interface CertificateTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CertificateType record);

    int insertSelective(CertificateType record);

    CertificateType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CertificateType record);

    int updateByPrimaryKey(CertificateType record);
}