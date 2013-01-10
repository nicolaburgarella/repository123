 import org.w3c.dom.*;
import javax.xml.xpath.*;
import javax.xml.parsers.*;
import java.io.IOException;
import org.xml.sax.SAXException;

public class XPathString {

  public static void main(String[] args) 
 throws ParserConfigurationException, SAXException, 
  IOException, XPathExpressionException {

  DocumentBuilderFactory domFactory =  DocumentBuilderFactory.newInstance();
  domFactory.setNamespaceAware(true); 
  DocumentBuilder builder = domFactory.newDocumentBuilder();
  Document doc = builder.parse("persons.xml");
  XPath xpath = XPathFactory.newInstance().newXPath();
  
    XPathExpression expr =  xpath.compile("/*[string-length(name()) = '11']");
 //Select elements which have string length equals to 11
    System.out.println("Select elements which  have string length equals to 11");
  Object result = expr.evaluate(doc, XPathConstants.NODESET);
  NodeList nodes = (NodeList) result;
  for (int i = 0; i < nodes.getLength(); i++) {
 System.out.println(nodes.item(i).getNodeName()); 
  } 
  
    System.out.println("Select elements which have string length greater than 4");
  expr = xpath.compile("//*[string-length(name()) > '4']");
   //Select elements which have string length greater than 4
  result = expr.evaluate(doc, XPathConstants.NODESET);
  nodes = (NodeList) result;
  for (int i = 0; i < nodes.getLength(); i++) {
 System.out.println(nodes.item(i).getNodeName()); 
  }
  
    System.out.println("Select elements which have string length less than 4");
  expr = xpath.compile(".//*[string-length(name()) < '4']");
   //Select elements which have string length less than 4
  result = expr.evaluate(doc, XPathConstants.NODESET);
  nodes = (NodeList) result;
  for (int i = 0; i < nodes.getLength(); i++) {
 System.out.println(nodes.item(i).getNodeName()); 
  }  
  }
}