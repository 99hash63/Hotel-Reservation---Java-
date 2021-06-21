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


<form action="UpdatePackageServlet" method="post">

	<c:forEach var="p" items="${pack}">	
	
	<c:set var="pid" value="${p.packId}"></c:set>
	
		Package ID<input type="text" name="packId" value="${p.packId}" readonly><br>
		Package Name<input type="text" name="packageName" value="${p.packageName}" ><br>
		Buffet Price<input type="text" name="buffetPrice" value="${p.buffetPrice}"><br>
		Number Of Meals<input type="text" name="numberOfMeals" value="${p.numberOfMeals}"><br>
		Pool Charges<input type="text" name="poolCharges" value="${p.poolCharges}"><br>
		Gym Charges<input type="text" name="gymCharges" value="${p.gymCharges}"><br>
		Liquor<input type="text" name="liquor" value="${p.liquor}"><br>
		Time Duration<input type="text" name="timeDuration" value="${p.timeDuration}"><br>
		Hotel Name<input type="text" name="hotelName" value="${p.hotelName}"readonly><br><br>
		<input type="submit" name="submit" value="Update Package">
		
	</c:forEach>
	
	</form>
	<form action="DeletePackageServlet" method="post">
	<input type="hidden" name="packId" value="${pid}">
	<input type="submit" name="submit" value="Delete Package">
	</form>
	
</body>
</html>