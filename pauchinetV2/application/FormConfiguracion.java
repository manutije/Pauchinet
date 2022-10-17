package application;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class FormConfiguracion extends GridPane {

	public FormConfiguracion() {
		Button borrarPeliculas = new Button("Borrar Peliculas");
		borrarPeliculas.setOnAction(this::deleteMovies);
		
		this.add(borrarPeliculas, 0, 0);
		
	}
	
	
	public void deleteMovies(ActionEvent event) {
		Peliculas peliculasInstance = new Peliculas();
		peliculasInstance.deletePeliculas();
		TablaPeliculas.peliculaList.clear();
	}

}
