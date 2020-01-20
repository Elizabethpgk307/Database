package bankaccountmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class bankconnection {

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = null;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
        return con;
	}
}
