package application;

import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.TextAlignment;

public class FormPeliculas extends GridPane {
	
	private ChoiceBox<String> tipoI = new ChoiceBox<String>(FXCollections.observableArrayList("SERIE", "PELICULA", "OTRO"));
	private TextField nombreI = new TextField();
	private ChoiceBox<String> plataformaI = new ChoiceBox<String>(FXCollections.observableArrayList("AMAZON", "DISNEY", "HBO MAX", "NETFLIX", "PARAMOUNT","STARPLUS", "OTRO"));
	private ChoiceBox<String> generoI = new ChoiceBox<String>(FXCollections.observableArrayList("ACCION", "CIENCIA FICCION", "COMEDIA", "DOCUMENTAL", "DRAMA", "SUSPENSO", "TERROR", "OTRO"));
	private TextField imdbI = new TextField();
	private TextArea comentariosI = new TextArea();
	
	public FormPeliculas() {
		// 
		this.setPadding(new Insets(10, 10, 10, 10));
		this.setVgap(10);
		this.setHgap(30);
		
		Label tituloForm = new Label("Insertar Pelicula & Serie");
		
		Label tipoL = new Label("Serie/Pelicula: ");
		Label nombreL = new Label("Nombre: ");
		Label plataformaL = new Label("Plataforma: ");
		Label generoL = new Label("Genero: ");
		Label imdbL = new Label("Link de IMDB: ");
		Label comentariosL = new Label("Comentarios: ");
		
		Button guardarB = new Button("Guardar");
		
		this.add(tituloForm, 2, 0, 2, 1);
		tituloForm.setTextAlignment(TextAlignment.CENTER);
		
		this.add(tipoL, 0, 1);
		this.add(this.tipoI, 1, 1);
		this.tipoI.setMaxWidth(300);
		
		this.add(nombreL, 2, 1);
		this.add(this.nombreI, 3, 1);
		this.nombreI.setMaxWidth(300);
		
		this.add(plataformaL, 0, 2);
		this.add(this.plataformaI, 1, 2);
		this.plataformaI.setMaxWidth(300);
		
		this.add(generoL, 2, 2);
		this.add(this.generoI, 3, 2);
		this.generoI.setMaxWidth(300);
		
		this.add(imdbL, 0, 3);
		this.add(this.imdbI, 1, 3);
		this.imdbI.setMaxWidth(300);
		
		this.add(comentariosL, 2, 3);
		this.add(this.comentariosI, 3, 3);
		this.comentariosI.setMaxWidth(300);
		this.comentariosI.setMaxHeight(60);
		this.comentariosI.setWrapText(true);
		
		this.add(guardarB, 2, 4, 2, 1);
		guardarB.setAlignment(Pos.CENTER);
	}

}