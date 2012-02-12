
public class Consumer implements Runnable {
	int counter=0;
	Buffer inputBuffer;
	boolean alive=false;
	long delay=1000;

	Thread thread=new Thread(this);

	public Consumer(Buffer buffer){
		this.inputBuffer=buffer;
	}

	public void run(){
		try{
			while(alive){
				thread.sleep(delay);
				inputBuffer.remove();
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
