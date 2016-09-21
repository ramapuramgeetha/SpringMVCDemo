 <%@ page isELIgnored="false" %>
 <%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<body>
<h2>Hello World!</h2>
<a href ="Save">Save</a>
<a href ="Products">View</a>
<a href ="Update">Update</a>
<a href ="Delete">Delete</a>
 <c:forEach var ="i" begin ="1" end ="5" step ="1">
 	<c:out value ="${i}"/> <br/>
 </c:forEach>
</body>
</html>
