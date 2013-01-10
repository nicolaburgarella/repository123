 import org.w3c.dom.*;
import javax.xml.xpath.*;
import javax.xml.parsers.*;
import java.io.IOException;
import org.xml.sax.SAXException;

public class XPathCount {

  public static void main(String[] args) 
 throws ParserConfigurationException, SAXException, 
  IOException, XPathExpressionException {

  DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
  domFactory.setNamespaceAware(true); 
  
  DocumentBuilder builder = domFactory.newDocumentBuilder();
  Document doc = builder.parse("xmlData.xml");
  XPath xpath = XPathFactory.newInstance().newXPath();
  
  XPathExpression expr = xpath.compile("//*[count(BBB)=2]");
  //Select elements which have two children BBB
 System.out.println("Select elements which have two children BBB");
  Object result = expr.evaluate(doc, XPathConstants.NODESET);
  NodeList nodes = (NodeList) result;
  for (int i = 0; i < nodes.getLength(); i++) {
 System.out.println(nodes.item(i).getNodeName()); 
  }
  
  
  System.out.println("Select elements which have 3 children");
  expr = xpath.compile("//*[count(*)=3]");
   //Select elements which have 3 children
  result = expr.evaluate(doc, XPathConstants.NODESET);
  nodes = (NodeList) result;
  for (int i = 0; i < nodes.getLength(); i++) {
 System.out.println(nodes.item(i).getNodeName()); 
  }
  }
}