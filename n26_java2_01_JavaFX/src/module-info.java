module n26_java2_01_JavaFX {
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.media;
	
	opens br.com.senaisp.bauru.richard.aula16 to 
		javafx.graphics, javafx.controls, javafx.fxml;
	
	opens br.com.senaisp.bauru.richard.aula17 to 
	javafx.graphics, javafx.controls, javafx.fxml;
}