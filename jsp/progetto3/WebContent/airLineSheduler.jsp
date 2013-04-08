<!-- page Directive used -->
<%@ page contentType="text/html"%>
<%@ page import="javax.xml.parsers.DocumentBuilderFactory,
javax.xml.parsers.DocumentBuilder,org.w3c.dom.*, java.io.*"
%>
<html>
<body><center><table border="2">

<%
File file = new File("/home/nicola/workspace2/p2/airLineSchedule.xml");
DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
DocumentBuilder db = dbf.newDocumentBuilder();
Document doc = db.parse(file);
doc.getDocumentElement().normalize();


NodeList nl= doc.getElementsByTagName("AirCarrier");
NodeList n1= doc.getElementsByTagName("FlightNumber");
NodeList n2= doc.getElementsByTagName("City");
NodeList n3= doc.getElementsByTagName("Date");
NodeList n4= doc.getElementsByTagName("Scheduled");
NodeList n5= doc.getElementsByTagName("Status");
NodeList n6= doc.getElementsByTagName("Gate");
NodeList n7= doc.getElementsByTagName("OffGateTime");
NodeList n8= doc.getElementsByTagName("OffGroundTime");

%>

<tr>
<td colspan="2"><h4>AirLine Shedule</h4></td> 
</tr>
<tr>
<td>AirCarrier</td>
<td><%= nl.item(0).getFirstChild().getNodeValue() %> </td>
</tr>
<tr><td>FlightNumber</td>
<td><%= n1.item(0).getFirstChild().getNodeValue() %> </td>
</tr>
<tr>
<td>City</td>
<td><%= n2.item(0).getFirstChild().getNodeValue() %> </td></tr>
<tr><td>Date</td>
<td><%= n3.item(0).getFirstChild().getNodeValue() %> </td></tr>
<tr><td>Scheduled</td>
<td><%= n4.item(0).getFirstChild().getNodeValue() %> </td></tr>
<tr><td>Status</td>
<td><%= n5.item(0).getFirstChild().getNodeValue() %> </td></tr>
<tr><td>Gate</td>
<td><%= n6.item(0).getFirstChild().getNodeValue() %> </td></tr>
<tr><td>OffGateTime</td>
<td><%= n7.item(0).getFirstChild().getNodeValue() %> </td>
</tr>
<tr><td>OffGroundTime</td>
<td><%= n8.item(0).getFirstChild().getNodeValue() %> 
</td>
</tr>
</table>
</center>
</body>
</html>