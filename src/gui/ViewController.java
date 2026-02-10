package gui;

import java.util.Locale;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {
	
	@FXML
	private TextField txtNumber1;
	@FXML
	private TextField txtNumber2;
	
	@FXML
	private Label labelResult;
	
	//Atributo correspondente ao botão
	/*@FXML ButtonTest
	private Button btTest;*/
	
	@FXML
	private Button btSum;
	
	/*@FXML Test Action
	public void onBtTestAction() {
		//System.out.println("click"); //Para ele mostrar que cliquei no botao
		Alerts.showAlert("Alert title", "Alert header", "Hello", AlertType.INFORMATION);
	}*/

	@FXML
	public void onBtSumAcion() {
		try {
		Locale.setDefault(Locale.US);
		//Uso o parse Double para converter o valor de String para Double
		double number1 = Double.parseDouble(txtNumber1.getText());
		double number2 = Double.parseDouble(txtNumber2.getText());
		double sum = number1 + number2;
		labelResult.setText(String.format("%.2f", sum));
	} catch(NumberFormatException e){
		Alerts.showAlert("Error", "Parse error", e.getMessage(), AlertType.ERROR);
	}
		
	}
}
