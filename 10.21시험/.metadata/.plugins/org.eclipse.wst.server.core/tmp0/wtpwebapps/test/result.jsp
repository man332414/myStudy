<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import = "com.oreilly.servlet.*"%>
<%@ page import = "com.oreilly.servlet.multipart.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result</title>
</head>
<body>
	<%
		String save = request.getServletContext().getRealPath("img");
		out.print(save);
		MultipartRequest multi = new MultipartRequest(request, save, 5*1024*1024, "utf-8", new DefaultFileRenamePolicy());
		String name = multi.getParameter("name");
		String filename = multi.getFilesystemName("filename");
	%>
</body>
</html>