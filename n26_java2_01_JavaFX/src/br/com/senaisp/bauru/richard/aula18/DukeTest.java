package br.com.senaisp.bauru.richard.aula18;

import br.com.senaisp.bauru.richard.aula17.Duke;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class DukeTest extends Application {

	@Override
	public void start(Stage stg) throws Exception {
		Group root = new Group();
		Duke dk01 = new Duke();
		dk01.setLayoutX(20);
		dk01.setLayoutY(20);
		root.getChildren().add(dk01);
		Scene scena = new Scene(root,400,400,Color.BEIGE);
		stg.setTitle("JavaFX - Duke Test");
		stg.setScene(scena);
		stg.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
