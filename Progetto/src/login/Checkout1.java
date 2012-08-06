package login;

import group.Group;
import group.JDOMRemoveChild;
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
public class Checkout1 extends JDialog {

        /** The content panel. */
        private final JPanel contentPanel = new JPanel();
        
        /** The j check box1. */
        private JCheckBox jCheckBox1;
        
        /** The j check box2. */
        private JCheckBox jCheckBox2;
        
        /** The j label5. */
        private JLabel jLabel5;
        
        /** The j text field2. */
        private JTextField jTextField2;
        
        /** The j text field1. */
        private JTextField jTextField1;
        
        /** The j label4. */
        private JLabel jLabel4;
        
        /** The j label3. */
        private JLabel jLabel3;
        
        /** The j label2. */
        private JLabel jLabel2;
        
        /** The j label1. */
        private JLabel jLabel1;
        
        /** The g. */
        Group g = new Group();
       
        /** The id. */
        int id;
        
        /** The nome. */
        String nome;
        
        /** The group id. */
        int groupId;
       
        /** The h. */
        Hotel h=new Hotel();
                
                /** The repeat ok. */
                private boolean repeatOk=false;

        /**
         * Create the dialog.
         *
         * @param hotel the hotel
         * @param string the string
         */
        public Checkout1(Hotel hotel, String string) {
               
                if(hotel==null){
                        JOptionPane.showMessageDialog(null,"L'istanza hotel è nulla");
                        repeatOk=true;
                        }
                        if(string==null){
                                JOptionPane.showMessageDialog(null,"il nome del gruppo è nullo");
                                repeatOk=true;
                                }
                        else{
               
                h=hotel;
                setBounds(100, 100, 450, 300);
                getContentPane().setLayout(new BorderLayout());
                GroupLayout contentPanelLayout = new GroupLayout((JComponent)contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
                getContentPane().add(contentPanel, BorderLayout.CENTER);
               
                jCheckBox1=new JCheckBox();
                jCheckBox2=new JCheckBox();
                jLabel2 =new JLabel();
                jLabel3=new JLabel();
                jTextField1=new JTextField();
                jTextField2=new JTextField();
               
                if(string.equals("name")){
                        //nomegruppo
                        jCheckBox2.setEnabled(false);
                        jCheckBox2.setVisible(true);
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
                        jCheckBox1.setVisible(true);
                        jCheckBox1.setSelected(true);
                        jCheckBox2.setVisible(false);
                       
                        jLabel2.setVisible(true);
                        jTextField1.setVisible(true);
                        jLabel3.setVisible(false);
                        jTextField2.setVisible(false);
                }
               

               
                {
                        jLabel1 = new JLabel();
                        jLabel1.setText("Checkout");
                }
                {
                        //jCheckBox1 = new JCheckBox();
                        jCheckBox1.setText("in base a id prenotazione");
                }
                {
                        //jCheckBox2 = new JCheckBox();
                        jCheckBox2.setText("in base a nome gruppo");
                }
                {
                        //jLabel2 = new JLabel();
                        jLabel2.setText("Inserisci id prenotazione");
                }
                {
                        //jLabel3 = new JLabel();
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
                       
                        //jTextField1 = new JTextField();
                        jTextField1.setText("id");
                        try{
                        id=Integer.parseInt(jTextField1.getText());
                        if(id==0){
                                JOptionPane.showMessageDialog(null,"L'id della prenotazione non può essere 0");
                        }
                        }catch(NumberFormatException nfe){
                                JOptionPane.showMessageDialog(null,"L'id della prenotazione deve essere un intero positivo");
                        }
                }
                {
                        //jTextField2 = new JTextField();
                        jTextField2.setText("nome");
                        try{
                        nome=jTextField2.getText();
                        }catch(NullPointerException npe){
                                JOptionPane.showMessageDialog(null,"Il nome del gruppo non deve essere nullo");
                                npe.printStackTrace();
                                repeatOk=true;
                        }
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
                                                         if(id==0){
                                                                JOptionPane.showMessageDialog(null,"L'id della prenotazione non può essere 0");
                                                         }
                                                         }catch(NumberFormatException nfe){
                                                                 JOptionPane.showMessageDialog(null,"L'id della prenotazione deve essere un intero positivo");
                                                         }
                                                         
                                                         try{
                                                             nome=jTextField2.getText();
                                                             }catch(NullPointerException npe){
                                                                JOptionPane.showMessageDialog(null,"Il nome del gruppo non deve essere nullo");
                                                                npe.printStackTrace();
                                                                repeatOk=true;
                                                             }
                                                         
                               
                                                                if(jCheckBox1.isSelected()){
                                                                        //id
                                                                        try {
                                                                                                                                                        CheckoutId c = new CheckoutId(h, g, id);
                                                                                                                                                } catch (IOException e1) {
                                                                                                                                                        JOptionPane.showMessageDialog(null,"Errore di i/o");
                                                                                                                                                        e1.printStackTrace();
                                                                                                                                                }
                 
                                                                }
                                                               
                                                                if(jCheckBox2.isSelected()){
                                                                        try {
                                                                                                                                                        CheckoutName c = new CheckoutName(h, g, nome);
                                                                                                                                                } catch (IOException e1) {
                                                                                                                                                        JOptionPane.showMessageDialog(null,"Errore di i/o");
                                                                                                                                                        e1.printStackTrace();
                                                                                                                                                }
                                                                                                             
                                                        }
                                                 }
                                                 }
                                });
                       
                }
        }
        }

       
}
