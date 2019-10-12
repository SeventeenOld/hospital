package com.zhiyou100.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.mapper.DrugMapper;
import com.zhiyou100.model.Drug;

@Service
public class DrugServiceImpl implements DrugService {

	@Autowired
	private DrugMapper mapper;
	
	
	public List<Drug> findAllDrug(Drug drug) {
		// TODO Auto-generated method stub
		return mapper.findAllDrug(drug);
	}


	public void addDrug(Drug drug) {
		// TODO Auto-generated method stub
		mapper.addDrug(drug);
	}


	public int findNum(String drugNum) {
		// TODO Auto-generated method stub
		return mapper.findNum(drugNum);
	}


	public void updateSurplus(Map<String,Object> map) {
		// TODO Auto-generated method stub
		mapper.updateSurplus(map);
	}


	public Drug findOne(String drugNum) {
		// TODO Auto-generated method stub
		return mapper.findOne(drugNum);
	}


	public void updateDrug(Drug drug) {
		// TODO Auto-generated method stub
		mapper.updateDrug(drug);
	}

}
