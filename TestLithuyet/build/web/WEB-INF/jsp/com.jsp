<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>

        <table border="1">
            <tr>
                <th>Computer Id</th>
                <th>Computer Name</th>
                <th>Producer</th>
                <th>Making Year</th>
                <th>Price</th>
            </tr>
                <tr>
                    <td>${com.comId}</td>
                    <td>${com.comName}</td>
                    <td>${com.producer}</td>
                    <td>${com.yearMaking}</td>
                    <td>
                        <fmt:formatNumber>${com.price}</fmt:formatNumber>
                        </td>
                </tr>
        </table>
        <a href="redirect.jsp">Back</a>
    </center>
</body>
</html>