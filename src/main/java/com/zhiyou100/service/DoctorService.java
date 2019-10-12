package com.zhiyou100.service;

import java.util.List;
import java.util.Map;

import com.zhiyou100.model.CertificateType;
import com.zhiyou100.model.Doctor;
import com.zhiyou100.model.Section;

public interface DoctorService {
	
	void addDoctor(Doctor doc);
	
	Doctor findDoctorById(int id);
	
	int countDoctor(Map map);
	
	
	List<Doctor> findAllDoctor(Doctor doc);
	
	
	List<Section> findAllSection();
	
	
	
	List<CertificateType> findAllCerti();
	
	String findSection(int id);
	
	String findCerti(int id);
	
	void updateDoctor(Doctor doc);
	
	void deletelist(int[] check);
	
}
