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

<form action="AddHotelServlet" method="post">
Hotel Name<input type="text" name="name"><br>
Hotel Address<input type="text" name="add"><br>
Contact Number<input type="text" name="contact"><br>
Director<input type="text" name="dir"><br>
Owner<input type="text" name="own"><br>
Rating<input type="text" name="rate"><br>
Number of halls<input type="text" name="nOh"><br>
<input type="submit" name="submit" value="submit">
</form>

</body>
</html>