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
		String buf = null;
		RegistroGruppi rg=new RegistroGruppi();
		RegistroExtra re=new RegistroExtra();
		re.caricaDaXML();
		rg.caricaDaXML();
		RegistroCamere rc=new RegistroCamere();
		RegistroPrenotazioni rp=new RegistroPrenotazioni();
		String sceltaOpzione="";
		Gruppo gruppo;

		do{
			do{
				sbagliato=false;
				System.out.println("============GESTIONE ALBERGO============");
				System.out.println("1 - INSERISCI IL GRUPPO");
				System.out.println("2 - CERCA IL GRUPPO");
				System.out.println("3 - INSERISCI GLI EXTRA");
				System.out.println("4 - CERCA GLI EXTRA");
				System.out.println("5 - INSERISCI CAMERA");
				System.out.println("6 - CERCA CAMERA PER COMPOSIZIONE LETTO/I");
				System.out.println("7 - CERCA CAMERA PER EXTRA");
				System.out.println("8 - NUOVA PRENOTAZIONE");
				System.out.println("9 - ELIMINA PRENOTAZIONE");
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
						if(buf=="\n"){continua=true;break;}
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
				System.out.println("Inserimento dati relativi all'extra da inserire: \n");
				Extra e1=null;
				e1.InserisciExtra();
				e1=new Extra(e1.getTipo(), e1.getCodiceCamera(), e1.getCostoExtra(), e1.getDataExtra());
				if(re.inserisci(e1)){
					System.out.println("Extra inserito correttamente.");
				}
				else{
					System.out.println("Extra gia' presente nel registroExtra.Inserimento non avvenuto.");
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
				Camera c1= new Camera(re);
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
				//dimmi quali sono le camere con singola o doppia o matrimoniale||dimmi se quella camera è singola o doppia o altro
				System.out.println("Inserimento dati relativi alla camera da cercare per composizione camera. \n");


			}

			case 7:
			{
				//dimmi se la camera inserita è singola doppia o matrimoniale


			}


		}

	}while(true);

}
}
