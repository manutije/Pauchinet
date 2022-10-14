package application;


import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class Botones extends HBox {
	
	public Button openChat = new Button("Chat Privado");
	public Button openMovies = new Button("Peliculas & Series");
	public Button openGallery = new Button("Nuestros Momentos");
	public Button openPlanner = new Button("Nuestros Planes Futuros");
	
	public FormPeliculas formPeliculas = new FormPeliculas();

	public Botones(double arg0) {
		super(arg0);
		Insets buttonPadding = new Insets(10, 10, 10, 10);
		
		this.setPadding(new Insets(20,10,10,10));
		
		this.openChat.setPadding(buttonPadding);
		this.openChat.setMinWidth(200);
		this.openChat.setMinWidth(200);
		
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
		
		this.getChildren().addAll(this.openChat, this.openMovies, this.openGallery, this.openPlanner);
	}
	
	public void moviesForm(ActionEvent event) {
		Main.centerPane.setCenter(this.formPeliculas);
		this.formPeliculas.setAlignment(Pos.TOP_CENTER);
	}
}
