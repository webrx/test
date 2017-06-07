<%@ page import="java.io.File" %>
<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <title>test-home</title>
    <link rel="stylesheet" href="css/index.css">
</head>
<body>
<a href="show">show</a>
<hr>
<c:forEach begin="1" end="10" var="i">
    ${i}<br>
</c:forEach>
<%
out.print("Hello222");
String dir = request.getServletContext().getRealPath("upload/user/");
out.print(dir);
File f = new File(dir);
if(!f.exists()){
    f.mkdirs();
}
%>
<hr>
${2*3}
</body>
</html>