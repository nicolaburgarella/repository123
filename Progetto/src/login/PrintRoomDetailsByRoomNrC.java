package login;
import group.ExtractRequest;
import group.Request;
import hotel.Hotel;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingWorker;

import reservation.JDOMExtractReservation;
import room.JDOMExtractExtrasByRoom;


// TODO: Auto-generated Javadoc
/**
 * The controller Class PrintRoomDetailsByRoomNrC.
 */
public class PrintRoomDetailsByRoomNrC {
	
	/** The Hotel instance h. */
	Hotel h = new Hotel();
	
	/** The room number. */
	int stanza;
	
	/** The fatto. */
	private boolean fatto=false;
	
	/** The repeat ok. */
	private boolean repeatOk=false;
	
	/**
	 * Console.
	 *
	 * @param out the InputStream
	 * @param in the PrintWriter
	 * @return the j scroll pane
	 */
	public static JScrollPane console(final InputStream out, final PrintWriter in) {
	    final JTextArea area = new JTextArea();

	    // handle "System.out"
	    new SwingWorker<Void, String>() {
	        @Override protected Void doInBackground() throws Exception {
	            Scanner s = new Scanner(out);
	            while (s.hasNextLine()) publish(s.nextLine() + "\n");
	            return null;
	        }
	        @Override protected void process(List<String> chunks) {
	            for (String line : chunks) area.append(line);
	        }
	    }.execute();

	    JScrollPane sp = new JScrollPane(area);  

	    return sp;
	}

	
	
	/**
	 * Instantiates a new prints the room details by room nr c.
	 *
	 * @param hotel the hotel instance
	 * @param s the room number
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public PrintRoomDetailsByRoomNrC(Hotel hotel,int s) throws IOException {
		
		if(hotel==null){
			JOptionPane.showMessageDialog(null,"L'istanza dell'hotel è nulla");
			repeatOk=true;
		}
		if(s==0){
			JOptionPane.showMessageDialog(null,"L'id della stanza è 0 e deve essere un numero intero positivo");
			repeatOk=true;
		}
		
		else{
		
		h=hotel;
		stanza=s;
	    // 1. create the pipes
	    PipedInputStream inPipe = new PipedInputStream();
	    PipedInputStream outPipe = new PipedInputStream();

	    // 2. set the System.in and System.out streams
	    System.setIn(inPipe);
	    System.setOut(new PrintStream(new PipedOutputStream(outPipe), true));

	    PrintWriter inWriter = new PrintWriter(new PipedOutputStream(inPipe), true);

	    // 3. create the gui 
	    JFrame frame = new JFrame("\"Console\"");
	    frame.getContentPane().add(console(outPipe, inWriter));
	    frame.setSize(400, 300);
	    //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);

	    // 4. write some output (to JTextArea)
	    for(int i=0;i<h.getRoomList().getRoomReg().size();i++){
			if(stanza==h.getRoomList().getRoomReg().get(i).getNumber()){
				System.out.println("Ecco i dettagli della stanza numero "+stanza);
				System.out.println(h.getRoomList().getRoomReg().get(i).toString());
				int number=h.getRoomList().getRoomReg().get(i).getNumber();
				String composition=h.getRoomList().getRoomReg().get(i).getComposition();
				float fee=h.getRoomList().getRoomReg().get(i).getFee();
				String free=h.getRoomList().getRoomReg().get(i).getFree();
				String description=h.getRoomList().getRoomReg().get(i).getDescription();
				System.out.println("*Numero:\t"+number);
				System.out.println("*Composizione:\t"+composition);
				System.out.println("*Costo giornaliero:\t"+fee+" euro");
				System.out.println("*Libera:\t"+free);
				System.out.println("*Descrizione:\t"+description);
				fatto=true;
				
			}
		}
		if(fatto==false){
			System.out.println("La stanza inserita non esiste nel registro delle stanze ");
		}
	
	    
	    

	    /* 5. get some input (from JTextArea)
	    Scanner s = new Scanner(System.in);
	    System.out.printf("got from input: \"%s\"%n", s.nextLine());*/
	}

	}
}
