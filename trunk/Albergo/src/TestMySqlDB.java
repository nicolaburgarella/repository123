

import java.io.IOException;
import java.sql.SQLException;

/**
 * This class test the Mysql connection
 */
public class TestMySqlDB {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 * @throws InstantiationException
	 *             the instantiation exception
	 * @throws IllegalAccessException
	 *             the illegal access exception
	 * @throws ClassNotFoundException
	 *             the class not found exception
	 * @throws SQLException
	 *             the sQL exception
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException, SQLException,
			IOException {
		MySqlDB db = new MySqlDB("localhost", "test", "root", "root");
		System.out.println(db.getConnection());
		System.out.println(db.executeFile("codiceSQL.txt"));
	}
}
