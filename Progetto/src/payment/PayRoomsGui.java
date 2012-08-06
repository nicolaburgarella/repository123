package payment;

import group.Group;

import java.util.ArrayList;

import date.DaysBetweenDates;

import room.Room;

// TODO: Auto-generated Javadoc
/**
 * The Class PayRoomsGui.
 */
public class PayRoomsGui {

	
	/**
	 * Instantiates a new pay rooms gui.
	 */
	public PayRoomsGui(){
	
	}
	
	/**
	 * Pay rooms.
	 *
	 * @param g the g
	 * @return the float
	 */
	public float PayRooms(Group g){
		float totCostRooms=0;
		float diffCost=0;
		
		System.out.println("Ecco i dettagli e il costo totale del gruppo "+g.getName()+"\nHai utilizzato:");
		for(int i=0;i<g.getRoomAssigned().size();i++){
			DaysBetweenDates d=new DaysBetweenDates();
			long days=d.daysInHotel(g.getCheckin(), g.getCheckout());
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
