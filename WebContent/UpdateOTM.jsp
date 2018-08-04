<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ page errorPage="Error.jsp" session="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<title>Lab Management System</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="css/style.css" type="text/css"media="screen, projection, tv" />
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


 

</style>
</head>
<body id="add" >
<ul class="style1">
<li><a href="Logout.jsp" ><font color="white">Logout</font></a></li>
<li><a href="HomeOTM.jsp" ><font color="white">Home</font></a></li>
 <h3 class="style1">Lab Management System</h3>
</ul>

  <h1>Lab Details</h1>

<div id="detail">

<form action="LMSController" method="post">
<c:if test="${not empty errupdate}">
  Lab Not Found
 </c:if> 
<fieldset>
<legend><h3 class="style2">Lab Update</h3></legend>
<table class ="tabprop" border="0">
<br></br>
<tr>
 <td><b>LabID</b></td>
<td><input type="text" name="labID" required></input></td>
<td><input type="submit" name="sear" required></input></td>
</tr>
</table>
<br></br>
<input type="hidden" value="update" name="activity"/>
</fieldset>
 
</form>
</div>
</body>
</html>
