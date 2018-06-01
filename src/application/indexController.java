package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class indexController {
	@FXML Pane productPane;			//商品面板标签
	@FXML ImageView productImg;		//商品图片标签
	@FXML Label productTitle;		//商品名称标签
	@FXML Label productPrice;      //商品价格标签
	@FXML Button toProductPageBtn;  //跳转到商品详情页面按钮
}
