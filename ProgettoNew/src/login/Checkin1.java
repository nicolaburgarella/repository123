package login;

import hotel.Hotel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.GroupLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.border.EmptyBorder;

import main.AssignRooms;



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
public class Checkin1 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JTextField jTextField1;
	private JLabel jLabel1;
	private JTextArea jTextArea1;
	String nome;
	Hotel h=new Hotel();

	/**
	 * Launch the application.

	public static void main(String[] args) {
		try {
			Checkin dialog = new Checkin();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/

	/**
	 * Create the dialog.
	 * @param h 
	 */
	public Checkin1(Hotel hotel) {
		h=hotel;
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		GroupLayout contentPanelLayout = new GroupLayout((JComponent)contentPanel);
		contentPanel.setLayout(contentPanelLayout);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			jTextArea1 = new JTextArea();
			jTextArea1.setText("jTextArea1");
		}
		{
			jLabel1 = new JLabel();
			jLabel1.setText("Sei entrato nel pannello JDialog relativo alla procedura di checkin");
		}
		{
			jLabel2 = new JLabel();
			jLabel2.setText("E' una procedura irreversibile");
		}
		{
			jLabel3 = new JLabel();
			jLabel3.setText("Inserisci il nome del gruppo ");
		}
		{
			jTextField1 = new JTextField();
			jTextField1.setText("nomegruppo");
			nome=jTextField1.getText();
		}
		{
			jLabel4 = new JLabel();
			jLabel4.setText("Inserisci eventuali note che compariranno a console:");
			System.out.println(jLabel4.getText());
		}
		contentPanelLayout.setVerticalGroup(contentPanelLayout.createSequentialGroup()
			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
			.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
			.addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
			    .addComponent(jLabel3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
			    .addComponent(jTextField1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
			.addGap(22)
			.addComponent(jLabel4, 0, 26, Short.MAX_VALUE)
			.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
			.addComponent(jTextArea1, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE));
		contentPanelLayout.setHorizontalGroup(contentPanelLayout.createSequentialGroup()
			.addGroup(contentPanelLayout.createParallelGroup()
			    .addGroup(GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
			        .addComponent(jTextArea1, GroupLayout.PREFERRED_SIZE, 321, GroupLayout.PREFERRED_SIZE)
			        .addGap(0, 76, Short.MAX_VALUE))
			    .addGroup(contentPanelLayout.createSequentialGroup()
			        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 397, GroupLayout.PREFERRED_SIZE)
			        .addGap(0, 0, Short.MAX_VALUE))
			    .addGroup(GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
			        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 382, GroupLayout.PREFERRED_SIZE)
			        .addGap(0, 15, Short.MAX_VALUE))
			    .addGroup(GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
			        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
			        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
			        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
			        .addGap(0, 88, Short.MAX_VALUE))
			    .addGroup(GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
			        .addComponent(jLabel4, 0, 344, Short.MAX_VALUE)
			        .addGap(53)))
			.addContainerGap(27, 27));
		
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
								 if(!(h.getGroupList().isGroupListEmpty())){
									 AssignRooms a=new AssignRooms(nome, h);
									 JOptionPane.showMessageDialog(null,"Fatto!");
										
									}
									else{
										JOptionPane.showMessageDialog(null,"Non è ancora stato inserito il gruppo con id selezionato sa cui associare la prenotazione");
									}

								 }
					}
				});
			
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			
	
	
	/*			
	public void actionPerformed(ActionEvent e){
		 
		 if(e.getActionCommand().equals("OK")){
			 if(!(h.getGroupList().isGroupListEmpty())){
				 AssignRooms a=new AssignRooms(nome, h);
				 JOptionPane.showMessageDialog(null,"Fatto!");
					
				}
				else{
					JOptionPane.showMessageDialog(null,"Non è ancora stato inserito il gruppo con id selezionato sa cui associare la prenotazione");
				}

			 }
			 
		 }*/

	}
}
			