
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>
</head>
<body>
<h1> The Current Products are</h1>
     <c:forEach var="i" begin="1" end="10" step="1">
      <c:out value="${i}" />

      <br />
    </c:forEach>
<!-- 
<table>
	<tr>
		<td> Product ID </td>
		<td> Product Category </td>
		<td> Product Name </td>
		<td>Price </td>
	</tr>
	<c: forEach item ="${data}" var="prod">
	<tr>
			<td> ${prod.prodID}</td>
			<td> ${prod.prodCategory}</td>
			<td> ${prod.prodName}</td>
			<td> ${prod.prodPrice}</td>
		</tr>
		</c:>
</table>
 -->

</body>
</html>