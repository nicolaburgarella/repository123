package main;

import room.JDOMWriter;

// TODO: Auto-generated Javadoc
/**
 * The Class InitMain.
 */
public class InitMain {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Creo xml delle stanze libere dell'albergo");
		System.out.println("Ecco tutte le stanze dell'albergo");
		JDOMWriter jdw = new JDOMWriter();

		System.out.println("Inizializzo l'xml dei gruppo");
		group.JDOMWriter jdwr = new group.JDOMWriter();

		System.out.println("Inizializzo l'xml delle prenotazioni");
		reservation.JDOMWriter jdxc = new reservation.JDOMWriter();

	}

}
