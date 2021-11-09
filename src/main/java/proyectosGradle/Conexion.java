package proyectosGradle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion{
	
	private static final String URL="jdbc:sqlite:C:/sqlite/chinook.db";
	
	public static Connection conectar() {
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection(URL);
			System.out.println("Conexión OK");
		}catch (SQLException e) {
			System.out.println("Error en la conexión" + e);
		}
		return conexion;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection miCon = conectar();
	}

}
