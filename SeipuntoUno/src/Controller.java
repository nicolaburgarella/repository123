
public class Controller extends EventProcess{
	TrafficLight trafficLight;
	PhotoCell inPhotoCell;
	PhotoCell outPhotocell;
	StoppingBar stoppingBar;
	TicketDispenser ticketDispenser;
	int phase=1;

	public Controller(String name, TrafficLight tLight, PhotoCell inPhC,PhotoCell outPhC, StoppingBar bar, TicketDispenser dispenser){
		super(name);

	trafficLight=tLight;
	inPhotoCell=inPhC;
	outPhotocell=outPhC;
	stoppingBar=bar;
	ticketDispenser=dispenser;

	this.attachTo(inPhC);
	this.attachTo(outPhC);
	this.attachTo(bar);
	this.attachTo(dispenser);
	}

	public void run(){
		trafficLight.setGreen();
		while(alive){
			switch(phase){
			case 1:
				waitEvent(inPhotoCell,"OCCUPIED");
				phase=2;
				break;

			case 2:
				waitEvent(inPhotoCell, "CLEARED");
				trafficLight.setRed();
				ticketDispenser.deliver();
				phase=3;
				break;

			case 3:
				waitEvent(ticketDispenser, "DELIVERED");
				phase=4;
				break;

			case 4:
				waitEvent(ticketDispenser, "WITHDRAWN");
				stoppingBar.raise();
				phase=5;
				break;

			case 5:
				waitEvent(stoppingBar,"UP");
				phase=6;
				break;

			case 6:
				waitEvent(outPhotocell, "OCCUPIED");
				phase=7;
				break;

			case 7:
				waitEvent(outPhotocell,"CLEARED");
				stoppingBar.lower();
				phase=8;
				break;

			case 8:
				waitEvent(stoppingBar,"DOWN");
				trafficLight.setGreen();
				phase=1;
				break;
		}
	}
}
}
