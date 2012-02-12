/**
 * Da un vettore di 10 numeri interi devo creare un nuovo vettore di numeri reali
 * i cui valori vengono calcolati in questo modo:
 * la cella i-esima del vettore di reali contiene il valore medio delle celle i-1,i+1
 * del vettore di interi
 */

public class MediaMobile {
	final static int DIM=10;
	static int v[]=new int[DIM];
	static double m[]=new double[DIM];

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<DIM;i++){
			v[i]=(int) Math.round(Math.random()*100);
		}
		for(int i=0;i<DIM;i++){
			m[i]=media(i);
			System.out.println("valore["+i+"]="+v[i]+" media["+i+"]="+m[i]);
		}
	}


	static double media(int pos){
		if(pos==0){
			return (v[DIM-1]+v[0]+v[1])/3.0;
		}
		if(pos==DIM-1){
			return(v[DIM-2]+v[DIM-1]+v[0])/3.0;
		}
		else{
			return(v[pos-1]+v[pos]+v[pos+1])/3.0;
		}
	}

}
