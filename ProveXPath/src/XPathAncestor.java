 import org.w3c.dom.*;
import javax.xml.xpath.*;
import javax.xml.parsers.*;
import java.io.IOException;
import org.xml.sax.SAXException;

public class XPathAncestor {

  public static void main(String[] args) 
 throws ParserConfigurationException, SAXException, 
  IOException, XPathExpressionException {

  DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
  domFactory.setNamespaceAware(true); 
  DocumentBuilder builder = domFactory.newDocumentBuilder();
  Document doc = builder.parse("persons.xml");
  XPath xpath = XPathFactory.newInstance().newXPath();
  
  XPathExpression expr = xpath.compile("//person/ancestor::*");
  // Selecting person element ancestor's name 
  Object result = expr.evaluate(doc, XPathConstants.NODESET);
  NodeList nodes = (NodeList) result;
  for (int i = 0; i < nodes.getLength(); i++) {
 System.out.println(nodes.item(i).getNodeName()); 
  }
  
  expr = xpath.compile("//ancestor::name/text()");
  // Selecting name element ancestor's value 
  result = expr.evaluate(doc, XPathConstants.NODESET);
  nodes = (NodeList) result;
  for (int i = 0; i < nodes.getLength(); i++) {
 System.out.print(nodes.item(i).getNodeValue()+",  "); 
    }
    System.out.println();
    
    expr = xpath.compile("//ancestor::age/text()");
  // Selecting age element ancestor's value 
  result = expr.evaluate(doc, XPathConstants.NODESET);
  nodes = (NodeList) result;
  for (int i = 0; i < nodes.getLength(); i++) {
 System.out.print(nodes.item(i).getNodeValue()+",  "); 
  }  
    System.out.println();
  }
}