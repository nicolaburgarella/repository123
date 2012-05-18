package basistaxroom;
import java.util.List;

public class TestRead {
	public static void main(String args[]) {
		StaxParser read = new StaxParser();
		List<Room> readConfig = read.readConfig("configroom.xml");
		for (Room room : readConfig) {
			System.out.println(room);
		}
	}
}
