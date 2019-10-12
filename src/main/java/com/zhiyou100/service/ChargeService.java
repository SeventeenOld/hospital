package com.zhiyou100.service;

import java.util.List;

import com.zhiyou100.model.ChargeManager;
import com.zhiyou100.model.PayItems;

public interface ChargeService {
	
	List<ChargeManager> findAllCharge(ChargeManager charge);
	
	ChargeManager findChargeById(int id);
	
	void addCharge(ChargeManager charge);
	
	void addPayItems(PayItems pay);
	
	List<PayItems> findAllPay();

}
