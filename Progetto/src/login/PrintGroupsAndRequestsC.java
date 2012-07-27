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
import javax.swing.SwingWorker;

import room.JDOMExtractExtrasByRoom;


public class PrintGroupsAndRequestsC {
	
	Hotel h = new Hotel();
	String nomegruppo;
	
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

	
	
	public PrintGroupsAndRequestsC(Hotel hotel,String nome) throws IOException {
		
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
	   // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);

	    // 4. write some output (to JTextArea)
	    for(int i=0;i<h.getGroupList().getGroupReg().size();i++){
			if(nomegruppo.equalsIgnoreCase(h.getGroupList().getGroupReg().get(i).getName())){
				System.out.println("Ecco i dettagli del gruppo numero "+nomegruppo);
				System.out.println(h.getGroupList().getGroupReg().get(i).toString());
				int number=h.getGroupList().getGroupReg().get(i).getNumber();
				String name=h.getGroupList().getGroupReg().get(i).getName();
				String checkin=h.getGroupList().getGroupReg().get(i).getCheckin();
				String checkout=h.getGroupList().getGroupReg().get(i).getCheckout();
				float deposit=h.getGroupList().getGroupReg().get(i).getDeposit();
				System.out.println("*Numero:\t"+number);
				System.out.println("*Nome:\t"+name);
				System.out.println("*Checkin:\t"+checkin);
				System.out.println("*Checkout:\t"+checkout);
				System.out.println("*Acconto:\t"+deposit);
				Request r =new Request();
				ExtractRequest er=new ExtractRequest();
				r=er.ExtractRequestbyGroupName(nomegruppo);
				System.out.println("Ha richiesto:\n"+r.getSingole()+"\tcamere singole,\n"+r.getDoppie()+"\tcamere doppie,\n"+r.getMatrimoniali()+"\tcamere matrimoniali.\n");
	
			}
		}
	
	    
	    

	    /* 5. get some input (from JTextArea)
	    Scanner s = new Scanner(System.in);
	    System.out.printf("got from input: \"%s\"%n", s.nextLine());*/
	}


}
