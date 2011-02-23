package defaultpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	public Database() {}

	public void DoConnection() {
		Connection conn = null;

		try {
			conn =
				DriverManager.getConnection("jdbc:mysql://localhost/drupal", "root", "pass");
			// Do something with the Connection

		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
	} 

}