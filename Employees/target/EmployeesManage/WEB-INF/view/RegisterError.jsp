<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>RegisterError</title>
    <link rel="stylesheet" type="text/css" href="/Employees/URLToReachResourcesFolder/css/style.css">
</head>
<body>
    <div style="margin-top: 10%" class="login-block">
        <h1>User exists. Log in</h1>
        <form action="ErrorAddUser">
            <button type="submit">OK</button>
        </form>
    </div>
</body>
</html>
