import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
	private int numCamerePrenotate;
	private boolean continua=false;
	RegistroCamere rc=null;


	public Gruppo(){

	}

//Costruttore completo con tutti i parametri id compreso(metodo inutile?? boh se uso l'id e voglio istanziarlo serve),per praticit� ha pure il tot sinmgole doppie e matrimoniali richieste
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
//Ritorna il numero di camere prenotate dall'istanza gruppo
	public int getNumCamerePrenotate(){
		numCamerePrenotate=singole+doppie+matrimoniali;
		return numCamerePrenotate;
	}


//metodo che setta il numero tot di camere prenotate dal gruppo,di fatto una volta pagato l'istanza gruppo pu� rimanere nel gc,ma non ci sono pi� camere prenotate da esso
	public void setNumCamerePrenotate(int numeroCamerePrenotate){
		numCamerePrenotate=numeroCamerePrenotate;
	}


	public String toString(){
		return "Codice Gruppo :"+id+"\n"+"Nome Gruppo: \t"+nome+"\n"+"Data Arrivo: \t"+dataArrivo+"\n"+"Anticipo Versato: \t"+anticipoVersato+"\n"+"numero di camere singole prenotate: "+singole+"\n"+"numero di camere doppie prenotate: "+doppie+"numero di camere matrimoniali prenotate: "+matrimoniali+"";
		}



//abb completo,e corretto nei controlli
	public void InserisciGruppo(){
		try{
			GregorianCalendar gc=new GregorianCalendar();
			DateFormat df=new SimpleDateFormat("dd/MM/yyyy - HH:mm");
			String oggi=df.format(gc.getTime());
			BufferedReader promptLine=new BufferedReader(new InputStreamReader(System.in));
			//Inserisco nome del gruppo,datacheckin,anticipo,numero di camere singole-doppi-matrimoniali richieste(con controlli)
			//l'id del gruppo prima di essere memorizzato � zero,viene incrementato in modo automatico ad ogni salvataggio nel registro
			System.out.println("Inserisci il nome del gruppo: ");
			this.nome=promptLine.readLine();
			System.out.println("data di arrivo checkin � quella odierna:"+oggi);
			this.dataArrivo=oggi;
			System.out.println("Inserisci l'importo dell'anticipo versato: ");
			this.anticipoVersato=Double.parseDouble(promptLine.readLine());

			do{
			System.out.println("Inserisci il numero di camere singole richieste: ");
			this.singole=Integer.parseInt(promptLine.readLine());

			if(singole>=0 && singole>this.MaxSingole){
				System.out.println("E' stato inserito un numero di camere singole oltre la capacit� dell'albergo");
				}
			else if(singole>=0 && singole>=rc.getTotSingoleDisp()){
				System.out.println("Al momento non � possibile accettare la richiesta non ci sono abbastanza camere singole disponibili");
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
				System.out.println("E' stato inserito un numero di camere doppie oltre la capacit� dell'albergo");
				}
			else if(doppie>=0 && doppie>=rc.getTotDoppieDisp()){
				System.out.println("Al momento non � possibile accettare la richiesta non ci sono abbastanza camere doppie disponibili");
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
				System.out.println("E' stato inserito un numero di camere matrimoniali oltre la capacit� dell'albergo");
				}
			else if(matrimoniali>=0 && matrimoniali>=rc.getTotMatrimonialiDisp()){
				System.out.println("Al momento non � possibile accettare la richiesta non ci sono abbastanza camere matrimoniali disponibili");
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

