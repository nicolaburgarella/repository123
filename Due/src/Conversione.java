/**
 * Programma che converte un numero da binario a decimale
 */
import java.io.*;

public class Conversione {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BufferedReader promptLine=new BufferedReader(new InputStreamReader(System.in));
			String binary="";
			int decimal;
			boolean continua=true;
			while(continua){
				System.out.println("Inserisci un numero binario (00 per terminare)");
				binary=promptLine.readLine();
				if(binary.equals("00")){
					break;
				}
				else{
					decimal=binaryToDecimal(binary);
					System.out.println(binary+ " --> "+decimal);
				}
			}

		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		finally{
			System.out.println("Fine programma");
		}
	}

	static int binaryToDecimal(String binary){
		int value=0;
		int power=1;
		for(int position=binary.length()-1;position>=0;position--){
			switch(binary.charAt(position)){
			case'0':
				break;
			case'1':
				value+=power;
				break;
			case'-':
				if(position==0){
					value=-value;
					break;
				}
				else{
					return value;
				}
			default:
				return value;
			}
		power*=2;
		}
		return value;
	}

}
