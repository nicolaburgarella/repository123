package payment;

import room.ExtraList;
import room.ExtractExtrasInstByRoom;
import room.JDOMExtractExtrasByRoom;
import room.RoomList;
import group.Group;

public class PayExtraByRoomNr {
	
	Group g = new Group();

	public PayExtraByRoomNr() {

	}

	public PayExtraByRoomNr(Group gruppo) {
		//Il gruppo esiste e non ha valore nullo
		g=gruppo;

		if (!(g.getRoomAssigned().isEmpty())) {
			System.out.println("Ecco gli extra da pagare relativi ad ogni stanza prenotata");
			for (int i = 0; i < g.getRoomAssigned().size(); i++) {
				int roomNumber = g.getRoomAssigned().get(i).getNumber();
				JDOMExtractExtrasByRoom e = new JDOMExtractExtrasByRoom(roomNumber);

			}
		} else {
			System.out.println("Non sono state assegnate stanze per quel gruppo");
		}

	}

}
