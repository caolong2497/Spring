<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>
    <body>
        <center>
            <h1>LIST Computer</h1>
            <table border="1">
                <tr>
                    <th>ComputerId</th>
                    <th>Computer Name</th>
                    <th>Producer</th>
                </tr>
                <c:forEach items="${listcom}" var="c">
                    <tr>
                        <td>
                            <a href="loadCombyId.htm?comId=${c.comId}">${c.comId}</a></td>
                        <td>${c.comName}</td>
                        <td>${c.producer}</td>
                    </tr>
                </c:forEach>
            </table>
        </center>
    </body>
</html>