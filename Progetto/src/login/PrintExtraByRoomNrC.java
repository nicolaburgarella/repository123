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

import room.JDOMExtractExtrasByRoom;


// TODO: Auto-generated Javadoc
/**
 * The Class PrintExtraByRoomNrC.
 */
public class PrintExtraByRoomNrC {
	
	/** The h. */
	Hotel h = new Hotel();
	
	/** The stanza. */
	int stanza;
	
	/** The fatto. */
	private boolean fatto;
	
	/** The repeat ok. */
	private boolean repeatOk=false;
	
	/**
	 * Console.
	 *
	 * @param out the out
	 * @param in the in
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

	    /* handle "System.in"
	    area.addKeyListener(new KeyAdapter() {
	        private StringBuffer line = new StringBuffer();
	        @Override public void keyTyped(KeyEvent e) {
	            char c = e.getKeyChar();
	            if (c == KeyEvent.VK_ENTER) {
	                in.println(line);
	                line.setLength(0); 
	            } else if (c == KeyEvent.VK_BACK_SPACE) { 
	                line.setLength(line.length() - 1); 
	            } else if (!Character.isISOControl(c)) {
	                line.append(e.getKeyChar());
	            }
	        }
	    });*/
	    
	    JScrollPane sp=new JScrollPane(area);

	    return sp;
	}

	
	
	/**
	 * Instantiates a new prints the extra by room nr c.
	 *
	 * @param hotel the hotel
	 * @param s the s
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public PrintExtraByRoomNrC(Hotel hotel,int s) throws IOException {
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
	    if(!(h.getExtraList().isExtraListEmpty())){
			for(int i=0;i<h.getRoomList().getRoomReg().size();i++){
				if(stanza==h.getRoomList().getRoomReg().get(i).getNumber()){
					//prendere gli output e metterli in stringa,o cambiare metodo e lavorare sulle istanze
					JDOMExtractExtrasByRoom ee=new JDOMExtractExtrasByRoom(stanza);
					fatto=true;
				}
			}
			if(fatto==false){
				System.out.println("Non è stato trovato il numero di stanza inserito");

			}

		}
		else{
			JOptionPane.showMessageDialog(null,"Non sono ancora stati inseriti gli extra");
		}

	    /* 5. get some input (from JTextArea)
	    Scanner s = new Scanner(System.in);
	    System.out.printf("got from input: \"%s\"%n", s.nextLine());*/
	}
	}

}
