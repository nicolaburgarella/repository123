import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.Map;
import java.util.TreeMap;


public class Camera {
	
	private int id=0;
	private String descrizione="";
	private int singola=0;
	static double costoSingola=40;
	static double costoDoppia=70;
	static double costoMatrimoniale=80;
				
	private int doppia=0;
	private int matrimoniale=0;
	private boolean disponibile=true;
	private String flagDisp="";
	Extra extra=null;
	private ArrayList <Extra> registroExtraDellaCamera=null;
	
	public Camera(){

	}
//da togliere il costruttore non può avere un'istanza extra,potrebbe averne molte
//Costruttore che inizializza tutti i parametri di uso[tranne la composizione,che gestisco nella classe,ma separatamente]
//per ora ho inserito anche l'oggetto extra nel costruttore per comodità,può darsi che sia utile in futuro
	public Camera(int id,Extra extra,String descrizione,boolean disp){
		this.id=id;
		this.extra=extra;
		this.descrizione=descrizione;
		this.disponibile=disponibile;
	}

//Come sopra ma senza extra
	public Camera(int id, String descrizione,boolean disp){
		this.id=id;
		this.descrizione=descrizione;
		this.disponibile=disponibile;
	}

/*
	public Camera(RegistroExtra re){
		RegistroExtra registroExtra=re;
		}
*/	
	
//Verifica sulla tipologia di camera
	public boolean isSingola(){
		if(this.singola != 0){
			return true; 
		}
		else {
			return false;
		}
	}
	
	public boolean isDoppia(){
		if(this.doppia != 0){
			return true; 
		}
		else {
			return false;
		}
	}
	
	public boolean isMatrimoniale(){
		if(this.matrimoniale != 0){
			return true; 
		}
		else {
			return false;
		}
	}
	
	//settaggio base sul tipo di camera
	public void setSingola(){
		this.singola=1;
		this.doppia=0;
		this.matrimoniale=0;
	}
	
	public void setDoppia(){
		this.singola=0;
		this.doppia=1;
		this.matrimoniale=0;
	}
	
	public void setMatrimoniale(){
		this.singola=0;
		this.doppia=0;
		this.matrimoniale=1;
	}

/*
	public void setId(int id){
		this.id=id;
	}
*/
	public int getId(){
		return this.id;
	}

	public void setIncrId(){
		this.id++;
	}

/*da togliere la camera può avere piu extra setter e getter di extra,della descrizione della camera 
	public void setExtra(Extra extra){
		this.extra=extra;
	}

	public Extra getExtra(){
		return this.extra;
	}
*/
	
	public ArrayList<Extra> getRegistroExtraDellaCamera(){
		return this.registroExtraDellaCamera;
	}
	
	//l'uso di questo arraylist in camera potrebbe sembrare inutile dato che fa la copia(da vedere come e dove nel programma)dell'arraylist registroextra
	//tutavia è essenziale dato che non sarebbe possibile fare la ricerca semplice degli extra per camera direttamente dal registroExtra,in quanto
	//una camera può avere +extra.
	public void setRegistroExtraDellaCamera(ArrayList<Extra> re){
		this.registroExtraDellaCamera=re;
	}
	
	public boolean isExtrainRegistroExtraDellaCamera(Extra extra){
		for(int i=0; i<registroExtraDellaCamera.size();i++){
			if(registroExtraDellaCamera.get(i)==extra){
				return true;
			}
		}
		return false;
	}
	
	//stampa tutti gli extra di ogni camera
	public void stampaTotExtrasDellaCamera(){
		for(int i=0;i<registroExtraDellaCamera.size();i++){
			registroExtraDellaCamera.get(i).toString();
		}
	}

	
	public void stampaCamerePrenotate(){
		for(int i=0;i<registroExtraDellaCamera.size();i++){
			registroExtraDellaCamera.get(i).toString();
		}
	}


//utile per stampare al salvataggio in xml della camera se la camera ha già richiesto extra
	public String isExtras(){
		if(!registroExtraDellaCamera.isEmpty()){
			return "SI";
		}
		else{
			return "NO";
		}
	}

	public void setDescrizione(String altro){
		this.descrizione=altro;
	}

	public String getDescrizione(){
		return this.descrizione;

	}


//Verifica della disponibilità della camera
	public void setDisponibile(boolean d){
		this.disponibile=d;
	}

	public boolean isDisponibile(){
		return disponibile;
	}


//utile per stampare al salvataggio in xml della camera se la camera è disponibile
	public String flagToDisp(){
		if(disponibile=true){
			flagDisp="SI";
		}
		else{
			flagDisp="NO";
		}
		return flagDisp;
	}

//metodo comodo per stampare a video tutta la struttura dell'istanza camera 
	public String toString(){
		return "Codice Camera :"+this.id+"\n"+"Extra da addebitare: \t"+this.isExtras()+"\n"+"Descrizione stanza: \t"+this.descrizione+"\n"+"Disponibile ora: \t"+this.flagToDisp()+"\n";
		}

//chiamato dalla classe main,si interfaccia con l'operatore per l'inserimento dei dati della camera(no id,no extra,si a composizione, descrizione, disponibilità)
	public void InserisciCamera(){
		try{
            BufferedReader promptLine=new BufferedReader(new InputStreamReader(System.in));
            boolean continua=true;
            extra=null;
            disponibile=true;
            while(continua){
                    /*System.out.println("Inserisci l'id della camera:(END per terminare)");
                    this.id=Integer.parseInt(promptLine.readLine());
                    if(promptLine.readLine().equals("END")){
                            break;
                    }*/

                    System.out.println("Specifica se è singola,doppia o matrimoniale: [0:singola][1:doppia][2:matrimoniale] ");
                    int choice=Integer.parseInt(promptLine.readLine());
                    try{
                    	if(choice==0){
                    		this.setSingola();
                    	}
                    	if(choice==1){
                    		this.setDoppia();
                    	}
                    	if(choice==0){
                    		this.setMatrimoniale();
                    	}
                    }catch(IllegalFormatException ife){
                    	ife.printStackTrace();
                    }
                    
                    System.out.println("Inserisci una descrizione della stanza:(END per terminare)");
                    this.descrizione=promptLine.readLine();
                    if(descrizione.equals("END")){
                            break;
                    }
                    else {
                        System.out.println("descrizione inserita correttamente");
                    }
                    
                    this.setDisponibile(true);
            }
            }catch(IOException ioe){
                    ioe.printStackTrace();
            }
            finally{
            	    System.out.println("La camera è stata compilata correttamente.");//va ora istanziata nel main
            }
	}


}
