<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search</title>
</head>
<body>
<!-- faccio la prima form usando struts 2 tags -->
<s:form action="tutorials/getTutorial">
<!-- creo una textbox con il valore della proprietà che ci interessa della action, sempre language -->
<s:textfield label="Enter the language you want to search for" key="language"></s:textfield>
<s:submit/>


</s:form>
<!-- soluzione alternativa classica senza struts 2 tags nelle jsp che usa post invece di get, scelgo di invocare il metodo post e non il get stavolta invoco searchForm.jsp nell'url 
<form method="post" action="tutorials/getTutorial.action">
<input id="language" name="language"/>
<input type="submit" />
</form>
-->


</body>
</html>