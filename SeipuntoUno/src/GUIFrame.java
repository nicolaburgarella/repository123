import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;


public class GUIFrame extends JFrame implements Observer{
	TrafficLight trafficLight=new TrafficLight("TRAFFIC_LIGHT");
	PhotoCell inPhotoCell=new PhotoCell("IN_PHOTOCELL");
	TicketDispenser ticketdispender= new TicketDispenser("TICKET_DISPENSER");
	StoppingBar stoppingbar=new StoppingBar("STOPPING_BAR");
	PhotoCell outPhotoCell =new PhotoCell("OUT_PHOTOCELL");
	Controller controller =new Controller("Controller",trafficLight,inPhotoCell,outPhotoCell,stoppingbar,ticketdispender);
	Car car=new Car("RedCar", trafficLight, inPhotoCell, outPhotoCell, stoppingbar, ticketdispender);

	public GUIFrame(){
		trafficLight.addObserver(this);
		inPhotoCell.addObserver(this);
		ticketdispender.addObserver(this);
		outPhotoCell.addObserver(this);
		car.addObserver(this);
	}

	public void start(){
		trafficLight.start();
		inPhotoCell.start();
		ticketdispender.start();
		stoppingbar.start();
		outPhotoCell.start();
		car.start();
		controller.start();
	}

	public static void main(String[] args){
		new GUIFrame();
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}
