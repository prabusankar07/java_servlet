<%@ page errorPage="Error.jsp" session="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<title>Lab Management System</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="css/style.css" type="text/css"  media="screen, projection, tv"/>
<link rel="stylesheet" href="css/style-print.css" type="text/css" media="print"  />
<script type="text/javascript">
window.history.forward();
function noBack()
{window.history.forward();}
</script>

<style>
li {
    float: right;
}

a:link {
    text-decoration: none;
    color: white;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover {
    background-color: #111;
}

h3
{
text-align:center;
color:white;
font-size:20px;
}
 

</style>
</head>
<body id="add" >
<script type="text/javascript">
function myFun()
{
	document.getElementById("bookid").value= Math.floor((Math.random() * 1000)+1);
}
</script>
<ul class="style1">
<li><a href="Logout.jsp" ><font color="white">Logout</font></a></li>
<li><a href="HomeLO.jsp" ><font color="white">Home</font></a></li>
 <h3 class="style1">Lab Management System</h3>
</ul>

  <h1>Lab Release Request</h1>

<div id="detail">
<c:if test="${not empty errrequest}">
  Request Not Found
  </c:if>
<form action="LMSController" method="post">
<input type="text" name="searchid" placeholder="Request Number" ></input>
<input type="submit" value="searchlab" name="req"/>
<fieldset>
<legend><h3 class="style2">Lab Release Request</h3></legend>
<c:forEach items="${data}" var="lerb">
<table class ="tabprop" border="0">
<br></br>
<tr>
<td><b>Booking ID</b></td>
<td><input type="text" name="bookingID" id="bookid" onclick="myFun()"/></td>
</tr>
<tr>
<td><b>Lab ID</b></td>
<td><input type="text" name="labID" value="${lerb.labId}" readonly></input></td>
</tr>
<tr>
<td><b>Lab Name</b></td>
<td><input type="text" name="type" value="${lerb.labName}" readonly></input></td>
</tr>
<tr>
<td><b>Location</b></td>
<td><input type="text" list="cities" name="city"  value="${lerb.location}" readonly />
</td></tr>
<tr>
<td><b>Training Name</b></td>
<td><input type="text" name="training" value="${lerb.trainingName}" readonly></input></td>
</tr>
<tr>
<td><b>LO Name</b></td>
<td><input type="text" name="loName" value="${lerb.loName}" readonly></input></td>
</tr>
<tr>
<td><b>Start Date</b></td>
<td><input type="date" name="sdate" value="${lerb.startDate}" readonly></input></td>
</tr>
<tr>
<td><b>End Date</b></td>
<td><input type="date" name="edate" value="${lerb.endDate}" readonly></input></td>
</tr>
<tr>
<td><b>Release Date</b></td>
<td><input type="date" name="reldate" required></input></td>
</tr>
<tr>
<td><b></b></td>
</tr>
</table>
</c:forEach>
<br></br>
<input type="submit" value="Request" name="req"></input>
<input type="reset" value="Reset"></input>
<input type="hidden" value="labReleaseRequest" name="activity"></input>
</fieldset>
</form>
</div>
</body>
</html>
