package com.zhiyou100.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.csource.common.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.zhiyou100.model.Drug;
import com.zhiyou100.model.FastDFS;
import com.zhiyou100.model.ResponseObject;
import com.zhiyou100.model.User;
import com.zhiyou100.service.AjaxService;

@Controller
public class AjaxTest {
	
	@Autowired
	private AjaxService service;

	@RequestMapping("checkUser")
	public void test(String usernameKey,HttpServletResponse response) throws IOException {
		System.out.println(usernameKey);
		String checkUser = service.checkUser(usernameKey);
		response.getWriter().write(checkUser);
	}
	
	
	//@ResponseBody 注解,可以使返回的对象变为json对象
	@RequestMapping("aaa")
	@ResponseBody
	public User test2() {
		User user = new User();
		return user;
	}
	
	@RequestMapping("findUserById")
	@ResponseBody
	public ResponseObject findUserById(String id) {
		ResponseObject obj = service.findUserById(id);
		return obj;
	}
	
	@RequestMapping("findDoctorBySectionId")
	@ResponseBody
	public ResponseObject findDoctorBySectionId(String sectionId) {
		ResponseObject obj = service.findDoctorBySectionId(sectionId);
		return obj;
	}
	
	@RequestMapping("showEchart")
	public String toEcharst() {
		return "echarst";
	}
	
	@RequestMapping("showEcharts")
	@ResponseBody
	public double[] show() {
		double[] month = {100.0,90.0,68.5,86.0,51.5,60.5,66.3};
		return month;
	}
	
	
	@RequestMapping("showEcharts2")
	@ResponseBody
	public ArrayList<Double[]> showEcharts2(){
		ArrayList<Double[]> list = new ArrayList<Double[]>();
		Double[] k1 = {100.0,90.0,80.0,70.0,60.0,50.0,40.0};
		Double[] k2 = {40.0,40.0,40.0,40.0,40.0,40.0,40.0};
		Double[] k3 = {80.0,80.0,80.0,80.0,80.0,80.0,80.0};
		Double[] k4 = {40.0,50.0,60.0,70.0,80.0,90.0,100.0};
		list.add(k1);
		list.add(k2);
		list.add(k3);
		list.add(k4);
		return list;
	}
	
	
	//ajax实现上传并回显
	@RequestMapping("upload")
	@ResponseBody
	public ResponseObject ajaxUpload(@RequestParam("img") MultipartFile img, HttpServletRequest request)
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
		
		String pathNew="/upload/"+newFileName;
		return new ResponseObject("200", "成功",pathNew);
		//System.out.println(drug.getDrugNum());
	}
	
	@RequestMapping("uploadFastDFS")
	@ResponseBody
	public ResponseObject ajaxUploadFastDFS(@RequestParam("img") MultipartFile img) throws IOException, MyException {
		ResponseObject obj = FastDFS.upload(img);
		return obj;
	}
	
	@RequestMapping("download")
	@ResponseBody
	public void ajaxdownload(String fid,HttpServletResponse response) throws IOException, MyException {
		byte[] bytes = FastDFS.download(fid);
		//解决响应中文文件名乱码问题
		//String encode = URLEncoder.encode("用户信息表","utf-8");
		//浏览器响应下载弹框
		response.setHeader("Context-dispositin", "attachment;filename="+new Date().getTime()+".png");
		response.setContentType("image/jpeg");
		OutputStream out = new FileOutputStream("C:/Users/Administrator/Desktop/图片/666.jpg");
		out.write(bytes);
		out.close();
		System.out.println("下载成功");
	}
	
	
	
	
}
