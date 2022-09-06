package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class WerkschtController implements Initializable {

	
	
	@FXML
	private TextArea txta_info;
	
	public void funcSearch()
	{
	txta_info.setText("Hi");
	System.out.println("Sehr gut gemacht");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public static void dbConnect()
	{
		String url = "jdbc:mysql://localhost:3306/javabase";
		String username = "java";
		String password = "password";

		System.out.println("Connecting database...");

		try(Connection connection = DriverManager.getConnection(url, username, password)) {
		    System.out.println("Database connected!");
		} 
		catch(SQLException e) {
		    throw new IllegalStateException("Cannot connect the database!", e);
		}
	}
	
	
}
