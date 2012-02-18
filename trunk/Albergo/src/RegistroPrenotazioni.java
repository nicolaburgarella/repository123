import java.util.ArrayList;

public class RegistroPrenotazioni {
	private ArrayList<Prenotazione> registroPrenotazioni=new ArrayList<Prenotazione>();

	public RegistroPrenotazioni(){
		registroPrenotazioni.clear();
	}

	public boolean inserisci(Prenotazione p){
		registroPrenotazioni.add(p);
		return true;
	}

	public int cerca(int idCamera,Gruppo gruppo){
		for(int i=0;i<registroPrenotazioni.size();i++){
			if((registroPrenotazioni.get(i).getCamera().getId()==idCamera)&&
					(registroPrenotazioni.get(i).getGruppo().getId()==gruppo.getId())){
				return i;
			}
		}
		return -1;
	}

	public void rimuoviPrenotazione(int posizione){
		registroPrenotazioni.get(posizione).getCamera().setDisponibile(true);
		int numCamerePrenotate=(registroPrenotazioni.get(posizione).getGruppo().getNumCamerePrenotate());
		registroPrenotazioni.get(posizione).getGruppo().setNumCamerePrenotate(0);
		//da rivedere!
		registroPrenotazioni.remove(posizione);
	}
}
