<%-- 
    Document   : select
    Created on : Jun 13, 2017, 2:44:48 PM
    Author     : NIIT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>搜索</title>
        <link href="../CSS/search.css" rel="stylesheet"/>
        <script type="../text/javascript" src="js/jquery-3.2.1.js"></script>
        <script type="../text/javascript" src="js/search.js"></script>
    </head>
    <body style="background-image:url(../image/1.jpg);background-attachment:fixed;background-repeat:no-repeat;background-size:cover">
        <div class="titleDiv">
        <div class="header">
            <!--<img src="image/2.png" class="headerList">-->
            <ul class="headerList">     
                <li><a href="checkBatch.do">查看所带班级</a></li>
                <li><a href="checkCourse.do">查看所教课程</a></li>
                <li><a href="manageAttendance.do">指定班级出勤记录</a></li>
                <li><a href="manageAttendanceByStudent.do">指定学生出勤记录</a></li>
                <li><a href="showTop20.do">缺勤前20</a></li>
            </ul>
        </div>
        	
        </div>
        <div>
        <h1>欢迎回来,${teacher.teacherName}老师</h1>
        </div>
        <div class="footDiv">
        <p>版权单位&nbsp;&nbsp;合作企业&nbsp;&nbsp;青岛大学&nbsp;&nbsp;版权所有&nbsp;&nbsp;联系我们&nbsp;&nbsp;
            常见问题&nbsp;&nbsp;意见反馈<br>Copyright © 2014级 Java13班&nbsp;在线反馈和出勤管理系统</p>
    </div>
    </body>
</html>
