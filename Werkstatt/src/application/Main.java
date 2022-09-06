package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main extends Application {
	
	
	
	public void start(Stage primaryStage) throws Exception {
		Parent werkscht = FXMLLoader.load(getClass().getResource("Werkscht.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(werkscht, 625, 700));
        primaryStage.show();
	}		
	
	public static void main(String[] args) {
			launch(args);
		}


}