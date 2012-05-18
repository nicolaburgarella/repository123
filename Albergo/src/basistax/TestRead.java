package basistax;
import java.util.List;

public class TestRead {
	public static void main(String args[]) {
		StaxParser read = new StaxParser();
		List<Item> readConfig = read.readConfig("config.xml");
		for (Item item : readConfig) {
			System.out.println(item);
		}
	}
}
