package test;

import room.JDOMWriter;

public class InitMain {

	/**
	 * @param args
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
