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
import com.zhiyou100.model.Section;
import com.zhiyou100.service.DoctorService;

@Controller
@RequestMapping("doctorController")
public class DoctorController {

	@Autowired
	private DoctorService service;

	// 查询全部医生信息
	@RequestMapping("findAll")
	public String findAllDoctor(Model model, Doctor doc, @RequestParam(defaultValue = "1") int pageNo) {
		PageHelper.startPage(pageNo, 2);
		List<Doctor> list = service.findAllDoctor(doc);
		PageInfo<Doctor> pageInfo = new PageInfo<Doctor>(list);
		model.addAttribute("list", pageInfo.getList());
		model.addAttribute("page", pageInfo);
		model.addAttribute("doc", doc);
		return "doctor/index";
	}

	// 跳转到添加的页面
	@RequestMapping("add")
	public String add(Model model) {
		List<Section> list = service.findAllSection();
		model.addAttribute("list", list);
		List<CertificateType> list2 = service.findAllCerti();
		model.addAttribute("list2", list2);
		return "doctor/add";
	}

	// 添加医生
	@RequestMapping("addDoctor")
	public String addDoctor(Doctor doc) {
		service.addDoctor(doc);
		return "redirect:/doctorController/findAll";
	}

	// 详情,根据id查
	@RequestMapping("findDoctorById")
	public String findDoctorById(int id, Model model) {
		Doctor doc = service.findDoctorById(id);
		model.addAttribute("doc", doc);
		String name = service.findSection(id);
		model.addAttribute("section", name);
		String certi = service.findCerti(id);
		model.addAttribute("certi", certi);
		return "doctor/look";
	}

	// 跳转到更改页面
	@RequestMapping("update")
	public String update(int id, Model model) {
		Doctor doctor = service.findDoctorById(id);
		List<Section> list = service.findAllSection();
		model.addAttribute("list", list);
		List<CertificateType> list2 = service.findAllCerti();
		model.addAttribute("list2", list2);
		model.addAttribute("doctor", doctor);
		return "doctor/edit";
	}

	@RequestMapping("updateDoctor")
	public String updateDoctor(Doctor doc) {
		service.updateDoctor(doc);
		return "redirect:/doctorController/findAll";
	}
	
	@RequestMapping("deletelist")
	public String deletelist(@RequestParam(value="check")int[] check) {
		service.deletelist(check);
		return "redirect:/doctorController/findAll";
	}
	
	
	

}
