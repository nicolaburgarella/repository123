package login;
import javax.swing.*;

import test.MainGui;


import java.awt.*;
import java.awt.event.*;
 
public class Login extends JFrame implements ActionListener
{
 JButton SUBMIT;
 JPanel panel;
 JLabel label1,label2;
 final JTextField  text1,text2;
  public Login()
  {
  label1 = new JLabel();
  label1.setText("Username:");
  text1 = new JTextField(15);

  label2 = new JLabel();
  label2.setText("Password:");
  text2 = new JPasswordField(15);
 
  SUBMIT=new JButton("SUBMIT");
  
  panel=new JPanel(new GridLayout(3,1));
  panel.add(label1);
  panel.add(text1);
  panel.add(label2);
  panel.add(text2);
  panel.add(SUBMIT);
  add(panel,BorderLayout.CENTER);
  SUBMIT.addActionListener(this);
  setTitle("LOGIN FORM");
  }
 public void actionPerformed(ActionEvent ae)
  {
  String value1=text1.getText();
  String value2=text2.getText();
  if (value1.equals("admin") && value2.equals("admin")) {
  /*NextPage page=new NextPage();
  page.setVisible(true);
  JLabel label = new JLabel("Welcome:"+value1);
  page.getContentPane().add(label);
  */
  

  MainGui main = new MainGui();
/*
	Toolkit mioTKit = Toolkit.getDefaultToolkit();
	// Interrogo il SO (tramite il Toolkit) per conoscere le dimensioni dello schermo
	Dimension dimensioniSchermo = mioTKit.getScreenSize();
	main.setSize(dimensioniSchermo.width-20, dimensioniSchermo.height-40);
	main.setVisible(true);
  */
  
 
  NextPage1 page1=new NextPage1();
  page1.setVisible(true);
  NextPage2 page2=new NextPage2();
  page2.setVisible(true);
  NextPage3 page3=new NextPage3();
  page3.setVisible(true);
  
  
  }
  else{
  System.out.println("enter the valid username and password");
  JOptionPane.showMessageDialog(this,"Incorrect login or password",
  "Error",JOptionPane.ERROR_MESSAGE);
  }
}
}