
public class StoppingBar extends EventProcess {
	double angle=0.0;
	double direction=1.0;
	String eventName;

	public StoppingBar(String name){
		super(name);
	}

	public void raise(){
		if(angle==Math.PI/2.0){
			return;
		}
		direction=1.0;
		eventName="UP";
		synchronized (this) {
			notify();
		}
	}

	public void lower(){
		if(angle==0.0){
			return;
		}
		direction=-1.0;
		eventName="DOWN";
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
				for(int i=0;i<10;i++){
					angle+=direction*Math.PI/20.0;
					this.repaint();
					thread.sleep(200);
				}
				this.notifyObservers(eventName);
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}
}
