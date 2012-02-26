import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;


public class Prenotazione {
	RegistroPrenotazioni rp=null;
	private int idPrenotazione=0;
	private String dataCheckout;
	Gruppo gruppo;
	int numeroCamerePrenotate=0;
	ArrayList<Camera> rcPrenotate=null;

	public Prenotazione(ArrayList<Camera> rcp, Gruppo g, String dataCheckout,int numeroCamerePrenotate){
		this.rcPrenotate=rcp;
		this.gruppo=g;
		this.dataCheckout=dataCheckout;
		this.numeroCamerePrenotate=numeroCamerePrenotate;
		//da rivedere come funziona il contatore delle camere prenotate 
		int i=gruppo.getNumCamerePrenotate()+this.numeroCamerePrenotate;
		gruppo.setNumCamerePrenotate(i);
		idPrenotazione++;

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
	
	public ArrayList<Camera> getRegistroPrenotazioni(){
		return registroPrenotazioni;
	}



}
