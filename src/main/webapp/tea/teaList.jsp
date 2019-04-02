<%--
  Created by IntelliJ IDEA.
  User: 欢迎谢公子
  Date: 2019/4/2
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <base href="<%=request.getContextPath()+"/"%>">
    <title>老师展示页面</title>
</head>
<body>
    <table >
      <th>
        <td>姓名</td>
        <td>操作</td>
      </th>
      <c:forEach items="${tTeaList}" var="tea">
          <tr>
              <td>${tea.tname}</td>
              <td>编辑|删除</td>
          </tr>
      </c:forEach>

    </table>
</body>
</html>
