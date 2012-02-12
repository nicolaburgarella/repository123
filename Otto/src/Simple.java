/**
 *Invocaizone di applet dalla rete
 */
import java.applet.Applet;
import java.awt.Graphics;

public class Simple extends Applet{
	StringBuffer buffer=new StringBuffer();
	public void init(){
		addItem("Initializing..");

	}

	public void start(){
		addItem("starting..");

	}

	public void stop(){
		addItem("stopping..");

	}

	public void destroy(){
		addItem("destroying..");

	}

	void addItem(){
		buffer.append(newWord);
		repaint();

	}

	public void paint(Graphics g){
		g.drawRect(0,0,size().width-1,size().height-1);
		g.drawString(buffer.toString(), 5, 15);

	}

}
