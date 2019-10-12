package com.zhiyou100.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiyou100.model.CertificateType;
import com.zhiyou100.model.Doctor;
import com.zhiyou100.model.RegistrationInfor;
import com.zhiyou100.model.Section;
import com.zhiyou100.service.RegistrationService;

@Controller
@RequestMapping("registrationController")
public class RegistrationController {

	@Autowired
	private RegistrationService service;
	
	@RequestMapping("findAll")
	public String findAllRegistration(Model model,@RequestParam(defaultValue = "1") int pageNo,RegistrationInfor registration) {
		PageHelper.startPage(pageNo, 2);
		List<RegistrationInfor> list = service.findAllReg(registration);
		PageInfo<RegistrationInfor> pageInfo = new PageInfo<RegistrationInfor>(list);
		model.addAttribute("list", pageInfo.getList());
		model.addAttribute("page", pageInfo);
		model.addAttribute("re", registration);
		return "registration/index";
	}
	
	@RequestMapping("add")
	public String add(Model model) {
		List<Section> section = service.findAllSection();
		model.addAttribute("section", section);
		List<CertificateType> certi = service.findAllCerti();
		model.addAttribute("certi", certi);
		List<Doctor> doc = service.findDoctorName();
		model.addAttribute("doc", doc);
		return "registration/add";
	}
	
	@RequestMapping("addRegi")
	public String addRegi(RegistrationInfor regi) {
		service.addRegistration(regi);
		return "redirect:/registrationController/findAll";
	}
	
	@RequestMapping("look")
	public String findOneRegi(String medicalRecord,Model model) {
		RegistrationInfor regi = service.finOneRegi(medicalRecord);
		model.addAttribute("regi", regi);
		String name = service.findCertName(medicalRecord);
		model.addAttribute("cert", name);
		return "registration/look";
	}
	
	@RequestMapping("delete")
	public String deleteOneRegi(String medicalRecord) {
		service.deleteOneRegi(medicalRecord);
		return "redirect:/registrationController/findAll";
	}
	
	@RequestMapping("update")
	public String update(String medicalRecord,Model model) {
		RegistrationInfor regi = service.finOneRegi(medicalRecord);
		model.addAttribute("regi", regi);
		List<CertificateType> certi = service.findAllCerti();
		model.addAttribute("certi", certi);
		List<Section> section = service.findAllSection();
		model.addAttribute("section", section);
		List<Doctor> doc = service.findDoctorName();
		model.addAttribute("doc", doc);
		return "registration/edit";
	}
	
	@RequestMapping("updateRegi")
	public String updateRegi(RegistrationInfor regi) {
		service.updateRegi(regi);
		return "redirect:/registrationController/findAll";
	}
	
		
}
