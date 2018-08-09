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
   if( !user.equals("emp")) {
	   response.sendRedirect("logout");
   }
%>
Hi <%= session.getAttribute("name") %> - <%= session.getAttribute("eid") %><br>
<form action="<%=request.getContextPath()%>/logout"><input type = "submit" value = "logout" ></form><br>

<a href="myreferrals">My referrals</a>
<a href="listjobs">List of Openings</a><br>
<form action="../refer" method=POST>

Job ID <input type=text name="jid" value="${jid}">
Title<input type = text name = "title" id="title" value=${title}>
location <input type = text name = "location" id="location" value=${location}>
Name <input type=text name="name" id="name">
emailid <input type=text name="email" id ="email">
Contact number <input type=text name="number" id="number">
Current Location <input type=text name="curlocation" id="curlocation">
Remarks to HR
<input type=text name="remark" id="remark">
<input type = "submit" value = "Submit" ></form>


</body>
</html>