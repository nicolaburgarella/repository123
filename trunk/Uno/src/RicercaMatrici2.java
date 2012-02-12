/**
 *Il programma riempie due matrici 10x10 e 2x2 di numeri binari in modo casuale e
 * calcola quante volte la matrice 2x2 è contenuta nella 10x10
 */

public class RicercaMatrici2 {

	static final int DIM_M=10;
	static final int DIM_F=2;
	static int matrice[][]=new int [DIM_M][DIM_M];
	static int figura[][]=new int [DIM_F][DIM_F];
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<DIM_M;i++){
			for(int j=0;j<DIM_M;j++){
				matrice[i][j]=(int) Math.round(Math.random());
				System.out.println(matrice[i][j]);
			}
			System.out.println();
		}

		for(int i=0;i<DIM_F;i++){
			for(int j=0;j<DIM_F;j++){
				figura[i][j]=(int) Math.round(Math.random());
				System.out.println(figura[i][j]);
			}
			System.out.println();
		}

		int trovate=0;

		for(int x=0;x<DIM_M-3;x++){
			for(int y=0;y<DIM_M-3;y++){
				if(confronta(x,y)){
					trovate++;
				}
			}
			}
			System.out.println("Trovate "+trovate);
		}



		static boolean confronta(int x,int y){
			for(int i=0;i<DIM_F;i++){
				for(int j=0;j<DIM_F;j++){
					if(figura[i][j]!=matrice[x+i][y+j]);
					return false;
				}
			}
			return true;
		}

}
