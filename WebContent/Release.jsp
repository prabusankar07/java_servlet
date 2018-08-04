<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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


 

</style>
</head>
<body id="add" >
<ul class="style1">
<li><a href="Logout.jsp" ><font color="white">Logout</font></a></li>
<li><a href="HomeLO.jsp" ><font color="white">Home</font></a></li>
</ul>
  <h1>Status</h1>

<div id="detail">
<form action="LMSController" method="post">
<fieldset>
<legend><h3 class="style2">ReleaseStatus</h3></legend>
<table class ="tabprop" border="0">
<br></br>
<table  border="2">
<tr>
<th>BookingID</th>
<th>LabID</th>
<th>LabName</th>
<th>Location</th>
<th>TrainingName</th>
<th>LOName</th>
<th>StartDate</th>
<th>EndDate</th>
<th>ReleaseDate</th>
<th>Approval</th>
</tr>
  <c:forEach items="${data}" var="lerb">
  <tr>
     <td> ${lerb.bookingId } </td>
   <td> ${lerb.labId } </td>
   <td> ${lerb.labName} </td>
   <td> ${lerb.location } </td>
    <td> ${lerb.trainingName } </td>
    <td>${lerb.loName } </td>
   <td> ${lerb.startDate } </td>
   <td> ${lerb.endDate } </td>
   <td> ${lerb.releaseDate } </td>
    <td> ${lerb.approval } </td>
 
   </tr>
  </c:forEach>
</table>
<br></br>
<input type="hidden" value="release" name="activity"/>
<input type="submit" value="viewrequest" name="extension"></input>

</fieldset>
</form>
</div>
</body>
</html>
