package hotel.reservation;
import hotel.model.group.Gruppo;
import hotel.model.room.Camera;
import hotel.model.room.RegistroCamere;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;


public class Prenotazione {
	RegistroPrenotazioni rp=null;
	RegistroCamere rc=null;
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
		//da rivedere le due righe sotto per funziona il contatore delle camere prenotate e soprattuto se è davvero utile(penso di no visto che ho un controllo totale con un arraylist delle camere prenotate) 
		int i=gruppo.getNumCamerePrenotate()+this.numeroCamerePrenotate;
		gruppo.setNumCamerePrenotate(i);
		this.idPrenotazione++;
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
	
	public void setCamerePrenotateNonDisp(){
		for(int i=0;i<registroCamerePrenotate.size();i++){
			registroCamerePrenotate.get(i).setDisponibile(false);
			for(int j=0;j<rc.getRegistroCamere().size();j++){
				if(registroCamerePrenotate.get(i)==rc.getRegistroCamere().get(j)){
					rc.getRegistroCamere().get(j).setDisponibile(false);
				}
			}
		}
	}
	
	public void setCamerePrenotateDisp(){
		for(int i=0;i<registroCamerePrenotate.size();i++){
			registroCamerePrenotate.get(i).setDisponibile(true);
			for(int j=0;j<rc.getRegistroCamere().size();j++){
				if(registroCamerePrenotate.get(i)==rc.getRegistroCamere().get(j)){
					rc.getRegistroCamere().get(j).setDisponibile(true);
				}
			}
		}
	}
	
	public Gruppo getGruppo(){
		return this.gruppo;
	}
	
	public String getDataCheckout(){
		return this.dataCheckout;
	}
	
	public int getGiorniPernottamento(){
		return this.giorniPernottamento;
	}
	


}
