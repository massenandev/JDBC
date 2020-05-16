package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	
	public static Connection getConexao() {
		try {
			final String url = "jdbc:mysql://localhost/bancojdbc?verifyServerCertificate=false&useSSL=true";
			final String usuario = "username";
			final String senha = "password";
			
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
