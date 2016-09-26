 <%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core"  %>
  <%@ page isELIgnored="false" %>
 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>
</head>
<body>
<h1> The Current Products are</h1>

<table>
	<tr>
		<td> Product ID </td>
		<td> Product Category </td>
		<td> Product Name </td>
		<td>Price </td>
	</tr>
	
	<c:if test ="${data != null}">
	<c:forEach items="${data}" var="prod">
	<tr>
			<td> ${prod.prodID}</td>
			<td> ${prod.prodCategory}</td>
			<td> ${prod.prodName}</td>
			<td> ${prod.prodPrice}</td>
		</tr>
		</c:forEach>
	</c:if>
	<c:if test ="${data = null}">
	<tr>
			<td> There are no products with this number</td>
	</tr>
	</c:if>
</table>


</body>
</html>