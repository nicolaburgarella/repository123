
public class Producer implements Runnable {
	int counter=0;
	Buffer outputBuffer;
	boolean alive=false;
	long delay=1000;

	Thread thread=new Thread(this);

	public Producer(Buffer buffer){
		this.outputBuffer=buffer;
	}

	public void run(){
		try{
			while(alive){
				thread.sleep(delay);
				outputBuffer.add(new Integer(counter++));
			}
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
	}

	public void start(){
		alive=true;
		thread.start();
	}

}