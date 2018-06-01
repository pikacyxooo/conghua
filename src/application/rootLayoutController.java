package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.AnchorPane;


public class rootLayoutController {
	@FXML private Hyperlink signInLink;
	@FXML protected void handleSignInPageClick(ActionEvent event) {
		try {
			 FXMLLoader loader = new FXMLLoader();
			 loader.setLocation(getClass().getResource("SignIn.fxml"));
			 AnchorPane signInLayout = (AnchorPane)loader.load();
			 Main.rootLayout.setCenter(signInLayout);
		}catch(Exception e) {
			e.getStackTrace();
		}
	}
	@FXML protected void handleIndexPageClick(ActionEvent event) {		
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("index.fxml"));
			AnchorPane indexLayout = (AnchorPane)loader.load();
			Main.rootLayout.setCenter(indexLayout);
		}catch(Exception e) {
			e.getStackTrace();
		}
	}
	@FXML protected void handleSignUpPageClick(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("SignUp.fxml"));
			AnchorPane signUpLayout = (AnchorPane)loader.load();
			Main.rootLayout.setCenter(signUpLayout);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
