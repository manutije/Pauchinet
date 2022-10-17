package application;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class FormConfiguracion extends GridPane {

	public FormConfiguracion() {
		
		this.setPadding(new Insets(30, 10, 10, 10));
		this.setVgap(10);
		this.setHgap(30);
		
		Label tituloForm = new Label ("CONFIGURACION DE PAUCHINET");
		tituloForm.getStyleClass().add("Titulos");
		tituloForm.setMinWidth(630);
		tituloForm.setAlignment(Pos.CENTER);
		
		Button borrarPeliculas = new Button("Borrar Peliculas");
		borrarPeliculas.setOnAction(this::deleteMovies);
		borrarPeliculas.setMinWidth(300);
		
		Button nombreUsuario = new Button("Nombre de Usuario");
		nombreUsuario.setMinWidth(300);
		
		Button regresar = new Button("Regresar");
		regresar.setOnAction(this::goBack);
		regresar.setMinWidth(300);
		
		
		this.add(tituloForm, 0, 0, 2, 1);
		this.add(borrarPeliculas, 0, 1);
		this.add(nombreUsuario, 1, 1);
		this.add(regresar, 0, 2);
		
	}
	
	
	public void deleteMovies(ActionEvent event) {
		Peliculas peliculasInstance = new Peliculas();
		peliculasInstance.deletePeliculas();
		TablaPeliculas.peliculaList.clear();
	}
	
public void goBack(ActionEvent event) {
		Main.centerPane.setCenter(Main.tablaPeliculas);
	}

}
