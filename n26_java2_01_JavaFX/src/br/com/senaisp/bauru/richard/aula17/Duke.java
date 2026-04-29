package br.com.senaisp.bauru.richard.aula17;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;

public class Duke extends Group {
	//Campos
	private Image dukeImg;
	private ImageView dukeImgVw;
	private Image luvaImg;
	private ImageView luvaImgVw;
	private AudioClip tom;
	//constructor
	public Duke() {
		//Carregar a imagem do Duke
		dukeImg = new Image(getClass()
				.getResource("images/Duke.png").toString());
		dukeImgVw = new ImageView(dukeImg);
		dukeImgVw.setFitWidth(50); //definindo com 50 pixels
		dukeImgVw.setPreserveRatio(true);
		dukeImgVw.setY(10);
		//Carregando a luva
		luvaImg = new Image(getClass()
				.getResource("images/Glove.png").toString());
		luvaImgVw = new ImageView(luvaImg);
		luvaImgVw.setFitWidth(40);
		luvaImgVw.setPreserveRatio(true);
		luvaImgVw.setX(17);
	}
	
}
