<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 
     <%
     Cookie ckPavani,ckHarshit,ckManju;
     
     ckPavani =new Cookie("Pavani","88");
     ckPavani.setMaxAge(1000*24*60*60);
     response.addCookie(ckPavani);
     
     
     ckHarshit =new Cookie("Harshit","88");
     ckHarshit.setMaxAge(1000*24*60*60);
     response.addCookie(ckHarshit);
     
     ckManju =new Cookie("Manju","88");
     ckManju.setMaxAge(1000*24*60*60);
     response.addCookie(ckManju);
     out.println("Cookie Created Succesfully......");
     
     
     
     
     %>
</body>
</html>