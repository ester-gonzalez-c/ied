package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	
	Connection conn = null;
	
	final String url="jdbc:mysql://localhost:3306";
	final String database="pelisyseries";
	final String driver="com.mysql.jdbc.Driver";
	final String username="root";
	final String password="Ester1687";
	
	public Connection createConnection () {
		try {
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url+database,username,password);
		}catch (Exception e){
			System.out.println("Exception" + e.getMessage());
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}
		return conn;
	}

}
