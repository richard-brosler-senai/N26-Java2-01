module n26_java2_02_javafx {
	requires javafx.graphics;
	requires javafx.controls;
	opens br.com.senaisp.bauru.richard.aula15 to javafx.controls, javafx.graphics, javafx.fxml;
}