import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Extra {
	private String tipo="null";
	private int idCamera;
	private String dataExtra;
	private double costoExtra=0.0;
	static int extraToTInseriti=0;
	private int id=0;
	RegistroCamere rc;
	private boolean continua=true;

	public Extra(){

	}

//Costruttore extra con id,tipo di extra,id della camera a cui riferirsi,costo e data consumo extra
	public Extra(int id,String tipo,int idCamera,double costoExtra,String dataExtra){
		this.id=id;
		this.tipo=tipo;
		this.idCamera=idCamera;
		this.costoExtra=costoExtra;
		this.dataExtra=dataExtra;

	}

//come sopra ma senza id
	public Extra(String tipo,int idCamera,double costoExtra,String dataExtra){
		this.tipo=tipo;
		this.idCamera=idCamera;
		this.costoExtra=costoExtra;
		this.dataExtra=dataExtra;

	}

//Incremento l'id
	public void setIncrId(){
		this.id++;
	}
/*
	public void setId(int id){
		this.id=id;
	}
*/

//setter e getter vari
	public int getId(){
		return id;
	}

	public void setTipo(String tipo){
		this.tipo=tipo;

	}

	public String getTipo(){
		return this.tipo;
	}

	public int getCodiceCamera(){
		return this.idCamera;
	}

	public void setCostoExtra(double costoExtra){
		this.costoExtra=costoExtra;

	}

	public double getCostoExtra(){
		return this.costoExtra;
	}
	
	public String getDataExtra(){
		return this.dataExtra;
	}
	
	public void setDataExtra(String dataExtra){
		this.dataExtra=dataExtra;
	}

//toString dei dati dell'istanza extra
	public String toString(){
		return "Codice Extra :"+id+"\n"+"Tipo di extra: \t"+tipo+"\n"+"CodiceCamera: \t"+idCamera+"\n"+"Importo Singolo Extra:: \t"+costoExtra+"\n";
	}
	

//Passo come parametro la lista delle camere
	public Extra(RegistroCamere rc){
		RegistroCamere registroCamera=rc;
		}

	/*
	public cercaCamereConExtra(){
		
	}
*/
	
//Inserimento dell'extra,ovvero della data,numerocamera,tipo di extra(aumentare i controlli)
//aumentare i controlli
//occorre controllare che ci sia almeno una camera	
	public void InserisciExtra(){
		try{
            BufferedReader promptLine=new BufferedReader(new InputStreamReader(System.in));
            do{
            		System.out.println("Inserisci la data odierna (END per ripetere tutto l'inserimento):");//bisogna automatizzarla a qlla attuale gg:mm:aa: \t ora
            		this.dataExtra=promptLine.readLine();
            		if(dataExtra.equals("END")){
                        continua=false;break;
            		}

            		System.out.println("Inserisci il numero di camera: (END per terminare) ");
            		this.idCamera=Integer.parseInt(promptLine.readLine());
            		if (rc.cercaIdCamera(idCamera)>0){
            			System.out.println("La camera "+idCamera +" inserita è stata riconosciuta");
            		}
            		else{
            			System.out.println("E' stata inserita un numero di camera errato");
            			continua=false;break;
            		}

                    System.out.println("Inserisci la tipologia di costo extra giornaliero:[0:internet][1:assistenza medica][2:servizio bar][3:servizio ristorante][4:nessun extra](END per terminare)");
                    this.tipo=promptLine.readLine();
                    this.tipo.toUpperCase();
                    if(tipo.equals("END")){
                    	continua=false;break;
                    }
                    else if(tipo.equals(0)) {
                        System.out.println("Il cliente ha utilizzato internet");
                        costoExtra=5.00;
                    }
                    else if(tipo.equals(1)) {
                        System.out.println("E' stata effettuata una chiamata medica di assistenza");
                        costoExtra=70.00;
                    }
                    else if(tipo.equals(2)) {
                        System.out.println("Il cliente ha utilizzato il servizio bar");
                        costoExtra=3.00;
                    }
                    else if(tipo.equals(3)) {
                        System.out.println("Il cliente ha utilizzato il servizio ristorante(pranzo e cena a menù fisso)");
                        costoExtra=60.00;
                    }
                    else {
                    	System.out.println("E' stato inserito un valore non corretto,riprova.");
                    	continua=false;break;
                    }

            }while(!continua);
       }
		catch(IOException ioe){
			ioe.printStackTrace();
			}
		catch(IllegalFormatException ife){
			ife.printStackTrace();
		}
		finally{
			System.out.println("l'extra giornaliero è stato compilato correttamente.");//va ora istanziato nel main
            }
	}
}

/*se c0è la camera allora aggingo extra , quindi in RegistroExtra:
int trovato=registroCamere.cerca(idCamera);
if(trovato!=-1){
system.out.println("Camera riconosciuta");
Camera camera=null;
camera=registroCamere.getCamera(trovato);
System.out.println("Inserisci id extra etc etc:");
int idExtra=promptLine.readLine();
*/


/*
<EXTRA id="" tipo="" codiceStanza="" costo="" data="" />
*/
