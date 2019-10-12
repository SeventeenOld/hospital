package com.zhiyou100.mapper;

import java.util.List;
import java.util.Map;

import com.zhiyou100.model.CertificateType;
import com.zhiyou100.model.Doctor;
import com.zhiyou100.model.Section;

public interface DoctorMapper {
    int deleteByPrimaryKey(Integer id);

    void addDoctor(Doctor record);

    int insertSelective(Doctor record);

    Doctor findDoctorById(int id);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKey(Doctor record);
    
    int countDoctor(Map map);
    
    List<Doctor> findAllDoctor(Doctor doc);
    
    List<Section> findAllSection();
    
    List<CertificateType> findAllCerti();
    
    String findSection(int id);
    
    String findCerti(int id);
    
    void updateDoctor(Doctor doc);
    
    void deletelist(int[] check);
   
    
}