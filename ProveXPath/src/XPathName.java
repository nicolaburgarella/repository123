 import org.w3c.dom.*;
import javax.xml.xpath.*;
import javax.xml.parsers.*;
import java.io.IOException;
import org.xml.sax.SAXException;

public class XPathName {

  public static void main(String[] args) 
 throws ParserConfigurationException, SAXException, 
  IOException, XPathExpressionException {

  DocumentBuilderFactory domFactory =  DocumentBuilderFactory.newInstance();
  domFactory.setNamespaceAware(true); 
  DocumentBuilder builder = domFactory.newDocumentBuilder();
  Document doc = builder.parse("xmlData.xml");
  XPath xpath = XPathFactory.newInstance().newXPath();
  
   XPathExpression expr = xpath.compile("//*[name()='BBB']");
  //Select all elements with name BBB, equivalent with //BBB
 System.out.println("Select all elements with " + "name BBB, equivalent with //BBB");
  Object result = expr.evaluate(doc, XPathConstants.NODESET);
  NodeList nodes = (NodeList) result;
  for (int i = 0; i < nodes.getLength(); i++) {
 System.out.println(nodes.item(i).getNodeName()); 
  }
  
  System.out.println("Select all elements name "+ "of which starts with letter B");
  expr = xpath.compile("//*[starts-with(name(),'B')]");
   //Select all elements name of which starts with letter B
  result = expr.evaluate(doc, XPathConstants.NODESET);
  nodes = (NodeList) result;
  for (int i = 0; i < nodes.getLength(); i++) {
 System.out.println(nodes.item(i).getNodeName()); 
  }
  
  System.out.println("Select all elements "+ "name of which contain letter C");
  expr = xpath.compile("//*[contains(name(),'C')]");
   //Select all elements name of which contain letter C
  result = expr.evaluate(doc, XPathConstants.NODESET);
  nodes = (NodeList) result;
  for (int i = 0; i < nodes.getLength(); i++) {
 System.out.println(nodes.item(i).getNodeName()); 
  }  
  }
}