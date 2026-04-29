package br.com.senaisp.bauru.richard.aula17;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class JavaFXCoresEFormas extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button btn01 = new Button("Botão 1");
		Button btn02 = new Button("Botão 2");
		
		btn01.setLayoutX(10);
		btn01.setLayoutY(10);

		btn02.setLayoutX(100);
		btn02.setLayoutY(10);
		
		//Formas
		Rectangle rect = new Rectangle(10,100,150,100);
		rect.setFill(Color.rgb(255, 255, 20, 1));
		rect.setStroke(Color.BLACK);//       +--> Transparência
		rect.setStrokeWidth(2);
		
		Circle circ = new Circle(250, 150, 50, Color.BLUE);
		circ.setStroke(Color.BLACK);
		circ.setStrokeWidth(3);
		
		Ellipse ellip = new Ellipse(150,300,100,50);
		ellip.setFill(Color.VIOLET);
		ellip.setStroke(Color.RED);
		ellip.setStrokeWidth(3);
		
		Group grp = new Group();
		grp.getChildren().addAll(btn01, btn02, rect, circ, ellip);
		
		Scene scena = new Scene(grp,400,400,Color.BEIGE);
		primaryStage.setTitle("JavaFX Cores e Formas");
		primaryStage.setScene(scena);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
