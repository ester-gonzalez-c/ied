package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domains.Actor;

public class ActorRepository {
	/*Method to get the connection with our database*/
	private Connection getConnection() {
		ConnectionManager connectionManager = new ConnectionManager();
		Connection conn = connectionManager.createConnection();
		return conn;
	}
	
	/**
	 * Method to get the list of all actors in our database
	 * @return
	 */
	public List<Actor> getAllActors(){
		List<Actor> actorsList = new ArrayList<Actor>();
		try {
			Connection conn = getConnection();
			PreparedStatement stm = conn.prepareStatement("SELECT * FROM actores");
			ResultSet rs = stm.executeQuery();
			while(rs.next()) {
				Actor actorDB = new Actor();
				actorDB.setId(rs.getLong("id"));
				actorDB.setNombreArtistico(rs.getString("nombreArtistico"));
				actorDB.setGenero(rs.getString("genero").charAt(0));
				actorDB.setEdad(rs.getInt("edad"));
				actorsList.add(actorDB);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return actorsList;
	}

}
