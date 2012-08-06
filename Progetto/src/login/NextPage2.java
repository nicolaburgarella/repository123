package login;
import hotel.Hotel;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
 

// TODO: Auto-generated Javadoc
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
public class NextPage2 extends JFrame implements ActionListener
{
	
	/** The j radio button1. */
	private JRadioButton jRadioButton1;
	
	/** The j radio button3. */
	private JRadioButton jRadioButton3;
	
	/** The j radio button4. */
	private JRadioButton jRadioButton4;
	
	/** The j radio button5. */
	private JRadioButton jRadioButton5;
	
	/** The j radio button7. */
	private JRadioButton jRadioButton7;
	
	/** The j label2. */
	private JLabel jLabel2;
	
	/** The j label1. */
	private JLabel jLabel1;
	
	/** The h. */
	Hotel h;
	
	
  /**
 * Instantiates the second panel from the maingui.
   *
   * @param hotel the Hotel instance hotel
   */
  public NextPage2(Hotel hotel)
 {
	  h=hotel;
 setDefaultCloseOperation(javax.swing.
  WindowConstants.DISPOSE_ON_CLOSE);
 GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
 getContentPane().setLayout(thisLayout);
 setTitle("Welcome");
 {
	 jRadioButton1 = new JRadioButton();
	 jRadioButton1.setText("Inserisci un gruppo");
	 jRadioButton1.setActionCommand("button1");
 }
 {
	 jLabel1 = new JLabel();
	 jLabel1.setText("INSERIMENTO, CANCELLAZIONE E GESTIONE DEI GRUPPI CON LE RISPETTIVE RICHIESTE");
 }
 {
	 jRadioButton3 = new JRadioButton();
	 jRadioButton3.setText("Elimino un gruppo in base al suo nome");
	 jRadioButton3.setActionCommand("button3");
 }
 {
	 jRadioButton4 = new JRadioButton();
	 jRadioButton4.setText("Stampo tutti i gruppi e lo stato della richiesta");
	 jRadioButton4.setActionCommand("button4");
 }
 {
	 jRadioButton5 = new JRadioButton();
	 jRadioButton5.setText("Stampo i dettagli del gruppo con la sua richiesta in base al suo nome");
	 jRadioButton5.setActionCommand("button5");
 }
 {
	 jLabel2 = new JLabel();
	 jLabel2.setText("Seleziona una delle seguenti opzioni per eseguire la procedura richiesta");
 }
 {
	 jRadioButton7 = new JRadioButton();
	 jRadioButton7.setText("Elimino un gruppo in base al suo id");
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
 	            .addComponent(jRadioButton4, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 342, GroupLayout.PREFERRED_SIZE)
 	            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
 	                .addComponent(jRadioButton1, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE)
 	                .addGap(57))
 	            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
 	                .addComponent(jRadioButton7, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE)
 	                .addGap(57))
 	            .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
 	                .addComponent(jRadioButton3, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE)
 	                .addGap(101)))
 	        .addGap(0, 191, Short.MAX_VALUE))
 	    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
 	        .addComponent(jRadioButton5, GroupLayout.PREFERRED_SIZE, 401, GroupLayout.PREFERRED_SIZE)
 	        .addGap(0, 209, Short.MAX_VALUE))
 	    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
 	        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 471, GroupLayout.PREFERRED_SIZE)
 	        .addGap(0, 139, Short.MAX_VALUE)))
 	.addContainerGap(211, 211));
 thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
 	.addContainerGap(85, 85)
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
 	.addGap(31)
 	.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
 	.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE));
 this.setSize(734, 448);

  
  ButtonGroup bg = new ButtonGroup();
  bg.add(jRadioButton1);
  bg.add(jRadioButton3);
  bg.add(jRadioButton4);
  bg.add(jRadioButton5);
  bg.add(jRadioButton7);
  
  jRadioButton1.addActionListener(this);
  jRadioButton3.addActionListener(this);
  jRadioButton4.addActionListener(this);
  jRadioButton5.addActionListener(this);
  jRadioButton7.addActionListener(this);
 
} 
		
		
		  /* (non-Javadoc)
  		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
  		 */
  		public void actionPerformed(ActionEvent e){
			  JLabel label=new JLabel();
		  label.setText(e.getActionCommand());
		//  JOptionPane.showMessageDialog(null,"This is the " + e.getActionCommand() + " radio button.");
		  
		  if(e.getActionCommand().equals("button1")){
			  InsertGroup1 ig = new InsertGroup1(h);
			  ig.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				ig.setVisible(true);
			  
		  }
		  if(e.getActionCommand().equals("button3")){
			  if(h.getGroupList().getGroupReg().isEmpty()){
				  JOptionPane.showMessageDialog(null,"Non c'� memorizzato alcun gruppo,non � possibile procedere nel cancellare il gruppo");
			  }
			  else {
			  CancelGroup1 dialog = new CancelGroup1(h,"name");
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
			  }
		  }
		  if(e.getActionCommand().equals("button7")){
			  if(h.getGroupList().getGroupReg().isEmpty()){
				  JOptionPane.showMessageDialog(null,"Non c'� memorizzato alcun gruppo,non � possibile procedere nel cancellare il gruppo");
			  }
			  else {
			  CancelGroup1 dialog = new CancelGroup1(h,"id");
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
			  }
		  }
		  if(e.getActionCommand().equals("button5")){
			//stampo tutti idettagli del gruppo e della richiesta in base al suo nome
			  if(h.getGroupList().getGroupReg().isEmpty()){
				  JOptionPane.showMessageDialog(null,"Non c'� memorizzato alcun gruppo,non � possibile procedere nello stampare i dettagli del gruppo");
			  }
			  if(h.getRequestList().getRequestReg().isEmpty()){
				  JOptionPane.showMessageDialog(null,"Non c'� memorizzato alcuna richiesta associata al gruppo,non � possibile procedere nello stampare i dettagli del gruppo");
			  }
			  else{
			  PrintGroupsAndRequests pg=new PrintGroupsAndRequests(h, "name");
			  pg.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				pg.setVisible(true);
			  }
		  }
		  if(e.getActionCommand().equals("button4")){
				//print all groups and the state of request
			  if(h.getGroupList().getGroupReg().isEmpty()){
				  JOptionPane.showMessageDialog(null,"Non c'� memorizzato alcun gruppo,non � possibile procedere nello stampare i dettagli del gruppo");
			  }
			  if(h.getRequestList().getRequestReg().isEmpty()){
				  JOptionPane.showMessageDialog(null,"Non c'� memorizzato alcuna richiesta associata al gruppo,non � possibile procedere nello stampare i dettagli del gruppo");
			  }
			  else{
			  try {
				PrintAllGroupsAndRequestsC p=new PrintAllGroupsAndRequestsC(h);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			  }
		  }
		  
		 	  
		  
		  }

	}