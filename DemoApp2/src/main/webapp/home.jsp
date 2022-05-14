<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ include file = "header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
    pageContext.setAttribute("name", "tharindu",PageContext.SESSION_SCOPE);
   
    try{
    	 int x = 10/0;
    	
    }catch(Exception e){
    	out.println("Error " + e.getMessage());
    }
 
%>
</body>
</html>