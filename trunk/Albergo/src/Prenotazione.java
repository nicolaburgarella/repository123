
public class Prenotazione {
	private String dataCheckout;
	Camera camera;
	Gruppo gruppo;

	public Prenotazione(){

	}

	public Prenotazione(Camera camera,Gruppo gruppo, String dataCheckout){
		this.camera=camera;
		this.gruppo=gruppo;
		this.dataCheckout=dataCheckout;

		camera.setDisponibile(false);
		int i=gruppo.getCamerePrenotate()+1;
		gruppo.setCamerePrenotate(i);
	}


	Gruppo getGruppo(){
		return this.gruppo;
	}

	Camera getCamera(){
		return this.camera;
	}
}