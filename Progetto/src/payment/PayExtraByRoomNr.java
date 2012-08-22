package payment;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import com.itextpdf.text.DocumentException;

import room.ExtraList;
import room.ExtractExtrasInstByRoom;
import room.JDOMExtractExtrasByRoom;
import room.PdfExtra;
import room.RoomList;
import group.Group;

// TODO: Auto-generated Javadoc
/**
 * The controller Class PayExtraByRoomNr deals with the payment of extras (if they exists).
 */
public class PayExtraByRoomNr {
	
	/** The group instance g. */
	Group g = new Group();
	
	private boolean noRoomAssigned=false;
	
	JDOMExtractExtrasByRoom ee = new JDOMExtractExtrasByRoom();
	
	private boolean extraTrovati=false;

	/**
	 * Pay extra by room number method.
	 */
	public PayExtraByRoomNr() {

	}

	/**
	 * Pay extra by room number method.
	 *
	 * @param gruppo the group instance
	 */
	public PayExtraByRoomNr(Group gruppo) {
		//Il gruppo esiste e non ha valore nullo
		g=gruppo;
		
		
		
		if (!(g.getRoomAssigned().isEmpty())&&g.getRoomAssigned().size()>0) {
			noRoomAssigned=false;
			for(int i=0;i<g.getRoomAssigned().size();i++){
				if(ee.JDOMIsExtractExtrasByRoom(g.getRoomAssigned().get(i).getNumber())==true){
					extraTrovati=true;
					//metti in stringa:
					
					// Create a stream to hold the output
				    ByteArrayOutputStream baos = new ByteArrayOutputStream();
				    PrintStream ps = new PrintStream(baos);
				    // IMPORTANT: Save the old System.out!
				    PrintStream old = System.out;
				    // Tell Java to use your special stream
				    System.setOut(ps);

	
					
					int roomNumber = g.getRoomAssigned().get(i).getNumber();
					System.out.println("Ecco gli extra da pagare relativi alla stanza numero: "+roomNumber+"\n\n");
				JDOMExtractExtrasByRoom e = new JDOMExtractExtrasByRoom(roomNumber);
				System.out.println("\n\n\n\nCordiali Saluti");
				
				
				// Put things back
			    System.out.flush();
			    System.setOut(old);
			    // Show what happened
			    String sb = new String();
			    sb=baos.toString();
			    System.out.println("Here: " + sb);
			    try {
					PdfExtra p=new PdfExtra(g.getName(), roomNumber, sb);
					
				} catch (DocumentException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				
				//fine stringa
			}
			
		}
		}
		if(noRoomAssigned==true){
			System.out.println("Non sono state assegnate stanze per quel gruppo");
		}
		if(extraTrovati==false){
			System.out.println("Non sono stati trovati extra per le camere assegnate a quel gruppo");
		}

	}

}
