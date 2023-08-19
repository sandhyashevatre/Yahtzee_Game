package Day8_26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class YahtzeeConnector {

	Connection cnx = null;

	
	public static void main(String[] args) {
		Connection cnx = null;
		try {
	         cnx= DriverManager.getConnection("jdbc:mysql://localhost:3306/Database","SandhyaShevatre","sandhya@123");
	            System.out.println("Connection Succeeded!");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	}	
}

