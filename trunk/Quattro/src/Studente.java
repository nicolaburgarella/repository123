import java.io.*;
import java.util.*;

public class Studente{
	private String nome;
	private String cognome;
	private String matricola;
	private ArrayList esami=new ArrayList();

	public Studente(String nome,String cognome, String matricola){
		this.nome=nome;
		this.cognome=cognome;
		this.matricola=matricola;
	}

	public void registra(Esame esame){
		esami.add(esame);
	}

	public String getMatricola(){
		return matricola;
	}

	public String toString(){
		String dati="Studente "+nome+" "+cognome+"("+matricola+")";
		Iterator iterator=esami.iterator();
		while(iterator.hasNext()){
			Esame esame=(Esame)iterator.next();
			dati+="\n    "+esame;
		}
		return dati;
	}
}