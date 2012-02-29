import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
	int[] idSingoleDisp=null;
	int[] idDoppieDisp=null;
	int[] idMatrimonialiDisp=null;

//Inizializza il registro camere rimuovendo tutti gli elementi della lista
	public RegistroCamere(){
			//Removes all of the elements from this list.
			registroCamere.clear();

		}

	public boolean isRegistroCamereVuoto(){
		return registroCamere.isEmpty();
	}

//Controlla se la camera passata come parametro esiste nella lista,se c'è viene inserita la camera nel registro (cioè aggiunta nella lista)
		public boolean inserisci(Camera camera){
			for(int i=0;i<registroCamere.size();i++){
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

//E' concettualmente sbagliato,da togliere,anche perchè c'è già il cerca extra tra gli extra
/*
		public void cerca(Extra extra){ 						//ArrayList <Extra> extra
			boolean flag=false;
			for(int i=0;i<registroCamere.size();i++){
				if((registroCamere.get(i).getExtra())==extra){  //getRegistroExtraDellacamera().
					System.out.println(extra);
				}
			}
			if(!flag){
				System.out.println("Non è stato trovato alcuna camera con quell' extra");
			}
		}
		
*/
		public void stampaSingoleDisp() {
			System.out.println("Ecco l'elenco delle  elenco di camere singole disponibili :");
			for(int i=0;i<registroCamere.size();i++){
				if(registroCamere.get(i).isSingola() && registroCamere.get(i).isDisponibile()){
					System.out.println(registroCamere.get(i));
				}
			}
		}

		public void stampaDoppieDisp() {
			System.out.println("Ecco l'elenco delle  elenco di camere doppie disponibili :");
			for(int i=0;i<registroCamere.size();i++){
				if(registroCamere.get(i).isDoppia() && registroCamere.get(i).isDisponibile()){
					System.out.println(registroCamere.get(i));
				}
			}
		}

		public void stampaMatrimonialiDisp() {
			System.out.println("Ecco l'elenco delle  elenco di camere matrimoniali disponibili :");
			for(int i=0;i<registroCamere.size();i++){
				if(registroCamere.get(i).isMatrimoniale() && registroCamere.get(i).isDisponibile()){
					System.out.println(registroCamere.get(i));
				}
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


		//Ritorna la somma delle camere singole disponibili
		public void setDecrTotSingoleDisp(){
			 this.totSingoleDisp--;
		}

//Ritorna la somma delle camere doppie disponibili
		public void setDecrTotDoppieDisp(){
			 this.totDoppieDisp--;
		}

//Ritorna la somma delle camere matrimoniali disponibili
		public void setDecrTotMatrimonialiDisp(){
			 this.totMatrimonialiDisp--;
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

//Ritorna il vettore degli id delle camere singole disponibili
		public int[] getIdCamereSingoleDisponibili(){
			System.out.println("Ecco l'elenco degli id delle camere singole disponibili :");
			for(int i=0;i<registroCamere.size();i++){
				if(registroCamere.get(i).isSingola() && registroCamere.get(i).isDisponibile()){
					for(int j=0;j<idSingoleDisp.length;j++){
						idSingoleDisp[j]=registroCamere.get(i).getId();
						System.out.println(".# "+idSingoleDisp[i]+", ");
						return idSingoleDisp;
					}
				}
				else{
					System.out.println("non ho trovato id");
					return null;
				}

			}
			return idSingoleDisp;
		}


//Ritorna il vettore degli id delle camere doppie disponibili
		public int[] getIdCamereDoppieDisponibili(){
			System.out.print("Ecco l'elenco degli id delle camere doppie disponibili :");
			for(int i=0;i<registroCamere.size();i++){
				if(registroCamere.get(i).isDoppia() && registroCamere.get(i).isDisponibile()){
					for(int j=0;j<idDoppieDisp.length;j++){
						idDoppieDisp[j]=registroCamere.get(i).getId();
						System.out.println(".# "+idDoppieDisp[i]+", ");
						return idDoppieDisp;
					}
				}
				else{
					System.out.println("non ho trovato id");
					return null;
				}

			}
			return idDoppieDisp;
		}


//Ritorna il vettore degli id delle camere matrimoniali disponibili
		public int[] getIdCamereMatrimonialiDisponibili(){
			System.out.println("Ecco l'elenco degli id delle camere matrimoniali disponibili :");
			for(int i=0;i<registroCamere.size();i++){
				if(registroCamere.get(i).isMatrimoniale() && registroCamere.get(i).isDisponibile()){
					for(int j=0;j<idMatrimonialiDisp.length;j++){
						idMatrimonialiDisp[j]=registroCamere.get(i).getId();
						System.out.println(".# "+idMatrimonialiDisp[i]+", ");
						return idMatrimonialiDisp;
					}
				}
				else{
					System.out.println("non ho trovato id");
					return null;
				}

			}
			return idMatrimonialiDisp;
		}
		
		
		/*
		 * salva va reso un file xml <GRUPPO id="" nome="" dataArrivo="" anticipo="" singole="" doppie="" matrimoniali="" />
		 * */
		public void salvaInXML(){
			try{
				File file =new File("RegistroCamere.txt");
				FileOutputStream outStream= new FileOutputStream(file);
		        BufferedWriter lineWriter= new BufferedWriter(new OutputStreamWriter(outStream));
		        for(int i=0;i<registroCamere.size();i++){
		            String LineaTesto;
		            LineaTesto="<CAMERA id="+(registroCamere.get(i)).getId()+" descrizione="+(registroCamere.get(i)).getDescrizione()+" extra="+
		            ((registroCamere.get(i)).isExtras())+" disponibile="+((registroCamere.get(i)).isDisponibile())+" />";
		            lineWriter.write(LineaTesto);
		        	//lineWriter.newLine();
				}
		        outStream.close();
		        lineWriter.close();
			}
			catch(IOException ioe){
				ioe.printStackTrace();
			}
		}




		public void caricaDaXML(){
			try{
	            File fileTesto =new File("RegistroCamere.txt");
	            FileInputStream inStream= new FileInputStream(fileTesto);
	            BufferedReader lineReader= new BufferedReader(new InputStreamReader(inStream));
	            Camera camera = null;
	            String lineaTesto;
	            int indexInit,indexEnd;
	            boolean trovato=false;
	            //legge il file riga per riga
	            while((lineaTesto=lineReader.readLine())!=null){
	                    if((indexInit=lineaTesto.indexOf("<CAMERA"))>-1){
	                            //estrae i dati del gruppo
	                            int id=Integer.parseInt(estrai("id",lineaTesto));
	                            String descrizione=estrai("descrizione",lineaTesto);
	                            String extra=estrai("extra",lineaTesto);
	                            String disponibile=estrai("disponibile",lineaTesto);
	                            //Appends the specified element to the end of this list.
	                            registroCamere.add(camera);
	                            trovato=true;
	                    }
	                    else if((indexInit=lineaTesto.indexOf(" />"))>-1){
	                            System.out.println("Appena caricato il gruppo");
	                    }
	                    else{
	                            continue;
	                    }
	            }
	            //chiude il file di testo
	            lineReader.close();
	            inStream.close();
	            }
	            catch(IOException ioe){
	                    ioe.printStackTrace();
	            }
		}

		static String estrai(String chiave,String riga){
			int indexInit,indexEnd;
			indexInit=riga.indexOf(chiave)+chiave.length()+2;//pos chiave+2,ovvero ="
			String valore=riga.substring(indexInit);
			indexEnd=valore.indexOf('"');
			valore=valore.substring(0,indexEnd); //il secondo parametro di substring è escluso
			return valore;
		}
		
		
		
		
		
		

}
