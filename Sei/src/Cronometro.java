
/**
 *Flussi di controllo con concorrenza,qua ce n'è 1solo,ma con sincronizzazione(uso di wait e notify)
 *
 */
public class Cronometro implements Runnable {
	boolean alive=false;
	boolean running=false;
	int minuti=0;
	int secondi=0;
	int decimi=0;

	Thread thread=new Thread(this);

	public Cronometro(){

	}

	public void run(){
	while(alive){
		try{
			while(running){
				decimi++;
				if(decimi==10){
					decimi=0;
					secondi++;
					if(secondi==60){
						secondi=0;
						minuti++;
					}
				}
				System.out.println(minuti+":"+secondi+":"+decimi);
				Thread.sleep(100);
			}
			synchronized(this){
				this.wait();
			}
		}
		catch(InterruptedException ie){
			return;
		}
	}
	}

	public synchronized void avvia(){
		if(!running){
			thread=new Thread(this);
			running=true;
			thread.start();
		}
		else{
			this.notify();
		}
	}

	public void sospendi(){
		running=false;
	}
}
