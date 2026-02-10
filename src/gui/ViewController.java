package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class ViewController {
	
	//Atributo correspondente ao botão
	@FXML
	private Button btTest;
	
	@FXML
	public void onBtTestAction() {
		//System.out.println("click"); //Para ele mostrar que cliquei no botao
		Alerts.showAlert("Alert title", "Alert header", "Hello", AlertType.INFORMATION);
	}

}
