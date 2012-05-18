package basistaxroom;
public class TestWrite {

	public static void main(String[] args) {
		StaxWriter configFile = new StaxWriter();
		configFile.setFile("configroom.xml");
		try {
			configFile.saveConfig();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
