<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="AddPackageServlet" method="post">
Enter Hotel name to add a package<input type="text" name="Hname" ><br>
Package Name<input type="text" name="Pname"><br>
Buffet Price<input type="text" name="BuffetP"><br>
Number of meals<input type="text" name="NoOfM"><br>
Pool Charges<input type="text" name=pCharges><br>
Gym Charges<input type="text" name="gCharges"><br>
Liquor<input type="text" name="liq"><br>
Time Duration<input type="text" name="TimeD"><br>
<input type="submit" name="submit" value="submit">
</form>

</body>
</html>