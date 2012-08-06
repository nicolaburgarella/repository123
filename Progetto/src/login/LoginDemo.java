package login;

import javax.swing.JOptionPane;



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
  }
  catch(Exception e)
  {JOptionPane.showMessageDialog(null, e.getMessage());}
  }
}
