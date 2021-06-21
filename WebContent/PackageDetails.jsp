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

	
	<form action="GetUpdatePackServlet" method="post">
	
	<label>Update Package Details</label><br>

		  <input type="text" placeholder="Enter Package ID" name="search">
		  <button type="submit"><i class="fa fa-search"></i>Update</button><br><br>
		  
	</form>
	
	
	<c:forEach var="p" items="${pack}">	
		
			
			Package ID : ${p.packId} <br>
			Package Name : ${p.packageName} <br>
			Buffet Price : ${p.buffetPrice}<br>
			Number Of Meals : ${p.numberOfMeals}<br>
			Pool Charges : ${p.poolCharges}<br>
			Gym Charges : ${p.gymCharges}<br>
			Liquor : ${p.liquor}<br>
			Time Duration : ${p.timeDuration}<br>
			Hotel Name : ${p.hotelName}<br><br>
		
			
	</c:forEach>
		
	
</body>
</html>