<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>LoginPanel</title>
    <link rel="stylesheet" type="text/css" href="/Employees/URLToReachResourcesFolder/css/style.css">
</head>
<body>

    <ul>
        <li><a href="/Employees/Register">REGISTER</a></li>
    </ul>


    <div style="margin-top: 10%" class="login-block">
        <h1>LOGIN</h1>
      <%--@elvariable id="User" type="com.Mvc.API.User"--%>
      <form:form action="LoginUser" modelAttribute="User" method="post">

          <form:input path="login" id="username" maxlength="45" required = "true" placeholder="LOGIN"
                      oninvalid="this.setCustomValidity('field cannot be empty')"
                      oninput="this.setCustomValidity('')"/>
          <br>

          <form:input path="pass" id="password" type="password"  maxlength="45" required = "true" placeholder="PASSWORD"
                      oninvalid="this.setCustomValidity('field cannot be empty')"
                      oninput="this.setCustomValidity('')"/>
          <br>

          <button type="submit">LOGIN</button>
      </form:form>
    </div>
</body>
</html>
