package br.com.senaisp.bauru.richard.aula18;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class PrincipalController {
	@FXML Button btnClicar;

	@FXML public void btnClicarClick(ActionEvent event) {
		System.out.println("Fui Clicado!!");
	}
	
}
