package login;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;

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
public class NextPage1 extends JFrame
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
	
public  NextPage1() {
 setDefaultCloseOperation(javax.swing.
  WindowConstants.DISPOSE_ON_CLOSE);
 GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
 getContentPane().setLayout(thisLayout);
 setTitle("Welcome");
 
 {
	 jRadioButton1 = new JRadioButton();
	 jRadioButton1.setText("Inserisci Extra in base al nome del gruppo");
 }
 {
	 jRadioButton2 = new JRadioButton();
	 jRadioButton2.setText("Stampo tutte le stanze libere");
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
 }
 {
	 jRadioButton4 = new JRadioButton();
	 jRadioButton4.setText("Stampo tutti gli extra ordinati per numero di camera");
 }
 {
	 jRadioButton5 = new JRadioButton();
	 jRadioButton5.setText("Elimino l'extra per numero di camera");
 }
 {
	 jRadioButton6 = new JRadioButton();
	 jRadioButton6.setText("Stampo i dettagli della stanza per numero di camera");
 }
 {
	 jRadioButton7 = new JRadioButton();
	 jRadioButton7.setText("Inserisci Extra in base al numero di camera");
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
 
 jRadioButton1.addActionListener(new MyAction());
 jRadioButton2.addActionListener(new MyAction());
 jRadioButton3.addActionListener(new MyAction());
 jRadioButton4.addActionListener(new MyAction());
 jRadioButton5.addActionListener(new MyAction());
 jRadioButton6.addActionListener(new MyAction());
 jRadioButton7.addActionListener(new MyAction());
  }

public class MyAction implements ActionListener{
	
	JLabel label=new JLabel();
	  public void actionPerformed(ActionEvent e){
	  label.setText(e.getActionCommand());
	  JOptionPane.showMessageDialog(null,"This is the " + e.getActionCommand() + 
	" radio button.");
	  
	  if(jRadioButton1.isSelected()){
		  InsertExtra ie = new InsertExtra();
			ie.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			ie.setVisible(true);
		  
	  }
	  if(jRadioButton2.isSelected()){
		//print all free rooms 
	  }
	  if(jRadioButton3.isSelected()){
		 //stampo l'extra per numero di camera
	  }
	  if(jRadioButton4.isSelected()){
		 //stampo tutti gli extra ordinati per numero di camera
	  }
	  if(jRadioButton5.isSelected()){
		  CancelExtra ce = new CancelExtra();
			ce.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			ce.setVisible(true);
	  }
	  if(jRadioButton6.isSelected()){
			//stampo i dettagli della stanza per numeor di camera
	  }
	  if(jRadioButton7.isSelected()){
		  InsertExtra ie = new InsertExtra();
			ie.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			ie.setVisible(true);
	  }
	  
	  
	  }
	  }



}