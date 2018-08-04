<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.List"%>
<%@ page errorPage="Error.jsp" session="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<title>Lab Management System</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="css/style.css" type="text/css" media="screen, projection, tv"  />
<link rel="stylesheet" href="css/style-print.css" type="text/css"  media="print" />
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
<ul class="style1">
<li><a href="Logout.jsp" ><font color="white">Logout</font></a></li>
<li><a href="LabSearchOTH.jsp" ><font color="white">Back</font></a></li>
 <h3></>Lab Management System</h3>
</ul>
</div>
<h1>Search Results ${search}</h1>
<form >
<table  border="2">
<tr>
<th>LabID</th>
<th>LabName</th>
<th>Type</th>
<th>Country</th>
<th>City</th>
<th>Capacity</th>
<th>Status</th>
<th>Projector</th>
<th>Phone</th>
<th>Mike</th>
<th>SoundSystem</th>
<th>VideoConference</th>
<th>AirConditioner</th>
<th>SystemAvailable</th>
<th>WhiteBoard</th>
</tr>
  <c:forEach items="${data}" var="ldb">
  <tr>
     <td> ${ldb.labId } </td>
   <td> ${ldb.labName } </td>
   <td> ${ldb.type } </td>
   <td> ${ldb.country } </td>
    <td> ${ldb.city } </td>
    <td>${ldb.capacity } </td>
   <td> ${ldb.status } </td>
   <td> ${ldb.projector } </td>
   <td> ${ldb.phone } </td>
    <td> ${ldb.mike } </td>
    <td>${ldb.soundSystem } </td>
    <td> ${ldb.videoConference } </td>
   <td> ${ldb.airConditioner } </td>
    <td> ${ldb.whiteBoard } </td>
    <td>${ldb.systemsAvailable } </td>
   </tr>
  </c:forEach>
</table>
</form>

</body>
</html>
