/**
 *Esempio riasuntivo
 */
import java.awt.*;
public class ApplTest extends java.applet.Applet {

	public void init(){
		System.out.println("Applet started");
	}

	public void paint(Graphics screen){
		Font f=new Font("Courier", Font.BOLD+Font.ITALIC, 11);

		screen.setFont(f);
		screen.drawString("Test applet!", 10, 10);
		screen.drawRect(20, 20, 100, 100);
		screen.fillRect(30,30, 100, 100);

	}
}
