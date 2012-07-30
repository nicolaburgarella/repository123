package login;
import group.Group;
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


public class CheckoutName {
	
	Hotel h = new Hotel();
	Group g=new Group();
	private boolean repeatOk=false;
	private boolean trovato=false;
	
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

	
	
	public CheckoutName(Hotel hotel,Group group,String groupName) throws IOException {
		if(hotel==null){
			JOptionPane.showMessageDialog(null,"L'istanza hotel � nulla");
			repeatOk=true;
			}
			if(groupName.equals(null)||groupName==null){
				JOptionPane.showMessageDialog(null,"Il nome del gruppo deve essere diverso da null");
				repeatOk=true;
				}
			if(group==null){
				JOptionPane.showMessageDialog(null,"L'istanza del gruppo � nulla");
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
                Reservation res=new Reservation();
                //System.out.println(h.getReservationList().getReservReg().toString());
                for(int i=0;i<h.getReservationList().getReservReg().size();i++){
                        if((h.getReservationList().getReservReg().get(i).getGroupName()).equalsIgnoreCase(groupName)){
                                res=h.getReservationList().getReservReg().get(i);
                                JOptionPane.showMessageDialog(null,"Prenotazione da eliminare:\n"+res.toString()+"\n"+
                               
                                //gestione del pagamento checkout,da estrarre in base al nome del gruppo,da fare con istanze
                                "Gestione del pagamento del fee e degli extra relativi al gruppo,a seguito del quale elimino il gruppo con la sua prenotazione.");
                               
                               
                                for(int j=0;j<h.getGroupList().getGroupReg().size();j++){
                                    if((h.getGroupList().getGroupReg().get(i).getName()).equalsIgnoreCase(groupName)){
                                    	trovato=true;
                                    	//inserire il valore della mappa interrogandola con la chiave groupname
                                    	g=h.getGroupList().getGroupReg().get(i);
                                    	ArrayList<Room>r =new ArrayList<Room>();
                                    	r=h.getGroupList().getRoomAssignedFromMap(groupName);
                                    	g.setRoomAssigned(r);	
                                    	
                                    	System.out.println("Ecco il gruppo a cui la prenotazione si riferisce:\n"+g.toString());
                                                PayRooms p=new PayRooms();
                                                float DiffTotFeeCost=p.PayRooms(g);
                                                
                                                if(DiffTotFeeCost==999999999){
                                    				System.out.println("checkout non eseguito, perch� non ci sono stanze assegnate al gruppo");
                                    			}
                                                if(DiffTotFeeCost==999999990){
                                					System.out.println("Prenotazione non eseguita, perch� � stato passato come parametro un gruppo nullo");
                                			}
                                			if(DiffTotFeeCost==999999909){
                                				System.out.println("Prenotazione non eseguita, perch� sono state inserite date con valori nulli o errati");
                                			}
                                                else{
                                                PayExtraByRoomNr pe=new PayExtraByRoomNr(g);
                                                }
                                        }
                                }
                                if(trovato==false){
                                	JOptionPane.showMessageDialog(null,"Il nome del gruppo inserito non � stato trovato");
                                }


                               

                                //elimino la prenotazione
                                h.getReservationList().getReservReg().remove(i);
                                JDOMRemoveChild2 jg = new JDOMRemoveChild2(groupName);
                                JOptionPane.showMessageDialog(null,"Elimino il gruppo"+ groupName);
                                for(int j=0;j<h.getGroupList().getGroupReg().size();j++){
                                        if((h.getGroupList().getGroupReg().get(j).getName()).equalsIgnoreCase(groupName)){
                                                h.getGroupList().getGroupReg().remove(j);
                                                JDOMRemoveChild gr =new JDOMRemoveChild(groupName);
                                                JOptionPane.showMessageDialog(null,"Gruppo eliminato assieme alla sua prenotazione");
                                        }
                                }
                               
                        }
                        else{
                        	JOptionPane.showMessageDialog(null,"Non trovo la prenotazione avente nome gruppo "+groupName);
                        }
                }
               
               
        }
        else{
        	JOptionPane.showMessageDialog(null,"Non � ancora stata inserita alcuna prenotazione");
        }
	    

	    /* 5. get some input (from JTextArea)
	    Scanner s = new Scanner(System.in);
	    System.out.printf("got from input: \"%s\"%n", s.nextLine());*/
	}
	}


}
