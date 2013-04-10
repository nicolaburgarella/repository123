<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" %>
<html>
<head><title>Email Validation</title>
<script language = "Javascript">

function emailcheck(str) {

var at="@"
var dot="."
var lat=str.indexOf(at)
var lstr=str.length
var ldot=str.indexOf(dot)
if (str.indexOf(at)==-1){
alert("Invalid E-mail ID")
return false
}

if (str.indexOf(at)==-1 || str.indexOf(at)==0 || str.indexOf(at)==lstr){
alert("Invalid E-mail ID")
return false
}

if (str.indexOf(dot)==-1 || str.indexOf(dot)==0 || str.indexOf(dot)==lstr){
alert("Invalid E-mail ID")
return false
}

if (str.indexOf(at,(lat+1))!=-1){
alert("Invalid E-mail ID")
return false
}

if (str.substring(lat-1,lat)==dot || str.substring(lat+1,lat+2)==dot){
alert("Invalid E-mail ID")
return false
}

if (str.indexOf(dot,(lat+2))==-1){
alert("Invalid E-mail ID")
return false
}

if (str.indexOf(" ")!=-1){
alert("Invalid E-mail ID")
return false
}
alert("valid E-mail ID")
return true 
}

function ValidateEmail(){
var emailID=document.frm.txtEmail

if ((emailID.value==null)||(emailID.value=="")){
alert("Please Enter your Email Address")
emailID.focus()
return false
}
if (emailcheck(emailID.value)==false){
emailID.value=""
emailID.focus()
return false
}
return true
}
</script>
</head>
<body>
<form name="frm" method="post" action="#" onSubmit="return ValidateEmail()">
<p>Enter an Email Address : 
<input type="text" name="txtEmail">
</p>
<p> 
<input type="submit" name="Submit" value="Submit">
</p>
</form>
</body>
</html>

