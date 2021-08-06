<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>EmployeeAdd</title>
    <link rel="stylesheet" type="text/css" href="/Employees/URLToReachResourcesFolder/css/style.css">
</head>
<body>

    <ul>
        <li><a href="/Employees/showEmployee">LIST OF EMPLOYEES</a></li>
        <li><a href="/Employees/Login">LOG OUT</a></li>
    </ul>

    <div style="margin-top: 5%" class="login-block">
    <h1>Add Employee</h1>
    <%--@elvariable id="empl" type="com.Mvc.API.Employee"--%>
    <form:form action="SaveEmploye" modelAttribute="empl"  method="POST" >
        <form:hidden path="id"/>

        <label>Name : </label>
        <form:input maxlength="45" path="name" required = "true"
                    oninvalid="this.setCustomValidity('field cannot be empty')"
                    oninput="this.setCustomValidity('')" />
        <br/>

        <label>Mobile : </label>
        <form:input type="text" pattern="[0-9]{9}" required = "true"
                    oninvalid="this.setCustomValidity('Incorrect format. Only [0-9], and 9 digit length, not null')"
                    oninput="this.setCustomValidity('')" maxlength="9" path="mobile"/>
        <br/>

        <label>Country : </label>
        <form:input path="country" required = "true"
                    oninvalid="this.setCustomValidity('field cannot be empty')"
                    oninput="this.setCustomValidity('')" />
        <br/>

        <label>Pesel : </label>
        <form:input path="pesel" type="text" pattern="[0-9]{11}" required = "true"
                    oninvalid="this.setCustomValidity('Incorrect format. Only [0-9], and 9 digit length, not null')"
                    oninput="this.setCustomValidity('')" maxlength="11" />
        <br/>
        <button type="SUBMIT">ADD</button>
    </form:form>
    </div>
</body>
</html>
