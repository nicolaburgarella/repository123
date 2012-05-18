package hotel.reservation;
import hotel.model.group.Gruppo;
import hotel.model.room.RegistroCamere;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class RegistroPrenotazioni {
	private ArrayList<Prenotazione> registroPrenotazioni=new ArrayList<Prenotazione>();
	RegistroCamere rc=null;

	public RegistroPrenotazioni(){
		registroPrenotazioni.clear();
	}


	public boolean inserisci(Prenotazione p){
		registroPrenotazioni.add(p);
		return true;
	}

	//Cerco la presenza del gruppo nel registro prenotazioni e mi ritorna l'indice del gruppo  o -1
	//in cerca non confronta sia il gruppo sia l'array delle camere prenotate,suppongo che il gruppo può fare al massimo una prenotazione,come di fatto è 
	public int cerca(Gruppo gruppo){
		for(int i=0;i<registroPrenotazioni.size();i++){
			if(registroPrenotazioni.get(i).getGruppo().getId()==gruppo.getId()){
				return i;
				}
		}
		return -1;
	}

	
	public void rimuoviPrenotazione(int posizione){
		for(int i=0;i<registroPrenotazioni.size();i++){
			registroPrenotazioni.get(i).setCamerePrenotateDisp();
		}
		//riga sotto contatore inutile
		int numCamerePrenotate=(registroPrenotazioni.get(posizione).getGruppo().getNumCamerePrenotate());
		registroPrenotazioni.get(posizione).getGruppo().setNumCamerePrenotate(0);
		registroPrenotazioni.remove(posizione);
	}
	
	
	public ArrayList<Prenotazione> getRegistroPrenotazioni(){
		return registroPrenotazioni;
	}
	
	/*
	 * salva va reso un file xml <GRUPPO id="" nome="" dataArrivo="" anticipo="" richiestaComposizione=""/>
	 * */
	public void salvaInXML(){
		try{
			File file =new File("RegistroPrenotazioni.txt");
			FileOutputStream outStream= new FileOutputStream(file);
	        BufferedWriter lineWriter= new BufferedWriter(new OutputStreamWriter(outStream));
	        for(int i=0;i<registroPrenotazioni.size();i++){
	            String LineaTesto;
	            LineaTesto="<PRENOTAZIONE idGruppo="+registroPrenotazioni.get(i).getGruppo().getId()+" dataCheckout="+registroPrenotazioni.get(i).getDataCheckout()+" giorniPernottamento="+registroPrenotazioni.get(i).getGiorniPernottamento()+" />";
	            lineWriter.write(LineaTesto);
	        	//lineWriter.newLine();
			}
	        outStream.close();
	        lineWriter.close();
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
	
	


	public void caricaDaXML(){
		try{
            File fileTesto =new File("registroPrenotazioni.txt");
            FileInputStream inStream= new FileInputStream(fileTesto);
            BufferedReader lineReader= new BufferedReader(new InputStreamReader(inStream));
            Prenotazione p=null;
            String lineaTesto;
            int indexInit,indexEnd;
            boolean trovato=false;
            //legge il file riga per riga
            while((lineaTesto=lineReader.readLine())!=null){
                    if((indexInit=lineaTesto.indexOf("<PRENOTAZIONE"))>-1){
                            //estrae i dati del gruppo
                            int id=Integer.parseInt(estrai("idGruppo",lineaTesto));
                            String dataCheckout=estrai("dataCheckout",lineaTesto);
                            int giorniPernottamento=Integer.parseInt(estrai("giorniPernottamento",lineaTesto));
                            //Appends the specified element to the end of this list.
                            registroPrenotazioni.add(p);
                            trovato=true;
                    }

                    else if((indexInit=lineaTesto.indexOf(" />"))>-1){
                            System.out.println("Appena caricato l'extra giornaliero ");
                    }
                    else{
                            continue;
                    }
            }
            //chiude il file di testo
            lineReader.close();
            inStream.close();
            }
            catch(IOException ioe){
                    ioe.printStackTrace();
            }
	}

	static String estrai(String chiave,String riga){
		int indexInit,indexEnd;
		indexInit=riga.indexOf(chiave)+chiave.length()+2;//pos chiave+2,ovvero ="
		String valore=riga.substring(indexInit);
		indexEnd=valore.indexOf('"');
		valore=valore.substring(0,indexEnd); //il secondo parametro di substring è escluso
		return valore;
	}
	
		
}
