package login;
import hotel.Hotel;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ButtonGroup;

import room.CheckFreeRooms;
import room.JDOMReader;

/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class NextPage1 extends JFrame implements ActionListener
{
	private JRadioButton jRadioButton1;
	private JRadioButton jRadioButton3;
	private JRadioButton jRadioButton4;
	private JRadioButton jRadioButton5;
	private JRadioButton jRadioButton6;
	private JRadioButton jRadioButton7;
	private JLabel jLabel2;
	private JLabel jLabel1;
	private JRadioButton jRadioButton2;
	Hotel h;
	
public  NextPage1(Hotel hotel) {
	h=hotel;
 setDefaultCloseOperation(javax.swing.
  WindowConstants.DISPOSE_ON_CLOSE);
 GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
 getContentPane().setLayout(thisLayout);
 setTitle("Welcome");
 
 {
	 jRadioButton1 = new JRadioButton();
	 jRadioButton1.setText("Inserisci Extra in base al nome del gruppo");
	 jRadioButton1.setActionCommand("button1");
 }
 {
	 jRadioButton2 = new JRadioButton();
	 jRadioButton2.setText("Stampo tutte le stanze libere");
	 jRadioButton2.setActionCommand("button2");
 }
 {
	 jLabel2 = new JLabel();
	 jLabel2.setText("Seleziona una delle seguenti opzioni per eseguire la procedura richiesta");
 }
 {
	 jLabel1 = new JLabel();
	 jLabel1.setText("INSERIMENTO, CANCELLAZIONE E GESTIONE DELLE STANZE E DEGLI EXTRA");
 }
 {
	 jRadioButton3 = new JRadioButton();
	 jRadioButton3.setText("Stampo l'extra per numero di camera");
	 jRadioButton3.setActionCommand("button3");
 }
 {
	 jRadioButton4 = new JRadioButton();
	 jRadioButton4.setText("Stampo tutti gli extra ordinati per numero di camera");
	 jRadioButton4.setActionCommand("button4");
 }
 {
	 jRadioButton5 = new JRadioButton();
	 jRadioButton5.setText("Elimino l'extra per numero di camera");
	 jRadioButton5.setActionCommand("button5");
 }
 {
	 jRadioButton6 = new JRadioButton();
	 jRadioButton6.setText("Stampo i dettagli della stanza per numero di camera");
	 jRadioButton6.setActionCommand("button6");
 }
 {
	 jRadioButton7 = new JRadioButton();
	 jRadioButton7.setText("Inserisci Extra in base al numero di camera");
	 jRadioButton7.setActionCommand("button7");
 }
 thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
 	.addContainerGap(63, 63)
 	.addGroup(thisLayout.createParallelGroup()
 	    .addGroup(thisLayout.createSequentialGroup()
 	        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 610, GroupLayout.PREFERRED_SIZE)
 	        .addGap(0, 0, Short.MAX_VALUE))
 	    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
 	        .addGroup(thisLayout.createParallelGroup()
 	            .addComponent(jRadioButton6, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 347, GroupLayout.PREFERRED_SIZE)
 	            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
 	                .addComponent(jRadioButton1, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE)
 	                .addGap(62))
 	            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
 	                .addComponent(jRadioButton7, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE)
 	                .addGap(62))
 	            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
 	                .addComponent(jRadioButton3, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE)
 	                .addGap(106))
 	            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
 	                .addComponent(jRadioButton4, GroupLayout.PREFERRED_SIZE, 342, GroupLayout.PREFERRED_SIZE)
 	                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
 	            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
 	                .addComponent(jRadioButton5, GroupLayout.PREFERRED_SIZE, 308, GroupLayout.PREFERRED_SIZE)
 	                .addGap(39))
 	            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
 	                .addComponent(jRadioButton2, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
 	                .addGap(51)))
 	        .addGap(0, 172, Short.MAX_VALUE))
 	    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
 	        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 446, GroupLayout.PREFERRED_SIZE)
 	        .addGap(0, 164, Short.MAX_VALUE)))
 	.addContainerGap(211, 211));
 thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
 	.addContainerGap(54, 54)
 	.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
 	.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
 	.addComponent(jRadioButton1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
 	.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
 	.addComponent(jRadioButton7, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
 	.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
 	.addComponent(jRadioButton3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
 	.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
 	.addComponent(jRadioButton4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
 	.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
 	.addComponent(jRadioButton5, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
 	.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
 	.addComponent(jRadioButton6, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
 	.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
 	.addComponent(jRadioButton2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
 	.addGap(22)
 	.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
 	.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE));
 this.setSize(771, 485);
 
 ButtonGroup bg = new ButtonGroup();
 bg.add(jRadioButton1);
 bg.add(jRadioButton2);
 bg.add(jRadioButton3);
 bg.add(jRadioButton4);
 bg.add(jRadioButton5);
 bg.add(jRadioButton6);
 bg.add(jRadioButton7);
 
 
 jRadioButton1.addActionListener(this);
 jRadioButton2.addActionListener(this);
 jRadioButton3.addActionListener(this);
 jRadioButton4.addActionListener(this);
 jRadioButton5.addActionListener(this);
 jRadioButton6.addActionListener(this);
 jRadioButton7.addActionListener(this);
 
  }

	
	  public void actionPerformed(ActionEvent e){
	JLabel label=new JLabel();
	  label.setText(e.getActionCommand());
	  JOptionPane.showMessageDialog(null,"This is the " + e.getActionCommand() + 
	" radio button.");
	  
	  if(e.getActionCommand().equals("button1")){
		  InsertExtra1 ie = new InsertExtra1(h,"name");
			ie.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			ie.setVisible(true);
		  
	  }
	  if(e.getActionCommand().equals("button2")){
		//print all free rooms  anch'esso da bufferizzare e mettere in pdf o jtextarea
		  try {
			CheckFreeRoomsGuiC c=new CheckFreeRoomsGuiC();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		  
		  
	  }
	  if(e.getActionCommand().equals("button3")){
		 //stampo l'extra per numero di camera,da mettere in pdf o in una jtextarea l'output del metodo
		  PrintExtraByRoomNr pebnr=new PrintExtraByRoomNr(h, "number");
		  pebnr.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			pebnr.setVisible(true);
	  }
	  if(e.getActionCommand().equals("button4")){
		 //stampo tutti gli extra ordinati per numero di camera,anch'esso da bufferizzare e mettere in pdf o jtextarea in un jdialog
		  if(!(h.getExtraList().isExtraListEmpty())){
				JDOMReader jdre=new JDOMReader();
			}
			else{
				JOptionPane.showMessageDialog(null,"Non sono ancora stati inseriti gli extra in alcuna stanza");
			}
		  
		  
		  
	  }
	  if((e.getActionCommand().equals("button5"))){
		  CancelExtra ce = new CancelExtra(h);
			ce.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			ce.setVisible(true);
	  }
	  if(e.getActionCommand().equals("button6")){
			//stampo i dettagli della stanza per numeor di camera damettere in pdf o in jtextarea l'output el metodo
		  PrintRoomDetailsByRoomNr p=new PrintRoomDetailsByRoomNr(h, "number");
			p.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			p.setVisible(true);
		  
	  }
	  if(e.getActionCommand().equals("button7")){
		  InsertExtra1 ie = new InsertExtra1(h,"number");
			ie.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			ie.setVisible(true);
	  }
	  
	  
	  }



}