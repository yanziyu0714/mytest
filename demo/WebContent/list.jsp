<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<table border="1" width="66%">
			<tr>  
				<th>编号</th>
				<th>文件名称</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${list}" var="file"> 
			<tr align="center">
				<td>${file.id }</td>
				<td>${file.fileShowName }</td>
				<td><a href="/demo/DownLoad?fileName=${file.fileRealName}">下载</a></td>
			</tr>
		</c:forEach> 
		</table>
	</center>
</body>
</html>