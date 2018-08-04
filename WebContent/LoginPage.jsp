<%@ page session="true" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<title>Lab Management System</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="css/style.css" type="text/css"media="screen, projection, tv" />
<link rel="stylesheet" href="css/style-print.css" type="text/css" media="print"  />
<SCRIPT type="text/javascript">
window.history.forward();
function noBack() { window.history.forward(); }
</SCRIPT>
<style>
body
{
height: 100%;
background-image: url(image.jpg);
background-size: cover;
background-repeat: no-repeat;

text-align: center;
font: 1.2em Verdana, Arial, Helvetica, sans-serif;

}

ul{ list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: black;
  }

h3
{
text-align:center;
color:white;
font-size:20px;
}
 .wrapper{
    max-width: 1366px;
    background: black ;
    height: 50px;
    text-align: right;
}

.marquee {
    background:;
    white-space: nowrap;
    -webkit-animation: rightThenLeft 0s linear;
}

</style>
</head>

<body onload="noBack();" onpageshow="if (event.persisted) noBack();" onunload=""  id="add">
<ul >
<div class="wrapper">
<marquee behavior="alternate"><span class="marquee"><h3>Welcome to Lab Management System</h3></span></marquee>
</div>

</ul>

  <h1 >Login</h1>
  <c:if test="${not empty errlog}">
  Invalid User Name and Password!
  </c:if>
<div id="detail">
<form id="log" method="post" action="LMSController">
<fieldset>
<legend>User Login</legend>
<input type="text" id ="name" name="username" placeholder="User Name" required autofocus/ >
<br>
<br>
<input type="password" name="password" placeholder="Password"/>
<br>
<br>
  <input type="hidden" value="login" name="activity"/>
<input type="submit" value="LogIn" " >

<img src="icon5.jpg" alt="Computer man" style="width:400px;height:200px;left:0;position:fixed;bottom:0px;">
</fieldset>
</form>

</div>
</body>
</html>
