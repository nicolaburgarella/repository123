<%@ page  language="java" import="java.sql.*,javax.xml.xpath.*,javax.xml.parsers.*" %>
<%
    Connection conn = null;
    
    Class.forName("org.postgresql.Driver").newInstance();
    String jdbcURL="jdbc:postgresql://localhost:5432/geonetwork264";
    conn = DriverManager.getConnection(jdbcURL,"postgres", "postgres");
    
    PreparedStatement psSelectRecord=null;
    ResultSet rsSelectRecord=null;
    String sqlSelectRecord=null;

     sqlSelectRecord="SELECT data FROM metadata WHERE to_tsvector(data) @@ to_tsquery('Caracalla')";
   //	select data from metadata where xpath('/gmd:language/*/text()', '<gmd:language xmlns:gmd="http://www.isotc211.org/2005/gmd">test</gmd:language>', ARRAY[ARRAY['gmd', 'http://www.isotc211.org/2005/gmd']]);";
   //  //*[local-name()="identificationInfo"]/gmd:title/gco:CharacterString
   // query_to_xml(query select data from metadata, nulls true, false, targetns )	
   
  //	String query_fulltext_semplice="SELECT data FROM metadata WHERE to_tsvector(data) @@ to_tsquery('Caracalla')";
  String crea_indice_e_fai_query="";
  crea_indice_e_fai_query=
    "CREATE INDEX pgweb_idx ON metadata USING gin(to_tsvector('english', data));\n"+
    "SELECT data FROM metadata WHERE textsearchable_index_col @@ to_tsquery('Caracalla') ORDER BY last_mod_date DESC LIMIT 10;";
     
    //sqlSelectRecord=crea_indice_e_fai_query;
    //select (xpath('//gmd:language/gco:CharacterString/text()', data , ARRAY[ARRAY['gmd','http://www.isotc211.org/2005/gmd'],['gco','http://www.isotc211.org/2005/gco']]))[1] from metadata; 
    //select data from metadata where xpath('//gmd:language/*/text()', data)[1]::text= ’eng’;
    
    psSelectRecord=conn.prepareStatement(sqlSelectRecord);
    rsSelectRecord=psSelectRecord.executeQuery();
 
%>
<html>
<head>
<title>SubQuery  in JDBC Query</title>
</head>

<body>
  <%
  int cnt=1;
  while(rsSelectRecord.next())
  {
  %>
  
	Data:<br><pre>
	<%=rsSelectRecord.getString("data").replaceAll("(?m)^[ \t]*\r?\n", "")%></pre>	
  <%
   cnt++;   /// increment of counter
  } /// End of while loop
  %>
</table>

</body>
</html>
<%
try{
          if(psSelectRecord!=null)
          {
            psSelectRecord.close();
          }
          if(rsSelectRecord!=null)
          {
            rsSelectRecord.close();
          }
          
          
          if(conn!=null)
          {
           conn.close();
          }
        }
        catch(Exception e)
        {
          e.printStackTrace(); 
        }
%>




