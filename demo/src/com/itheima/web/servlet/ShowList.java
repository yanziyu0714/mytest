package com.itheima.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.domain.DownloadFile;
import com.itheima.service.FileListService;


/**
 * Servlet implementation class ShowList
 */
public class ShowList extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			request.setCharacterEncoding("utf-8");
			response.setHeader("content-type", "text/html;charset=utf-8");
			FileListService service = new FileListService();
			List<DownloadFile> list = service.findAll();
			//3.响应数据
			request.setAttribute("list", list);
			request.getRequestDispatcher("/list.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
