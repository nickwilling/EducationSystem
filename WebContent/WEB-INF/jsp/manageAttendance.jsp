<%-- 
    Document   : manageAttendance
    Created on : 2017-6-15, 11:10:10
    Author     : nick
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<form>
		<span>输入班级号：</span><input type="text" name="batch"> <br>
		<br> <span>输入开始时间：</span><input type="date" name="beginDate">
		<br>
		<br> <span>输入结束时间：</span><input type="date" name="endDate">
		<br>
		<br> <input type="submit" value="查询"
			formaction="showAttendace.do">
	</form>

	<table>
		<tr>
			<td>日期</td>
			<td>学生学号</td>
			<td>姓名</td>
			<td>课程名</td>
			<td>节数</td>
			<td>出勤情况</td>
		</tr>
		<c:forEach items="${aList}" var="a">
			<tr>
				<td><fmt:formatDate value="${a.adate}"
						pattern="yyyy-MM-dd HH:mm:ss" />
				<td>${a.student.studentId}</td>
				<td>${a.student.studentName}</td>
				<td>${a.teachingProgramDetail.teachingProgram.course.courseName}</td>
				<td>${a.teachingProgramDetail.tpdlessonTime}</td>
				<c:choose>
					<c:when test="${a.astate}=1">
					<td>出勤</td>
  					</c:when>
					<c:otherwise>
					<td>缺勤</td>
  					</c:otherwise>
				</c:choose>
				
			</tr>
		</c:forEach>

	</table>
</body>
</html>
