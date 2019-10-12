package com.zhiyou100.service;

import java.util.List;

import com.zhiyou100.model.CertificateType;
import com.zhiyou100.model.Doctor;
import com.zhiyou100.model.RegistrationInfor;
import com.zhiyou100.model.Section;

public interface RegistrationService {
	
	List<RegistrationInfor> findAllReg(RegistrationInfor registration);
	
	List<Doctor> findDoctorName();
	
	List<Section> findAllSection();
	
	List<CertificateType> findAllCerti();
	
	void addRegistration(RegistrationInfor regi);
	
	RegistrationInfor finOneRegi(String medicalRecord);
	
	void deleteOneRegi(String medicalRecord);
	
	String findCertName(String medicalRecord);
	
	void updateRegi(RegistrationInfor regi);
	
}
