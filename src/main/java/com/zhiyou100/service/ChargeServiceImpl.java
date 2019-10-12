package com.zhiyou100.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.mapper.ChargeManagerMapper;
import com.zhiyou100.model.ChargeManager;
import com.zhiyou100.model.PayItems;

@Service
public class ChargeServiceImpl implements ChargeService {
	
	@Autowired
	private ChargeManagerMapper mapper;

	public List<ChargeManager> findAllCharge(ChargeManager charge) {
		// TODO Auto-generated method stub
		
		
		return mapper.findAllCharge(charge);
	}

	public ChargeManager findChargeById(int id) {
		// TODO Auto-generated method stub
		return mapper.findChargeById(id);
	}

	public void addCharge(ChargeManager charge) {
		// TODO Auto-generated method stub
		mapper.addCharge(charge);
	}

	public void addPayItems(PayItems pay) {
		// TODO Auto-generated method stub
		mapper.addPayItems(pay);
	}

	public List<PayItems> findAllPay() {
		// TODO Auto-generated method stub
		return mapper.findAllPay();
	}

}
