<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String user = (String) session.getAttribute("type");
   if( !user.equals("emp")) {
	   response.sendRedirect("logout");
   }
%>

Hi <%= session.getAttribute("name") %> - <%= session.getAttribute("eid") %><br>
<form action="logout"><input type = "submit" value = "logout" ></form><br>

<a href="myreferrals">My referrals</a>
<a href="listjobs">List of Openings</a>

<table border=2>
<tr><th>Job ID</th><th>No. Of openings</th><th>Location</th><th>Salary</th><th>Description</th><th>Refer</th>
<c:forEach items="${jobs}" var="key">
    
    

    
        <tr>
        <td>${key.jid} </td>
        <td>${key.openings}</td>
        <td>${key.location}</td>
        <td>${key.salary}</td>
        <td>${key.description}</td>
        <td><form action="refer/${key.jid}"><input type = "submit" value = "Refer a Friend " ></form></td>
        
        </tr>
    </c:forEach>

</table>


</body>
</html>