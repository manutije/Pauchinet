package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TablaPeliculas extends TableView<Pelicula> {
	
	public static ObservableList<Pelicula> peliculaList;
	
	
	public TablaPeliculas(){
		
		TableColumn<Pelicula, String> tipoCol = new TableColumn<Pelicula, String>("Serie/Pelicula");
		TableColumn<Pelicula, String> nombreCol = new TableColumn<Pelicula, String>("Nombre");
		TableColumn<Pelicula, String> plataformaCol = new TableColumn<Pelicula, String>("Plataforma");
		TableColumn<Pelicula, String> generoCol = new TableColumn<Pelicula, String>("Genero");
		TableColumn<Pelicula, String> imdbCol = new TableColumn<Pelicula, String>("IMDB");
		TableColumn<Pelicula, String> comentariosCol = new TableColumn<Pelicula, String>("Comentarios");
		
		tipoCol.setCellValueFactory(new PropertyValueFactory<Pelicula,String>("Tipo"));
		nombreCol.setCellValueFactory(new PropertyValueFactory<Pelicula,String>("Nombre"));
		plataformaCol.setCellValueFactory(new PropertyValueFactory<Pelicula,String>("Plataforma"));
		generoCol.setCellValueFactory(new PropertyValueFactory<Pelicula,String>("Genero"));
		imdbCol.setCellValueFactory(new PropertyValueFactory<Pelicula,String>("Imdb"));
		comentariosCol.setCellValueFactory(new PropertyValueFactory<Pelicula,String>("Comentarios"));
		
		this.getColumns().add(tipoCol);
		this.getColumns().add(nombreCol);
		this.getColumns().add(plataformaCol);
		this.getColumns().add(generoCol);
		this.getColumns().add(imdbCol);
		this.getColumns().add(comentariosCol);
		
		Peliculas peliculasCarga = new Peliculas();
		
		peliculaList = FXCollections.observableList(peliculasCarga.getPeliculas());
		this.setItems(peliculaList);
	}
	
	public void addPelicula(Pelicula pelicula) {
		peliculaList.add(pelicula);
	}
	
}
