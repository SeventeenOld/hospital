package com.zhiyou100.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.mapper.DoctorMapper;
import com.zhiyou100.model.CertificateType;
import com.zhiyou100.model.Doctor;
import com.zhiyou100.model.Section;

@Service
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	private DoctorMapper mapper;

	public void addDoctor(Doctor doc) {
		// TODO Auto-generated method stub
		mapper.addDoctor(doc);
	}

	public Doctor findDoctorById(int id) {
		// TODO Auto-generated method stub
		
		return mapper.findDoctorById(id);
	}

	public int countDoctor(Map map) {
		// TODO Auto-generated method stub
		
		return mapper.countDoctor(map);
	}

	public List<Doctor> findAllDoctor(Doctor doc) {
		// TODO Auto-generated method stub
		return mapper.findAllDoctor(doc);
	}

	public List<Section> findAllSection() {
		// TODO Auto-generated method stub
		List<Section> section = mapper.findAllSection();
		System.out.println(section);
		return section;
	}

	public List<CertificateType> findAllCerti() {
		// TODO Auto-generated method stub
		return mapper.findAllCerti();
	}

	public String findSection(int id) {
		// TODO Auto-generated method stub
		return mapper.findSection(id);
	}

	public String findCerti(int id) {
		// TODO Auto-generated method stub
		return mapper.findCerti(id);
	}

	public void updateDoctor(Doctor doc) {
		// TODO Auto-generated method stub
		mapper.updateDoctor(doc);
	}

	public void deletelist(int[] check) {
		// TODO Auto-generated method stub
		mapper.deletelist(check);
	}

}
