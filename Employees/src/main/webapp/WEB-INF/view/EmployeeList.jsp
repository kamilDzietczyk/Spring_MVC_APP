<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>List</title>
    <link rel="stylesheet" type="text/css" href="/Employees/URLToReachResourcesFolder/css/style.css">
</head>
<body>

    <ul>
        <li><a href="/Employees/showAddEmployeePage">ADD EMPLOYEE</a></li>
        <li><a href="/Employees/Login">LOG OUT</a></li>
    </ul>

    <div id="DivCustomers">
        <table id="customers">
            <thead>
                <tr>
                    <th>NAME</th>
                    <th>MOBILE</th>
                    <th>COUNTRY</th>
                    <th>PESEL</th>
                    <th>ACTION</th>
                </tr>
            </thead>

            <c:forEach var="employee" items="${employee}">
                <tr>
                    <td> ${employee.name} </td>
                    <td> ${employee.mobile} </td>
                    <td> ${employee.country} </td>
                    <td> ${employee.pesel} </td>
                    <td align="center">
                        <div id="wrapper">
                            <a class="floated" href="/Employees/update?userId=${employee.id}">UPDATE</a>
                            <a class="floated" href="/Employees/delete?userId=${employee.id}" onclick="if(!(confirm('Are you want delete')))return false">DELETE</a>
                        </div>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <br/>
    </div>

</body>
</html>
