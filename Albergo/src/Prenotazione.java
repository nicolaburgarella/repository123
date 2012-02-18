import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;


public class Prenotazione {
	private String dataCheckout;
	private Map camereGruppo = new TreeMap();
	public int[] camereP=null;
	Gruppo gruppo;
	int numeroCamerePrenotate=0;
	RegistroCamere rc=null;

	public Prenotazione(){

	}

	public Prenotazione(int[] camereP,Gruppo gruppo, String dataCheckout,int numeroCamerePrenotate){
		this.camereP=camereP;
		this.gruppo=gruppo;
		this.numeroCamerePrenotate=numeroCamerePrenotate;
		this.dataCheckout=dataCheckout;
		setCamerePrenotateNonDisp();
		/*
		int i=gruppo.getNumCamerePrenotate()+numeroCamerePrenotate;
		gruppo.setNumCamerePrenotate(i);
		*/
	}

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

	public void addInCamereP(int idCameraPrenotata){
		for(int j=0;j<rc.getRegistroCamere().size();j++){
			for(int i=0;i<camereP.length;i++){
				if(rc.getRegistroCamere().get(j).getId()==idCameraPrenotata){
					camereP[i]=idCameraPrenotata;
				}
			}
		}
	}

	public void assegnaCamereAGruppo(Gruppo g){
		//if(g.getSingole()){
			camereGruppo.put("SINGOLA", XXX);
			rc.setDecrTotSingoleDisp();//-->ci vorrebbe una cazzo di pila,arraylist abdrebbe bene


		}

		if(g.getDoppie()<=this.getTotDoppieDisp()){


		}
		if(g.getMatrimoniali()<=this.getTotMatrimonialiDisp()){


		}


	}





	Gruppo getGruppo(){
		return this.gruppo;
	}

    public int[] getCamereP(){
        return this.camereP;
    }



}
