package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	private static final String URL = "jdbc:postgresql://localhost:5432/crud_java";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Mathias7107!";

    public static Connection conectar() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conectado ao banco!");
        } catch (Exception e) {
            System.out.println("Erro na conexão: " + e.getMessage());
        }

        return conn;
    }
}