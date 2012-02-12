public class TrafficLight extends EventProcess {
	public boolean stop=false;
	String eventName;

	public TrafficLight(String name){
		super(name);
	}

	public void setRed(){
		if(stop){
			return;
		}
		eventName="RED";
		stop=true;
		synchronized(this){
			notify();
		}
	}

	public void setGreen(){
		if(!stop){
			return;
		}
		eventName="GREEN";
		stop=false;
		synchronized (this) {
			notify();
		}
	}


	public void run(){
		while(alive){
			try{
				synchronized(this){
					wait();
				}
				this.repaint();
				this.notifyObservers(eventName);
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}
}
