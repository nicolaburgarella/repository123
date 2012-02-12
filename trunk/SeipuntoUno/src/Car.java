
public class Car extends EventProcess{
	TrafficLight trafficLight;
	PhotoCell inPhotoCell;
	PhotoCell outPhotocell;
	StoppingBar stoppingBar;
	TicketDispenser ticketDispenser;
	int phase=1;
	int distance=0;

	public Car(String name, TrafficLight tLight, PhotoCell inPhC,PhotoCell outPhC, StoppingBar bar, TicketDispenser dispenser){
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
		while(alive){
			try{
				switch(phase){
				case 1:
					waitEvent(trafficLight,"GREEN");
					thread.sleep(500);
					goTo(20);
					inPhotoCell.occupy();
					goTo(170);
					inPhotoCell.clear();
					this.notifyObservers("PROCEEDING");
					goTo(320);
					phase=2;
					break;

				case 2:
					waitEvent(ticketDispenser, "DELIVERED");
					thread.sleep(1500);
					ticketDispenser.withdraw();
					phase=3;
					break;

				case 3:
					waitEvent(stoppingBar, "UP");
					goTo(470);
					outPhotocell.occupy();
					goTo(650);
					outPhotocell.clear();
					goTo(750);
					boolean inside = false;
					distance=0;
					phase=1;
					break;
				}
			}
				catch(InterruptedException ie){
					ie.printStackTrace();
				}
		}
	}

		private void waitEvent(TrafficLight trafficLight2, String event) {
		// TODO Auto-generated method stub

	}

		private void goTo(int pos){
			while(distance<pos){
				distance+=10;
				this.repaint();
				try{
					thread.sleep(100);
				}
				catch(InterruptedException ie){
					ie.printStackTrace();
				}
			}
		}
	}

