public class RicercaMatrici {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrice piccola=new Matrice(3,3);
		Matrice grande=new Matrice(30,30);

		piccola.initRandom();
		grande.initRandom();

		int occorrenze=grande.ricerca(piccola);
		System.out.println("Occorrenze = "+occorrenze);
	}

}
