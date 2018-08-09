<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String user = (String) session.getAttribute("type");
   if( !user.equals("hr")) {
	   response.sendRedirect("logout");
   }
%>
Hi <%= session.getAttribute("name") %> - <%= session.getAttribute("eid") %> <br>
<h3>HR Portal</h3> 
<a href="logout">Logout</a>
<a href="viewreferals.jsp">View Referrals</a>
<a href="manageopening.jsp">Manage Openings</a>
<a href="jobvacanciesform.jsp">Create New Opening</a>

</body>
</html>