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


	public Gruppo(){

	}

	public Gruppo(int id,String nome,String dataArrivo, double anticipoVersato, int singole, int doppie, int matrimoniali){
		this.id=id;
		this.nome=nome;
		this.dataArrivo=dataArrivo;
		this.anticipoVersato=anticipoVersato;
		this.singole=singole;
		this.doppie=doppie;
		this.matrimoniali=matrimoniali;

	}

	public Gruppo(String nome,String dataArrivo, double anticipoVersato, int singole, int doppie, int matrimoniali){
		this.nome=nome;
		this.dataArrivo=dataArrivo;
		this.anticipoVersato=anticipoVersato;
		this.singole=singole;
		this.doppie=doppie;
		this.matrimoniali=matrimoniali;

	}

	public void setId(int id){
		this.id=id;
	}

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

	public void setRichiestaComposizione(int s, int d, int m){
		this.singole=s;
		this.doppie=d;
		this.matrimoniali=m;
	}

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

//da completare nei controlli vari
	public void InserisciGruppo(){
		try{
		BufferedReader promptLine=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Inserisci il nome del gruppo: ");
		this.nome=promptLine.readLine();
		System.out.println("Inserisci la data di arrivo checkin");
		this.dataArrivo=promptLine.readLine();
		System.out.println("Inserisci l'importo dell'anticipo versato: ");
		this.anticipoVersato=Double.parseDouble(promptLine.readLine());
		System.out.println("Inserisci il numero di camere singole richieste: ");
		this.singole=Integer.parseInt(promptLine.readLine());
		if(singole>this.MaxSingole){
			System.out.println("E' stato inserito un numero di camere singole oltre la capacità dell'albergo");
		}
		else if(){}//controllo somma singole da registroCamere
		System.out.println("Inserisci il numero di camere doppie richieste: ");
		this.doppie=Integer.parseInt(promptLine.readLine());
		if(doppie>this.MaxDoppie){
			System.out.println("E' stato inserito un numero di camere doppie oltre la capacità dell'albergo");
		}
		System.out.println("Inserisci il numero di camere matrimoniali richieste: ");
		this.matrimoniali=Integer.parseInt(promptLine.readLine());
		if(matrimoniali>this.MaxMatrimoniali){
			System.out.println("E' stato inserito un numero di camere matrimoniali oltre la capacità dell'albergo");
		}
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

