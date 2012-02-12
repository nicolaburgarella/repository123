public class PhotoCell extends EventProcess{
	public boolean cleared=true;
	String eventName;

	public PhotoCell(String name){
		super(name);
	}

	public void occupy(){
		if(!cleared){
			return;
		}
		eventName="OCCUPIED";
		cleared=false;
		synchronized (this) {
			notify();
		}
	}

	public void clear(){
		if(cleared){
			return;
		}
		eventName="CLEARED";
		cleared=true;
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

				this.repaint();
				this.notifyObservers(eventName);
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}
}
