<%-- 
    Document   : top20
    Created on : 2017-6-16, 1:34:36
    Author     : nick
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <fieldset>
            <legend>缺勤Top20列表</legend>
            <table>
                    <tr>
                        <td>学号</td>
                        <td>姓名</td>
                        <td>班级</td>
                        <td>缺勤次数</td>
                    </tr>
                <c:forEach items="${top20}" var="b" >
              
                    <tr>
                        <td>${b.id}</td>
                        <td>${b.name}</td>
                        <td>${b.batch}</td>
                        <td>${b.c}</td>
                    </tr>
                </c:forEach>
            </table>
        </fieldset>
    </body>
</html>
