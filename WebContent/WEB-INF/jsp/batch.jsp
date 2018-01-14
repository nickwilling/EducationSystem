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
            <legend>班级列表</legend>
            <table>
                <c:forEach items="${batchList}" var="b" >
                    <tr>
                        <td>${b.cyear}级</td>
                        <td>${b.cname}班</td>
                        <td>
                            <a href="showTPByBatch.do?cid=${b.cid}&cname=${b.cname}">查看教学计划</a> &nbsp;
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </fieldset>
</html>
