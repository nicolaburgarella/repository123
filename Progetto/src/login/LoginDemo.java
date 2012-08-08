package login;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

import room.JDOMWriter;



// TODO: Auto-generated Javadoc
/**
 * The main Class LoginDemo used to start the application.
 */
class LoginDemo
{
  
  /**
   * The main method.
   *
   * @param arg the arguments
   */
  public static void main(String arg[])
  {
  try
  {
  Login frame=new Login();
  frame.setSize(300,100);
  frame.setVisible(true);
  
  File dir = new File("pdfFolder");
	boolean exists = dir.exists();
	  if (!exists) {
	dir.mkdir();
	  }
  
  
  File roomsXml = new File("rooms.xml");
  File reservationXml = new File("reservation.xml");
  File groupsXml = new File("groups.xml");
  
  if(!roomsXml.exists()||!reservationXml.exists()||!groupsXml.exists()){
    try
    {
      roomsXml.createNewFile();
      room.JDOMWriter r1=new JDOMWriter();
      
      reservationXml.createNewFile();
      reservation.JDOMWriter r2=new reservation.JDOMWriter();
      
      groupsXml.createNewFile();
      group.JDOMWriter r3=new group.JDOMWriter();
    }
    catch(IOException ioe)
    {
      ioe.printStackTrace();
    }
  } 
  }
  catch(Exception e)
  {JOptionPane.showMessageDialog(null, e.getMessage());}
  }
}
