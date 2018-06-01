package application;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class CartController {
	@FXML private ImageView productImg;  //商品图片
	@FXML private Label productTitle;    //商品名称
	@FXML private Text price;     //价格
	@FXML private Text choiceNum;    //选中的商品数量数量
	@FXML private Text productType;  //商品的类型
	@FXML private Hyperlink collectProduct;
	@FXML private Text totalPrice;   //选中的商品价格
	@FXML private Button payBtn;    //支付按钮
}
