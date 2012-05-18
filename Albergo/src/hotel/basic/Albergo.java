package hotel.basic;

import hotel.model.extra.Extra;
import hotel.model.extra.RegistroExtra;
import hotel.model.group.Gruppo;
import hotel.model.group.RegistroGruppi;
import hotel.model.room.Camera;
import hotel.model.room.RegistroCamere;
import hotel.reservation.Prenotazione;
import hotel.reservation.RegistroPrenotazioni;

import java.io.*;
import java.io.ObjectInputStream.GetField;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Albergo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar gc=new GregorianCalendar();
		DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		String oggi=df.format(gc.getTime());
		
		boolean end=false;
		int scelta;
		boolean sbagliato;
		boolean continua=false;
		boolean exit=true;
		String buf = null;
		RegistroGruppi rg=new RegistroGruppi();
		RegistroExtra re=new RegistroExtra();
		RegistroCamere rc=new RegistroCamere();
		RegistroPrenotazioni rp=new RegistroPrenotazioni();
		re.caricaDaXML();
		rp.caricaDaXML();
		rc.caricaDaXML();
		rg.caricaDaXML();
		Prenotazione p =null;
		String sceltaOpzione="";
		Gruppo gruppo;
		String tipo="";
		String dataCheckout = null;
		int giorniPernottamento=0;
		double costoPernottamento;
		//RegistroPrenotazioni rp=null;
		//int posizione=0;


		do{
			do{
				sbagliato=false;
				
				System.out.println("Data odierna:\t "+gc.get(Calendar.DAY_OF_WEEK)+", "+gc.get(Calendar.DATE)+" / "+(gc.get(Calendar.MONTH)+1)+" / "+gc.get(Calendar.YEAR));
				System.out.println("Ora esatta:\t "+gc.get(Calendar.HOUR)+":"+gc.get(Calendar.MINUTE)+"\n\n");
				
				System.out.println("============GESTIONE ALBERGO============");
				System.out.println("1 - INSERISCI IL GRUPPO");
				System.out.println("2 - CERCA IL GRUPPO(per corrispondenza di id)");
				System.out.println("3 - INSERISCI GLI EXTRA");
				System.out.println("4 - CERCA GLI EXTRA(per corrispondenza di id)");
				System.out.println("5 - INSERISCI CAMERA");
				System.out.println("6 - CERCA CAMERE PER TIPOLOGIA LETTI(stampa elenco camere della tipologia selezionata)");
				System.out.println("7 - CERCA CAMERA PER EXTRA(stampa tutti gli extra della camera selezionata)");
				System.out.println("8 - CHECKIN:NUOVA PRENOTAZIONE");
				System.out.println("9 - CHECKOUT:PAGAMENTO PRENOTAZIONE(per gruppo,e gli extra per camera)ED ELIMINAZIONE DELLA PRENOTAZIONE");
				System.out.println("0 - ESCI\n\n");
				System.out.println("Inserire la scelta digitando l'apposito numero: ");
				try{
					BufferedReader promptLine=new BufferedReader(new InputStreamReader(System.in));
					sceltaOpzione=promptLine.readLine();

					if(!(sceltaOpzione.equals("0")||(sceltaOpzione.equals("1"))||(sceltaOpzione.equals("2"))||(sceltaOpzione.equals("3"))||(sceltaOpzione.equals("4"))||(sceltaOpzione.equals("5"))||(sceltaOpzione.equals("6"))||(sceltaOpzione.equals("7"))||(sceltaOpzione.equals("8"))||(sceltaOpzione.equals("9")||(sceltaOpzione).equals("")))){
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
				Gruppo g1 = new Gruppo();
				g1.InserisciGruppo();
				//g1=new Gruppo(g1.getNome(), g1.getDataArrivo(), g1.getAnticipoVersato(), g1.getSingole(), g1.getDoppie(), g1.getMatrimoniali());
				if(rg.inserisci(g1)){
					rg.salvaInXML();
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
				Gruppo g2=new Gruppo();
				g2.InserisciGruppo();
				//g2=new Gruppo(g2.getNome(), g2.getDataArrivo(), g2.getAnticipoVersato(), g2.getSingole(), g2.getDoppie(), g2.getMatrimoniali());
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
				Extra e1=new Extra();
				e1.InserisciExtra();
				//e1=new Extra(e1.getTipo(), e1.getCodiceCamera(), e1.getCostoExtra(), e1.getDataExtra());
				if(re.inserisci(e1)){
					re.salvaInXML();
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
						if(buf=="\n"){continua=false;}
					}while(!continua);
					break;
			}

			case 4:
			{
				System.out.println("Inserimento dati relativi all'extra da cercare. \n");
				Extra e2=new Extra();
				e2.InserisciExtra();
				//e2=new Extra(e2.getTipo(), e2.getCodiceCamera(), e2.getCostoExtra(), e2.getDataExtra());
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
				Camera c1=new Camera();
				c1.InserisciCamera();
				//c1=new Camera(c1.getId(), c1.getDescrizione(), c1.isDisponibile());
				if(rc.inserisci(c1)){
					rc.salvaInXML();
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
					if(buf=="\n"){continua=false;}
				}while(!continua);
				break;
			}

			case 8:
			{
				int posizione=0;
				do{
					System.out.println("Inserimento dati relativi alle camere da prenotare:\n+Inserisci il codice della camera : ");
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
					posizione=rc.cercaIdCamera(idCamera);
					if(posizione>0){
						if(rc.getCamera(posizione).isSingola()){
							int idCSD[]=rc.getIdCamereSingoleDisponibili();
							for(int i=0;i<idCSD.length;i++){
								System.out.println(idCSD[i]);
								if(idCSD[i]==idCamera){
									System.out.println("id trovato e corrisponde!");
								}
							}
						}

						if(rc.getCamera(posizione).isDoppia()){
							int idCDD[]=rc.getIdCamereDoppieDisponibili();
							for(int i=0;i<idCDD.length;i++){
								System.out.println(idCDD[i]);
								if(idCDD[i]==idCamera){
									System.out.println("id trovato e corrisponde!");
								}
							}
						}
						
						if(rc.getCamera(posizione).isMatrimoniale()){
							int idCMD[]=rc.getIdCamereMatrimonialiDisponibili();
							for(int i=0;i<idCMD.length;i++){
								System.out.println(idCMD[i]);
								if(idCMD[i]==idCamera){
									System.out.println("id trovato e corrisponde!");
								}
							}
						}
						
						Camera c=rc.getCamera(posizione);
						p.getRegistroCamerePrenotate().add(c);
						rp.salvaInXML();
						System.out.println("Camera trovata: ");
						System.out.println(c);
						System.out.println("\n\n");
						
						do{
							System.out.println("Premi QUIT per terminare l'inserimento delle camere");
							try {
								buf=promptLine.readLine();
								buf.toUpperCase();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							if(buf=="QUIT"){continua=true;}
							else{//break;
								
							}
						}while(!continua);
						
						if(posizione==-1){
							System.out.println("Camera non disponibile perchè già prenotata");
						}
						if(posizione==-2){
							System.out.println("Camera non trovata");
						}
					}
	
				}while(continua);
					
				System.out.println("Inserimento dati relativi al gruppo da cercare: ");
					Gruppo g = new Gruppo();
					g.InserisciGruppo();
					//g=new Gruppo(g.getNome(), g.getDataArrivo(), g.getAnticipoVersato(), g.getSingole(), g.getDoppie(), g.getMatrimoniali());
					int trovato=rg.cerca(g.getId());
					if(trovato!=-1){
						Gruppo g1=null;
						g1=rg.getGruppo(trovato);
						if(g1.getNumCamerePrenotate()<=10-1){//max 10 camere prenotate
						System.out.println("quanti giorni si vuol alloggiare?");
						try {
							buf=promptLine.readLine();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						giorniPernottamento=Integer.parseInt(buf);
						GregorianCalendar gc1=new GregorianCalendar();
						gc1.add(GregorianCalendar.DATE,+giorniPernottamento);
						dataCheckout=df.format(gc1);
						p=new Prenotazione(g1, dataCheckout,giorniPernottamento);
						rp.inserisci(p);
						System.out.println("Prenotazione effettuata con successo");
						System.out.println("Ecco l'elenco delle camere prenotate");
						p.stampaCamerePrenotate();
						}
						else{
							System.out.println("Il gruppo non può prenotare cs tante camere (può prenotarne al massimo 10)");
						}
					}
					else{
						System.out.println("gruppo non trovato");
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
				System.out.println("Inserisci il codice del gruppo per il pagamento: ");
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
				
				for(int i=0;i<rp.getRegistroPrenotazioni().size();i++){
					if((rp.getRegistroPrenotazioni().get(i).getGruppo().getId()==idGruppo)&&!(rp.getRegistroPrenotazioni().get(i).getRegistroCamerePrenotate().isEmpty())){
						System.out.print("Gruppo trovato,ecco la sua prenotazione: ");
						rp.getRegistroPrenotazioni().get(i).toString();
						System.out.println("Pagamento camere usate nel pernottamento:");
						int singole=rp.getRegistroPrenotazioni().get(i).getGruppo().getSingole();
						int doppie=rp.getRegistroPrenotazioni().get(i).getGruppo().getDoppie();
						int matrimoniali=rp.getRegistroPrenotazioni().get(i).getGruppo().getMatrimoniali();
						//System.out.println("Il gruppo deve pagare:\n Camere singole\t"+Camera.costoSingola*singole*giorniPernottamento+"euro \n"+"Camere doppie\t"+Camera.costoDoppia*doppie*giorniPernottamento+"euro \n"+"Camere matrimoniali\t"+Camera.costoMatrimoniale*matrimoniali*giorniPernottamento+"euro \n\n");
						//costoPernottamento=(Camera.costoSingola*singole+Camera.costoDoppia*doppie+Camera.costoMatrimoniale*matrimoniali)*giorniPernottamento;
						//System.out.println("Per un costo complessivo (extra esclusi) di "+costoPernottamento+" euro\n\n\n");
						
						//controllo ogni camera della prenotazione e verifico se ha usufruito degli extra che stamperò singolarmente raggruppati per camera
						System.out.println("Passiamo ora al pagamento degli extra da addebitare a chi ha usufruito della camera che lo ha richiesto");
						for(int j=0;j<rp.getRegistroPrenotazioni().get(i).getRegistroCamerePrenotate().size();j++){
							rp.getRegistroPrenotazioni().get(i).getRegistroCamerePrenotate().get(j).stampaTotExtrasDellaCamera();
							System.out.println("somma dei costi della camera da fare in extra o qui.");
													
						}
							
						System.out.println("Ora posso eliminare la prenotazione");
						rp.rimuoviPrenotazione(i);
						System.out.println("Prenotazione rimossa con successo");	
					}
					else{
						System.out.println("Prenotazione non trovata");
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

			case 0:
			{
				re.salvaInXML();
				//re.salvaInMYSQL();
				rg.salvaInXML();
				//rg.salvaInMYSQL();
				rc.salvaInXML();
				rp.salvaInXML();
				end=true;
				//un exit(0) in java System.exit(0); oppure ancora
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

