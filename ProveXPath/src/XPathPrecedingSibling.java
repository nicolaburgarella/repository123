 import org.w3c.dom.*;
import javax.xml.xpath.*;
import javax.xml.parsers.*;
import java.io.IOException;
import org.xml.sax.SAXException;

public class XPathPrecedingSibling {

  public static void main(String[] args) 
 throws ParserConfigurationException, SAXException, 
  IOException, XPathExpressionException {

  DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
  domFactory.setNamespaceAware(true); 
  DocumentBuilder builder = domFactory.newDocumentBuilder();
  Document doc = builder.parse("persons.xml");
  XPath xpath = XPathFactory.newInstance().newXPath();
  
  XPathExpression expr = xpath.compile("//person/preceding-sibling::*");
  // Selecting person element's preceding-sibling name 
  Object result = expr.evaluate(doc, XPathConstants.NODESET);
  NodeList nodes = (NodeList) result;
  for (int i = 0; i < nodes.getLength(); i++) {
 System.out.println(nodes.item(i).getNodeName()); 
  }
  
    expr = xpath.compile("//person/preceding-sibling::*/*/text()");
 // Selecting all person element's preceding-siblings value 
  result = expr.evaluate(doc, XPathConstants.NODESET);
  nodes = (NodeList) result;
  for (int i = 0; i < nodes.getLength();i++) {
 System.out.print(nodes.item(i).getNodeValue()+",  "); 
  }  
  }
}