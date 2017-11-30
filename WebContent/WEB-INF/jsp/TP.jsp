<%-- 
    Document   : TP
    Created on : 2017-6-20, 21:04:24
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
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Batch</th>
                    <th>TeacherID</th>
                    <th>CourseID</th>
                    <th>Year</th>
                    <th>Season</th>
                    <th>Week</th>
                    <th>WeekDay</th>
                    <th>LessonTime</th>
                    <th>Location</th>
                    <th>Operate</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${TPList}" var="tp">
                    <tr>
                        <td>${tp[0]}</td>
                        <td>${tp[1]}</td>
                        <td>${tp[2]}</td>
                        <td>${tp[3]}</td>
                        <td>${tp[4]}</td>
                        <td>${tp[5]}</td>
                        <td>${tp[6]}</td>
                        <td>${tp[7]}</td>
                        <td>${tp[8]}</td>
                        <td>
                            <form>
                                <input type="hidden" value="${tp[9]}" name="id">
                                <button onclick="editTeaching()" style="margin-top: -4px;" type="button" class="btn btn-success btn-sm">修改</button>
                                <button style="margin-top: -4px;" type="submit" formaction="deleteTP" class="btn btn-danger btn-sm">删除</button>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>




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
                            <button onclick="editTeaching()" style="margin-top: -4px;" type="button" class="btn btn-success btn-sm">修改</button>
                            <button style="margin-top: -4px;" type="submit" formaction="deleteStudent" class="btn btn-danger btn-sm">删除</button>
                        </form>
                    </td>
                </tr>
            </tbody>
        </table>



        <table class="table table-striped">
            <thead>
                <tr>
                    <th>StudentID</th>
                    <th>StudentName</th>
                    <th>FeedBackQuestion</th>
                    <th>FeedBackOption</th>
                    <th>CourseID</th>
                    <th>CourseName</th>
                    <th>Operate</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${CFDList}" var="cfd">
                    <tr>
                        <td>${cfd.student.studentId}</td>
                        <td>${cfd.student.studentName}</td>
                        <td>${cfd.courseFeedBackQuestion.qcontent}</td>
                        <td>${cfd.foption}</td>
                        <td>${cfd.courseFeedBackQuestion.course.courseId}</td>
                        <td>${cfd.courseFeedBackQuestion.course.courseName}</td>
                        <td>
                            <form>
                                <input type="hidden" name="id" value="${cfd.fid}">
                                <button onclick="editTeaching()" style="margin-top: -4px;" type="button" class="btn btn-success btn-sm">修改</button>
                                <button style="margin-top: -4px;" type="submit" formaction="deleteCFB" class="btn btn-danger btn-sm">删除</button>
                            </form>
                        </td>

                    </tr>
                </c:forEach>
            </tbody>
        </table>


        <table class="table table-striped">
            <thead>
                <tr>
                    <th>StudentID</th>
                    <th>FeedBackQuestion</th>
                    <th>FeedBackOption</th>
                    <th>TeacherID</th>
                    <th>Operate</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${TFDList}" var="tfd">
                    <tr>
                        <td>${tfd.student.studentId}</td>
                        <td>${tfd.student.studentName}</td>
                        <td>${tfd.teacherFeedBackQuestion.qcontent}</td>
                        <td>${tfd.foption}</td>
                        <td>${tfd.teacherFeedBackQuestion.teacher.teacherId}</td>
                        <td>${tfd.teacherFeedBackQuestion.teacher.teacherName}</td>
                        <td>
                            <form>
                                <input type="hidden" name="id" value="${tfd.fid}">
                                <button onclick="editTeaching()" style="margin-top: -4px;" type="button" class="btn btn-success btn-sm">修改</button>
                                <button style="margin-top: -4px;" type="submit" formaction="deleteTFB" class="btn btn-danger btn-sm">删除</button>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>

