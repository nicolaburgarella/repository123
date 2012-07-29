package login;

import hotel.Hotel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
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
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import room.ExtraList;
import room.ExtractExtrasInstByRoom;


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
public class CancelExtra extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel jLabel2;
	private JTextField jTextField1;
	private JLabel jLabel1;
	Hotel hotel1=new Hotel();
	Hotel h;
	int id;

	/**
	 * Create the dialog.
	 * @param hotel 
	 */
	public CancelExtra(Hotel hotel) {
		h=hotel;
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		GroupLayout contentPanelLayout = new GroupLayout((JComponent)contentPanel);
		contentPanel.setLayout(contentPanelLayout);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			jLabel1 = new JLabel();
			jLabel1.setText("Cancello l'extra in base al numero di camera");
		}
		{
			jLabel2 = new JLabel();
			jLabel2.setText("Scrivi l'id della camera");
		}
		{
			try{
			jTextField1 = new JTextField();
			jTextField1.setText("id");
			id=Integer.parseInt(jTextField1.getText());
			}catch(NumberFormatException fne){
				JOptionPane.showMessageDialog(null,"E' stato inserito l'id in modo errato,deve essere un numero");
			}
		}
		contentPanelLayout.setVerticalGroup(contentPanelLayout.createSequentialGroup()
			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
			.addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
			    .addComponent(jLabel2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
			    .addComponent(jTextField1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
			.addContainerGap(96, 96));
		contentPanelLayout.setHorizontalGroup(contentPanelLayout.createSequentialGroup()
			.addGroup(contentPanelLayout.createParallelGroup()
			    .addGroup(contentPanelLayout.createSequentialGroup()
			        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 306, GroupLayout.PREFERRED_SIZE)
			        .addGap(0, 0, Short.MAX_VALUE))
			    .addGroup(GroupLayout.Alignment.LEADING, contentPanelLayout.createSequentialGroup()
			        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
			        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
			        .addGap(0, 54, Short.MAX_VALUE)))
			.addContainerGap(118, 118));
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
			 id=Integer.parseInt(jTextField1.getText());
			 if(!(h.getExtraList().isExtraListEmpty())&&id!=0){
					ExtraList el=new ExtraList();
					
					for(int i=0;i<h.getRoomList().getRoomReg().size();i++){
						if(id==h.getRoomList().getRoomReg().get(i).getNumber()){
							ExtractExtrasInstByRoom ee=new ExtractExtrasInstByRoom();
							el=ee.ExtractExtrasInstByRoom(id);
							cancelExtras(hotel1, el);
							room.JDOMRemoveExtraByRoomNr jdree =new room.JDOMRemoveExtraByRoomNr(id);
							JOptionPane.showMessageDialog(null,"Fatto!");
						}
					}
				}
				else{
					JOptionPane.showMessageDialog(null,"Non sono ancora stati inseriti gli extra o hai inserito un numero di camera errato");
				}
					
			 
			 
		 }
		 
		 if(e.getActionCommand().equals("Cancel")){
			 //.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			 dispose();

			 
		 }
		 
	}
	
	public void cancelExtras(Hotel h, ExtraList el){
		for(int i=0;i<h.getExtraList().getExtraReg().size();i++){
			for(int j=0;j<el.getExtraReg().size();j++){
				if(h.getExtraList().getExtraReg().get(i).equals(el.getExtraReg().get(j))){
					h.getExtraList().getExtraReg().remove(i);
				}
			}
		}
	}

}
