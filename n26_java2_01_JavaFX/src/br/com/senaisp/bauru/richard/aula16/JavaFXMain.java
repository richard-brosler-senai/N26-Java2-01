package br.com.senaisp.bauru.richard.aula16;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class JavaFXMain extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Group root = new Group();
		HBox cmpHBox = new HBox();
		Rectangle cmpRect = new Rectangle(100,100,Color.BLUE);
		Text cmpTxt = new Text("Dorm 6:\n200");
		Image cmpImg = new Image(JavaFXMain.class
				.getResourceAsStream("Duke.png"));
		ImageView cmpImgVw = new ImageView(cmpImg);
		Button btn01 = new Button("Say 'Hello World'");
		Button btn02 = new Button("222");
		Button btn03 = new Button("33333");
		// Ajustando os componentes
		root.getChildren().addAll(cmpHBox,cmpRect,cmpTxt,cmpImgVw);
		cmpHBox.getChildren().addAll(btn01,btn02,btn03);
		//Ajustes de posição e cor
		cmpHBox.setLayoutY(300);
		cmpHBox.setPrefWidth(400);
		
		cmpRect.setLayoutX(10);
		cmpRect.setLayoutY(10);
		cmpRect.setStroke(Color.ORANGE);
		cmpRect.setStrokeWidth(10);
		
		cmpTxt.setLayoutX(120);
		cmpTxt.setLayoutY(200);
		cmpTxt.setFont(Font.font("Verdana",FontWeight.BOLD,30));
		cmpTxt.setFill(Color.RED);
		cmpTxt.setTextAlignment(TextAlignment.CENTER);
		cmpTxt.setStroke(Color.BLACK);
		cmpTxt.setStrokeWidth(5);
		cmpTxt.setStrokeType(StrokeType.OUTSIDE);
		cmpTxt.setStrokeLineCap(StrokeLineCap.ROUND);
		cmpTxt.setStrokeLineJoin(StrokeLineJoin.ROUND);
		//Efeitos no texto (sombra)
		DropShadow ds = new DropShadow();
		ds.setColor(Color.BLACK);
		cmpTxt.setEffect(ds);
		
		cmpImgVw.setLayoutX(290);
		cmpImgVw.setLayoutY(10);
		cmpImgVw.setFitWidth(100); //ajustar para o tamanho 
		cmpImgVw.setPreserveRatio(true); //manter proporção
		
		//Ajustando os botões no HBox
		HBox.setHgrow(btn01, Priority.ALWAYS);
		HBox.setHgrow(btn02, Priority.ALWAYS);
		HBox.setHgrow(btn03, Priority.ALWAYS);
		
		btn01.setMaxWidth(Double.MAX_VALUE);
		btn02.setMaxWidth(Double.MAX_VALUE);
		btn03.setMaxWidth(Double.MAX_VALUE);
		
		//Montando a tela
		Scene scena = new Scene(root,400,400);
		primaryStage.setTitle("Itens JavaFX");
		primaryStage.setScene(scena);
		primaryStage.show();
	}

}
