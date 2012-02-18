import java.io.*;
import java.io.ObjectInputStream.GetField;
import java.util.*;

public class Albergo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean end=false;
		int scelta;
		boolean sbagliato;
		boolean continua=false;
		boolean exit=true;
		String buf = null;
		RegistroGruppi rg=new RegistroGruppi();
		RegistroExtra re=new RegistroExtra();
		re.caricaDaXML();
		rg.caricaDaXML();
		RegistroCamere rc=new RegistroCamere();
		RegistroPrenotazioni rp=new RegistroPrenotazioni();
		String sceltaOpzione="";
		Gruppo gruppo;
		String tipo="";
		String dataCheckout = null;
		int giorniPernottamento=0;
		double costoGiornalieroBaseACamera=60.0;


		do{
			do{
				sbagliato=false;
				System.out.println("============GESTIONE ALBERGO============");
				System.out.println("1 - INSERISCI IL GRUPPO");
				System.out.println("2 - CERCA IL GRUPPO(per corrispondenza di id)");
				System.out.println("3 - INSERISCI GLI EXTRA");
				System.out.println("4 - CERCA GLI EXTRA(per corrispondenza di id)");
				System.out.println("5 - INSERISCI CAMERA");
				System.out.println("6 - CERCA CAMERE PER TIPOLOGIA LETTI(stampa elenco camere della tipologia selezionata)");
				System.out.println("7 - CERCA CAMERA PER EXTRA(stampa tutti gli extra della camera selezionata)");
				System.out.println("8 - NUOVA PRENOTAZIONE");
				System.out.println("9 - PAGAMENTO PRENOTAZIONE(per gruppo,e gli extra per camera)");
				System.out.println("10 - ELIMINA PRENOTAZIONE");
				System.out.println("0 - ESCI\n\n");
				System.out.println("Inserire la scelta digitando l'apposito numero: ");
				try{
					BufferedReader promptLine=new BufferedReader(new InputStreamReader(System.in));
					sceltaOpzione=promptLine.readLine();

					if(!(sceltaOpzione.equals("0")||(sceltaOpzione.equals("1"))||(sceltaOpzione.equals("2"))||(sceltaOpzione.equals("3"))||(sceltaOpzione.equals("4"))||(sceltaOpzione.equals("5"))||(sceltaOpzione.equals("6"))||(sceltaOpzione.equals("7"))||(sceltaOpzione.equals("8"))||(sceltaOpzione.equals("9")))){
						sbagliato=true;
						System.out.println("E' stata scelta un'opzione non valida riprova");
						break;
					}
				}
				catch(IOException ioe){
					ioe.printStackTrace();
				}
			}while(sbagliato);
			scelta=Integer.parseInt(sceltaOpzione);
			BufferedReader promptLine=new BufferedReader(new InputStreamReader(System.in));
			try {
				sceltaOpzione=promptLine.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			switch(scelta){
			case 1:
			{
				System.out.println("Inserimento dati relativi al gruppo da inserire: \n");
				Gruppo g1 = null;
				g1.InserisciGruppo();
				g1=new Gruppo(g1.getNome(), g1.getDataArrivo(), g1.getAnticipoVersato(), g1.getSingole(), g1.getDoppie(), g1.getMatrimoniali());
				if(rg.inserisci(g1)){
					System.out.println("Gruppo inserito correttamente");
				}
				else{
					do{
						System.out.println("Gruppo già presente nel registro,inserimento non avvenuto\n\n");
						System.out.println("Premi ENTER per continuare");
						try {
							buf=promptLine.readLine();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						if(buf=="\n"){continua=true;}
					}while(!continua);
				}
				break;
			}

			case 2:
			{
				System.out.println("Inserimento dati relativi al gruppo da cercare. \n");
				Gruppo g2=null;
				g2.InserisciGruppo();
				g2=new Gruppo(g2.getNome(), g2.getDataArrivo(), g2.getAnticipoVersato(), g2.getSingole(), g2.getDoppie(), g2.getMatrimoniali());
				int trovato=rg.cerca(g2.getId());
				if(trovato!=-1||trovato!=0){
					System.out.println("Gruppo trovato");
					g2=rg.getGruppo(trovato);
					System.out.println(g2);
				}
				else{
					System.out.println("Gruppo non trovato");
				}
				do{
					System.out.println("Premi ENTER per continuare");
					try {
						buf=promptLine.readLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(buf=="\n"){continua=true;}
				}while(!continua);
				break;
			}

			case 3:
			{
				while(!exit){
				System.out.println("Inserimento dati relativi all'extra da inserire: \n");
				if(rc.isRegistroCamereVuoto()){
					System.out.println("Prima di inserire un extra è necessario che ci sia almeno una camera salvata");
					exit=true;
				}
				Extra e1=null;
				e1.InserisciExtra();
				e1=new Extra(e1.getTipo(), e1.getCodiceCamera(), e1.getCostoExtra(), e1.getDataExtra());
				if(re.inserisci(e1)){
					System.out.println("Extra inserito correttamente.");
				}
				else{
					System.out.println("Extra gia' presente nel registroExtra.Inserimento non avvenuto.");
				}
				}
					do{
						System.out.println("Premi ENTER per continuare");
						try {
							buf=promptLine.readLine();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						if(buf=="\n"){continua=true;}
					}while(!continua);
					break;
			}

			case 4:
			{
				System.out.println("Inserimento dati relativi all'extra da cercare. \n");
				Extra e2=null;
				e2.InserisciExtra();
				e2=new Extra(e2.getTipo(), e2.getCodiceCamera(), e2.getCostoExtra(), e2.getDataExtra());
				int trovato=re.cerca(e2.getId());
				if(trovato!=-1||trovato!=0){
					System.out.println("Extra trovato");
					e2=re.getExtra(trovato);
					System.out.println(e2);
				}
				else{
					System.out.println("Extra non trovato");
				}
				do{
					System.out.println("Premi ENTER per continuare");
					try {
						buf=promptLine.readLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(buf=="\n"){continua=true;}
				}while(!continua);
				break;
			}

			case 5:
			{
				System.out.println("Inserimento dati relativi alla camera da inserire: \n");
				Camera c1=null;
				c1.InserisciCamera();
				c1=new Camera(c1.getId(), c1.getDescrizione(), c1.isDisponibile());
				if(rc.inserisci(c1)){
					System.out.println("Camera inserita correttamente\n");
				}
				else{
					System.out.println("Camera con id già presente nel registro.Inserimento non avvenutio");
				}
				do{
					System.out.println("Premi ENTER per continuare");
					try {
						buf=promptLine.readLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(buf=="\n"){continua=true;}
				}while(!continua);
				break;
			}

			case 6:
			{
				//cerca camera per tipologia,cioè dimmi quali sono le camere con singola o doppia o matrimoniale
				do{
				System.out.println("Inserimento dati relativi alle camere da cercare. \n");
				System.out.println("Inserisci la tipologia di camere che si vuol selezionare");
				try {
					tipo=promptLine.readLine();
					tipo.toUpperCase();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(tipo.equals("SINGOLA")){
					rc.stampaSingoleDisp();
				}
				if(tipo.equals("DOPPIA")){
					rc.stampaDoppieDisp();
				}
				if(tipo.equals("MATRIMONIALE")){
					rc.stampaMatrimonialiDisp();
				}

				else{
					System.out.println("E' stato scritto un tipo inesistente: una camera può essere o singola o doppia o matrimoniale,riprova");
					continua=false;}

				}while(continua);

				do{
					System.out.println("Premi ENTER per continuare");
					try {
						buf=promptLine.readLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(buf=="\n"){continua=true;}
				}while(!continua);
				break;
			}

			case 7:
			{
				System.out.println("Ricerca degli extra di una camera passata come parametro. \n");
				String camera = null;
				try {
					camera = promptLine.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int c=Integer.parseInt(camera);
				re.stampaExtraByIdCamera(c);
				do{
					System.out.println("Premi ENTER per continuare");
					try {
						buf=promptLine.readLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(buf=="\n"){continua=true;}
				}while(!continua);
				break;
			}

			case 8:
			{
				System.out.println("Inserimento dati relativi alla camera da prenotare:\n+Inserisci il codice della camera: ");
				int idCamera = 0;
				try {
					idCamera = Integer.parseInt(promptLine.readLine());
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int posizione=rc.cercaIdCamera(idCamera);
				if(posizione>0){
					Camera c=rc.getCamera(posizione);
					System.out.println("Camera trovata: ");
					System.out.println(c);
					System.out.println("\n\n");
					System.out.println("Inserimento dati relativi al gruppo da cercare: ");
					Gruppo g = null;
					g.InserisciGruppo();
					g=new Gruppo(g.getNome(), g.getDataArrivo(), g.getAnticipoVersato(), g.getSingole(), g.getDoppie(), g.getMatrimoniali());
					int trovato=rg.cerca(g.getId());
					if(trovato!=-1){
						Gruppo g1=null;
						g1=rg.getGruppo(trovato);
						if(g1.getNumCamerePrenotate()<=10-1){//max 10 camere prenotate
						System.out.println("quanti giorni si vuol alloggiare? [0: 5giorni][1: 7giorni][][]");
						giorniPernottamento=1;
						//oppure basta che sia meno di un mese e ho la stringa(da far diventare time) poi da convertire nel giorno del checkout
						dataCheckout="5";
						Prenotazione p=new Prenotazione(c, g1, dataCheckout,g1.getNumCamerePrenotate());
						rp.inserisci(p);
						System.out.println("Prenotazione effettuata con successo");
						}
						else{
							System.out.println("Il gruppo non può prenotare cs tante camere (può prenotarne al massimo 10)");
						}
					}
					else{
						System.out.println("gruppo non trovato");
					}
				}
				if(posizione==-1){
					System.out.println("Camera non disponibile perchè già prenotata");
				}
				if(posizione==-2){
					System.out.println("Camera non trovata");
				}
				else{

				}

					do{
						System.out.println("Premi ENTER per continuare");
						try {
							buf=promptLine.readLine();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						if(buf=="\n"){continua=true;}
					}while(!continua);
					break;
				}
			case 9:
			{
				System.out.println("Pagamento della prenotazione del gruppo e degli extra relativi alle singole camere");
				System.out.println("I giorni di pernottamento sono stati "+giorniPernottamento+" per un costo giornaliero a camera di "+costoGiornalieroBaseACamera+ "per un totale di euro: "+(costoGiornalieroBaseACamera*giorniPernottamento));
				System.out.println("Ricercare tutte le camere del gruppo");
				System.out.println("stampa tutti gli extra per quelle camere");
				//in prenotazione non posso passargli un'istanza camera,va rifatto e ritestato...


			}

			case 10:
			{
				System.out.println("Inserimento dati delle camere da rilassciare,eliminare la prenotazione");
				System.out.println("Inserisci il codice di camera: ");
				int idCamera = 0;
				try {
					idCamera = Integer.parseInt(promptLine.readLine());
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Inserisci il codice del gruppo: ");
				int idGruppo = 0;
				try {
					idGruppo = Integer.parseInt(promptLine.readLine());
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int trovato=rp.cerca(idCamera,gruppo);//devo implementare un cerca che passandogli una camera e il gruppo torva tt le camere intestate al gruppo
				if(trovato>=0){
					rp.rimuoviPrenotazione(trovato);
					System.out.println("Prenotazione rimossa con successo");
				}
				else{
					System.out.println("Prestito non trovato");
				}
				do{
					System.out.println("Premi ENTER per continuare");
					try {
						buf=promptLine.readLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(buf=="\n"){continua=true;}
				}while(!continua);
				break;
			}

			case 0:
			{
				re.salvaInXML();
				//re.salvaInMYSQL();
				rg.salvaInXML();
				//rg.salvaInMYSQL();
				//rc.salva??
				//rp.salva??
				end=true;
				//un exit(0) in java; oppure ancora
				/*
				 * do{
					System.out.println("Premi ENTER per continuare");
					try {
						buf=promptLine.readLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(buf=="\n"){continua=true;}
				}while(!continua);
				break;
				 * */
			}
			default:
			{
				do{
					System.out.println("Premi ENTER per continuare");
					try {
						buf=promptLine.readLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(buf=="\n"){continua=true;}
				}while(!continua);
				break;
			}
		}
	}while(!end);
}
}

