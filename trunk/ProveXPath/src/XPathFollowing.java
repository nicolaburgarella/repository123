 import org.w3c.dom.*;
import javax.xml.xpath.*;
import javax.xml.parsers.*;
import java.io.IOException;
import org.xml.sax.SAXException;

public class XPathFollowing {

  public static void main(String[] args) 
 throws ParserConfigurationException, SAXException, 
  IOException, XPathExpressionException {

  DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
  domFactory.setNamespaceAware(true); 
  DocumentBuilder builder = domFactory.newDocumentBuilder();
  Document doc = builder.parse("persons.xml");
  XPath xpath = XPathFactory.newInstance().newXPath();  
  
    XPathExpression expr = xpath.compile("//person/following::name");
 // Selecting all Node's name of 
   // elements following name and preceding element person
  Object result = expr.evaluate(doc, XPathConstants.NODESET);
  NodeList nodes = (NodeList) result;
  for (int i = 0;i < nodes.getLength();i++) {
 System.out.println(nodes.item(i).getNodeName()); 
  }
  
    expr = xpath.compile("//person/following::name/text()");
 // Selecting all element's value following 
   // element name and preceding element person 
  result = expr.evaluate(doc, XPathConstants.NODESET);
  nodes = (NodeList) result;
  for (int i = 0; i < nodes.getLength(); i++) {
 System.out.print(nodes.item(i).getNodeValue()+",  "); 
  }  
  }
}