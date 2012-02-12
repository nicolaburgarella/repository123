import java.io.*;
import java.util.*;

public class Documento {
    private ArrayList listaRighe=new ArrayList();
    private ArrayList listaParole=new ArrayList();

    public Documento(String testo){
        StringTokenizer tokenizer=new StringTokenizer(testo);
        String word;
        while(tokenizer.hasMoreTokens()){
            word=tokenizer.nextToken();
            listaParole.add(word);
        }
    }

    public void giustifica(int numColonne){
        int numCaratteri=numColonne;
        Riga riga=null;
        Parola parola=null;
        for(int i=0;i<listaParole.size();i++){
            String word=(String)listaParole.get(i);
            numCaratteri-=(word.length()+1);
            if(numCaratteri>=0){
                if(riga==null){
                	riga= new Riga();
                	parola=new Parola(word);
                	riga.aggiungiParola(parola);
                }
                else{
                	riga.giustifica(numColonne);
                	System.out.println(riga);
                	listaRighe.add(riga);
                	riga=null;
                	numCaratteri=numColonne;
                	i--;
                }
            }
            riga.giustifica(numColonne);
            listaRighe.add(riga);
        }
    }

        public String toString(){
        	String testo="";
        	Iterator iterator=listaRighe.iterator();
        	while(iterator.hasNext()){
        		Riga riga=(Riga)iterator.next();
        		testo+=riga+"\n";
        	}
        	return testo;
        }
}
