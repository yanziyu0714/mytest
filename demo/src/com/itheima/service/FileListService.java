package com.itheima.service;

import java.sql.SQLException;
import java.util.List;

import com.itheima.dao.FileListDao;
import com.itheima.domain.DownloadFile;

public class FileListService {

	public List<DownloadFile> findAll() throws SQLException {
		FileListDao dao=new FileListDao();
		
		return dao.showall();
	}
	
}
