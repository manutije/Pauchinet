package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	
	public Botones mainMenu = new Botones(10);
	public BarraInferior barra = new BarraInferior(30);
	public FormPeliculas formPeliculas = new FormPeliculas();
	
	public static BorderPane centerPane = new BorderPane();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			//------------------------------------------------------------
			// REMOVER CUANDO FUNCIONE EL MENU
			this.formPeliculas.setAlignment(Pos.TOP_CENTER);
			centerPane.setCenter(this.formPeliculas);
			
			//------------------------------------------------------------
			BorderPane root = new BorderPane();
			
			this.mainMenu.setAlignment(Pos.CENTER);
			this.barra.setAlignment(Pos.CENTER);
			this.barra.getStyleClass().add("BarraInferior");
			
			root.setTop(this.mainMenu);
			root.setCenter(centerPane);
			root.setBottom(barra);
			
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("PAUCHINET");
			primaryStage.setMaximized(true);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
