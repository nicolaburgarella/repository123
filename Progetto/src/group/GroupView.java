package group;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

import hotel.Hotel;

public class GroupView {

private int groupId;
private boolean trovato=false;

public GroupView(){
	
}

public GroupView(Hotel h){
	Hotel hotel = new Hotel();
	hotel=h;
	System.out.println(h);
	boolean sbagliato=false;
	int scelta;
	String sceltaOpzione="";
	boolean exit=false;
	
	System.out.println("BENVENUTO NELLA SEZIONE DEI GRUPPI E DELLE RISPETTIVE RICHIESTE DI PERNOTTAMENTO, SCEGLI UNA OPZIONE TRA LE SEGUENTI,PREMI 0 PER USCIRE: ");
	
	do{
		do{
			sbagliato=false;
			System.out.println("1 - INSERISCO UN GRUPPO");
			System.out.println("2 - RIMUOVO UN GRUPPO IN BASE AL NUMERO ID");
			System.out.println("3 - RIMUOVO UN GRUPPO IN BASE AL NOME DEL GRUPPO");
			System.out.println("4 - STAMPO TUTTI I GRUPPI E LO STATO DELLA RICHIESTA");
			System.out.println("5 - STAMPO I DETTAGLI DEL GRUPPO CON LA SUA RICHIESTA IN BASE AL SUO NOME");

			System.out.println("Inserire la scelta digitando l'apposito numero: ");
			try{
				BufferedReader promptLine=new BufferedReader(new InputStreamReader(System.in));
				sceltaOpzione=promptLine.readLine();

				if(!(sceltaOpzione.equals("1")||(sceltaOpzione.equals("2"))||(sceltaOpzione.equals("3"))||(sceltaOpzione.equals("4"))||(sceltaOpzione.equals("5"))||(sceltaOpzione.equals("0")))){
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
			System.out.println("INSERISCO UN GRUPPO CON LA SUA RICHIESTA:");
					AddGroupView agv=new AddGroupView();
					Group g= new Group();
					g=agv.AddGroupView(h);
					if(g==null){
						System.out.println("gruppo non inserito");
						sbagliato=true;
					}
					else{
					System.out.println(g.toString());
					h.getGroupList().getGroupReg().add(g);
					
					AddRequestView arv=new AddRequestView();
					Request r=new Request();
					r=arv.AddRequestView();
					if(r==null){
						System.out.println("richiesta e gruppo non inseriti");
						h.getGroupList().getGroupReg().remove(g);
						sbagliato=true;
					}
					else{
					h.getRequestList().getRequestReg().add(r);
					System.out.println(g.toString()+"\n and "+r.toString());
					JDOMAddChild j=new JDOMAddChild(g,r);
					}
					}
			break;
		}
		

		case 2:
		{	
			System.out.println("RIMUOVO UN GRUPPO CON LA SUA RICHIESTA IN BASE AL SUO ID: \n");
			if(!(h.getGroupList().isGroupListEmpty())){
				System.out.println("Inserisci il numero id del gruppo: ");
				BufferedReader prLine=new BufferedReader(new InputStreamReader(System.in));
				try {
					sceltaOpzione=prLine.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try{
				groupId=Integer.parseInt(sceltaOpzione);
				if(groupId==0){
					System.out.println("Il gruppo deve avere un id intero maggiore di zero");
					sbagliato=true;
				}
				}catch(NumberFormatException nfe){
					System.out.println("Il gruppo deve avere un id intero positivo");
					nfe.getMessage();
					sbagliato=true;
				}
				
				for(int i=0;i<h.getGroupList().getGroupReg().size();i++){
					if(groupId==h.getGroupList().getGroupReg().get(i).getNumber()){
						h.getGroupList().getGroupReg().remove(i);
						JDOMRemoveChild jdrc=new JDOMRemoveChild(groupId);
					}
				}

			}
			else{
				System.out.println("Non è ancora stato inserito un gruppo");
			}
			
			break;
		}

		case 3:
		{
			System.out.println("RIMUOVO UN GRUPPO CON LA SUA RICHIESTA IN BASE AL SUO GROUPNAME: \n");
			if(!(h.getGroupList().isGroupListEmpty())){
				System.out.println("Inserisci il nome del gruppo: ");
				BufferedReader prLine=new BufferedReader(new InputStreamReader(System.in));
				try {
					sceltaOpzione=prLine.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String groupName=sceltaOpzione;
				for(int i=0;i<h.getGroupList().getGroupReg().size();i++){
					if(groupName.equalsIgnoreCase(h.getGroupList().getGroupReg().get(i).getName())){
						h.getGroupList().getGroupReg().remove(i);
						ExtractRequest e=new ExtractRequest();
						if(e.ExtractRequestbyGroupName(groupName)!=null){
						Request r =e.ExtractRequestbyGroupName(groupName);
						cancelRequest(h, r);
						JDOMRemoveChild jdrc=new JDOMRemoveChild(groupName);
						trovato=true;
					}else{
						System.out.println("Inserito un valore nullo");
					}
				}

			}
				if(trovato==false){
					System.out.println("Non ho trovato quel nome gruppo necessario per rimuovere il gruppo");
				}
			}
			else{
				System.out.println("Non è ancora stato inserito il gruppo con il nome selezionato");
			}
			break;
			
		}

		case 4:
		{
			System.out.println("STAMPO TUTTI I GRUPPI E LO STATO DELLA RICHIESTA");
			if(!(h.getGroupList().isGroupListEmpty())){
				group.JDOMReader jdgr = new group.JDOMReader();
			}
			else{
				System.out.println("Non è ancora stato inserito alcun gruppo");
			}
			break;
		}
		
		case 5:
		{
			System.out.println("STAMPO I DETTAGLI DEL GRUPPO CON LA SUA RICHIESTA IN BASE AL SUO NOME");
			System.out.println("Inserisci il nome del gruppo: ");
			BufferedReader prLine=new BufferedReader(new InputStreamReader(System.in));
			try {
				sceltaOpzione=prLine.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String groupName=sceltaOpzione;
			for(int i=0;i<h.getGroupList().getGroupReg().size();i++){
				if(groupName.equalsIgnoreCase(h.getGroupList().getGroupReg().get(i).getName())){
					System.out.println("Ecco i dettagli del gruppo numero "+groupName);
					System.out.println(h.getGroupList().getGroupReg().get(i).toString());
					int number=h.getGroupList().getGroupReg().get(i).getNumber();
					String name=h.getGroupList().getGroupReg().get(i).getName();
					String checkin=h.getGroupList().getGroupReg().get(i).getCheckin();
					String checkout=h.getGroupList().getGroupReg().get(i).getCheckout();
					float deposit=h.getGroupList().getGroupReg().get(i).getDeposit();
					System.out.println("*Numero:\t"+number);
					System.out.println("*Nome:\t"+name);
					System.out.println("*Checkin:\t"+checkin);
					System.out.println("*Checkout:\t"+checkout);
					System.out.println("*Acconto:\t"+deposit);
					Request r =new Request();
					ExtractRequest er=new ExtractRequest();
					r=er.ExtractRequestbyGroupName(groupName);
					System.out.println("Ha richiesto:\n"+r.getSingole()+"\tcamere singole,\n"+r.getDoppie()+"\tcamere doppie,\n"+r.getMatrimoniali()+"\tcamere matrimoniali.\n");
					trovato=true;
		
				}
				if(trovato==false){
					System.out.println("Non ho trovato il nome del gruppo da cui estrapolare i risultati");
				}
			}
			break;
		}
		
		case 0:
		{
			exit=true; 
			break;
		}
		
	}
	}while(!exit);
		
}

public void cancelRequest(Hotel h, Request r){
	for(int i=0;i<h.getRequestList().getRequestReg().size();i++){
			if(h.getRequestList().getRequestReg().get(i).equals(r)){
				h.getRequestList().getRequestReg().remove(i);
			}
		}
	}

}

