package login;

import group.Group;
import group.JDOMAddChild;
import group.Request;
import hotel.Hotel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.EmptyBorder;

import date.DataCheckout;
import date.DateToString;

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
public class InsertGroup1 extends JDialog {

	/** The content panel. */
	private final JPanel contentPanel = new JPanel();
	
	/** The j text field1. */
	private JTextField jTextField1;
	
	/** The j label2. */
	private JLabel jLabel2;
	
	/** The j label3. */
	private JLabel jLabel3;
	
	/** The j label4. */
	private JLabel jLabel4;
	
	/** The j label5. */
	private JLabel jLabel5;
	
	/** The j text field7. */
	private JTextField jTextField7;
	
	/** The j text field6. */
	private JTextField jTextField6;
	
	/** The j text field5. */
	private JTextField jTextField5;
	
	/** The j label9. */
	private JLabel jLabel9;
	
	/** The j label8. */
	private JLabel jLabel8;
	
	/** The j label7. */
	private JLabel jLabel7;
	
	/** The j label6. */
	private JLabel jLabel6;
	
	/** The j text field4. */
	private JTextField jTextField4;
	
	/** The j text field3. */
	private JTextField jTextField3;
	
	/** The j text field2. */
	private JTextField jTextField2;
	
	/** The j label1. */
	private JLabel jLabel1;
	
	/** The numbers of rooms by the composition single rooms,double rooms,wedding rooms. */
	int singole,doppie,matrimoniali;
	
	/** The group ID */
	int id;
	
	/** The days of fee*/
	int days;
	
	/** The group name. */
	String nome;
	
	/** The deposit. */
	float deposit;
	
	/** The checkout. */
	String checkin,checkout;
	
	/** The Hotel instance h. */
	Hotel h=new Hotel();
	
	/** The repeat ok. */
	private boolean repeatOk=false;

	/**
	 * Create the dialog.
	 *
	 * @param hotel the Hotel instance hotel loaded at the beginning of the application
	 */
	public InsertGroup1(Hotel hotel) {
		
		if(hotel==null){
			JOptionPane.showMessageDialog(null,"L'istanza hotel è nulla");
			repeatOk=true;
		}
		else{
		h=hotel;
		setBounds(100, 100, 450, 500);
		getContentPane().setLayout(new BorderLayout());
		GroupLayout contentPanelLayout = new GroupLayout((JComponent)contentPanel);
		contentPanel.setLayout(contentPanelLayout);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setPreferredSize(new java.awt.Dimension(477, 265));
		{
			jLabel1 = new JLabel();
			jLabel1.setText("Inserisci il gruppo");
		}
		
		
		{
			try{
			
			jTextField1 = new JTextField();
			jTextField1.setText("id");
			id=Integer.parseInt(jTextField1.getText());
			for(int i=0;i<h.getGroupList().getGroupReg().size();i++){ 
				if((h.getGroupList().getGroupReg().get(i).getNumber()==id)){
					 repeatOk=true;
					 JOptionPane.showMessageDialog(null,"Valore già inserito!riprova"); 
				 }
			}
			}catch(NumberFormatException nfe){
				JOptionPane.showMessageDialog(null,"L'id del gruppo deve essere un intero");
			}
		}
		{
			jLabel2 = new JLabel();
			jLabel2.setText("Inserisci l'id del gruppo");
		}
		{
			jLabel3 = new JLabel();
			jLabel3.setText("Inserisci il nome del gruppo");
		}
		{
			jLabel4 = new JLabel();
			jLabel4.setText("Inserisci l'importo dell'extra");
		}
		{
			jLabel5 = new JLabel();
			jLabel5.setText("Inserisci i giorni di pernottamento");
		}
		{
			jLabel6 = new JLabel();
			jLabel6.setText("Inserisci la richiesta relativa");
		}
		{
			jLabel7 = new JLabel();
			jLabel7.setText("Inserisci il numero di camere singole richieste");
		}
		{
			jLabel8 = new JLabel();
			jLabel8.setText("Inserisci il numero di camere doppie richieste");
		}
		{
			jLabel9 = new JLabel();
			jLabel9.setText("Inserisci il numero di camere matrimoniali richieste");
		}
		{
			try{
			jTextField5 = new JTextField();
			jTextField5.setText("0");
			singole=Integer.parseInt(jTextField5.getText());
			}catch(NumberFormatException nfe){
				JOptionPane.showMessageDialog(null,"Il numero di singole devono essere valori interi");
			}
		}
		{
			try{
			jTextField6 = new JTextField();
			jTextField6.setText("0");
			doppie=Integer.parseInt(jTextField6.getText());
			}catch(NumberFormatException nfe){
				JOptionPane.showMessageDialog(null,"Il numero di doppie devono essere valori interi");
			}
		}
		{
			try{
			jTextField7 = new JTextField();
			jTextField7.setText("0");
			matrimoniali=Integer.parseInt(jTextField7.getText());
			}catch(NumberFormatException nfe){
				JOptionPane.showMessageDialog(null,"Il numero di matrimoniali devono essere valori interi");
			}
		}
		{
			
				jTextField2 = new JTextField();
				jTextField2.setText("nome_gruppo");
				try{
				nome=jTextField2.getText();
				for(int i=0;i<h.getGroupList().getGroupReg().size();i++){ 
					if((h.getGroupList().getGroupReg().get(i).getName().equalsIgnoreCase(nome))){
						 JOptionPane.showMessageDialog(null,"Valore già inserito!riprova");
						 repeatOk=true;
					 }
				}
				}catch(NullPointerException npe){
					JOptionPane.showMessageDialog(null,"E' stato inserito un valore nullo");
					repeatOk=true;
					npe.printStackTrace();
				}
			
		}
		{
			try{
			jTextField3 = new JTextField();
			jTextField3.setText("0");
			deposit=Float.parseFloat(jTextField3.getText());
			}catch(NumberFormatException nfe){
				JOptionPane.showMessageDialog(null,"l'acconto deve assumere un valore float in euro");
			}
		}
		{
			try{
			jTextField4 = new JTextField();
			jTextField4.setText("1");
			days=Integer.parseInt(jTextField4.getText());
			if(days==0){
				JOptionPane.showMessageDialog(null,"Il numero di giorni deve esseremaggiore di zero");
			}
			}catch(NumberFormatException nfe){
				JOptionPane.showMessageDialog(null,"Il numero di giorni deve essere intero");
			}
		}
		
		
		
				contentPanelLayout.setVerticalGroup(contentPanelLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jLabel2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jTextField1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jTextField2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabel3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jTextField3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabel4, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jTextField4, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabel5, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jLabel7, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jTextField5, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jLabel8, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jTextField6, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jLabel9, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jTextField7, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(94, 94));
				contentPanelLayout.setHorizontalGroup(contentPanelLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(contentPanelLayout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
					        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					        .addGroup(contentPanelLayout.createParallelGroup()
					            .addGroup(GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
					                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE)
					                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
					            .addGroup(GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
					                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
					                .addGap(0, 55, Short.MAX_VALUE))))
					    .addGroup(contentPanelLayout.createSequentialGroup()
					        .addGroup(contentPanelLayout.createParallelGroup()
					            .addComponent(jLabel5, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
					            .addGroup(GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
					                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
					                .addGap(26))
					            .addGroup(GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
					                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
					                .addGap(26)))
					        .addGap(7)
					        .addGroup(contentPanelLayout.createParallelGroup()
					            .addGroup(contentPanelLayout.createSequentialGroup()
					                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
					            .addGroup(contentPanelLayout.createSequentialGroup()
					                .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
					            .addGroup(contentPanelLayout.createSequentialGroup()
					                .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)))
					        .addGap(0, 43, Short.MAX_VALUE))
					    .addGroup(contentPanelLayout.createSequentialGroup()
					        .addGroup(contentPanelLayout.createParallelGroup()
					            .addComponent(jLabel9, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE)
					            .addGroup(GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
					                .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
					                .addGap(40))
					            .addGroup(GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
					                .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)
					                .addGap(9)))
					        .addGroup(contentPanelLayout.createParallelGroup()
					            .addGroup(contentPanelLayout.createSequentialGroup()
					                .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
					            .addGroup(contentPanelLayout.createSequentialGroup()
					                .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
					            .addGroup(contentPanelLayout.createSequentialGroup()
					                .addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)))
					        .addGap(0, 15, Short.MAX_VALUE)))
					.addContainerGap(63, 63));	
				
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			getContentPane().add(contentPanel, BorderLayout.CENTER);
			
			JButton cancelButton = new JButton("Cancel");
			cancelButton.setActionCommand("Cancel");
			buttonPane.add(cancelButton);
			
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e){
						System.out.println("called");
					
						 
						 if(e.getActionCommand().equals("OK")){
							 
							 try{
							 id=Integer.parseInt(jTextField1.getText());
								for(int i=0;i<h.getGroupList().getGroupReg().size();i++){ 
									if((h.getGroupList().getGroupReg().get(i).getNumber()==id)){
										 repeatOk=true;
										 JOptionPane.showMessageDialog(null,"Valore già inserito!riprova"); 
									 }
								}
								}catch(NumberFormatException nfe){
									JOptionPane.showMessageDialog(null,"L'id del gruppo deve essere un intero");
								}
								
								try{
									singole=Integer.parseInt(jTextField5.getText());
									}catch(NumberFormatException nfe){
										JOptionPane.showMessageDialog(null,"Il numero di singole devono essere valori interi");
									}
									
									try{
										doppie=Integer.parseInt(jTextField6.getText());
										}catch(NumberFormatException nfe){
											JOptionPane.showMessageDialog(null,"Il numero di doppie devono essere valori interi");
										}
										try{
											matrimoniali=Integer.parseInt(jTextField7.getText());
											}catch(NumberFormatException nfe){
												JOptionPane.showMessageDialog(null,"Il numero di matrimoniali devono essere valori interi");
											}
											
											try{
												nome=jTextField2.getText();
												for(int i=0;i<h.getGroupList().getGroupReg().size();i++){ 
													if((h.getGroupList().getGroupReg().get(i).getName().equalsIgnoreCase(nome))){
														 JOptionPane.showMessageDialog(null,"Valore già inserito!riprova");
														 repeatOk=true;
													 }
												}
												}catch(NullPointerException npe){
													JOptionPane.showMessageDialog(null,"E' stato inserito un valore nullo");
													repeatOk=true;
													npe.printStackTrace();
												}
												
												try{
													deposit=Float.parseFloat(jTextField3.getText());
													}catch(NumberFormatException nfe){
														JOptionPane.showMessageDialog(null,"l'acconto deve assumere un valore float in euro");
													}
													try{
													days=Integer.parseInt(jTextField4.getText());
													if(days==0){
														JOptionPane.showMessageDialog(null,"Il numero di giorni deve esseremaggiore di zero");
													}
													}catch(NumberFormatException nfe){
														JOptionPane.showMessageDialog(null,"Il numero di giorni deve essere intero");
													}
													
													if(singole==0&&doppie==0&&matrimoniali==0){
														JOptionPane.showMessageDialog(null,"Nell'albergo occorre la prenotazione di almeno una camera");
														repeatOk=true;
						                             }
													
							
                             
                             DataCheckout d=new DataCheckout();
                                    Date []dates=new Date[2];
                                    dates=d.DataCheckout(days);
                                    DateToString ds=new DateToString();
                                	if(ds.DateToString(dates[0])==null||ds.DateToString(dates[1])==null){
                                		JOptionPane.showMessageDialog(null,"Checkin e checkout non possono assumere valori nulli");
                            			repeatOk=true;
                            		}
                                    checkin=ds.DateToString(dates[0]);
                                    checkout=ds.DateToString(dates[1]);
                                    Group g = new Group(id, nome, checkin, checkout, deposit);
                                    h.getGroupList().getGroupReg().add(g);
                                    Request r=new Request(singole, doppie, matrimoniali, "eseguita");
                                    h.getRequestList().getRequestReg().add(r);
                                    JDOMAddChild j=new JDOMAddChild(g,r);
                                    JOptionPane.showMessageDialog(null,"Fatto!");
						 }
					}
				});
			
			
		}
		}
	}
	
}
		 
