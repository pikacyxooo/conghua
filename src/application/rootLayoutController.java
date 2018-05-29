package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.AnchorPane;


public class rootLayoutController {
	@FXML private Hyperlink signInLink;
	@FXML protected void handleSignInLinkClick(ActionEvent event) {
		System.out.println("I was clicked");
		try {
			 FXMLLoader loader = new FXMLLoader();
			 loader.setLocation(getClass().getResource("product.fxml"));
			 AnchorPane signInLayout = (AnchorPane)loader.load();
			 Scene scene = new Scene(signInLayout);
			 System.out.println(Main.rootLayout);
			 System.out.println("yo");
			 Main.rootLayout.setCenter(signInLayout);
			 
		}catch(Exception e) {
			e.getStackTrace();
		}
	}
}
