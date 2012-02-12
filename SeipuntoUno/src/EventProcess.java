import java.util.Observable;
import java.util.Observer;

public class EventProcess extends Observable implements Observer,Runnable {
	String name;
	Thread thread;
	boolean alive=false;
	String observable;
	String event="";

	public EventProcess(String name){
		this.name=name;
	}

	public void attachTo(EventProcess process){
		process.addObserver(this);
	}

	public synchronized void update(Observable observable,Object event){

		this.observable=observable.toString();
		this.event=(String)event;

		notify();
	}


	public synchronized void waitEvent(Observable observable,String event){

		while(!(this.observable.equals(observable.toString())&& this.event.equals(event))){
			try{
				this.wait();
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
			this.event="";
		}
	}

	public void notifyObservers(String event){
		this.setChanged();
		super.notifyObservers(event);
	}

	public void start(){
		thread=new Thread(this);
		if(!alive){
			alive=true;
			thread.start();
		}
	}

	public void run(){}

	public String toString(){
		return this.name;
		}

	public void repaint(){
		this.notifyObservers("REPAINT");
	}
}


