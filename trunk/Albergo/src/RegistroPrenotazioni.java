import java.util.ArrayList;

public class RegistroPrenotazioni {
	private ArrayList<Prenotazione> registroPrenotazioni=new ArrayList<Prenotazione>();
	RegistroCamere rc=null;
	ArrayList<Camera> rcPrenotate=null;

	public RegistroPrenotazioni(){
		registroPrenotazioni.clear();
	}


	public boolean inserisci(Prenotazione p){
		registroPrenotazioni.add(p);
		return true;
	}

	//in cerca non confronta sia il gruppo sia l'array delle camere prenotate,suppongo che il gruppo può fare al massimo una prenotazione,come di fatto è 
	public int cerca(Gruppo gruppo){
		for(int i=0;i<registroPrenotazioni.size();i++){
			if(registroPrenotazioni.get(i).getGruppo().getId()==gruppo.getId()){
				return i;
				}
		}
		return -1;
	}

	/*
	public void rimuoviPrenotazione(int posizione){
		for(int i=0;i<rcPrenotate.size();i++){
			
		}
		
		registroPrenotazioni.get(posizione).getCamera().setDisponibile(true);
		int numCamerePrenotate=(registroPrenotazioni.get(posizione).getGruppo().getNumCamerePrenotate());
		registroPrenotazioni.get(posizione).getGruppo().setNumCamerePrenotate(0);
		//da rivedere!
		registroPrenotazioni.remove(posizione);
	}
	*/
	
	public ArrayList<Prenotazione> getCamerePrenotate(){
		return registroPrenotazioni;
	}

		
}
