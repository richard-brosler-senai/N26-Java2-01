package br.com.senaisp.bauru.richard.aula17;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class JavaFXGradiente extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Group root = new Group();
		//Criando linha gradiente
		LinearGradient lg = new LinearGradient(
				//StartX, StartY, EndX, EndY
				0, 1, 1, 0, 
				//Proporcional, Repetição ou não
				true, CycleMethod.NO_CYCLE, 
				//Pontos para cores
				new Stop[] {
					new Stop(0,Color.BLACK),
					new Stop(0.5,Color.YELLOW),
					new Stop(1,Color.BLUE)
				});
		RadialGradient rg = new RadialGradient(
				//Angulo Foco, Dist Foco, CentroX, CentroY, Raio 
				0, 0, 0.5, 0.5, 1, 
				//Proporcional, Forma Ciclos
				true, CycleMethod.NO_CYCLE, 
				//Pontos
				new Stop[] {
					new Stop(0,Color.YELLOW),
					new Stop(0.25,Color.RED),
					new Stop(0.5,Color.TRANSPARENT)
				});
		//Montando um triângulo
		Polygon triangulo = new Polygon(new double[] {
				210.0, 10.0,
				210.0, 210.0,
				10.0, 210.0
		});
		//triangulo.setFill(Color.rgb(0,0,255,0.5));
		//triangulo.setFill(lg);
		triangulo.setFill(rg);
		triangulo.setLayoutX(50);
		triangulo.setLayoutY(50);
		root.getChildren().add(triangulo);
		
		Scene scena = new Scene(root,400,400,Color.BLACK);
		
		primaryStage.setTitle("JavaFX - Gradientes");
		primaryStage.setScene(scena);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
