import java.util.*;
import java.io.*;
import java.sql.*;

public class Listino {
	List elencoPrezzi=new ArrayList();
	Prodotto prodotto;
	boolean listinoCaricato=false;

	public Listino(){

	}

	public void caricaDB(){
		elencoPrezzi.removeAll(elencoPrezzi);
		Prodotto prodotto;

		String url="jdbc:odbc:Esselunga";
		String query="SELECT codice,prezzo,nome FROM Prodotti";

		try{
			//Carica il jdbc-odbc bridge driver
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection(url);

			//Ottiene l'oggetto DatabaseMetaData e mostra alcune info sulla connesisone
			DatabaseMetaData dma=con.getMetaData();

			//Crea un oggetto Statement cs possiamo inviare le query sql al driver
			Statement stmt=con.createStatement();

			//Invia una query,creando un oggetto ResultSet
			ResultSet rs=stmt.executeQuery(query);

			//Ottengo il ResultSetMetaData.Questo sarà usato per i titoli di colonna (column headings)
			ResultSetMetaData rsmd=rs.getMetaData();

			//carico i dati,andandoli a prendere fino alla fine el result set
			boolean more=rs.next();

			while(more){
				//cicla lungo ogni colonna
				//ottiene il dato della colonna e lo mostra
				int codice=rs.getInt("codice");
				int prezzo=rs.getInt("prezzo");
				String nome=rs.getString("nome");

				prodotto=new Prodotto(nome,codice,prezzo);

				elencoPrezzi.add(prodotto);
				more=rs.next();
			}

			//chiude il result set
			rs.close();
			//chiude lo statement
			stmt.close();
			//chiude la connessione
			con.close();
			//setta la flag a true
			listinoCaricato=true;
		}
		catch(SQLException ex){
			ex.printStackTrace();
		}
		catch(java.lang.Exception ex){
			ex.printStackTrace();
		}
	}

	public void salvaDB(){
		String sql;
		String url="jdbc:odbc:Esselunga";

		try{
			//Carica il jdbc-odbc bridge driver
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection(url);

			//se non possiamo connetterci si genera un eccezione
			//altrimenti se va ci siamo connessi all'url

			//Ottiene l'oggetto DatabaseMetaData e mostra alcune info sulla connessione
			DatabaseMetaData dma=con.getMetaData();

			//crea un'oggetto statement cs possiamo inviare query sql al driver
			Statement stmt=con.createStatement();

			Iterator iterator=elencoPrezzi.iterator();
			while(iterator.hasNext()){
				sql=new String();
				sql+="INSERT INTO Prodotti ("+"Codice, Prezzo, Nome"+") VALUES (";
				sql+="'"+prodotto.getCodice()+"'";
				sql+=",'"+prodotto.getPrezzo()+"'";
				sql+=",'"+prodotto.getNome()+"'";
				sql+=");";

				stmt.executeUpdate(sql);
			}
				//chiude la statement
				stmt.close();
				//chiude la connessione
				con.close();
			}
			catch(SQLException ex){
				ex.printStackTrace();
			}
			catch(java.lang.Exception ex){
				ex.printStackTrace();
			}
		}

	public boolean caricato(){
		return listinoCaricato;
	}

	public void aggiungiProdotto(String nome,int codice, int prezzo){
		elencoPrezzi.add(new Prodotto(nome,codice,prezzo));
	}

	public Prodotto getProdotto(int codice){
		Iterator iterator=elencoPrezzi.iterator();
		while(iterator.hasNext()){
			Prodotto prodotto=(Prodotto)iterator.next();
			if(prodotto.getCodice()==codice){
				return prodotto;
			}
			return null;
		}
		return prodotto;
	}











}
