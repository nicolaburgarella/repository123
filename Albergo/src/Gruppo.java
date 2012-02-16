import java.io.*;
import java.util.*;

public class Gruppo {
	private int id=0;
	private String nome;
	private String dataArrivo;
	private double anticipoVersato;
	private int singole=0;
	private int doppie=0;
	private int matrimoniali=0;
	static int gruppiTotInseriti=0;
	public final static int MaxSingole=30;
	public final static int MaxDoppie=20;
	public final static int MaxMatrimoniali=15;
	static int camerePrenotate;
	private boolean continua=false;
	RegistroCamere rc=null;


	public Gruppo(){

	}

//Costruttore completo con tutti i parametri id compreso(metodo inutile?? boh se uso l'id e voglio istanziarlo serve),per praticità ha pure il tot sinmgole doppie e matrimoniali richieste 
	public Gruppo(int id,String nome,String dataArrivo, double anticipoVersato, int singole, int doppie, int matrimoniali){
		this.id=id;
		this.nome=nome;
		this.dataArrivo=dataArrivo;
		this.anticipoVersato=anticipoVersato;
		this.singole=singole;
		this.doppie=doppie;
		this.matrimoniali=matrimoniali;

	}

//Come sopra ma senza id
	public Gruppo(String nome,String dataArrivo, double anticipoVersato, int singole, int doppie, int matrimoniali){
		this.nome=nome;
		this.dataArrivo=dataArrivo;
		this.anticipoVersato=anticipoVersato;
		this.singole=singole;
		this.doppie=doppie;
		this.matrimoniali=matrimoniali;

	}

/*
	public void setId(int id){
		this.id=id;
	}
*/

//metodo che incrementa l'id e i vari getter setter del nomegruppo, dataarrivo(da modificare in Time??cmq vera data,magari qlla attuale),anticipo 
	public int getId(){
		return id;
	}

	public void setIncrId(){
		this.id++;
	}

	public void setNome(String nome){
		this.nome=nome;
	}

	public String getNome(){
		return this.nome;
	}


	public void setDataArrivo(String dataArrivo){
		this.dataArrivo=dataArrivo;
	}

	public String getDataArrivo(){
		return this.dataArrivo;
	}

	public void setAnticipoVersato(double anticipo){
		this.anticipoVersato=anticipo;
	}

	public double getAnticipoVersato(){
		return this.anticipoVersato;
	}

//questi tre get li uso per il salvataggio sul file xml del registro gruppi.
	public int getSingole(){
		return this.singole;
	}

	public int getDoppie(){
		return this.doppie;
	}

	public int getMatrimoniali(){
		return this.matrimoniali;
	}

	public int getCamerePrenotate(){
		return camerePrenotate;
	}

	public void setCamerePrenotate(int camerePrenotate){
		camerePrenotate=camerePrenotate;
	}

//da togliere
	public void setRichiestaComposizione(int s, int d, int m){
		this.singole=s;
		this.doppie=d;
		this.matrimoniali=m;
	}

//da togliere
	public int[] getRichiestaComposizione(){
		int richiestaGruppo[]= new int[3];
		this.singole=richiestaGruppo[0];
		this.doppie=richiestaGruppo[1];
		this.matrimoniali=richiestaGruppo[2];
		return richiestaGruppo;
	}

	public String toString(){
		return "Codice Gruppo :"+id+"\n"+"Nome Gruppo: \t"+nome+"\n"+"Data Arrivo: \t"+dataArrivo+"\n"+"Anticipo Versato: \t"+anticipoVersato+"\n"+"numero di camere singole prenotate: "+singole+"\n"+"numero di camere doppie prenotate: "+doppie+"numero di camere matrimoniali prenotate: "+matrimoniali+"";
		}

//abb completo,e corretto nei controlli
	public void InserisciGruppo(){
		try{
			BufferedReader promptLine=new BufferedReader(new InputStreamReader(System.in));
			//Inserisco nome del gruppo,datacheckin,anticipo,numero di camere singole-doppi-matrimoniali richieste(con controlli)
			//l'id del gruppo prima di essere memorizzato è zero,viene incrementato in modo automatico ad ogni salvataggio nel registro
			System.out.println("Inserisci il nome del gruppo: ");	
			this.nome=promptLine.readLine();
			System.out.println("Inserisci la data di arrivo checkin");
			this.dataArrivo=promptLine.readLine();
			System.out.println("Inserisci l'importo dell'anticipo versato: ");
			this.anticipoVersato=Double.parseDouble(promptLine.readLine());
		
			do{
			System.out.println("Inserisci il numero di camere singole richieste: ");
			this.singole=Integer.parseInt(promptLine.readLine());
			
			if(singole>=0 && singole>this.MaxSingole){
				System.out.println("E' stato inserito un numero di camere singole oltre la capacità dell'albergo");
				}
			else if(singole>=0 && singole>=rc.getTotSingoleDisp()){
				System.out.println("Al momento non è possibile accettare la richiesta non ci sono abbastanza camere singole disponibili");
			}
			else if(singole>=0 && singole<=rc.getTotSingoleDisp()){
				System.out.println("Richiesta di camere singole accettata");
			}
			else{
				System.out.println("Errore di digitazione");
				continua=true;break;
			}
			}while(continua);
			
			do{
			System.out.println("Inserisci il numero di camere doppie richieste: ");
			this.doppie=Integer.parseInt(promptLine.readLine());
			if(doppie>=0 && doppie>this.MaxDoppie){
				System.out.println("E' stato inserito un numero di camere doppie oltre la capacità dell'albergo");
				}
			else if(doppie>=0 && doppie>=rc.getTotDoppieDisp()){
				System.out.println("Al momento non è possibile accettare la richiesta non ci sono abbastanza camere doppie disponibili");
			}
			else if(doppie>=0 && doppie<=rc.getTotDoppieDisp()){
				System.out.println("Richiesta di camere doppie accettata");
			}
			else{
				System.out.println("Errore di digitazione");
				continua=true;break;
			}
			}while(continua);
			
			do{
			System.out.println("Inserisci il numero di camere matrimoniali richieste: ");
			this.matrimoniali=Integer.parseInt(promptLine.readLine());
			if(matrimoniali>=0 && matrimoniali>this.MaxMatrimoniali){
				System.out.println("E' stato inserito un numero di camere matrimoniali oltre la capacità dell'albergo");
				}
			else if(matrimoniali>=0 && matrimoniali>=rc.getTotMatrimonialiDisp()){
				System.out.println("Al momento non è possibile accettare la richiesta non ci sono abbastanza camere matrimoniali disponibili");
			}
			else if(matrimoniali>=0 && matrimoniali<=rc.getTotMatrimonialiDisp()){
				System.out.println("Richiesta di camere matrimoniali accettata");
			}
			else{
				System.out.println("Errore di digitazione");
				continua=true;break;
			}
			}while(continua);
		

		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		catch(IllegalFormatException ife){
			ife.printStackTrace();
		}
		finally{
			System.out.println("Inserimento gruppo terminato");
		}

	}

}

