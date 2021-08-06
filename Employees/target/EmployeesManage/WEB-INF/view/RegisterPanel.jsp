<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Register</title>
    <link rel="stylesheet" type="text/css" href="/Employees/URLToReachResourcesFolder/css/style.css">
</head>
<body>

    <ul>
        <li><a href="/Employees/Login">LOG IN</a></li>
    </ul>
    
    <div style="margin-top: 10%" class="login-block" >
        <h1>Register</h1>
        <%--@elvariable id="user" type="com.Mvc.API.User"--%>
        <form:form action="RegisterUser" modelAttribute = "user" method="post">

            <form:input path="login" maxlength="45" required = "true" placeholder="LOGIN"
                        oninvalid="this.setCustomValidity('field cannot be empty')"
                        oninput="this.setCustomValidity('')"/>
            <br/>

            <form:input type="password" path="pass" maxlength="45" required = "true" placeholder="PASSWORD"
                        oninvalid="this.setCustomValidity('field cannot be empty')"
                        oninput="this.setCustomValidity('')"/>
            <br/>

            <form:input path="email" maxlength="45" required = "true" placeholder="E-MAIL"
                        oninvalid="this.setCustomValidity('field cannot be empty')"
                        oninput="this.setCustomValidity('')"/>
            <br/>

            <button type="submit">REGISTER</button>
        </form:form>
    </div>
</body>
</html>
