package login;
import hotel.Hotel;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 

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
public class NextPage3 extends JFrame implements ActionListener
{
	private JRadioButton jRadioButton2;
	private JRadioButton jRadioButton3;
	private JRadioButton jRadioButton4;
	private JRadioButton jRadioButton5;
	private JRadioButton jRadioButton7;
	private JLabel jLabel2;
	private JLabel jLabel1;
	Hotel h;
	
  public NextPage3(Hotel hotel)
 {
	  h=hotel;
 setDefaultCloseOperation(javax.swing.
  WindowConstants.DISPOSE_ON_CLOSE);
 GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
 getContentPane().setLayout(thisLayout);
 setTitle("Welcome");
 {
	 jLabel1 = new JLabel();
	 jLabel1.setText("INSERIMENTO, CANCELLAZIONE E GESTIONE DELLE PRENOTAZIONI");
 }
 {
	 jRadioButton2 = new JRadioButton();
	 jRadioButton2.setText("Stampo tutte le prenotazioni e i dettagli dei gruppi relativi");
	 jRadioButton2.setActionCommand("button2");
 }
 
 {
	 jRadioButton3 = new JRadioButton();
	 jRadioButton3.setText("CHECKIN");
	 jRadioButton3.setActionCommand("button3");
 }
 {
	 jRadioButton4 = new JRadioButton();
	 jRadioButton4.setText("CHECKOUT in base all'id della prenotazione");
	 jRadioButton4.setActionCommand("button4");
 }
 {
	 jRadioButton5 = new JRadioButton();
	 jRadioButton5.setText("CHECKOUT in base al nome del gruppo inserito");
	 jRadioButton5.setActionCommand("button5");
 }
 {
	 jLabel2 = new JLabel();
	 jLabel2.setText("Seleziona una delle seguenti opzioni per eseguire la procedura richiesta");
 }
 {
	 jRadioButton7 = new JRadioButton();
	 jRadioButton7.setText("Stampo la prenotazione del gruppo in base al nome del gruppo");
	 jRadioButton7.setActionCommand("button7");
 }
 thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
 	.addContainerGap(50, 50)
 	.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
 	.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
 	.addComponent(jRadioButton2, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
 	.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
 	.addComponent(jRadioButton7, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
 	.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
 	.addComponent(jRadioButton3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
 	.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
 	.addComponent(jRadioButton4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
 	.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
 	.addComponent(jRadioButton5, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
 	.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
 	.addComponent(jRadioButton2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
 	.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE)
 	.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
 	.addContainerGap(136, 136));
 thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
 	.addContainerGap()
 	.addGroup(thisLayout.createParallelGroup()
 	    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
 	        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 471, GroupLayout.PREFERRED_SIZE)
 	        .addGap(0, 139, Short.MAX_VALUE))
 	    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
 	        .addComponent(jRadioButton5, GroupLayout.PREFERRED_SIZE, 401, GroupLayout.PREFERRED_SIZE)
 	        .addGap(0, 209, Short.MAX_VALUE))
 	    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
 	        .addComponent(jRadioButton4, GroupLayout.PREFERRED_SIZE, 342, GroupLayout.PREFERRED_SIZE)
 	        .addGap(0, 268, Short.MAX_VALUE))
 	    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
 	        .addComponent(jRadioButton3, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE)
 	        .addGap(0, 369, Short.MAX_VALUE))
 	    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
 	        .addComponent(jRadioButton7, 0, 458, Short.MAX_VALUE)
 	        .addGap(152))
 	    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
 	        .addComponent(jRadioButton2, GroupLayout.PREFERRED_SIZE, 401, GroupLayout.PREFERRED_SIZE)
 	        .addGap(0, 209, Short.MAX_VALUE))
 	    .addGroup(thisLayout.createSequentialGroup()
 	        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 610, GroupLayout.PREFERRED_SIZE)
 	        .addGap(0, 0, Short.MAX_VALUE))
 	    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
 	        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
 	        .addComponent(jRadioButton2, GroupLayout.PREFERRED_SIZE, 401, GroupLayout.PREFERRED_SIZE)
 	        .addGap(0, 203, Short.MAX_VALUE)))
 	.addContainerGap(56, 56));
 this.setSize(694, 475);
 
 
 ButtonGroup bg = new ButtonGroup();
 bg.add(jRadioButton2);
 bg.add(jRadioButton3);
 bg.add(jRadioButton4);
 bg.add(jRadioButton5);
 bg.add(jRadioButton7);
 
 jRadioButton2.addActionListener(this);
 jRadioButton3.addActionListener(this);
 jRadioButton4.addActionListener(this);
 jRadioButton5.addActionListener(this);
 jRadioButton7.addActionListener(this);
  }
  
		  public void actionPerformed(ActionEvent e){
			  JLabel label=new JLabel();
		  label.setText(e.getActionCommand());
		  JOptionPane.showMessageDialog(null,"This is the " + e.getActionCommand() + 
		" radio button.");
			 if(e.getActionCommand().equals("button2")){
				  //print reservation
				  
			  }
			  if(e.getActionCommand().equals("button7")){
				//print reservation  
			  }
			  if(e.getActionCommand().equals("button5")){
				  Checkout c=new Checkout(h);
				  c.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				  c.setVisible(true);
			  }
			  if(e.getActionCommand().equals("button4")){
				  Checkout c=new Checkout(h);
				  c.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				  c.setVisible(true);
			  }
			  if(e.getActionCommand().equals("button3")){
				  Checkin c=new Checkin(h);
				  c.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				  c.setVisible(true);
			  }
			  
			  
		  }

	}