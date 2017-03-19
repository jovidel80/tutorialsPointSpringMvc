<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: jose
  Date: 19/03/2017
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="include.jsp"%>

<html>
<head>
    <title><fmt:message key="title"/></title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
    <h1><fmt:message key="priceincrease.heading"/></h1>
    <form:form method="post" commandName="priceIncrease">
        <table>
            <tr>
                <td align="right" width="20%">Increase (%):</td>
                <td width="20%">
                    <form:input path="percentage"/>
                </td>
                <td width="60%">
                    <form:errors path="percentage" cssClass="error"/>
                </td>
            </tr>
        </table>
        <br>
        <input type="submit" value="Execute">
    </form:form>
    <a href="<c:out value="hello.htm"/>">Home</a>
</body>
</html>
