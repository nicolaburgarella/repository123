/**
 *Esempio interfacce grafiche
 */
import java.applet.Applet;
import java.awt.*;
public class Gui extends Applet {
	CheckboxGroup cards=new CheckboxGroup();
	Checkbox visacard= new Checkbox("visa card",true,cards);
	Label emailLabel=new Label("email address: ",Label.RIGHT);
	TextField emailAddress=new TextField(25);

	Button oneButton=new Button("One");
	Button twoButton= new Button("Two");
	Choice sport = new Choice();

	public void init(){
		add(emailLabel);
		add(emailAddress);
		add(visacard);
		sport.add("Baseball");
		sport.add("Golf");
		sport.add("Beach volleyball");
		sport.add("Swimming");
		//sport.add(sport);
		add(oneButton);
		add(twoButton);
	}
}
