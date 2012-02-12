import java.io.*;
import java.util.*;

public class Esame {

	private String corso;
	private String data;
	private String voto;

	public Esame(String corso,String data, String voto){
		this.corso=corso;
		this.data=data;
		this.voto=voto;
	}

	public String toString(){
		return "Esame di "+corso+" registrato il "+data+" --voto: "+voto;
	}
}
