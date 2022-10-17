package application;


import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class Botones extends HBox {
	
	public Button openConfig = new Button("Configuracion");
	public Button openMovies = new Button("Peliculas & Series");
	public Button openGallery = new Button("Nuestros Momentos");
	public Button openPlanner = new Button("Nuestros Planes Futuros");
	
	public FormPeliculas formPeliculas = new FormPeliculas();
	public FormConfiguracion formConfiguracion = new FormConfiguracion();

	public Botones(double arg0) {
		super(arg0);
		Insets buttonPadding = new Insets(10, 10, 10, 10);
		
		this.setPadding(new Insets(20,10,10,10));
		
		this.openConfig.setPadding(buttonPadding);
		this.openConfig.setMinWidth(200);
		this.openConfig.setMinWidth(200);
		this.openConfig.setOnAction(this::configForm);
		
		this.openMovies.setPadding(buttonPadding);
		this.openMovies.setMinWidth(200);
		this.openMovies.setMaxWidth(200);
		this.openMovies.setOnAction(this::moviesForm);
		
		this.openGallery.setPadding(buttonPadding);
		this.openGallery.setMinWidth(200);
		this.openGallery.setMaxWidth(200);
		
		this.openPlanner.setPadding(buttonPadding);
		this.openPlanner.setMinWidth(200);
		this.openPlanner.setMaxWidth(200);
		
		this.getChildren().addAll(this.openConfig, this.openMovies, this.openGallery, this.openPlanner);
	}
	
	public void moviesForm(ActionEvent event) {
		Main.centerPane.setCenter(this.formPeliculas);
		this.formPeliculas.setAlignment(Pos.TOP_CENTER);
	}
	
	public void configForm(ActionEvent event) {
		Main.centerPane.setCenter(this.formConfiguracion);
		this.formConfiguracion.setAlignment(Pos.TOP_CENTER);
	}
}
