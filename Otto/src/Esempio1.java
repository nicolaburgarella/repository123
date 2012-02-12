/**
 *Uso di finestre in applicazioni standalone: l'idea è ok,ma ci sono errori,
 *la classe applet gui non va bene
 */
import java.awt.Frame;
public class Esempio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f =new Frame("My Window");
		Gui myapplet=new Gui();
		myapplet.init();
		myapplet.start();
		f.resize(300,300);
		f.show();

	}

}
