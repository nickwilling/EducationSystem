<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="CSS/style.css" rel="stylesheet" />
    </head>
    <body class="container">
        <div class="welcome">Welcome,<br/>Where the future begins</div>
        <div class="login">
            <span style="color: white;font-size: 40px;margin-bottom: 32px;">Login</span>
            <form>
            <input class="input" type="text" name="username" placeholder="&nbsp;&nbsp;Username"/><br/>
            <input class="input" type="password" name="password" placeholder="&nbsp;&nbsp;Password"/>
            <input class="code" type="text" placeholder="&nbsp;&nbsp;Identification number"/>
            <canvas id="myCanvas"  class="J_codeimg" onClick="createCode()" >
                您的浏览器不支持画布属性
            </canvas>
            <br/><br/>
            <button type="submit" formaction="student/welcome.do" class="loginButton">login</button>
            </form>
             <a href="register.jsp" class="reg">Register</a>
        </div>
    </body>
</html>

<script>
    window.setTimeout(createCode, 100);
    function showCode(a) {
        var c = document.getElementById("myCanvas");
        var ctx = c.getContext("2d");
        ctx.clearRect(0, 0, 1000, 1000);
        ctx.font = "75px 'Comic Sans MS', cursive";
        ctx.fillText(a, 62, 95);
    }
    var code;
    function createCode() {
        code = "";
        var codeLength = 4;
        var selectChar = new Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
        for (var i = 0; i < codeLength; i++) {
            var charIndex = Math.floor(Math.random() * 60);
            code += selectChar[charIndex];
        }
        if (code.length != codeLength) {
            createCode();
        }
        showCode(code);
    }
</script>
