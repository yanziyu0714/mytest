package com.itheima.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.itheima.domain.DownloadFile;
import com.itheima.utils.DataSourceUtils;

public class FileListDao {

	public List<DownloadFile> showall() throws SQLException {
		QueryRunner queryRunner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from filelist ";
		Object [] params = {};
		List<DownloadFile> list = queryRunner.query(sql, new BeanListHandler<DownloadFile>(DownloadFile.class));
		return list;
		
	}

}
