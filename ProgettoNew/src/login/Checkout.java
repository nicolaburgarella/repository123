package login;

import group.Group;
import group.JDOMRemoveChild;
import hotel.Hotel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.GroupLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.EmptyBorder;

import payment.PayExtraByRoomNr;
import payment.PayRooms;
import reservation.JDOMRemoveChild2;
import reservation.Reservation;


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
public class Checkout extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JCheckBox jCheckBox1;
	private JCheckBox jCheckBox2;
	private JLabel jLabel5;
	private JTextField jTextField2;
	private JTextField jTextField1;
	private JLabel jLabel4;
	private JLabel jLabel3;
	private JLabel jLabel2;
	private JLabel jLabel1;
	
	int id;
	String nome;
	int groupId;
	
	Hotel h;

	/**
	 * Create the dialog.
	 * @param h 
	 */
	public Checkout(Hotel hotel) {
		h=hotel;
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		GroupLayout contentPanelLayout = new GroupLayout((JComponent)contentPanel);
		contentPanel.setLayout(contentPanelLayout);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			jLabel1 = new JLabel();
			jLabel1.setText("Checkout");
		}
		{
			jCheckBox1 = new JCheckBox();
			jCheckBox1.setText("in base a id prenotazione");
		}
		{
			jCheckBox2 = new JCheckBox();
			jCheckBox2.setText("in base a nome gruppo");
		}
		{
			jLabel2 = new JLabel();
			jLabel2.setText("Inserisci id prenotazione");
		}
		{
			jLabel3 = new JLabel();
			jLabel3.setText("Inserisci nome del gruppo");
		}
		{
			jLabel4 = new JLabel();
			jLabel4.setText("Il checkout è una operazione irreversibile che cancellerà ");
		}
		{
			jLabel5 = new JLabel();
			jLabel5.setText("sia la prenotazione sia il gruppo relativo dal programma e dalle strutture dati");
		}
		{
			try{
			jTextField1 = new JTextField();
			jTextField1.setText("id");
			id=Integer.parseInt(jTextField1.getText());
			}catch(NumberFormatException nfe){
				JOptionPane.showMessageDialog(null,"L'id della prenotazione deve essere un intero");
			}
		}
		{
			jTextField2 = new JTextField();
			jTextField2.setText("nome");
			nome=jTextField2.getText();
		}
		contentPanelLayout.setVerticalGroup(contentPanelLayout.createSequentialGroup()
			.addContainerGap()
			.addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
			    .addComponent(jCheckBox2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
			    .addComponent(jLabel1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
			    .addComponent(jCheckBox1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
			.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
			.addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
			    .addComponent(jLabel2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
			    .addComponent(jTextField1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
			.addGroup(contentPanelLayout.createParallelGroup()
			    .addComponent(jLabel3, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
			    .addGroup(GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
			        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
			        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
			.addGap(0, 20, Short.MAX_VALUE)
			.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
			.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
			.addContainerGap());
		contentPanelLayout.setHorizontalGroup(contentPanelLayout.createParallelGroup()
			.addGroup(contentPanelLayout.createParallelGroup()
			    .addGroup(GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
			        .addGroup(contentPanelLayout.createParallelGroup()
			            .addComponent(jLabel2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
			            .addComponent(jLabel3, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE))
			        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
			        .addGroup(contentPanelLayout.createParallelGroup()
			            .addComponent(jTextField1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
			            .addComponent(jTextField2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
			        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
			        .addComponent(jCheckBox2, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
			    .addGroup(GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
			        .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 393, GroupLayout.PREFERRED_SIZE)
			        .addGap(0, 31, Short.MAX_VALUE))
			    .addGroup(GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
			        .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 412, GroupLayout.PREFERRED_SIZE)
			        .addGap(0, 12, Short.MAX_VALUE)))
			.addGroup(GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
			    .addPreferredGap(jLabel2, jLabel1, LayoutStyle.ComponentPlacement.INDENT)
			    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
			    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
			    .addComponent(jCheckBox1, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
			    .addContainerGap(154, Short.MAX_VALUE)));
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	public void actionPerformed(ActionEvent e){
		 
		if(e.getActionCommand().equals("OK")){
			
		if(jCheckBox1.isSelected()){
			//id
			if(!(h.getReservationList().isReservationListEmpty())){
				Reservation res=new Reservation();
				for(int i=0;i<h.getReservationList().getReservReg().size();i++){
					if((h.getReservationList().getReservReg().get(i).getNumber())==id){
						//prenotazione da eliminare
						res=h.getReservationList().getReservReg().get(i);
						JOptionPane.showMessageDialog(null,"Prenotazione da eliminare: "+res);
						//gestione del pagamento checkout,da estrarre in base al numero del gruppo,da fare con istanze
						JOptionPane.showMessageDialog(null,"Gestione del pagamento del fee e degli extra relativi al gruppo,a seguito del quale elimino il gruppo con la sua prenotazione.");
						Group g =new Group();
						
						for(int j=0;j<h.getGroupList().getGroupReg().size();j++){
							if(h.getGroupList().getGroupReg().get(i).getNumber()==id){
								//DA RISOLVERE CON ALTRI DUE PANEL A COMPARSA
								PayRooms p=new PayRooms();
								float DiffTotFeeCost=p.PayRooms(g);
								PayExtraByRoomNr pe=new PayExtraByRoomNr(g);
							}
						}
						
						JOptionPane.showMessageDialog(null,"Elimino la prenotazione e il gruppo associato");
						h.getReservationList().getReservReg().remove(i);
						groupId=id;
						JDOMRemoveChild2 jg = new JDOMRemoveChild2(groupId);
						for(int j=0;j<h.getGroupList().getGroupReg().size();j++){
							if((h.getGroupList().getGroupReg().get(j).getNumber())==groupId){
								h.getGroupList().getGroupReg().remove(j);
								JDOMRemoveChild gr =new JDOMRemoveChild(groupId);
								JOptionPane.showMessageDialog(null,"Gruppo eliminato assieme alla sua prenotazione");
							}
						}
					}
					else{
						JOptionPane.showMessageDialog(null,"Non trovo la prenotazione numero "+groupId);
					}
				}		
				
			}
			else{
				JOptionPane.showMessageDialog(null,"Non è ancora stata inserita alcuna prenotazione");
			}
				
		}
		
		if(jCheckBox2.isSelected()){
			if(!(h.getReservationList().isReservationListEmpty())){
				Reservation res=new Reservation();
				for(int i=0;i<h.getReservationList().getReservReg().size();i++){
					if((h.getReservationList().getReservReg().get(i).getGroupName()).equalsIgnoreCase(nome)){
						res=h.getReservationList().getReservReg().get(i);
						JOptionPane.showMessageDialog(null,"Ecco la prenotazione da eliminare\n"+res.toString());
						
						JOptionPane.showMessageDialog(null,"Gestione del pagamento del fee e degli extra relativi al gruppo,a seguito del quale elimino il gruppo con la sua prenotazione.");
						Group g =new Group();
						
						for(int j=0;j<h.getGroupList().getGroupReg().size();j++){
							if((h.getGroupList().getGroupReg().get(i).getName()).equalsIgnoreCase(nome)){
								//DA RISOLVERE CON ALTRI DUE PANEL A COMPARSA
								PayRooms p=new PayRooms();
								float DiffTotFeeCost=p.PayRooms(g);
								PayExtraByRoomNr pe=new PayExtraByRoomNr(g);
							}
						}
						
						JOptionPane.showMessageDialog(null,"elimino la prenotazione ed il gruppo selezionato associato");
						h.getReservationList().getReservReg().remove(i);
						JDOMRemoveChild2 jg = new JDOMRemoveChild2(nome);
						for(int j=0;j<h.getGroupList().getGroupReg().size();j++){
							if((h.getGroupList().getGroupReg().get(j).getName()).equalsIgnoreCase(nome)){
								h.getGroupList().getGroupReg().remove(j);
								JDOMRemoveChild gr =new JDOMRemoveChild(nome);
								JOptionPane.showMessageDialog(null,"Gruppo eliminato assieme alla sua prenotazione");
							}
						}
						
					}
					else{
						JOptionPane.showMessageDialog(null,"Non trovo la prenotazione avente nome gruppo "+nome);
					}
				}
					
			}
			else{
				JOptionPane.showMessageDialog(null,"Non è ancora stata inserita alcuna prenotazione");
			}					
	}
		
}
		
		if(jCheckBox2.isSelected()){
			//nomegruppo
			jLabel2.setVisible(false);
			jTextField1.setVisible(false);
			jLabel3.setVisible(true);
			jTextField2.setVisible(true);
			
		}
		
		if(jCheckBox1.isSelected()){
			//id
			jLabel2.setVisible(true);
			jTextField1.setVisible(true);
			jLabel3.setVisible(false);
			jTextField2.setVisible(false);
		}
		 
		 
		 }
	
}