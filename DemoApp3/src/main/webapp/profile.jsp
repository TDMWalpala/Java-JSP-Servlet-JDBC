<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

     <%
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","12345");
         
         String sql = "SELECT * FROM Users WHERE FirstName=Tharindu";
         Statement st = conn.createStatement();
         
         ResultSet rs = st.executeQuery(sql);
         rs.next();
         
         
          
     %>
     FirstName = <%= rs.getString(1) %><br>
     LastName = <%= rs.getString(2) %><br>
     
</body>
</html>