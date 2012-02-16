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

	public Extra(){

	}

	public Extra(int id,String tipo,int idCamera,double costoExtra,String dataExtra){
		this.id=id;
		this.tipo=tipo;
		this.idCamera=idCamera;
		this.costoExtra=costoExtra;
		this.dataExtra=dataExtra;

	}

	public Extra(String tipo,int idCamera,double costoExtra,String dataExtra){
		this.tipo=tipo;
		this.idCamera=idCamera;
		this.costoExtra=costoExtra;
		this.dataExtra=dataExtra;

	}

	public void setIncrId(){
		this.id++;
	}

	public void setId(int id){
		this.id=id;
	}


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

	public String toString(){
		return "Codice Extra :"+id+"\n"+"Tipo di extra: \t"+tipo+"\n"+"CodiceCamera: \t"+idCamera+"\n"+"Importo Singolo Extra:: \t"+costoExtra+"\n";
	}

	public String getDataExtra(){
		return this.dataExtra;
	}


	public void InserisciExtra(){
		try{
            BufferedReader promptLine=new BufferedReader(new InputStreamReader(System.in));
            boolean continua=true;
            while(continua){

            		System.out.println("Inserisci la data odierna (END per terminare):");//bisogna automatizzarla a qlla attuale gg:mm:aa: \t ora
            		this.dataExtra=promptLine.readLine();
            		if(dataExtra.equals("END")){
                        break;
            		}

            		System.out.println("Inserisci il numero di stanza: (END per terminare) ");
            		this.idCamera=Integer.parseInt(promptLine.readLine());
            		if (rc.cercaIdCamera(idCamera)>0){
            			System.out.println("La camera inserita è stata riconosciuta");
            		}
            		else{
            			System.out.println("E' stata inserita un numero di camera errato");
            			break;
            		}

                    System.out.println("Inserisci la tipologia di costo extra giornaliero:[0:internet][1:assistenza medica][2:servizio bar][3:servizio ristorante][4:nessun extra](END per terminare)");
                    this.tipo=promptLine.readLine();
                    this.tipo.toUpperCase();
                    if(tipo.equals("END")){
                            break;
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
                    	break;
                    }

            }
  //sono fuori dal while..che faccio..mi arrivano qui tutti gli errori,poi presi dal catch
       }
		catch(IOException ioe){
			ioe.printStackTrace();
			}
		catch(IllegalFormatException ife){
			ife.printStackTrace();
		}
		finally{
			//Extra extra=new Extra(..,..,..,...,..)
			System.out.println("l'extra giornaliero è stato inserito correttamente da tastiera.");
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
