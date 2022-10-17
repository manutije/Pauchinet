package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
				            + "loginTimeout=2;";
	public Connection connection;
	
	
	public Peliculas() {
		try {
			this.connection = DriverManager.getConnection(connectionUrl);
			Statement statement = this.connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM dbo.Peliculas;");                       
                   while( rs.next()){
                	   Pelicula pelicula = new Pelicula();
                	   pelicula.setTipo(rs.getString(2));
                	   pelicula.setNombre(rs.getString(3));
                	   pelicula.setPlataforma(rs.getString(4));
                	   pelicula.setGenero(rs.getString(5));
                	   pelicula.setImdb(rs.getString(6));
                	   pelicula.setComentarios(rs.getString(7));
                	   this.peliculas.add(pelicula);
                   }
            rs.close();
            statement.close();
		} catch (SQLException e) {
			BarraInferior.estatusRed.setText("Desconectado: (Offline)");
		} 
	}
	
	
	public void addPelicula(Pelicula pelicula) {
		String insertSql = "INSERT INTO dbo.Peliculas (tipo, nombre, plataforma, genero, imdb, comentarios, usuario) VALUES "
	                + "(?,?,?,?,?,?,?);";

        try {
        	PreparedStatement insertPelicula = this.connection.prepareStatement(insertSql);
        	insertPelicula.setString(1, pelicula.getTipo());
        	insertPelicula.setString(2, pelicula.getNombre());
        	insertPelicula.setString(3, pelicula.getPlataforma());
        	insertPelicula.setString(4, pelicula.getGenero());
        	insertPelicula.setString(5, pelicula.getImdb());
        	insertPelicula.setString(6, pelicula.getComentarios());
        	insertPelicula.setString(7, "MANUTIJE");
            insertPelicula.execute();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
        this.peliculas.add(pelicula);
	}
	
	public ArrayList<Pelicula> getPeliculas(){
		
		return this.peliculas;
	}
	
	public void deletePeliculas() {
		PreparedStatement statement;
		try {
			statement = this.connection.prepareStatement("TRUNCATE TABLE dbo.Peliculas;");
			statement.execute();	
			this.peliculas.clear();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}
