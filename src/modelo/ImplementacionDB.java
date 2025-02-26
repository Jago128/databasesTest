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
	
	final String SQL="SELECT * FROM usuario WHERE nombre=? AND contraseña=?";

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
			System.out.println("Error al intentar abrir la base de datos.");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean comprobarUsuario(Usuario user) {
		boolean existe=false;
		this.openConnection();

		try {
			stmt=con.prepareStatement(SQL);
			stmt.setString(1, user.getNombre());
			stmt.setString(2, user.getContraseña());
			ResultSet resultado=stmt.executeQuery();

			if (resultado.next()) {
				existe=true;
			}
			
			resultado.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("Error al verificar credenciales: "+e.getMessage());
		}
		return existe;
	}
}
