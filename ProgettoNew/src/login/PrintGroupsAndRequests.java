package login;

import group.ExtractRequest;
import group.Request;
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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.EmptyBorder;

import room.AddExtraView;
import room.Extra;
import room.JDOMExtractExtrasByRoom;
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
public class PrintGroupsAndRequests extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JCheckBox jCheckBox2;
	private JTextArea jTextArea1;
	private JLabel jLabel5;
	private JTextField jTextField4;
	private JLabel jLabel1;
	
	 String nomegruppo;
	 Hotel h=new Hotel();

	/**
	 * Create the dialog.
	 * @param hotel 
	 * @param string 
	 */
	public PrintGroupsAndRequests(Hotel hotel, String string) {
		h=hotel;
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		GroupLayout contentPanelLayout = new GroupLayout((JComponent)contentPanel);
		contentPanel.setLayout(contentPanelLayout);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setPreferredSize(new java.awt.Dimension(469, 233));

		jCheckBox2 =new JCheckBox();

							 if(string.equals("name")){
								 //id
								 jCheckBox2.setEnabled(false);
								 jCheckBox2.setSelected(true);
							 }
		
		{
			jLabel1 = new JLabel();
			jLabel1.setText("Stampo dettagli del gruppo");
		}
		
		{
			//jCheckBox2 = new JCheckBox();
			jCheckBox2.setText("in base al nome del gruppo");
		}
		{
			jLabel5 = new JLabel();
			jLabel5.setText("Quale nome del gruppo controllare?");
		}
		
		{
			//try{
			jTextField4 = new JTextField();
			jTextField4.setText("nome");
			nomegruppo=jTextField4.getText();
			/*}catch(IOException nfe){
				JOptionPane.showMessageDialog(null,"errore ");
			}*/
			
			
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
							 			 
							 if (jCheckBox2.isSelected()){ //in base al nome del gruppo

								 nomegruppo=jTextField4.getText();
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
		

		 {
			 jTextArea1 = new JTextArea();
		 }
				contentPanelLayout.setVerticalGroup(contentPanelLayout.createSequentialGroup()
					.addContainerGap(17, 17)
					.addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jCheckBox2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabel1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(20)
					.addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jTextField4, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabel5, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(jTextArea1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE));
				contentPanelLayout.setHorizontalGroup(contentPanelLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(contentPanelLayout.createParallelGroup()
					    .addGroup(contentPanelLayout.createSequentialGroup()
					        .addGroup(contentPanelLayout.createParallelGroup()
					            .addComponent(jLabel5, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
					            .addGroup(GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
					                .addPreferredGap(jLabel5, jLabel1, LayoutStyle.ComponentPlacement.INDENT)
					                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					                .addGap(10)))
					        .addGap(24)
					        .addGroup(contentPanelLayout.createParallelGroup()
					            .addGroup(contentPanelLayout.createSequentialGroup()
					                .addComponent(jCheckBox2, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
					                .addGap(0, 0, Short.MAX_VALUE))
					            .addGroup(GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
					                .addGap(64)
					                .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
					                .addGap(0, 41, Short.MAX_VALUE)))
					        .addGap(88))
					    .addComponent(jTextArea1, GroupLayout.Alignment.LEADING, 0, 476, Short.MAX_VALUE)));

	}

}
		 


