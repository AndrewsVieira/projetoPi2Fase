package be.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDataBase  {

  private static String URL = "jdbc:postgresql://localhost:5432/poo-t2";
  private static String USER = "postgres";
  private static String PSWORD = "2512";

  private static Connection connection;

  private ConnectionDataBase() {
  }

  public static  Connection getConnection() throws SQLException {
    if (connection == null) {
      connection = DriverManager.getConnection(URL, USER, PSWORD);
    }
    return connection;
  }
}

