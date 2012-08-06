package group;

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
	 * The Class JDOMAddChild adds a group entry into xml data structure groups.xml.
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
  	 * @param g the group entity to be added
  	 * @param r the request entity to be added
  	 */
  	public JDOMAddChild(Group g,Request r) {
	/*String XmlFile = "<Company>" 
	  + "<Employee name=\"satya\" age=\"25\"/> "
	    + "<Employee  name=\"bharat\" age=\"24\"/>" 
	   + "</Company>";*/
		  SAXBuilder builder = new SAXBuilder(); 
	      Document document = null;
		try {
			document = builder.build(new File("groups.xml"));
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
			//Element group = rootNode.getChild("GROUP");
			//group.getAttribute("number").setValue("1");
	 
			// add new group element
			String number=Integer.toString(g.getNumber());
			String name=g.getName();
			String checkin=g.getCheckin();
			String checkout=g.getCheckout();
			String deposit=Float.toString(g.getDeposit());
			
			 Element newGroup = new Element("GROUP"); 
		      newGroup.setAttribute("number", number); 
		      newGroup.setAttribute("name", name); 
		      newGroup.setAttribute("checkin", checkin); 
		      newGroup.setAttribute("checkout", checkout); 
		      newGroup.setAttribute("deposit", deposit);
		      
		      
		     String singole=Integer.toString(r.getSingole());
		     String doppie=Integer.toString(r.getDoppie());
		     String matrimoniali=Integer.toString(r.getMatrimoniali());
		      
		      
		      Element descr5 = new Element("RICHIESTA");
		      descr5.setAttribute("singole", singole);
		      descr5.setAttribute("doppie", doppie);
		      descr5.setAttribute("matrimoniali", matrimoniali);
		      newGroup.addContent(descr5); 
		      rootNode.addContent(newGroup);
	 
			// update salary value
			newGroup.getChild("RICHIESTA").setText("non eseguita");
	 
			// remove firstname element
			//group.removeChild("firstname");
			//Creazione dell'oggetto XMLOutputter 
		      XMLOutputter outputter = new XMLOutputter(); 
		      //Imposto il formato dell'outputter come "bel formato" 
		      outputter.setFormat(Format.getPrettyFormat()); 
		      //Produco l'output sul file xml.foo 
		      outputter.output(document, new FileOutputStream("groups.xml")); 
		      System.out.println("File creato:"); 
		      //Stampo l'output anche sullo standard output 
		      outputter.output(document, System.out); 
	      
	   
	    } catch (Exception e) {
	      System.out.println(e);
	    }
	  }
	}