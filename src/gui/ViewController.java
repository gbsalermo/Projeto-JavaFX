package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {
	
	//Atributo correspondente ao botão
	@FXML
	private Button btTest;
	
	@FXML
	public void onBtTestAction() {
		System.out.println("click"); //Para ele mostrar que cliquei no botao
	}

}
