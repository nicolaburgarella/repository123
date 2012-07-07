package test;

import group.*;
import group.ExtractRequest;
import group.Group;
import group.JDOMAddChild;
import group.JDOMConfirmRequest;
import group.JDOMExtractGroup;
import group.JDOMRemoveChild;
import group.Request;
import reservation.JDOMExtractReservation;
import reservation.JDOMRemoveChild2;
import room.CheckFreeRooms;
import room.ExtractRoomByNumber;
import room.JDOMExtractExtrasByRoom;
import room.JDOMInsertExtraByRoomNr;
import room.JDOMReader;
import room.JDOMWriter;
import room.Room;
import room.RoomList;
import room.SetRoomNotFree;

public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*//Funzionalità package room
		
		System.out.println("Scrivo alcune stanze e extra");
		JDOMWriter jdw=new JDOMWriter();
	
		System.out.println("Stampo tutti gli extra relativi alla room 1");
		JDOMExtractExtrasByRoom jdr=new JDOMExtractExtrasByRoom(1);
	
		System.out.println("Inserisco l'extra relativo alla room 1");
		JDOMInsertExtraByRoomNr jier =new JDOMInsertExtraByRoomNr(1, "2/5/2012", "5000", "Internet");

		System.out.println("Stampo tutti gli extra con il loro costo totale divisi per stanza");
		JDOMReader jdre=new JDOMReader();

		System.out.println("elimino tutti gli extra relativi alla stanza 1");
		room.JDOMRemoveExtraByRoomNr jdree =new room.JDOMRemoveExtraByRoomNr(1);
		
		System.out.println("Stampa e istanzia la richiesta in base al nome del gruppo");
		Request r=null;
		ExtractRequest prova=new ExtractRequest();
		r=prova.ExtractRequestbyGroupName("gruppo1");
			
		/*
		System.out.println("Stampa la stanza selezionata"); ->tolto perchè inutile da fare dall'xml
		JDOMExtractRoom jde=new JDOMExtractRoom(1);
		*/
		
		
		/*//funzionalità package group
		
		System.out.println("Scrivo alcuni gruppi");
		group.JDOMWriter jdwr = new group.JDOMWriter();
		
		System.out.println("Aggiungo un gruppo");
		JDOMAddChild jdac=new JDOMAddChild();
		
		System.out.println("Rimuovo il gruppo numero 3"); 
		JDOMRemoveChild jdrc=new JDOMRemoveChild(3);
		JDOMRemoveChild df=new JDOMRemoveChild("gruppo2");
		
		System.out.println("Stampo tutti i gruppi e lo stato della richiesta");
		group.JDOMReader jdgr = new group.JDOMReader();
		
		System.out.println("Scrivo che la richiesta del gruppo è stata eseguita");
		JDOMConfirmRequest jdcr =new JDOMConfirmRequest(3); 
		
		System.out.println("stampo il gruppo 'gruppo1'");
		JDOMExtractGroup g=new JDOMExtractGroup("gruppo1");
		//*/
		
		
		/*//funzionalità package prenotazioni
		
		System.out.println("Scrivo alcune prenotazioni");
		reservation.JDOMWriter jdwr =new reservation.JDOMWriter();
		
		System.out.println("Stampo tutte le prenotazioni e i dettagli del gruppo relativo");
		reservation.JDOMReader jdrr=new reservation.JDOMReader();
		
		
		System.out.println("Stampo la prenotazione relativa al gruppo 'gruppo1'");
		JDOMExtractReservation jder =new JDOMExtractReservation("gruppo1");
		
		System.out.println("Aggiungo una prenotazione");
		reservation.JDOMAddChild jdac =new reservation.JDOMAddChild();
		
		System.out.println("Elimino la prenotazione numero 2");
		JDOMRemoveChild2 jg = new JDOMRemoveChild2(2);
		System.out.println("Elimino la prenotazione numero relativa al gruppo3");
		JDOMRemoveChild2 jrcr =new JDOMRemoveChild2("gruppo3");
		*/
		
		
		//funzionalità caricamento iniziale strututra dati xml nelle istanze
		
		//LoadGroupsAndRequestsFromXML l1=new LoadGroupsAndRequestsFromXML();
		//LoadExtrasAndRoomsFromXML l2=new LoadExtrasAndRoomsFromXML();
		
		//funzionalità verifica stanze libere e
		//assegnamento ai gruppi in base alla composizione
		
		/*//prova
		JDOMExtractGroup g = new JDOMExtractGroup("gruppo1");
		ExtractRoomByNumber ern=new ExtractRoomByNumber();
		Room room=ern.ExtractRoom(5);*/
		/*
		//System.out.println("Stampa tutte le stanze libere");
		//room.JDOMReader r = new JDOMReader();
		System.out.println("Stampo tutte le camere libere");
		CheckFreeRooms cfr =new CheckFreeRooms(); 
		//System.out.println("carica la richiesta del gruppo1");
		//Request r=null;
		//ExtractRequest prova=new ExtractRequest();
		//r=prova.ExtractRequestbyGroupName("gruppo1");
		System.out.println("Assegna stanze libere a gruppo in base alla composizione richiesta e stampa dettagli gruppo e stanza");
		AssignRooms ar =new AssignRooms("gruppo1");
		System.exit(0);
		//*/
		
	}

}
