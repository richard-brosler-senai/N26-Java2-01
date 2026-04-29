package br.com.senaisp.bauru.richard.aula16;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn01 = new Button();
		Button btn02 = new Button();
		btn01.setText("Hello World!");
		btn02.setText("222");
		//StackPane root = new StackPane();
		//TilePane root = new TilePane();
		//HBox root = new HBox();
		//FlowPane root = new FlowPane();
		//VBox root = new VBox();
		Group root = new Group();
		root.getChildren().add(btn01);
		root.getChildren().add(btn02);
		btn02.setLayoutX(200);
		btn02.setLayoutY(200);
		
		Scene scena = new Scene(root, 300, 250);
		
		primaryStage.setTitle("Exemplo JavaFX Sem Módulo");
		primaryStage.setScene(scena);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
