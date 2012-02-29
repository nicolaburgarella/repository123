import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;


public class Prenotazione {
	RegistroPrenotazioni rp=null;
	private int idPrenotazione=0;
	private String dataCheckout;
	Gruppo gruppo;
	int numeroCamerePrenotate=0;
	int giorniPernottamento=0;
	private ArrayList<Camera> registroCamerePrenotate=null;

	public Prenotazione(Gruppo g, String dataCheckout,int giorniPernottamento){
		this.gruppo=g;
		this.dataCheckout=dataCheckout;
		this.giorniPernottamento=giorniPernottamento;
		//da rivedere come funziona il contatore delle camere prenotate 
		int i=gruppo.getNumCamerePrenotate()+this.numeroCamerePrenotate;
		gruppo.setNumCamerePrenotate(i);
		idPrenotazione++;
	}
	
	public ArrayList <Camera> getRegistroCamerePrenotate(){
		return this.registroCamerePrenotate;
	}
	
	public void setRegistroCamerePrenotate(ArrayList<Camera> rcp){
		this.registroCamerePrenotate=rcp;
	}
	
	public void stampaCamerePrenotate(){
		for(int i=0;i<registroCamerePrenotate.size();i++){
			registroCamerePrenotate.get(i).toString();
		}
	}
	
	public String toString(){
		return "Prenotazione relativa al gruppo "+gruppo.getId()+" per un numero totale di "+this.giorniPernottamento+" giorni.Nella data di checkout "+this.dataCheckout+" le camere devono essere liberate";
	}

/*
		setCamerePrenotateNonDisp();
		int i=gruppo.getNumCamerePrenotate()+numeroCamerePrenotate;
		gruppo.setNumCamerePrenotate(i);

	}
*/

/*
	public void setCamerePrenotateNonDisp(){
		for(int i=0;i<camereP.length;i++){
			for(int j=0;j<rc.getRegistroCamere().size();i++){
				if(camereP[i]==rc.getRegistroCamere().get(j).getId()){
					rc.getCamera(i).setDisponibile(false);
				}
			}
		}
	}
*/


	Gruppo getGruppo(){
		return this.gruppo;
	}
	


}
