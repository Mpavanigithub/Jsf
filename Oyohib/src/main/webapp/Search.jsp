<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<form action="SearchPrint.jsp" method="post">
		Select Search Criteria:
		<br/><br/>
		
		<input type="radio" name="searchtype" value="roomId" > By Room Id <br/>
		<input type="radio" name="searchtype" value="type" > By Type <br/>
		<input type="radio" name="searchtype" value="status" > By Status <br/>
		<input type="radio" name="searchtype" value="costPerDay" > By CostPerDay<br/>
		<input type="radio" name="searchtype" value="all" > All Rooms<br/><br/>
		
		Insert Search Value:
		<input type="text" name="searchvalue" size="10"><br/><br/>
		<input type="submit" value='Search'/>
		
	</form>
</body>
</html>