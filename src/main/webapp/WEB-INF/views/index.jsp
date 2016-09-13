 <%@ page isELIgnored="false" %>
 <%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<body>
<h2>Hello World!</h2>
<a href ="Products">Products</a>
 <c:forEach var ="i" begin ="1" end ="5" step ="1">
 	<c:out value ="${i}"/> <br/>
 </c:forEach>
</body>
</html>
