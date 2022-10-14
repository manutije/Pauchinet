package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Peliculas {

	public ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
	public String connectionUrl =
				            "jdbc:sqlserver://tijenet.database.windows.net:1433;"
				            + "database=tijenet;"
				            + "user=manutije@tijenet;"
				            + "password=@Avanti2;"
				            + "encrypt=true;"
				            + "trustServerCertificate=false;"
				            + "loginTimeout=30;";
	public Connection connection;
	
	public Peliculas() {
		try {
			this.connection = DriverManager.getConnection(connectionUrl);
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	public void addPelicula(Pelicula pelicula) {
		String insertSql = "INSERT INTO dbo.Peliculas (tipo, nombre, plataforma, genero, imdb, comentarios) VALUES "
	                + "(?,?,?,?,?,?);";

        try {
        	PreparedStatement insertPelicula = this.connection.prepareStatement(insertSql);
        	insertPelicula.setString(1, pelicula.getTipo());
        	insertPelicula.setString(2, pelicula.getNombre());
        	insertPelicula.setString(3, pelicula.getPlataforma());
        	insertPelicula.setString(4, pelicula.getGenero());
        	insertPelicula.setString(5, pelicula.getImdb());
        	insertPelicula.setString(6, pelicula.getComentarios());
            insertPelicula.execute();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
	}
}
