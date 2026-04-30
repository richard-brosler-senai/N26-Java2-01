module javafx_projeto {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens br.com.senaisp.bauru.richard.aula18 to javafx.graphics, javafx.fxml;
}
