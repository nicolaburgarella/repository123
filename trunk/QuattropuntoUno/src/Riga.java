import java.io.*;
import java.util.*;

public class Riga {
	private ArrayList listaParole=new ArrayList();
	private int lunghezzaRiga=0;

	public Riga(){

	}

	public void aggiungiParola(Parola parola){
		listaParole.add(parola);
		lunghezzaRiga+=parola.length();
	}

	public void giustifica(int numColonne){
		//aggiunge uno spazio bianco tra le parole
		for(int i=0;i<listaParole.size()-1;i++){
			((Parola)listaParole.get(i)).allunga(1);
			lunghezzaRiga++;
		}

		int numBlanks=numColonne -lunghezzaRiga;

		if(numBlanks<=0){
			return;
		}

		int numWords=listaParole.size();

		Iterator iterator=listaParole.iterator();
		int frequenza=1;
		while(iterator.hasNext()){
			Parola parola=(Parola)iterator.next();
			if(numBlanks==0){
				break;
			}
			else if(numBlanks>numWords-1){
				frequenza=(int)Math.ceil(numBlanks/(numWords-1));
			}
			else{
				frequenza=1;
				parola.allunga(frequenza);
				numBlanks -=frequenza;
				numWords--;
			}
		}
	}

		public String toString(){
			String riga="";
			Iterator iterator=listaParole.iterator();
			while(iterator.hasNext()){
				Parola parola=(Parola)iterator.next();
				riga+=parola;
			}
			return riga;
		}
	}


