import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;

/**
 *Fonts e colori - esempio
 */
public class Fonts extends java.applet.Applet {
	public void paint(Graphics screen){

		Font currentFont=new Font("TimesRoman", Font.PLAIN,20);
		screen.setFont(currentFont);
		screen.drawString("Plain Times Roman, 20pont.", 5, 40);
	//	screen.setBackground(Color.green);
		screen.drawString("Black text on green", 5, 50);
		screen.setColor(Color.blue);
		screen.drawString("Now this is blue text", 5, 70);
	}
}
