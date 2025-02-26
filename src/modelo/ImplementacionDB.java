package modelo;

import java.sql.*;
import java.util.*;

public class ImplementacionDB {
	private Connection con;
	private PreparedStatement stmt;
	private ResourceBundle configFile;
	private String driverDB;
	private String urlDB;
	private String userDB;
	private String passwordDB;

	public ImplementacionDB() {
		this.configFile=ResourceBundle.getBundle("configClase");
		this.driverDB=this.configFile.getString("Driver");
		this.urlDB=this.configFile.getString("Conn");
		this.userDB=this.configFile.getString("DBUser");
		this.passwordDB=this.configFile.getString("DBPass");
	}

	private void openConnection() {
		try {
			con=DriverManager.getConnection(urlDB, this.userDB, this.passwordDB);
		} catch (SQLException e) {
			System.out.println("Error al intentar abrir la BD");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
