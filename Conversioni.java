package it.edu.iisgubbio.TPSIT;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class Conversioni extends Application{
	TextField cNumero=new TextField();
	TextField cBase =new TextField();
	Label eNumero= new Label("Nuemro");
	Label eBase=new Label("Base");
	Label ePrinti=new Label();
	Button bCalsocla=new Button();
	GridPane griglia=new GridPane();
	public void start (Stage finestra) {
		Scene scena=new Scene (griglia);
		finestra.setScene(scena);
		finestra.show();
		
	}
	public static void main(String[] args) {

		launch(args);
	}
}
