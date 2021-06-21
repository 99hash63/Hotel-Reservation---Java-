<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
	<form action="UpdateHootelServlet" method="post">
	
		<c:forEach var="h" items="${hotel}">	
		
		<c:set var="hotelNm" value="${h.name}"></c:set>
		
		Hotel Name<input type="text" name="name" value="${h.name}" readonly><br>
		Hotel Address<input type="text" name="add" value="${h.address}"><br>
		Contact Number<input type="text" name="contact" value="${h.contact}"><br>
		Director<input type="text" name="dir" value="${h.director}"><br>
		Owner<input type="text" name="own" value="${h.owner}"><br>
		Rating<input type="text" name="rate" value="${h.rating}"><br>
		Number of halls<input type="text" name="nOh" value="${h.noOfHalls}"><br>
		<input type="submit" name="update" value="Update Details">
		
		</c:forEach>
			
	</form>
	
	<form action="DeleteHotelServlet" method="post">
	<input type="hidden" name="hn" value="${hotelNm}">
	<input type="submit" name="submit" value="Delete Hotel">
	
	
	</form>

</body>
</html>