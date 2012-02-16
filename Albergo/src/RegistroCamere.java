import java.util.ArrayList;


public class RegistroCamere {
	private ArrayList<Camera> registroCamere=new ArrayList<Camera>();
	private int totSingoleDisp=0;
	private int totDoppieDisp=0;
	private int totMatrimonialiDisp=0;
	static int gruppiTotInseriti=0;
	public final static int MaxSingole=30;
	public final static int MaxDoppie=20;
	public final static int MaxMatrimoniali=15;

//Inizializza il registro camere rimuovendo tutti gli elementi della lista
	public RegistroCamere(){
			//Removes all of the elements from this list.
			registroCamere.clear();

		}

//Controlla se la camera passata come parametro esiste nella lista,se c'è viene inserita la camera nel registro (cioè aggiunta nella lista)	
		public boolean inserisci(Camera camera){
			for(int i=0;i<registroCamere.size()-1;i++){
				if((registroCamere.get(i)).equals(camera)){
					return false;
				}
			}
			registroCamere.add(camera);
			camera.setIncrId();
			return true;
		}
	
//Ritorna la camera in base all'indice della lista passato come parametro
		public Camera getCamera(int posizione){
			return registroCamere.get(posizione);
		}

//Ricerca se esiste l'extra passato come parametro alla funzione esiste nella classe camera,se c'è lo stampa
		public void cerca(Extra extra){
			boolean flag=false;
			for(int i=0;i<registroCamere.size();i++){
				if((registroCamere.get(i).getExtra())==extra){
					System.out.println(extra);
				}
			}
			if(!flag){
				System.out.println("Non è stato trovato alcuna camera con quell' extra");
			}
		}

//Ricerca se la richiesta del gruppo relativa al numero di camere da prenotare rispetta la capacità dell'albergo
		public void cerca(Gruppo gruppo){
			boolean flag=false;
			int[] vComp=new int[3];
			vComp=gruppo.getRichiestaComposizione();
			if(vComp[0]<=Gruppo.MaxSingole && vComp[1]<=Gruppo.MaxDoppie && vComp[2]<=Gruppo.MaxMatrimoniali){
				System.out.println("La richiesta delle camere soddisfa la capacità dell'albergo");
				flag=true;
			}
			if(!flag){
			System.out.println("La richiesta delle camere non rispetta i limiti di capacità dell'albergo");
			}
		}


//Ricerca tramite l'id della camera passato come parametro se la camera è presente nella lista e disponibile 
		public int cercaIdCamera(int id){
			for(int i=0;i<registroCamere.size();i++){
				if(((registroCamere.get(i)).getId())==id && ((registroCamere.get(i)).isDisponibile()==true)){
					return i;
				}
				if(((registroCamere.get(i)).getId())==id && ((registroCamere.get(i)).isDisponibile()==false)){
				return -1;
				}
			}
			return -2;
		}

//Ritorna la lista delle camere
		public ArrayList<Camera> getRegistroCamere(){
			return registroCamere;
		}

//Ritorna la somma delle camere singole disponibili
		public int getTotSingoleDisp(){
			return this.totSingoleDisp;
		}

//Ritorna la somma delle camere doppie disponibili
		public int getTotDoppieDisp(){
			return this.totDoppieDisp;
		}
		
//Ritorna la somma delle camere matrimoniali disponibili
		public int getTotMatrimonialiDisp(){
			return this.totMatrimonialiDisp;
		}

//Incrementa il contatore aggiornato delle camere singole disponibili 
		public void setIncrTotSingole(){
			for(int i=0;i<registroCamere.size();i++){
				if(registroCamere.get(i).isSingola() && registroCamere.get(i).isDisponibile()){
					this.totSingoleDisp++;
				}
			}
		}

//Incrementa il contatore aggiornato delle camere doppie disponibili 		
		public void setIncrTotDoppie(){
			for(int i=0;i<registroCamere.size();i++){
				if(registroCamere.get(i).isDoppia() && registroCamere.get(i).isDisponibile()){
					this.totDoppieDisp++;
				}
			}
		}

//Incrementa il contatore aggiornato delle camere matrimoniali disponibili 
		public void setIncrTotMatrimoniali(){
			for(int i=0;i<registroCamere.size();i++){
				if(registroCamere.get(i).isMatrimoniale() && registroCamere.get(i).isDisponibile()){
					this.totMatrimonialiDisp++;
				}
			}
		}
		
//Decrementa il contatore aggiornato delle camere singole disponibili 
		public void setDecrTotSingole(){
			for(int i=0;i<registroCamere.size();i++){
				if(registroCamere.get(i).isSingola() && registroCamere.get(i).isDisponibile()){
					this.totSingoleDisp--;
				}
			}
		}

//Decrementa il contatore aggiornato delle camere doppie disponibili 		
		public void setDecrTotDoppie(){
			for(int i=0;i<registroCamere.size();i++){
				if(registroCamere.get(i).isDoppia() && registroCamere.get(i).isDisponibile()){
					this.totDoppieDisp--;
				}
			}
		}

//Decrementa il contatore aggiornato delle camere matrimoniali disponibili 
		public void setDecrTotMatrimoniali(){
			for(int i=0;i<registroCamere.size();i++){
				if(registroCamere.get(i).isMatrimoniale() && registroCamere.get(i).isDisponibile()){
					this.totMatrimonialiDisp--;
				}
			}
		}
		
		
		
		
		
}
