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

h3
{
text-align:center;
color:white;
font-size:20px;
}
 h1{
 text-align:center;
 
 }
h3.style1
{
text-align:center;
color:white;
font-size:20px;
}
h3.style2
{
text-align:center;
color:black;
font-size:20px;
}
 
</style>

</head>
<body>
<ul class="style1">
<li><a href="Logout.jsp" ><font color="white">Logout</font></a></li>
<li><a href="HomeOTH.jsp" ><font color="white">Home</font></a></li>
 <h3 class="style1">Lab Management System</h3>
 </ul>
 <div id="wrapper">

 <body id="add" >

 <h1>Lab Details</h1>

<div id="detail">
<form action="LMSController" method="post">
<fieldset>

<legend><h3 class="style2">Add Lab Details</h3></legend>
<table class ="tabprop" border="0">
<br></br>
<tr>
<td><b>Lab ID</b></td>
<td><input type="text" name="labID" pattern="msat[A-Za-z]{4}[A-Za-z]{4}[0-9]{4}" title="Format:msat<<city>><<loc>>9999" required></input></td>
</tr>
<tr>
<td><b>Lab Name</b></td>
<td><input type="text" name="type"   required></input></td>
</tr>
<tr>
<td><b>Lab type</b></td>
<td>
<input type="radio" name ="labtype" value="auditorium"></input><b>Auditorium</b>
<input type="radio" name ="labtype" value="normal"></input><b>Normal</b>
</td>
</tr>
<tr>
<td><b>Capacity</b></td>
<td><input type="number" name="capacity"  min="30" required></input></td>
</tr>
<tr>
<td><b>Country</b></td>
<td><input type="text" list="countries" name="mycountry" required/>
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
<td><input type="text" list="cities" name="city" required />
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
<input type="text" list="availability" name="status" required/>
<datalist id="availability">
    <option value="available">Available</option>
    <option value="not available">Not Available</option>
     <option value="deactivate">Deactivate</option>
    </datalist>
</td>
</tr>
<tr>
<td><b>Systems Availabe</b></td>
<td><input type="text" name="sysavl" required></input></td>
</tr>
<tr>
<td><b>White Board</b></td>
<td>
<input type="text" list="availabilit" name="wboard" pattern="available"  title="White board is mandatory" required/>
<datalist id="availabilit">
    <option value="available">Available</option>
    <option value="not available">Not Available</option>
    </datalist>
</td>
</tr>
<tr>
<td><b>AC</b></td>
<td>
<input type="text" list="availabilit" name="ac" pattern="available"  title="AC is mandatory" required/>
<datalist id="availabilit">
    <option value="available">Available</option>
    <option value="not available">Not Available</option>
</datalist>
</td>
</tr>
<tr>
<td><b>Projector</b></td>
<td>
<input type="text" list="availabilit" name="projector" required/>
<datalist id="availabilit">
    <option value="available">Available</option>
    <option value="not available">Not Available</option>
    </datalist>
</td>
</tr>
<tr>
<td><b>Phone</b></td>
<td>
<input type="text" list="availabilit" name="phone" required/>
<datalist id="availabilit">
    <option value="available">Available</option>
    <option value="not available">Not Available</option>
    </datalist>
</td>
</tr>
<tr>
<td><b>Mike</b></td>
<td>
<input type="text" list="availabilit" name="mike" required/>
<datalist id="availabilit">
    <option value="available">Available</option>
    <option value="not available">Not Available</option>
    </datalist>
</td>
</tr>
<tr>
<td><b>Sound System</b></td>
<td>
<input type="text" list="availabilit" name="soundsys" required/>
<datalist id="availabilit">
    <option value="available">Available</option>
    <option value="not available">Not Available</option>
    </datalist>
</td>
</tr>
<tr>
<td><b>Video Conference</b></td>
<td>
<input type="text" list="availabilit" name="videoconf" required/>
<datalist id="availabilit">
    <option value="available">Available</option>
    <option value="not available">Not Available</option>
    </datalist>
</td>
</tr>
</table>
<br></br>
<center>
<input type="hidden" value="addlabdetails" name="activity"/>
<input type="submit" value="ADD"></input>
<input type="reset" value="Reset"></input>
</center>
</fieldset>
</form>
</div>
</body>
</html>
