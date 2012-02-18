

import java.sql.SQLException;

/**
 * Classe di connessione al database mysql
 */
public class Database {

	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException, SQLException {
		String type = "access";

		String server = "";
		String database = "";
		String user = "";
		String password = "";
		String driverclassname = "";
		String connection = "";
		String create = "";

		if (type == "mysql") {
			server = "localhost";
			database = "testsql";
			user = "root";
			password = "root";
			driverclassname = "com.mysql.jdbc.Driver";
			connection = "jdbc:mysql://" + server + "/" + database + "?user="
					+ user + "&password=" + password;
			create = "CREATE TABLE  gruppo (  `id` int(10) unsigned NOT NULL AUTO_INCREMENT, `nome` varchar(45) NOT NULL, PRIMARY KEY (`id`))";
		} else if (type == "access") {
			database = "test.mdb";
			driverclassname = "sun.jdbc.odbc.JdbcOdbcDriver";
			connection = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ="
					+ database.trim() + ";DriverID=22;READONLY=true}";

			create = "CREATE TABLE  gruppo ( id COUNTER UNIQUE NOT NULL PRIMARY KEY, nome TEXT(45) NOT NULL)";
		}
		String insert = "INSERT INTO gruppo (nome) VALUES ('Il_mio_gruppo')";
		String update = "UPDATE gruppo SET nome = 'Il_mio_gruppo2' WHERE nome = 'Il_mio_gruppo'";

		java.sql.Connection conn = null;
		Class.forName(driverclassname).newInstance();
		conn = java.sql.DriverManager.getConnection(connection);
		System.out.println("Connection established");

		java.sql.Statement s = conn.createStatement();
		int exit = s.executeUpdate(create);
		boolean bool = (exit == 0);
		if (bool)
			System.out.println("Creazione tabella gruppo RIUSCITA");

		s = conn.createStatement();
		exit = s.executeUpdate(insert);
		bool = (exit == 1);
		if (bool)
			System.out.println("Inserimento dato di prova RIUSCITO");

		s = conn.createStatement();
		exit = s.executeUpdate(update);
		bool = (exit == 1);
		if (bool)
			System.out.println("Aggiornamento dato di prova RIUSCITO");

		System.out.println("Visualizzazione dati tab. gruppo");
		java.sql.ResultSet r = s.executeQuery("SELECT * FROM gruppo");
		while (r.next()) {
			System.out.println(r.getString("id") + " " + r.getString("nome")
					+ " ");
		}
	}
}
