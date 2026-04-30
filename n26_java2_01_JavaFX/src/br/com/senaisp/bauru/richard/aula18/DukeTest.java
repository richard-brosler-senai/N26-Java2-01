package br.com.senaisp.bauru.richard.aula18;

import br.com.senaisp.bauru.richard.aula17.Duke;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class DukeTest extends Application {

	@Override
	public void start(Stage stg) throws Exception {
		Group root = new Group();
		Duke dk01 = new Duke();
		dk01.setLayoutX(20);
		dk01.setLayoutY(20);
		//Colocando os itens necessários para o vídeo
		Media video = new Media(Duke.class
				.getResource("videos/video.mp4").toString());
		MediaPlayer mp = new MediaPlayer(video);
		//Visualizador de vídeo
		MediaView mvw = new MediaView(mp);
		//Ajustando o MediaView
		mvw.setFitWidth(600);
		mvw.setFitHeight(400);
		mvw.setPreserveRatio(true);
		mvw.setX(100);
		mvw.setY(100);
		//Colocando os botões de controle de mídia
		Button btnPlay = new Button("Play");
		Button btnPause = new Button("Pause");
		Button btnStop = new Button("Stop");
		//Posicionando os botões
		btnPlay.setLayoutX(100);
		btnPause.setLayoutX(200);
		btnStop.setLayoutX(300);

		btnPlay.setLayoutY(450);
		btnPause.setLayoutY(450);
		btnStop.setLayoutY(450);

		//Colocando os eventos
		btnPlay.setOnAction((ev)->{ mp.play(); });
		btnPause.setOnAction((ev)->{ mp.pause(); });
		btnStop.setOnAction((ev)->{ mp.stop(); });
		
		root.getChildren().addAll(dk01,mvw,btnPlay,btnPause,btnStop);
		Scene scena = new Scene(root,800,600,Color.BEIGE);
		stg.setTitle("JavaFX - Duke Test");
		stg.setScene(scena);
		stg.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
