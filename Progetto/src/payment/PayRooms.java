package payment;

import group.Group;

import java.io.IOException;
import java.util.ArrayList;

import com.itextpdf.text.DocumentException;

import date.DaysBetweenDates;

import room.PdfFee;
import room.Room;

public class PayRooms {

	Group g = new Group();
	private float totCostRooms=0;
	private float diffCost=0;
	private float totCostByRoom;
	private String mess="";
	
	public PayRooms(){
	
	}
	
	public float PayRooms(Group gruppo){
		
		if(gruppo==null){
			System.out.println("E' stato passato un gruppo nullo come parametro");
			return 999999990;
		}
		g=gruppo;

		if(g.getRoomAssigned().isEmpty()||g.getRoomAssigned()==null){
			System.out.println("Non ci sono stanze assegnate al gruppo,impossibile procedere nel checkout con il pagamento");
			return 999999999;
		}
		
		System.out.println("Ecco i dettagli e il costo totale del gruppo: "+g.getName());
			DaysBetweenDates d=new DaysBetweenDates();
			long days=d.daysInHotel(g.getCheckin(), g.getCheckout());
			mess="Ecco i dettagli e il costo totale del gruppo: "+g.getName()+":\n\n\n"+"•checkin "+g.getCheckin()+"\n•checkout "+g.getCheckout()+"\n\nTra le due date ci sono "+days+" giorni\n\n";
			if(days==6000){
				System.out.println("Le date non sono parsabili");
				return 999999909;
			}
			if(days==5000){
				System.out.println("Le date hanno valori nulli");
				return 999999909;
			}
			for(int i=0;i<g.getRoomAssigned().size();i++){
			 totCostByRoom=(g.getRoomAssigned().get(i).getFee())*days;
			System.out.println("* camera numero "+g.getRoomAssigned().get(i).getNumber()+"\tal costo giornaliero di "+g.getRoomAssigned().get(i).getFee()+"euro per "+days+ "giorni,\tal costo totale di "+totCostByRoom);
			mess+="* camera numero "+g.getRoomAssigned().get(i).getNumber()+"\tal costo giornaliero di "+g.getRoomAssigned().get(i).getFee()+"euro per "+days+ "giorni"+"\n";
			totCostRooms+=totCostByRoom;
		}
		System.out.println("Il gruppo "+g.getName()+" deve pagare un pernottamento totale di "+totCostRooms+" euro\n\n");
		mess+="Il gruppo "+g.getName()+" deve pagare un pernottamento totale di "+totCostRooms+" euro.\n";
		diffCost=totCostRooms-g.getDeposit();
		System.out.println("Il gruppo ha già pagato un acconto di "+g.getDeposit()+" euro,\nAl gruppo resta di pagare "+diffCost+" euro");
		mess+="Il gruppo ha già pagato un acconto di "+g.getDeposit()+" euro,\n\nAl gruppo resta di pagare "+diffCost+" euro.\n\n\n\n\n\n\n\t\t\tCordiali Saluti";
		//System.out.println(mess);
		try {
			PdfFee p=new PdfFee(g, mess);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return diffCost;
		
	}

}
