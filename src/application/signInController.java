package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class signInController {
	@FXML private Button signInBtn;
	@FXML private TextField loginField;
	@FXML private Text loginTitle;
	@FXML protected void handleSignInBtn(ActionEvent event) {
			loginTitle.setText("感谢注册葱花购物商城");
			loginTitle.setUnderline(true);
//			Stage newStage = new Stage();
//			newStage.setTitle("test");
//			newStage.show();
		}

}
