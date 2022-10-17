package application;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class BarraInferior extends HBox {

	public Label nombreUsuario = new Label("Usuario: manutije");
	public static Label estatusRed = new Label("Status: Conectado(online)");
	public Label fechaHora = new Label(LocalDateTime.now().atOffset(ZoneOffset.ofHours(-5)).format(DateTimeFormatter.RFC_1123_DATE_TIME).toString());
	
	public BarraInferior(double arg0) {
		super(arg0);
		this.nombreUsuario.getStyleClass().add("TextoBarra");
		estatusRed.getStyleClass().add("TextoBarra");
		this.fechaHora.getStyleClass().add("TextoBarra");
		
		this.getChildren().addAll(this.nombreUsuario, estatusRed, this.fechaHora);
		
	}
	
	
}
