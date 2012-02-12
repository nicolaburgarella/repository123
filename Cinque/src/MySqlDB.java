	import java.io.FileInputStream;
	import java.io.IOException;
	import java.sql.SQLException;

	/**
	 * The Class MySqlDB.
	 */
	public class MySqlDB {

		/** The server. */
		private String server;

		/** The database. */
		private String database;

		/** The user. */
		private String user;

		/** The password. */
		private String password;

		/** The connection. */
		private boolean connection = false;

		/** The mysql connection string. */
		private java.sql.Connection conn = null;

		/**
		 * Instantiates a new my sql database.
		 */
		public MySqlDB() {
			this.server = "";
			this.database = "";
			this.user = "";
			this.password = "";
		}

		/**
		 * Instantiates a new my sql database.
		 * 
		 * @param server
		 *            the server
		 * @param database
		 *            the database
		 * @param user
		 *            the user
		 * @param password
		 *            the password
		 */
		public MySqlDB(String server, String database, String user, String password) {
			setConnection(server, database, user, password);
		}

		/**
		 * Sets the connection.
		 * 
		 * @param server
		 *            the server
		 * @param database
		 *            the database
		 * @param user
		 *            the user
		 * @param password
		 *            the password
		 */
		public void setConnection(String server, String database, String user,
				String password) {
			this.server = server;
			this.database = database;
			this.user = user;
			this.password = password;

			String driverclassname = "com.mysql.jdbc.Driver";
			String ConnectionString = "jdbc:mysql://" + server + "/" + database
					+ "?user=" + user + "&password=" + password;

			try {
				this.conn = null;
				Class.forName(driverclassname).newInstance();
				conn = java.sql.DriverManager.getConnection(ConnectionString);
				this.connection = true;
			} catch (Exception e) {
			}
		}

		/**
		 * Gets the connection.
		 * 
		 * @return the connection
		 */
		public boolean getConnection() {
			return this.connection;
		}

		/**
		 * Execute file.
		 * 
		 * @param pathfile
		 *            the path file
		 * @return true, if successful
		 * @throws IOException
		 *             Signals that an I/O exception has occurred.
		 */
		public boolean executeFile(String pathfile) throws IOException {
			boolean ret = true;

			FileInputStream fin = new FileInputStream(pathfile);
			String s = "";
			int cint = 0;
			while ((cint = fin.read()) != -1) {
				if ((char) cint != ';')
					s += (char) cint;
				else {
					ret &= executeQuery(s);
					if (!ret)
						return false;
					s = "";
				}
			}
			if (s.compareTo("") != 0 && s.compareTo("\n") != 0) {
				ret &= executeQuery(s);
				if (!ret)
					return false;
			}
			return ret;
		}

		/**
		 * Getter methods
		 * 
		 * @return
		 */
		public String getServer() {
			return this.server;
		}

		public String getDatabase() {
			return this.database;
		}

		public String getPassword() {
			return this.password;
		}

		public String getUsername() {
			return this.user;
		}

		/**
		 * Execute query.
		 * 
		 * @param query
		 *            the query
		 * @return true, if successful
		 */
		public boolean executeQuery(String query) {
			boolean ret = true;
			if (conn != null) {
				java.sql.Statement s = null;
				try {
					s = conn.createStatement();
				} catch (SQLException e) {
					ret = false;
				}
				try {
					s.execute(query);
				} catch (SQLException e) {
					System.out.println(e.getMessage());
					ret = false;
				}
				return (ret);
			} else {
				System.err.println("Connessione non riuscita");
				return false;
			}
		}
	}

