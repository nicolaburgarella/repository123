import java.applet.Applet;
import java.awt.*;

public class Example extends Applet{
  String pname;

  public void init(){
    String nameParam=getParameter("username");
    if(nameParam!=null){
    pname=nameParam;
    }
  }
    public void paint(Graphics screen){
    System.out.println("Hello "+pname);
 }
}