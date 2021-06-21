<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="ViewHotelServlet" method="post">

<label>View Hotels</label><br>

  <input type="text" placeholder="Search.." name="search">
  <button type="submit"><i class="fa fa-search"></i>search</button>
  
</form>
<br>


<form action="ViewPackageServlet" method="post">

<label>View Packages</label><br>

  <input type="text" placeholder="Enter Hotel Name.." name="search">
  <button type="submit"><i class="fa fa-search"></i>search</button>
  
</form>
<br>

<a href="AddHotel.jsp">
<button>Add New Hotel</button>
</a>

<a href="AddPackage.jsp">
<button>Add New Package</button>
</a>



</body>
</html>