package application;
	
import java.io.IOException;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	private static Stage stage;
	public static BorderPane rootLayout;
	
	@Override
	public void start(Stage stage) throws IOException {
		Main.stage = stage;
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("RootLayout.fxml"));
		rootLayout = (BorderPane)loader.load();
		System.out.println(stage);
		initRootLayout();
		showSignInLayout();
//		showIndexLayout();
	}
	
	public void initRootLayout() {
		try {		
			Scene scene = new Scene(rootLayout);
			stage.setScene(scene);
			stage.setResizable(false);
			stage.show();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	public void showIndexLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("Index.fxml"));
			AnchorPane indexLayout = (AnchorPane)loader.load();
			
			rootLayout.setCenter(indexLayout);;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void showSignInLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("SignIn.fxml"));
			AnchorPane signInLayout = (AnchorPane)loader.load();
			
			rootLayout.setCenter(signInLayout);
		}catch(Exception e) {
			e.getStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
	public static Stage getStage() {
		return stage;
	}
	public static BorderPane getRootLayout() {
		return rootLayout;
	}
	
}
