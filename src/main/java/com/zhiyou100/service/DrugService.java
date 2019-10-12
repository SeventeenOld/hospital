package com.zhiyou100.service;

import java.util.List;
import java.util.Map;

import com.zhiyou100.model.Drug;

public interface DrugService {
	
	List<Drug> findAllDrug(Drug drug);
	
	void addDrug(Drug drug);
	
	int findNum(String drugNum);
	
	void updateSurplus(Map<String,Object> map);
	
	Drug findOne(String drugNum);
	
	void updateDrug(Drug drug);

}
