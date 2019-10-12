package com.zhiyou100.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiyou100.model.Drug;
import com.zhiyou100.service.DrugService;

@Controller
@RequestMapping("DrugController")
public class DrugController {

	@Autowired
	private DrugService service;

	@RequestMapping("findAll")
	public String findAll(Model model, @RequestParam(defaultValue = "1") int pageNo, Drug drug) {
		PageHelper.startPage(pageNo, 2);
		List<Drug> list = service.findAllDrug(drug);
		PageInfo<Drug> pageInfo = new PageInfo<Drug>(list);
		model.addAttribute("list", pageInfo.getList());
		model.addAttribute("page", pageInfo);
		model.addAttribute("drug", drug);
		return "medicine/index";
	}

	@RequestMapping("add")
	public String add() {
		return "medicine/add";
	}

	@RequestMapping("addDrug")
	public String addDrug(@RequestParam("img") MultipartFile img, HttpServletRequest request, Drug drug)
			throws IOException {
		// 获得项目路劲
		String path = request.getServletContext().getRealPath("/upload");
		System.out.println(path);
		// 创建该文件
		File file = new File(path);
		// 判断文件是否存在
		if (file.exists()) {
			file.mkdir();// 创建文件夹
		}
		String fileName = img.getOriginalFilename();
		// 获得文件夹后缀名
		String[] split = fileName.split("\\.");
		String suffix = split[1];
		// 以毫秒值为文件名
		long time = new Date().getTime();
		// 组装文件名
		String newFileName = time + "." + suffix;
		// 3确定上传路劲
		File file2 = new File(file, newFileName);
		// 4开始上传
		FileUtils.writeByteArrayToFile(file2, img.getBytes());
		drug.setDrugUrl(newFileName);
		//System.out.println(drug.getDrugNum());
		service.addDrug(drug);
		int num = service.findNum(drug.getDrugNum());
		System.out.println(num);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("drugNum", drug.getDrugNum());
		map.put("num", num);
		service.updateSurplus(map);
		return "redirect:/DrugController/findAll";
	}

	@RequestMapping("lookOne")
	public String lookOne(String drugNum, Model model) {
		Drug drug = service.findOne(drugNum);
		model.addAttribute("drug", drug);
		model.addAttribute("path", "/upload/" + drug.getDrugUrl());
		return "medicine/look";
	}

	@RequestMapping("update")
	public String update(String drugNum, Model model) {
		Drug drug = service.findOne(drugNum);
		model.addAttribute("drug", drug);
		return "medicine/edit";
	}

	@RequestMapping("updateDrug")
	public String updateDrug(@RequestParam("img") MultipartFile img, HttpServletRequest request, Drug drug) throws IOException {
		// 获得项目路劲
		String path = request.getServletContext().getRealPath("/upload");
		System.out.println(path);
		// 创建该文件
		File file = new File(path);
		// 判断文件是否存在
		if (file.exists()) {
			file.mkdir();// 创建文件夹
		}
		String fileName = img.getOriginalFilename();
		// 获得文件夹后缀名
		String[] split = fileName.split("\\.");
		String suffix = split[1];
		// 以毫秒值为文件名
		long time = new Date().getTime();
		// 组装文件名
		String newFileName = time + "." + suffix;
		// 3确定上传路劲
		File file2 = new File(file, newFileName);
		// 4开始上传
		FileUtils.writeByteArrayToFile(file2, img.getBytes());
		drug.setDrugUrl(newFileName);
		service.updateDrug(drug);
		int num = service.findNum(drug.getDrugNum());
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("drugNum", drug.getDrugNum());
		map.put("num", num);
		service.updateSurplus(map);

		return "redirect:/DrugController/findAll";
	}

}
