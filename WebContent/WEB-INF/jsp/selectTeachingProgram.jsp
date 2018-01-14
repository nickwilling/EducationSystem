<%-- 
    Document   : selectTeachingProgram
    Created on : 2017-6-22, 16:31:01
    Author     : nick
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" 
              href="../bootstrap-3.3.5-dist/css/bootstrap.min.css" >
        <link href="../CSS/style.css" rel="stylesheet">
        <script src="../bootstrap-3.3.5-dist/js/jquery-2.2.4.min.js"></script>
        <script src="../bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
    </head>
    <body>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Batch</th>
                    <th>TeacherID</th>
                    <th>CourseName</th>
                    <th>Year</th>
                    <th>Season</th>
                    <th>Week</th>
                    <th>WeekDay</th>
                    <th>LessonTime</th>
                    <th>Location</th>
                    <th>ID</th>
                    <th>Operate</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${TPList}" var="tp">
                    <tr>
                        <td>${tp.teachingProgram.batch.cname}</td>
                        <td>${tp.teachingProgram.teacher.teacherId}</td>
                        <td>${tp.teachingProgram.course.courseName}</td>
                        <td>${tp.tpdyear}</td>
                        <td>${tp.tpdseason}</td>
                        <td>${tp.tpdweek}</td>
                        <td>${tp.tpdweekDay}</td>
                        <td>${tp.tpdlessonTime}</td>
                        <td>${tp.tpdlocation}</td>
                        <td>
                            <form>
                                <input type="hidden" value="${tp.tpdid}" name="id">
                                <button  style="margin-top: -4px;" type="submit" formaction="forEditTP"  class="btn btn-success btn-sm">修改</button>
                                <button style="margin-top: -4px;" type="submit" formaction="deleteTP" class="btn btn-danger btn-sm">删除</button>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
