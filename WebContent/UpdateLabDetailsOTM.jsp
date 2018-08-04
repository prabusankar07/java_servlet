<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.List"%>
<%@ page errorPage="Error.jsp" session="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
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

h2
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
<li><a href="HomeOTM.jsp" ><font color="white">Home</font></a></li>
 <h2>Lab Management System</h2>
</ul>

  <h1>Lab Details</h1>


<div id="detail">
<form action="LMSController" method="post">
<fieldset>
<legend><h3 class="style2">Lab Update</h3></legend>
<table class ="tabprop" border="0">

<br></br>


<c:forEach items="${data}" var="ldb">
<tr>
<td><b>Lab ID</b></td>
<td><input type="text" name="id" value="${ldb.labId}" ></input></td>
</tr>
<tr>
<td><b>Lab Name</b></td>
<td><input type="text" name="type" value="${ldb.labName}" ></input></td>
</tr>
<tr>
<td><b>Lab type</b></td>
<td>
<input type="text" name ="labtype" value="${ldb.type }" ></input>

</td>
</tr>
<tr>
<td><b>Capacity</b></td>
<td><input type="text" name="capacity" value="${ldb.capacity }" ></input></td>
</tr>
<tr>
<td><b>Country</b></td>
<td><input type="text" list="countries" name="mycountry"  value=" ${ldb.country }"/>
<datalist id="countries">
    <option value="India">India</option>
    <option value="United States">United States</option>
    <option value="United Kingdom">United Kingdom</option>
    <option value="Germany">Germany</option>
    <option value="France">France</option>
</datalist>
</td></tr>
<tr>
<td><b>City</b></td>
<td><input type="text" list="cities" name="city" value="${ldb.city }"  />
<datalist id="cities">
    <option value="chennai">Chennai</option>
    <option value="hyderabad">Hyderabad</option>
    <option value="pune">Pune</option>
    <option value="banglore">Bangalore</option>
   </datalist>
</td></tr>
<tr>
<td><b>Status</b></td>
<td>
<input type="text" list="availability" name="status" value="${ldb.status }" />
<datalist id="availability">
    <option value="available">Available</option>
    <option value="not available">Not Available</option>
    </datalist>
</td>
</tr>
<tr>
<td><b>Systems Availabe</b></td>
<td><input type="text" name="sysavl" value="${ldb.systemsAvailable }" ></input></td>
</tr>
<tr>
<td><b>White Board</b></td>
<td>
<input type="text" list="availability" name="wboard" value=" ${ldb.whiteBoard }" />
<datalist id="availability">
    <option value="available">Available</option>
    <option value="not available">Not Available</option>
    </datalist>
</td>
</tr>
<tr>
<td><b>AC</b></td>
<td>
<input type="text" list="availability" name="ac" value=" ${ldb.airConditioner }" />
<datalist id="availability">
    <option value="available">Available</option>
    <option value="not available">Not Available</option>
    </datalist>
</td>
</tr>
<tr>
<td><b>Projector</b></td>
<td>
<input type="text" list="availability" name="projector" value="${ldb.projector }" />
<datalist id="availability">
    <option value="available">Available</option>
    <option value="not available">Not Available</option>
    </datalist>
</td>
</tr>
<tr>
<td><b>Phone</b></td>
<td>
<input type="text" list="availability" name="phone" value="${ldb.phone }" />
<datalist id="availability">
    <option value="available">Available</option>
    <option value="not available">Not Available</option>
    </datalist>
</td>
</tr>
<tr>
<td><b>Mike</b></td>
<td>
<input type="text" list="availability" name="mike" value=" ${ldb.mike } " />
<datalist id="availability">
    <option value="available">Available</option>
    <option value="not available">Not Available</option>
    </datalist>
</td>
</tr>
<tr>
<td><b>Sound System</b></td>
<td>
<input type="text" list="availability" name="soundsys" value="${ldb.soundSystem } " />
<datalist id="availability">
    <option value="available">Available</option>
    <option value="not available">Not Available</option>
    </datalist>
</td>
</tr>
<tr>
<td><b>Video Conference</b></td>
<td>
<input type="text" list="availability" name="videoconf" value="${ldb.videoConference }"/>
<datalist id="availability">
    <option value="available">Available</option>
    <option value="not available">Not Available</option>
    </datalist>
</td>
</tr>
 </c:forEach>
</table>
<br></br>
<input type="hidden" value="updatelab" name="activity"/>
<input type="submit" value="Update" name="sear"></input>
</fieldset>
 
</form>
</div>
</body>
</html>
