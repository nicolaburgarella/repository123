package login;
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
import javax.swing.SwingWorker;

import main.AssignRooms;

import room.JDOMExtractExtrasByRoom;


// TODO: Auto-generated Javadoc
/**
 * The controller Class CheckinC.
 */
public class CheckinC {
	
	/** The Hotel instance h. */
	Hotel h = new Hotel();
	
	/** The group name. */
	String nomegruppo;
	
	/** The repeat ok. */
	private boolean repeatOk=false;
	
	/**
	 * Console.
	 *
	 * @param out the InputStream
	 * @param in the PrintStream
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
	 * Instantiates a new checkin c.
	 *
	 * @param hotel the hotel instance
	 * @param nome the group name
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public CheckinC(Hotel hotel,String nome) throws IOException {
		
		if(hotel==null){
		JOptionPane.showMessageDialog(null,"L'istanza hotel è nulla");
		repeatOk=true;
		}
		if(nome==null){
			JOptionPane.showMessageDialog(null,"il nome del gruppo è nullo");
			repeatOk=true;
			}
		else{
		
		h=hotel;
		nomegruppo=nome;
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
	    if(!(h.getGroupList().isGroupListEmpty())){
			 AssignRooms a=new AssignRooms(nomegruppo, h);
			 JOptionPane.showMessageDialog(null,"Fatto!");
				
			}
			else{
				JOptionPane.showMessageDialog(null,"Non è ancora stato inserito il gruppo con id selezionato sa cui associare la prenotazione");
			}
	    
	    
	    

	    /* 5. get some input (from JTextArea)
	    Scanner s = new Scanner(System.in);
	    System.out.printf("got from input: \"%s\"%n", s.nextLine());*/
	}
	}


}
