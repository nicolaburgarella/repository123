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
	
public class SetRoomNotFree {

		public SetRoomNotFree(int number) {
	 
		  try {
	 
			SAXBuilder builder = new SAXBuilder();
			File xmlFile = new File("rooms.xml");
	 
			Document doc = (Document) builder.build(xmlFile);
			Element rootNode = doc.getRootElement();
	 
			// update staff id attribute
			//Element room = rootNode.getChild("ROOM");
			//room.getAttribute("free").setValue("no");
	 
			// add new age element
			
			List room2=rootNode.getChildren("ROOM");
			for(int i=0;i<(room2.size());i++){
			if(Integer.parseInt(((Element) room2.get(i)).getAttributeValue("number"))==number){
				((Element) room2.get(i)).getAttribute("free").setValue("no");
			}
			}
	 
			// update salary value
			//room.getChild("altrotagsottoroom").setText("7000");
	 
			// remove firstname element
			//room.removeChild("altrotagsottoroom");
	 
			XMLOutputter xmlOutput = new XMLOutputter();
	 
			// display nice nice
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