
public class TicketDispenser extends EventProcess{

	boolean delivered=false;
	String eventName;
	long delay;

	public TicketDispenser(String name){
		super(name);
	}

	public void deliver(){
		if(delivered){
			return;
		}
		eventName="DELIVERED";
		delay=700;
		delivered=true;
		synchronized (this) {
			notify();
		}
	}

	public void withdraw(){
		if(!delivered){
			return;
		}
		eventName="WITHDRAW";
		delay=200;
		delivered=false;
		synchronized (this) {
			notify();
		}
	}

	public void run(){
		while(alive){
			try{
				synchronized (this) {
					wait();
				}
				thread.sleep(delay);
				delivered=!delivered;
				this.repaint();
				this.notifyObservers(eventName);
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}
}
