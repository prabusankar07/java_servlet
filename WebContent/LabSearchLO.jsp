<%@ page errorPage="Error.jsp" session="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.List"%>

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
h2{

text-align:center;
color:white;
font-size:20px;

}

h3
{
text-align:center;
color:black;
font-size:20px;
}
 

</style>
</head>
<body id="add" >
<ul class="style1">
<li><a href="Logout.jsp" ><font color="white">Logout</font></a></li>
<li><a href="HomeLO.jsp" ><font color="white">Home</font></a></li>
 <h2>Lab Management System</h2>
</ul>

  <h1>Search</h1>
<c:if test="${not empty errsearch}">
  Lab Not Found
  </c:if>
<div id="detail">
<form action="LMSController" method="post">
<fieldset>
<legend><h3>Lab Search</h3></legend>
<table class ="tabprop" border="0">
<br></br>
<tr>
<td>
<input type="text" name="labsearchbyID"></input>
</td>
<td>
<input type="submit" value="search_ID" name="searchlab"></input>
</td>
</tr>
<tr>
<td>
<input type="text" name="labsearchbyplace"></input>
</td>
<td><input type="submit" value="search_city" name="searchlab"></input>
</td>
</tr>
<tr>
</tr>
</table>
<input type="submit" value="all_labs" name="searchlab"></input>
<input type="hidden" value="search" name="activity"/>
<input type="reset" value="Reset"></input>
</fieldset>
</form>
</div>


</body>
</html>
