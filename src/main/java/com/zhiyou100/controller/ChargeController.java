package com.zhiyou100.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiyou100.model.ChargeManager;
import com.zhiyou100.model.PayItems;
import com.zhiyou100.service.ChargeService;

@Controller
@RequestMapping("chargeController")
public class ChargeController {

	@Autowired
	private ChargeService service;
	
	@RequestMapping("findAll")
	public String findAll(Model model, ChargeManager charge, @RequestParam(defaultValue = "1") int pageNo) {
			PageHelper.startPage(pageNo, 2);
			List<ChargeManager> list = service.findAllCharge(charge);
			PageInfo<ChargeManager> pageInfo = new PageInfo<ChargeManager>(list);
			model.addAttribute("list", pageInfo.getList());
			model.addAttribute("page", pageInfo);
			model.addAttribute("charge", charge);
			return "hospital/charge";
			
		}
	
	
	@RequestMapping("add")
	public String add(int id,Model model) {
		ChargeManager charge = service.findChargeById(id);
		List<PayItems> pay = service.findAllPay();
		model.addAttribute("charg",charge);
		model.addAttribute("list", pay);
		return "hospital/chargenew";
	}
	
	
	
	@RequestMapping("addCharge")
	public String addChargeById(ChargeManager charge) {
		System.out.println(charge);
		service.addCharge(charge);
		return "redirect:/chargeController/findAll";
	}
	
	
	@RequestMapping("addPay")
	public String addPayItems() {
		return "hospital/addpay";
	}
	
	@RequestMapping("pay")
	public String addPay(PayItems pay) {
		System.out.println(pay);
		service.addPayItems(pay);
		return "redirect:/chargeController/findAll";
	}
	

	

}
