package br.com.senaisp.bauru.richard.aula17;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class JavaFXEstrela extends Application {

	@Override
	public void start(Stage stg) throws Exception {
		Group root = new Group();
		Polygon est01 = new Polygon(new double[] {
			100.0, 0.0,
			200.0, 170.0,
			0.0, 170.0
		});
		Polygon est02 = new Polygon(new double[] {
			0, 0,
			200.0, 0,
			100.0, 170.0
		});
		est01.setFill(Color.TRANSPARENT);
		est02.setFill(Color.TRANSPARENT);
		est01.setStroke(Color.BLUE);
		est02.setStroke(Color.BLUE);
		est01.setStrokeWidth(10);
		est02.setStrokeWidth(10);
		//Ajustando posição
		est01.setLayoutX(50);
		est01.setLayoutY(50);
		est02.setLayoutX(50);
		est02.setLayoutY(100);
		//
		root.getChildren().addAll(est01,est02);
		Scene scena = new Scene(root,400,400,Color.BEIGE);
		stg.setTitle("JavaFX - Estrela de Davi");
		stg.setScene(scena);
		stg.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
