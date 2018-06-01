package application;

import java.awt.Label;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class productController {
	@FXML Label productTitle;    //商品名称
	@FXML Label productDesc;     //商品简介
	@FXML Label normalPrice;     //价格
	@FXML Label discountPrice;   //折扣价
	@FXML Text stock;            //商品库存
	@FXML TextField numberField;    //购买数量
	@FXML Text productId;           //商品id
	@FXML Text productDetailDesc;    //商品介绍详情
	@FXML protected void handlePlus(ActionEvent event) {
		String productNum = numberField.getText();
		int num = Integer.valueOf(productNum);
		num++;
		productNum = Integer.toString(num);
		numberField.setText(productNum);
	}
	@FXML protected void handleMinus(ActionEvent event) {
		String productNum = numberField.getText();
		int num = Integer.valueOf(productNum);
		num--;
		productNum = Integer.toString(num);
		numberField.setText(productNum);
	}
}
