package com.zhiyou100.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;

public class TestPOI {
	
	
	
	//导出:从系统(程序)中导出到本地
	@Test
	public void export() throws IOException {
		//1.创建工作表
		HSSFWorkbook wb = new HSSFWorkbook();
		//2.创建sheet
		HSSFSheet sheet = wb.createSheet();
		//3.在sheet中创建行 : 参数为第几行,并不是创建几行,从0开始
		HSSFRow row0 = sheet.createRow(0);
		HSSFRow row1 = sheet.createRow(1);
		HSSFRow row2 = sheet.createRow(2);
		//4.在行中创建列
		HSSFCell cell0 = row0.createCell(0);
		HSSFCell cell1 = row0.createCell(1);
		HSSFCell cell2 = row0.createCell(2);
		//5.单元格内写内容
		cell0.setCellValue("病历号");
		cell1.setCellValue("牛逼");
		cell2.setCellValue("厉害了");
		//6.导出 : 输出流导出
		OutputStream os = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\1.xls");
		
		//使用工作表导出
		wb.write(os);
		System.out.println("已成功");
		os.close();
	}
	
	//导入 : 从本地导入到项目中
	@Test
	public void importExcel() throws IOException {
		//1.将本地文件变成流,已输入流的形式读入程序
		InputStream is = new FileInputStream("C:\\\\Users\\\\Administrator\\\\Desktop\\\\1.xls");
		//2.通过流创建工作表
		HSSFWorkbook wb = new HSSFWorkbook(is);
		//3.获得sheet : 通过下标获得
		HSSFSheet sheet = wb.getSheetAt(0);
		//4.获得行
		HSSFRow row = sheet.getRow(0);
		//5.获得列
		HSSFCell cell = row.getCell(0);
		//6.获得值
		String value = cell.getStringCellValue();
		System.out.println(value);
		is.close();
	}
	
	
	
}
