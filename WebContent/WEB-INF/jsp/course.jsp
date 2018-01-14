<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>试题</title>
        <link rel="stylesheet" href="../css/style.css" >
    </head>
    <body>
        <fieldset>
            <legend>课程列表</legend>
            <table>
                <c:forEach items="${courseList}" var="b" >
                    <tr>
                        <td>课程号</td>
                        <td>课程名</td>
                        <td>&nbsp;</td>
                        
                    </tr>
                    <tr>
                        <td>${b.courseId}</td>
                        <td>${b.courseName}</td>
                        <td>
                            <a href="showTPByCourse.do?cid=${b.courseId}">查看教学计划</a> &nbsp;
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </fieldset>
</html>
