package com.zhiyou100.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.csource.common.MyException;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageClient1;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;

public class TestFastDFS {
	//1.依赖,jar包
	//2.配置文件
	//3.javaapi  
	//4.加载配置文件
	//5.创建Teacker客户端,通过客户端得到Tracker对象,在得到Storage对象
	//创建文件属性存储对象
	//通过客户端执行上传
	
	
	@Test
	public void upload() throws IOException, MyException {
		
		//加载配置文件,绝对路劲
		ClientGlobal.init("D:/javawork/hospital/src/main/resources/fastdfs-client.properties");
		//创建Teacker客户端
		TrackerClient client = new TrackerClient();
		//通过客户端得到Tracker对象
		TrackerServer connection = client.getConnection();
		//通过客户端得到Storage对象
		StorageClient1 storageClient1 = new StorageClient1(connection,null);
		//创建文件属性存储对象
		NameValuePair[] list = new NameValuePair[1];
		list[0] = new NameValuePair("fileName","6.jpg");
		//通过客户端执行上传
		//参1 :文件的地址
		//参2 :文件的类型
		//参3 :文件属性对象数组
		String id = storageClient1.upload_file1("C:/Users/Administrator/Desktop/卡通头像/6.jpg","jpg" ,list);
		System.out.println("上传成功");
		System.out.println(id);
		byte[] bytes = storageClient1.download_file1(id);
		OutputStream out = new FileOutputStream("C:/Users/Administrator/Desktop/图片/666.jpg");
		out.write(bytes);
		out.close();
	}
	
	@Test
	public void download() throws IOException, MyException {
		String fid = "group1/M00/00/00/wKgogF2IdZuANch8AABym60bA5U629.jpg";
		//加载配置文件,绝对路劲
		ClientGlobal.init("D:/javawork/hospital/src/main/resources/fastdfs-client.properties");
		//创建Teacker客户端
		TrackerClient client = new TrackerClient();
		//通过客户端得到Tracker对象
		TrackerServer connection = client.getConnection();
		//通过客户端得到Storage对象
		StorageClient1 storageClient1 = new StorageClient1(connection,null);
		//通过客户端执行上传
		//参1 :文件的地址
		//参2 :文件的类型
		//参3 :文件属性对象数组
		byte[] bytes = storageClient1.download_file1(fid);
		OutputStream out = new FileOutputStream("C:/Users/Administrator/Desktop/图片/666.jpg");
		out.write(bytes);
		out.close();
		System.out.println("下载成功");

	}
	
	
	
	
	
	
	
	
	
	
}
