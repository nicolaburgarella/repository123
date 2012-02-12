
public class Prodotto {
	private int codice;
	private int prezzo;
	private String nome;


	public Prodotto(String nome,int codice, int prezzo){
		this.nome=nome;
		this.codice=codice;
		this.prezzo=prezzo;
	}

	public String getNome(){
		return nome;
	}

	public int getCodice(){
		return codice;
	}

	public int getPrezzo(){
		return prezzo;
	}

}