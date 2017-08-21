package com.itheima.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.domain.DownloadFile;
import com.itheima.service.FileListService;
import com.itheima.utils.DownLoadUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.misc.BASE64Encoder;

public class DownLoad extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		request.setCharacterEncoding("UTF-8");
		String str = request.getParameter("fileName");
		System.out.println(str);
		String name = new String(str.getBytes("iso-8859-1"),"utf-8");
		System.out.println(name);
		String agent = request.getHeader("user-agent");
		String imageName = DownLoadUtils.getName(agent, name);
System.out.println(imageName);
		response.setHeader("content-disposition", "attachment;filename=" + imageName);

		InputStream is = getServletContext().getResourceAsStream("/download/" + name);
		// 输出流
		OutputStream os = response.getOutputStream();

		// 流转换
		byte[] buffer = new byte[1024];
		int len = -1;

		while ((len = is.read(buffer)) != -1) {
			os.write(buffer, 0, len);
		}

		os.close();
		is.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
