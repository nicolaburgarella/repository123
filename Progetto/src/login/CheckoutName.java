package login;
import group.Group;
import group.JDOMExtractRoomAssigned;
import group.JDOMRemoveChild;
import hotel.Hotel;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingWorker;

import payment.PayExtraByRoomNr;
import payment.PayRooms;

import main.AssignRooms;

import reservation.JDOMRemoveChild2;
import reservation.Reservation;
import room.JDOMExtractExtrasByRoom;
import room.Room;


// TODO: Auto-generated Javadoc
/**
 * The Class CheckoutName.
 */
public class CheckoutName {
	
	/** The h. */
	Hotel h = new Hotel();
	
	/** The g. */
	Group g=new Group();
	
	/** The repeat ok. */
	private boolean repeatOk=false;
	
	/** The Gruppo trovato. */
	private boolean GruppoTrovato=false;
	
	/** The ok. */
	private boolean ok=true;
	
	/** The id. */
	private int id=0;
	
	/** The res. */
	private Reservation res=new Reservation();
	
	/** The Prenotazione trovata. */
	private boolean PrenotazioneTrovata=false;
	
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
	 * Instantiates a new checkout name.
	 *
	 * @param hotel the hotel
	 * @param group the group
	 * @param groupName the group name
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public CheckoutName(Hotel hotel,Group group,String groupName) throws IOException {
		
		if(hotel==null){
			JOptionPane.showMessageDialog(null,"L'istanza hotel è nulla");
			repeatOk=true;
			}
			if(groupName.equals(null)){
				JOptionPane.showMessageDialog(null,"Il nome del gruppo deve essere diverso da null");
				repeatOk=true;
				}
			if(group==null){
				JOptionPane.showMessageDialog(null,"L'istanza del gruppo è nulla");
				repeatOk=true;
			}
			else{
		
		
		g=group;
		h=hotel;
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
	    System.out.println("RIMUOVO UNA PRENOTAZIONE IN BASE AL NOME DEL GRUPPO INSERITO");
	    if(!(h.getReservationList().isReservationListEmpty())){
           
            //System.out.println(h.getReservationList().getReservReg().toString());
            for(int j=0;j<h.getGroupList().getGroupReg().size();j++){
            	if(h.getGroupList().getGroupReg().get(j).getName().equals(groupName)){
            		g=h.getGroupList().getGroupReg().get(j);
            		System.out.println("Il gruppo è stato trovato e riconosciuto tra quelli inseriti,ecco i dettagli\n"+h.getGroupList().getGroupReg().get(j).toString());
            		GruppoTrovato=true;
            	}
            }
            
            
            for(int i=0;i<h.getReservationList().getReservReg().size();i++){
                    if((h.getReservationList().getReservReg().get(i).getGroupName().equals(g.getName()))){
                            res=h.getReservationList().getReservReg().get(i);
                            id=h.getReservationList().getReservReg().get(i).getNumber();
                            JOptionPane.showMessageDialog(null,"Prenotazione da eliminare:\n"+res.toString()+"\n"+
                           
                            //gestione del pagamento checkout,da estrarre in base al numero del gruppo,da fare con istanze
                            "Gestione del pagamento del fee e degli extra relativi al gruppo,a seguito del quale elimino il gruppo con la sua prenotazione.");
          
                                    	PrenotazioneTrovata=true;
                                    	String name=g.getName();
                                    	ArrayList<Room>r =new ArrayList<Room>();
                                    	//r=h.getGroupList().getRoomAssignedFromMap(name);
                                    	JDOMExtractRoomAssigned dj=new JDOMExtractRoomAssigned();
                                    	r=dj.JDOMExtractRoomAssigned(h,g.getNumber());
                                    	g.setRoomAssigned(r);
                                    	System.out.println("Stanze assegnate al gruppo ricaricate nella istanza:\n"+g.getRoomAssigned().toString());
                                    	
                                    	JOptionPane.showMessageDialog(null,"Ecco il gruppo a cui la prenotazione si riferisce:\n"+g.toString());
                                            PayRooms p=new PayRooms();
                                            float DiffTotFeeCost=p.PayRooms(g);
                                            if(DiffTotFeeCost==999999999){
                                            	JOptionPane.showMessageDialog(null,"checkout non eseguito, perchè non ci sono stanze assegnate al gruppo");
                                			}
                                            if(DiffTotFeeCost==999999990){
                                            	JOptionPane.showMessageDialog(null,"Prenotazione non eseguita, perchè è stato passato come parametro un gruppo nullo");
                            			}
                            			if(DiffTotFeeCost==999999909){
                            				JOptionPane.showMessageDialog(null,"Prenotazione non eseguita, perchè sono state inserite date con valori nulli o errati");
                            			}
                                            else{
                                            PayExtraByRoomNr pe=new PayExtraByRoomNr(g);
                                            }
                           
                           
                            //elimino la prenotazione
                            h.getReservationList().getReservReg().remove(i);    
                            
                            JDOMRemoveChild2 jg = new JDOMRemoveChild2(id);
                            JOptionPane.showMessageDialog(null,"Elimino il gruppo associato alla prenotazione, numero "+ id);
                            for(int j=0;j<h.getGroupList().getGroupReg().size();j++){
                                    if((h.getGroupList().getGroupReg().get(j).getNumber())==id){
                                            h.getGroupList().getGroupReg().remove(j);
                                            JDOMRemoveChild gr =new JDOMRemoveChild(id);
                                            JOptionPane.showMessageDialog(null,"Fatto! Gruppo eliminato assieme alla sua prenotazione");
                                    }
                            }
                            
                            
                    }
            }
            if(GruppoTrovato==false){
            	JOptionPane.showMessageDialog(null, "Non è stato trovato il gruppo richiesto,impossibile procedere nel checkout");
            }

                    if(PrenotazioneTrovata==false){
                    	JOptionPane.showMessageDialog(null,"Non trovo la prenotazione relativa al nomde del gruppo "+groupName);
                    }
                    
            }  
       else{
    	JOptionPane.showMessageDialog(null,"Non è  stata inserita alcuna prenotazione");
    }
	    
	}
	}


}
