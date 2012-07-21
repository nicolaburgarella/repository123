package login;

import group.ExtractRequest;
import group.JDOMRemoveChild;
import group.Request;
import hotel.Hotel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
public class CancelGroup1 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JCheckBox jCheckBox1;
	private JCheckBox jCheckBox2;
	private JTextField jTextField2;
	private JTextField jTextField1;
	private JLabel jLabel3;
	private JLabel jLabel2;
	private JLabel jLabel1;
	Hotel h=new Hotel();
	
	int id;
	String nome;

	/**
	 * Create the dialog.
	 * @param hotel 
	 * @param string 
	 */
	public CancelGroup1(Hotel hotel, String string) {
		h=hotel;
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		GroupLayout contentPanelLayout = new GroupLayout((JComponent)contentPanel);
		contentPanel.setLayout(contentPanelLayout);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setVisible(true);
		
		jCheckBox1 =new JCheckBox();
		jCheckBox2 =new JCheckBox();
		jLabel2 = new JLabel();
		jTextField1 =new JTextField();
		jLabel3 =new JLabel();
		jTextField2 = new JTextField();
		
		
		 if(string.equals("name")){
								 
			 jCheckBox2.setEnabled(false);
			 jCheckBox2.setSelected(true);
			 jCheckBox1.setVisible(false);
								 jLabel2.setVisible(false);
								 jTextField1.setVisible(false);
								 jLabel3.setVisible(true);
								 jTextField2.setVisible(true);
							 }
							 
							 if(string.equals("id")){
								 //id
								 jCheckBox1.setEnabled(false);
								 jCheckBox1.setSelected(true);
								 jCheckBox2.setVisible(false);
								 
								 jLabel3.setVisible(false);
								 jTextField2.setVisible(false);
								 jLabel2.setVisible(true);
								 jTextField1.setVisible(true);
							 }
		
		
		
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
			jLabel1 = new JLabel();
			jLabel1.setText("Seleziona come cancellare il gruppo");
		
		
			//jCheckBox1 = new JCheckBox();
			jCheckBox1.setText("In base all'id");
		
		
			//jCheckBox2 = new JCheckBox();
			jCheckBox2.setText("In base al nome del gruppo");
		
		
			//jLabel2 = new JLabel();
			jLabel2.setText("Inserisci l'id del gruppo da cancellare");
		
		
			//jLabel3 = new JLabel();
			jLabel3.setText("Inserisci il nome del gruppo da cancellare");
		
		
			try{
			//jTextField1 = new JTextField();
			jTextField1.setText("id");
			id=Integer.parseInt(jTextField1.getText());
			}catch(NumberFormatException nfe){
				JOptionPane.showMessageDialog(null,"l'id del gruppo deve essere un intero");

		
		
			try{
			//jTextField2 = new JTextField();
			jTextField2.setText("nomegruppo");
			nome=jTextField2.getText();
			}catch(NumberFormatException nfe2){
				JOptionPane.showMessageDialog(null,"Non sono ancora stati inseriti gli extra");

			}
		
		contentPanelLayout.setVerticalGroup(contentPanelLayout.createSequentialGroup()
			.addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
			    .addComponent(jLabel1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
			    .addComponent(jCheckBox1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
			    .addComponent(jCheckBox2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
			.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
			.addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
			    .addComponent(jLabel2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
			    .addComponent(jTextField1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
			.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
			.addGroup(contentPanelLayout.createParallelGroup()
			    .addGroup(contentPanelLayout.createSequentialGroup()
			        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
			        .addGap(0, 0, Short.MAX_VALUE))
			    .addGroup(GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
			        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
			        .addGap(0, 12, Short.MAX_VALUE)))
			.addContainerGap(81, 81));
		contentPanelLayout.setHorizontalGroup(contentPanelLayout.createParallelGroup()
			.addGroup(GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
			    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
			    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
			    .addComponent(jCheckBox2, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
			    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
			    .addComponent(jCheckBox1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
			    .addContainerGap(26, Short.MAX_VALUE))
			.addGroup(contentPanelLayout.createSequentialGroup()
			    .addGap(7)
			    .addGroup(contentPanelLayout.createParallelGroup()
			        .addComponent(jLabel2, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
			        .addComponent(jLabel3, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE))
			    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
			    .addGroup(contentPanelLayout.createParallelGroup()
			        .addGroup(contentPanelLayout.createSequentialGroup()
			            .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
			        .addGroup(contentPanelLayout.createSequentialGroup()
			            .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)))
			    .addContainerGap(78, Short.MAX_VALUE)));
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
								 
								 
								 if(jCheckBox1.isSelected()){
									 
								 if(!(h.getGroupList().isGroupListEmpty())){
									 for(int i=0;i<h.getGroupList().getGroupReg().size();i++){
											if(id==h.getGroupList().getGroupReg().get(i).getNumber()){
												h.getGroupList().getGroupReg().remove(i);
												JDOMRemoveChild jdrc=new JDOMRemoveChild(id);
											}
										}
								 }
								 
								 else{
									 JOptionPane.showMessageDialog(null,"Non è ancora stato inserito il gruppo con id selezionato");
									}	 
							 }
								 
								 
								 if(jCheckBox2.isSelected()){
									 
									 if(!(h.getGroupList().isGroupListEmpty())){
										 for(int i=0;i<h.getGroupList().getGroupReg().size();i++){
												if(nome.equalsIgnoreCase(h.getGroupList().getGroupReg().get(i).getName())){
													h.getGroupList().getGroupReg().remove(i);
													ExtractRequest er=new ExtractRequest();
													Request r =er.ExtractRequestbyGroupName(nome);
													cancelRequest(h, r);
													JDOMRemoveChild jdrc=new JDOMRemoveChild(nome);
													JOptionPane.showMessageDialog(null,"Fatto!");
												}
											}
										}
									 
										else{
											JOptionPane.showMessageDialog(null,"Non è ancora stato inserito il gruppo con id selezionato");
										}
										
									 }	 
								 
								 }
									 
							}
					});
				
			
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			
		}
		}
	}

	public void actionPerformed(ActionEvent e){
		 
		 if(e.getActionCommand().equals("OK")){
			 
			 
			 if(jCheckBox1.isSelected()){
				 
			 if(!(h.getGroupList().isGroupListEmpty())){
				 for(int i=0;i<h.getGroupList().getGroupReg().size();i++){
						if(id==h.getGroupList().getGroupReg().get(i).getNumber()){
							h.getGroupList().getGroupReg().remove(i);
							JDOMRemoveChild jdrc=new JDOMRemoveChild(id);
						}
					}
			 }
			 
			 else{
				 JOptionPane.showMessageDialog(null,"Non è ancora stato inserito il gruppo con id selezionato");
				}	 
		 }
			 
			 
			 if(jCheckBox2.isSelected()){
				 
				 if(!(h.getGroupList().isGroupListEmpty())){
					 for(int i=0;i<h.getGroupList().getGroupReg().size();i++){
							if(nome.equalsIgnoreCase(h.getGroupList().getGroupReg().get(i).getName())){
								h.getGroupList().getGroupReg().remove(i);
								ExtractRequest er=new ExtractRequest();
								Request r =er.ExtractRequestbyGroupName(nome);
								cancelRequest(h, r);
								JDOMRemoveChild jdrc=new JDOMRemoveChild(nome);
								JOptionPane.showMessageDialog(null,"Fatto!");
							}
						}
					}
				 
					else{
						JOptionPane.showMessageDialog(null,"Non è ancora stato inserito il gruppo con id selezionato");
					}
					
				 }	 
			 
			 }
				 
		}
	
	public void cancelRequest(Hotel h, Request r){
		for(int i=0;i<h.getRequestList().getRequestReg().size();i++){
				if(h.getRequestList().getRequestReg().get(i).equals(r)){
					h.getRequestList().getRequestReg().remove(i);
				}
			}
		}
		 
	}
		