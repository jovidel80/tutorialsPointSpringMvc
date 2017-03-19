<%--
  Created by IntelliJ IDEA.
  User: jose
  Date: 19/03/2017
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@include file="include.jsp" %>
<html>
<head><title><fmt:message key="title"/></title></head>
<body>
<h1><fmt:message key="heading"/></h1>
<p><fmt:message key="greeting"/> <c:out value="${model.now}"/></p>
<h3>Products</h3>
<c:forEach var="prod" items="${model.products}">
    <c:out value="${prod.description}"/> <i>$<c:out value="${prod.price}"/></i><br><br>
</c:forEach>
<br>
<a href="<c:out value="priceincrease.htm"/>">Increase Prices</a>
</body>
</html>
