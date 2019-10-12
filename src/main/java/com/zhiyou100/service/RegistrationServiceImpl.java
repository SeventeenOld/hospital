package com.zhiyou100.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.zhiyou100.mapper.RegistrationInforMapper;
import com.zhiyou100.model.CertificateType;
import com.zhiyou100.model.Doctor;
import com.zhiyou100.model.RegistrationInfor;
import com.zhiyou100.model.Section;

@Service
public class RegistrationServiceImpl implements RegistrationService {
	
	@Autowired
	private RegistrationInforMapper mapper;

	public List<RegistrationInfor> findAllReg(RegistrationInfor registration) {
		// TODO Auto-generated method stub
		return mapper.findAllReg(registration);
	}

	public List<Doctor> findDoctorName() {
		// TODO Auto-generated method stub
		return mapper.findDoctorName();
	}

	public List<Section> findAllSection() {
		// TODO Auto-generated method stub
		return mapper.findAllSection();
	}

	public List<CertificateType> findAllCerti() {
		// TODO Auto-generated method stub
		return mapper.findAllCerti();
	}

	public void addRegistration(RegistrationInfor regi) {
		// TODO Auto-generated method stub
		mapper.addRegistration(regi);
	}

	public RegistrationInfor finOneRegi(String medicalRecord) {
		// TODO Auto-generated method stub
		return mapper.finOneRegi(medicalRecord);
	}

	public void deleteOneRegi(String medicalRecord) {
		// TODO Auto-generated method stub
		mapper.deleteOneRegi(medicalRecord);
	}

	public String findCertName(String medicalRecord) {
		// TODO Auto-generated method stub
		return mapper.findCertName(medicalRecord);
	}

	public void updateRegi(RegistrationInfor regi) {
		// TODO Auto-generated method stub
		mapper.updateRegi(regi);
	}
	
	
	
	
}
