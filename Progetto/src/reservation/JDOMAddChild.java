package reservation;

	import org.jdom.input.SAXBuilder;
	import org.jdom.Document;
	import org.jdom.Element;
import org.jdom.JDOMException;
	import org.jdom.output.XMLOutputter;
	import org.jdom.output.Format;
	import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

	// TODO: Auto-generated Javadoc
/**
	 * The Class JDOMAddChild.
	 */
	public class JDOMAddChild {
		
		/**
		 * Instantiates a new jDOM add child.
		 */
		public JDOMAddChild(){
			
		}
		
	  /**
  	 * Instantiates a new jDOM add child.
  	 *
  	 * @param res the res
  	 */
  	public JDOMAddChild(Reservation res) {
	/*String XmlFile = "<Company>" 
	  + "<Employee name=\"satya\" age=\"25\"/> "
	    + "<Employee  name=\"bharat\" age=\"24\"/>" 
	   + "</Company>";*/
		  SAXBuilder builder = new SAXBuilder(); 
	      Document document = null;
		try {
			document = builder.build(new File("reservation.xml"));
		} catch (JDOMException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 

	    try {
			Element rootNode = document.getRootElement();
	 
			// update  1st group number attribute
			//Element group = rootNode.getChild("RESERVATION");
			//group.getAttribute("number").setValue("3");
	 
			// add new age element
			// add new group element
			String number=Integer.toString(res.getNumber());
			String name=res.getGroupName();
			String checkin=res.getCheckin();
			String checkout=res.getCheckout();
			String deposit=Float.toString(res.getDeposit());
			String totcost=Float.toString(res.getTotcost());
		      
			 Element newGroup = new Element("RESERVATION"); 
		      newGroup.setAttribute("number", number); 
		      newGroup.setAttribute("groupname", name); 
		      newGroup.setAttribute("checkin", checkin); 
		      newGroup.setAttribute("checkout", checkout); 
		      newGroup.setAttribute("deposit", deposit); 
		      newGroup.setAttribute("totcost", totcost);
		      rootNode.addContent(newGroup);
	 
			// remove firstname element
			//group.removeChild("firstname");
			//Creazione dell'oggetto XMLOutputter 
		      XMLOutputter outputter = new XMLOutputter(); 
		      //Imposto il formato dell'outputter come "bel formato" 
		      outputter.setFormat(Format.getPrettyFormat()); 
		      //Produco l'output sul file xml.foo 
		      outputter.output(document, new FileOutputStream("reservation.xml")); 
		      System.out.println("File creato:"); 
		      //Stampo l'output anche sullo standard output 
		      outputter.output(document, System.out); 
	      
	   
	    } catch (Exception e) {
	      System.out.println(e);
	    }
	  }
	}