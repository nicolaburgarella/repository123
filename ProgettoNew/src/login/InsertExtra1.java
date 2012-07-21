package login;

import hotel.Hotel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.EmptyBorder;

import room.AddExtraView;
import room.Extra;
import room.JDOMInsertExtraByRoomNr;


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
public class InsertExtra1 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JCheckBox jCheckBox1;
	private JCheckBox jCheckBox2;
	private JTextField jTextField6;
	private JLabel jLabel7;
	private JLabel jLabel5;
	private JTextField jTextField4;
	private JTextField jTextField3;
	private JTextField jTextField2;
	private JTextField jTextField1;
	private JLabel jLabel4;
	private JLabel jLabel3;
	private JLabel jLabel2;
	private JLabel jLabel1;
	
	String date;
	 String type;
	 Float cost;
	 int stanza;
	 String nomegruppo;
	 Hotel h=new Hotel();

	/**
	 * Create the dialog.
	 * @param hotel 
	 * @param string 
	 */
	public InsertExtra1(Hotel hotel, String string) {
		h=hotel;
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		GroupLayout contentPanelLayout = new GroupLayout((JComponent)contentPanel);
		contentPanel.setLayout(contentPanelLayout);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setPreferredSize(new java.awt.Dimension(469, 233));

		jCheckBox1 =new JCheckBox();
		jCheckBox2 =new JCheckBox();
		jLabel7 =new JLabel();
		jTextField6=new JTextField();
		
		
		 if(string.equals("name")){
								 
			 jCheckBox1.setEnabled(false);
			 jCheckBox1.setSelected(true);
			 jCheckBox2.setVisible(false);
								//jLabel6.setVisible(true);
								 //jTextField5.setVisible(true);
			 jLabel7.setVisible(true);
			 jTextField6.setVisible(true);
							 }
							 
							 if(string.equals("number")){
								 //id
								 jCheckBox2.setEnabled(false);
								 jCheckBox2.setSelected(true);
								 jCheckBox1.setVisible(false);
								 
								// jLabel6.setVisible(false);
								// jTextField5.setVisible(false);
								 jLabel7.setVisible(false);
								 jTextField6.setVisible(false);
							 }
		
		
		
		
		
		
		
		{
			jLabel1 = new JLabel();
			jLabel1.setText("Inserisci extra");
		}
		{
			//jCheckBox1 = new JCheckBox();
			jCheckBox1.setText("in base al nome del gruppo");
		}
		{
			//jCheckBox2 = new JCheckBox();
			jCheckBox2.setText("o al numero di stanza");
		}
		{
			jLabel2 = new JLabel();
			jLabel2.setText("Data dell'extra");
			
		}
		{
			jLabel3 = new JLabel();
			jLabel3.setText("Tipologia di extra");
		}
		{
			jLabel4 = new JLabel();
			jLabel4.setText("Costo");
		}
		{
			jLabel5 = new JLabel();
			jLabel5.setText("In quale stanza va addebitato");
		}
		
		
		{
			// jLabel7 = new JLabel();
			 jLabel7.setText("Nome del gruppo");
		 }
		 {
			 //jTextField6 = new JTextField();
			 jTextField6.setText("nomee");
			 nomegruppo=jTextField6.getText();
		 }
		
		
		
		
		
		
		{
			try{
			jTextField1 = new JTextField();
			jTextField1.setText("data");
			date =jTextField1.getText();
			}catch(NumberFormatException nfe){
				JOptionPane.showMessageDialog(null,"la data deve essere corretta");
			}
			
		}
		{
			jTextField2 = new JTextField();
			jTextField2.setText("tipologia");
			type=jTextField2.getText();

			
		}
		{
			try{
			jTextField3 = new JTextField();
			jTextField3.setText("0");
			cost=Float.parseFloat(jTextField3.getText());
			}catch(NumberFormatException nfe){
				JOptionPane.showMessageDialog(null,"Il costo dell'extra deve essere float");
			}
			
		}
		{
			try{
			jTextField4 = new JTextField();
			jTextField4.setText("0");
			stanza=Integer.parseInt(jTextField4.getText());
			}catch(NumberFormatException nfe){
				JOptionPane.showMessageDialog(null,"Il la stanza deve essere un numero intero");
			}
			
			
		}
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e){
						System.out.println("called");
						 
						 
						 if(e.getActionCommand().equals("OK")){
							 if(jCheckBox1.isSelected()){  //in base al nome del gruppo
								/* date =jTextField1.getText();
								 type=jTextField2.getText();
								 cost=Float.parseFloat(jTextField3.getText());
								 stanza=Integer.parseInt(jTextField4.getText());
								 nomegruppo=jTextField5.getText();*/
								 
								 for(int i=0;i<h.getGroupList().getGroupReg().size();i++){
										if((h.getGroupList().getGroupReg().get(i).getName()).equalsIgnoreCase(nomegruppo)||!(h.getGroupList().getGroupReg().get(i).getRoomAssigned()).isEmpty()){
											Extra extra=new Extra(cost, date, type);
											h.getExtraList().getExtraList().add(extra);
											
											//VA FATTA SOPRA COME finestrapopupdi scelta non COMBOBOX,IN MODO CHE ABBIA SELEZIONATO SUBITO LA SCELTA
											String msg=new String();
											
											for(int j=0;j<h.getGroupList().getGroupReg().get(i).getRoomAssigned().size();j++){
												msg+=h.getGroupList().getGroupReg().get(i).getRoomAssigned().get(j).getNumber();
											}
											 JOptionPane.showMessageDialog(null,"In quale stanza prenotata va inserito l'extra?Digita il nome della stanza a cui addebitare l'extra tra quelle prenotate dal gruppo\n"+"Stanze assegnate: "+msg);
											
											for(int j=0;j<h.getGroupList().getGroupReg().get(i).getRoomAssigned().size();j++){
												if(h.getGroupList().getGroupReg().get(i).getRoomAssigned().get(j).getNumber()==stanza){
												JDOMInsertExtraByRoomNr jier =new JDOMInsertExtraByRoomNr(stanza, extra.getDate(), Float.toString(extra.getCost()), extra.getType());
												}
												else{
													JOptionPane.showMessageDialog(null,"E' stato scritto un numero di stanza non valido");
												}
											}
											
										}
				 
							 }
							 }
							 
							 if (jCheckBox2.isSelected()){ //in base al numero di stanza
								 
								 /*date =jTextField1.getText();
								 type=jTextField2.getText();
								 cost=Float.parseFloat(jTextField3.getText());
								 stanza=Integer.parseInt(jTextField4.getText());
								 */
								 
								 for(int i=0;i<h.getRoomList().getRoomReg().size();i++){
										if(stanza==h.getRoomList().getRoomReg().get(i).getNumber()){
											 Extra extra = new Extra(cost, date, type);
											 h.getExtraList().getExtraList().add(extra);
												JDOMInsertExtraByRoomNr jier =new JDOMInsertExtraByRoomNr(stanza, extra.getDate(), Float.toString(extra.getCost()), extra.getType());
												JOptionPane.showMessageDialog(null,"Fatto!");
								 
							 }
							/*String date =jTextField1.getText();
							 String type=jTextField2.getText();
							 Float cost=Float.parseFloat(jTextField3.getText());
							 int stanza=Integer.parseInt(jTextField4.getText());
							 String nomegruppo=jTextField5.getText();
							 Extra extra = new Extra(cost, date, type);
					*/
							 
						 }
						 
					 }
					 }
					}
					});
							 	
			
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
		ButtonGroup bg = new ButtonGroup();
		 bg.add(jCheckBox1);
		 bg.add(jCheckBox2);
				contentPanelLayout.setHorizontalGroup(contentPanelLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(contentPanelLayout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
					        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					        .addComponent(jCheckBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					        .addGap(22))
					    .addGroup(contentPanelLayout.createSequentialGroup()
					        .addGroup(contentPanelLayout.createParallelGroup()
					            .addComponent(jLabel4, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jLabel3, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jLabel2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
					        .addGroup(contentPanelLayout.createParallelGroup()
					            .addComponent(jTextField3, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jTextField2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jTextField1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
					        .addGap(67))
					    .addGroup(contentPanelLayout.createSequentialGroup()
					        .addGroup(contentPanelLayout.createParallelGroup()
					            .addComponent(jLabel5, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jLabel7, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE))
					        .addGap(7)
					        .addGroup(contentPanelLayout.createParallelGroup()
					            .addComponent(jTextField4, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
					            .addComponent(jTextField6, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))))
					.addComponent(jCheckBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(17, Short.MAX_VALUE));
				contentPanelLayout.setVerticalGroup(contentPanelLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jCheckBox1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabel1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jCheckBox2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(16)
					.addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jLabel2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jTextField1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jLabel3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jTextField2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jLabel4, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jTextField3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jLabel5, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jTextField4, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(contentPanelLayout.createParallelGroup()
					    .addComponent(jTextField6, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					    .addGroup(GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
					        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					        .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE));

	}

	/*
	 public void actionPerformed(ActionEvent e){
		 
		 if(jCheckBox1.isSelected()){
			 jLabel6.setVisible(true);
			 jTextField5.setVisible(true);
			 
		 }
		 
		 if(jCheckBox2.isSelected()){
			 jLabel6.setVisible(false);
			 jTextField5.setVisible(false);
		 }
		 
		 if(e.getActionCommand().equals("OK")){
			 if(jCheckBox1.isSelected()){  //in base al nome del gruppo
				 date =jTextField1.getText();
				 type=jTextField2.getText();
				 cost=Float.parseFloat(jTextField3.getText());
				 stanza=Integer.parseInt(jTextField4.getText());
				 nomegruppo=jTextField5.getText();
				 
				 for(int i=0;i<h.getGroupList().getGroupReg().size();i++){
						if((h.getGroupList().getGroupReg().get(i).getName()).equalsIgnoreCase(nomegruppo)||!(h.getGroupList().getGroupReg().get(i).getRoomAssigned()).isEmpty()){
							Extra extra=new Extra(cost, date, type);
							h.getExtraList().getExtraList().add(extra);
							
							//VA FATTA SOPRA COME finestrapopupdi scelta non COMBOBOX,IN MODO CHE ABBIA SELEZIONATO SUBITO LA SCELTA
							String msg=new String();
							
							for(int j=0;j<h.getGroupList().getGroupReg().get(i).getRoomAssigned().size();j++){
								msg+=h.getGroupList().getGroupReg().get(i).getRoomAssigned().get(j).getNumber();
							}
							 JOptionPane.showMessageDialog(null,"In quale stanza prenotata va inserito l'extra?Digita il nome della stanza a cui addebitare l'extra tra quelle prenotate dal gruppo\n"+"Stanze assegnate: "+msg);
							/*BufferedReader pLine=new BufferedReader(new InputStreamReader(System.in));
							try {
								sceltaOpzione=pLine.readLine();
							} catch (IOException ee) {
								// TODO Auto-generated catch block
								ee.printStackTrace();
							}
							int roomNumber=Integer.parseInt(sceltaOpzione);
							*/
							/*
							for(int j=0;j<h.getGroupList().getGroupReg().get(i).getRoomAssigned().size();j++){
								if(h.getGroupList().getGroupReg().get(i).getRoomAssigned().get(j).getNumber()==stanza){
								JDOMInsertExtraByRoomNr jier =new JDOMInsertExtraByRoomNr(stanza, extra.getDate(), Float.toString(extra.getCost()), extra.getType());
								}
								else{
									JOptionPane.showMessageDialog(null,"E' stato scritto un numero di stanza non valido");
								}
							}
							
						}
 
			 }
			 
			 if (jCheckBox2.isSelected()){ //in base al numero di stanza
				 
				 date =jTextField1.getText();
				 type=jTextField2.getText();
				 cost=Float.parseFloat(jTextField3.getText());
				 stanza=Integer.parseInt(jTextField4.getText());
				 
				 
				 for(int i=0;i<h.getRoomList().getRoomReg().size();i++){
						if(stanza==h.getRoomList().getRoomReg().get(i).getNumber()){
							 Extra extra = new Extra(cost, date, type);
							 h.getExtraList().getExtraList().add(extra);
								JDOMInsertExtraByRoomNr jier =new JDOMInsertExtraByRoomNr(stanza, extra.getDate(), Float.toString(extra.getCost()), extra.getType());
								JOptionPane.showMessageDialog(null,"Fatto!");
				 
			 }
			/*String date =jTextField1.getText();
			 String type=jTextField2.getText();
			 Float cost=Float.parseFloat(jTextField3.getText());
			 int stanza=Integer.parseInt(jTextField4.getText());
			 String nomegruppo=jTextField5.getText();
			 Extra extra = new Extra(cost, date, type);
	*//*
			 
		 }
		 
	 }
	 }
}
	 }*/
}
		 


