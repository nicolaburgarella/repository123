import java.io.*;
import java.util.*;

public class Parola {
	private String word="";
	private String blanks="";

	public Parola(String word){
		this.word=word;
	}

	public void allunga(int numBlanks){
		for(int i=0;i<numBlanks;i++){
			this.blanks=" ";
		}
	}

	public int length(){
		return word.length()+blanks.length();
	}

	public String toString(){
		return word+blanks;
	}

}
