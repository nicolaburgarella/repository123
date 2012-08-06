package group;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import org.jdom.*;
import org.jdom.input.*;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import room.Extra;
import room.ExtraList;
import room.Room;
import room.RoomList;

// TODO: Auto-generated Javadoc
/**
 * The Class JDOMWriteAssignment.
 */
public class JDOMWriteAssignment {

	/**
	 * Instantiates a new jDOM write assignment.
	 *
	 * @param group the group
	 * @param name the name
	 */
	public JDOMWriteAssignment(Group group, String name) {

		// Creo un SAXBuilder e con esco costruisco un document
		SAXBuilder builder = new SAXBuilder();
		Document document;
		try {
			document = builder.build(new File("groups.xml"));

			Element root = document.getRootElement();

			for (Element child : (List<Element>) root.getChildren()) {

				if (child.getAttributeValue("name").equalsIgnoreCase(name)) {
					Element assign = new Element("ASSIGN");
					assign.setText("assegnate");
					String roomNumbers = "";
					for (Room r : group.getRoomAssigned()) {
						roomNumbers += r.getNumber() + " ";
					}
					assign.setAttribute("rooms", roomNumbers);
					child.addContent(assign);
				}
			}

			XMLOutputter xmlOutput = new XMLOutputter();

			// display nice nice
			xmlOutput.setFormat(Format.getPrettyFormat());
			xmlOutput.output(document, new FileWriter("groups.xml"));

			// Stampo l'output anche sullo standard output
			xmlOutput.output(document, System.out);

			System.out.println("File updated!");
		} catch (JDOMException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

}
