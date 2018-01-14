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
        <form>
                       
            <input value="${stu.studentId}" name="studentId" class="inputID" type="hidden" />
                        <span>学生姓名:</span>
                        <input value="${stu.studentName}" name="studentName" class="inputID" type="text" placeholder="&nbsp;&nbsp;StudentName"/><br/><br/>
                        <span>性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别:</span>
                        <label>
                            <input type="radio" name="studentGender" id="optionsRadios1" value="男" checked>男
                        </label>
                        <label style="margin-left: 20px;">
                            <input type="radio" name="studentGender" id="optionsRadios2" value="女">女
                        </label>
                        <br/><br/>
                        <span>入学年份:</span>
                        <select name="studentGrade" style="width: 10%;display: inline-block" class="form-control">
                            <option value="2011">2011</option>
                            <option value="2012">2012</option>
                            <option value="2013">2013</option>
                            <option value="2014">2014</option>
                        </select>
                        <br/><br/>
                        <span>班&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;级:</span>
                        <input value="${stu.batch.cid}" name="batchID" class="inputID" type="text" placeholder="&nbsp;&nbsp;Batch"/><br/><br/>
                        <button type="submit" formaction="editStudent.do" class="btn btn-primary addbtn">确认修改</button>
                    </form>
    </body>
</html>
