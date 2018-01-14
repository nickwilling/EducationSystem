<%-- 
    Document   : selectStudent
    Created on : 2017-6-22, 16:34:00
    Author     : nick
--%>

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
                    <th>StudentID</th>
                    <th>StudentName</th>
                    <th>Gender</th>
                    <th>Grade</th>
                    <th>Batch</th>
                    <th>Operate</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>${s.studentId}</td>
                    <td>${s.studentName}</td>
                    <td>${s.studentGender}</td>
                    <td>${s.studentGrade}</td>
                    <td>${s.batch.cname}</td>
                    <td>
                        <form>
                            <input type="hidden" name="sid" value="${s.studentId}">
                            <button  style="margin-top: -4px;" type="submit" formaction="forEditStudent.do" class="btn btn-success btn-sm">修改</button>
                            <button style="margin-top: -4px;" type="submit" formaction="deleteStudent.do" class="btn btn-danger btn-sm">删除</button>
                        </form>
                    </td>
                </tr>
            </tbody>
        </table>
    </body>
</html>
