package payment;

import group.Group;

import java.util.ArrayList;

import date.DaysBetweenDates;

import room.Room;

public class PayRooms {

	Group g = new Group();
	
	public PayRooms(){
	
	}
	
	public float PayRooms(Group gruppo){
		
		if(gruppo==null){
			System.out.println("E' stato passato un gruppo nullo come parametro");
			return 999999990;
		}
		g=gruppo;
		float totCostRooms=0;
		float diffCost=0;
		if(g.getRoomAssigned().isEmpty()){
			System.out.println("Non ci sono stanze assegnate al gruppo,impossibile procedere nel checkout con il pagamento");
			return 999999999;
		}
		System.out.println("Ecco i dettagli e il costo totale del gruppo "+g.getName()+"\nHai utilizzato:");
		for(int i=0;i<g.getRoomAssigned().size();i++){
			DaysBetweenDates d=new DaysBetweenDates();
			long days=d.daysInHotel(g.getCheckin(), g.getCheckout());
			if(days==6000){
				System.out.println("Le date non sono parsabili");
				return 999999909;
			}
			if(days==5000){
				System.out.println("Le date hanno valori nulli");
				return 999999909;
			}
			float totCostByRoom=(g.getRoomAssigned().get(i).getFee())*days;
			System.out.println("* camera numero "+g.getRoomAssigned().get(i).getNumber()+"\tal costo giornaliero di "+g.getRoomAssigned().get(i).getFee()+" per "+days+ "giorni, al costo totale di "+totCostByRoom);
			totCostRooms+=totCostByRoom;
		}
		System.out.println("Il gruppo "+g.getName()+" deve pagare di pernottamento "+totCostRooms);
		diffCost=totCostRooms-g.getDeposit();
		System.out.println("Il gruppo ha già pagato un acconto di "+g.getDeposit()+" euro,\nAl gruppo resta di pagare "+diffCost+" euro");
		return diffCost;
		
	}

}
