//Non si aggiungono nuove stanze,questa classe non serve
package room;

	import org.jdom.input.SAXBuilder;
	import org.jdom.Document;
	import org.jdom.Element;
import org.jdom.JDOMException;
	import org.jdom.output.XMLOutputter;
	import org.jdom.output.Format;
	import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;

	public class JDOMAddChild {
	  public static void main(String[] args) {
	/*String XmlFile = "<Company>" 
	  + "<Employee name=\"satya\" age=\"25\"/> "
	    + "<Employee  name=\"bharat\" age=\"24\"/>" 
	   + "</Company>";*/
		  SAXBuilder builder = new SAXBuilder(); 
	      Document document = null;
		try {
			document = builder.build(new File("rooms.xml"));
		} catch (JDOMException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 

	    try {
	      //document.getRootElement().addContent(
	      //   new Element("Employee").setAttribute("key", "056"));
	      List<Element> childList = document.getRootElement()
	      .getChildren();
	   childList.add(new Element("GROUP").setAttribute("name",
	      "Roseindia.net"));
	      childList.remove(1);
	    XMLOutputter outputter1 = new XMLOutputter(Format
	    .getPrettyFormat());
	      outputter1.output(document, System.out);
	    } catch (Exception e) {
	      System.out.println(e);
	    }
	  }
	}