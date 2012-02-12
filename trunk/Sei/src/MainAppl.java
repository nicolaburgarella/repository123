/**
 * CLASSE DA NON AVVIARE è CONCETTUALE DI ESEMPIO
 *
 */
public class MainAppl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cronometro cr1=new Cronometro();
		Cronometro cr2=new Cronometro();
		Cronometro cr3=new Cronometro();

		Thread th1=new Thread(cr1);
		Thread th2=new Thread(cr2);
		Thread th3=new Thread(cr3);

		th1.start();
		th2.start();
		th3.start();

	}

}
