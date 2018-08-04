<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page  session="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<title>Lab Management System</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" href="css/style.css" type="text/css" media="screen, projection, tv" />
<link rel="stylesheet" href="css/style-print.css" type="text/css" media="print"  />
<script type="text/javascript">
window.history.forward();
function noBack()
{window.history.forward();}
</script>

<style>

body
{
height: 100%;
background-image: url(image11.jpg);
background-size: cover;
background-repeat: no-repeat;

text-align: center;
font: 1.2em Verdana, Arial, Helvetica, sans-serif;

}
li {
    float: right;
}

a:link {
    text-decoration: none;
    color: white;
}

li a {
    background : green;
    background-position: 0px -401px;
    border: solid 1px #000000;
    color:#ffffff;
    height: 21px;
    margin-top: -1px;
    padding-bottom: 5px;
}

li a:hover {
    background-color: black;
     background-position: 0px -501px;
     color:#000000;
}
li.logout{
float: right;

}
a:link.logout {
text-decoration: none;
color:white;
}
li a.logout{
display: block;
color:white;
text-align: center;
padding: 14px 16px;
text-decoration: none;
}
li a:hover.logout
{
background-color: #111;
}


</style>
</head>
<body id = "add">
<ul class="style1">
<li class="logout"><a class="logout" href="Logout.jsp" ><font color="white">Logout</font></a></li>
 <h3 class="style1">Lab Management System</h3>
</ul>
 <div id="wrapper">

 <hr class="noscreen" />
 <div class="content">
 <div class="column-left">
 <h3 class="style2"><b>MENU</b></h3><br>
<ul class="menu">
       
        <li><a href="LabSearchOTM.jsp"><font color:"white" size:"4px"></>Lab Search</font></a></li>
        <li><a href="UpdateOTM.jsp"><font color:"white" size:"4px">Update Lab </font></a></li>
        <li><a href="ReleaseUpdateOTM.jsp"><font color:"white" size:"4px">Release Update</font></a></li>
        <li><a href="RequestUpdateOTM.jsp"><font color:"white" size:"4px">Request Update</font></a></li>
        <li><a href="ExtensionUpdateOTM.jsp"><font color:"white" size:"4px">Extension Update</font></a></li>
		</ul>
    </div>
 <div id="skip-menu"></div>
    <div class="column-right">
      <div class="box">
        <div class="box-top"></div>
        <div class="box-in">
          <h2>Welcome Operation Team Members "${user}"</h2>
           <div id="background"></div>
          <p></p>
          <p></p>
          <br />
        </div>
      </div>
      <div class="box-bottom">
        <hr class="noscreen" />
         </div>
    </div>
    <div class="cleaner">&nbsp;</div>
  </div>
</div>
<div ></div></body>
</html>
