	package room;

	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.List;

	import org.jdom.Document;
	import org.jdom.Element;
	import org.jdom.JDOMException;
	import org.jdom.input.SAXBuilder;
	import org.jdom.output.Format;
	import org.jdom.output.XMLOutputter;
	
// TODO: Auto-generated Javadoc
/**
 * The controller Class SetRoomNotFree checks as not free the rooms already assigned to a group.
 */
public class SetRoomNotFree {

		/**
		 * Sets the room not free to the file rooms.xml.
		 *
		 * @param number the number
		 */
		public SetRoomNotFree(int number) {
	 
		  try {
	 
			SAXBuilder builder = new SAXBuilder();
			File xmlFile = new File("rooms.xml");
	 
			Document doc = (Document) builder.build(xmlFile);
			Element rootNode = doc.getRootElement();
	 
			
			
			List room2=rootNode.getChildren("ROOM");
			for(int i=0;i<(room2.size());i++){
			if(Integer.parseInt(((Element) room2.get(i)).getAttributeValue("number"))==number){
				((Element) room2.get(i)).getAttribute("free").setValue("no");
			}
			}
	 
			
	 
			XMLOutputter xmlOutput = new XMLOutputter();
	 
			
			xmlOutput.setFormat(Format.getPrettyFormat());
			xmlOutput.output(doc, new FileWriter("rooms.xml"));
	 
			// xmlOutput.output(doc, System.out);
	 
			//System.out.println("File updated!");
		  } catch (IOException io) {
			io.printStackTrace();
		  } catch (JDOMException e) {
			e.printStackTrace();
		  }
		}
	}