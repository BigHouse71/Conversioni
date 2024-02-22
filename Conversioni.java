package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import java.util.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class Conversioni extends Application{
	TextField cNumero=new TextField();
	TextField cBase =new TextField();
	Label eNumero= new Label("numero");
	Label eBase=new Label("Base");
	Label ePrint=new Label();
	Button bCalsocla=new Button("Converti");
	GridPane griglia=new GridPane();
	Hashtable<Integer,String> dizionario=new Hashtable<Integer,String>();

	public void start(Stage finestra) {

		griglia.add(eNumero, 0, 0);
		griglia.add(cNumero, 1, 0);
		griglia.add(eBase, 0, 1);
		griglia.add(cBase, 1, 1);
		griglia.add(bCalsocla, 0, 2);
		griglia.add(ePrint, 0, 3,2,1 );
		bCalsocla.setOnAction(e-> coverzioni());
		Scene scena=new Scene (griglia);
		finestra.setScene(scena);
		finestra.show();
		dizionario.put(10,"A");
		dizionario.put(11,"B");
		dizionario.put(12,"C");
		dizionario.put(13,"D");
		dizionario.put(14,"E");
		dizionario.put(15,"F");
		dizionario.put(16,"G");
	}
	public void coverzioni() {
		String print="";
		int x[]=new int[10];
	
		int numero=Integer.parseInt(cNumero.getText());
		int risultato =numero  ,resto;
		int base=Integer.parseInt(cBase.getText());
		if(numero>1024) {
			ePrint.setText("Nomero troppo alto");
		}else {

			for(int i=x.length-1 ;i>1 && !(risultato==0);i--) {
				risultato=numero/base;

				resto=numero%base;
				if(resto>=10) {
					print+=" "+(dizionario.get(resto));
				}else {
					print+=" "+resto;
				}
				numero=risultato;
			}
		}
		print.trim();
		ePrint.setText(print);
	}
	public static void main(String[] args) {

		launch(args);
	}
}

