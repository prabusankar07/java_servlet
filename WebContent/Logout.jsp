<%@ page errorPage="Error.jsp" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/style.css" type="text/css" media="screen, projection, tv"  />
<link rel="stylesheet" href="css/style-print.css" type="text/css"  media="print" />
<title>Logout</title>
<script type="text/javascript">
window.history.forward();
function noBack()
{window.history.forward();}
</script>

</head>
<style>

body {
    border-style: double;
    border-width: thick;
    border-color: black;
    background-color:#800040;
}
h1{
color:black;
}
h4{
color:#ff6666;
}

</style>
<body>
 <%
    session.invalidate();
 %>
   <h1>You are Sucessfully logged out...</h2>
   <br>
   <a href="LoginPage.jsp"><h4>Login Page</h4></a>
   </body>

</body>
</html>