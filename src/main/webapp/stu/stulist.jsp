<%--
  Created by IntelliJ IDEA.
  User: cx
  Date: 2019/4/2
  Time: 18:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学生管理</title>
</head>
<body>
<base href="<%=request.getContextPath()+"/"%>">
<table border="1" cellspacing="0">

    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${stuList}" var="stu">
        <tr>
            <td>${stu.sid}</td>
            <td>${stu.sname}</td>
            <td><a href="#">编辑</a>|<a>删除</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
