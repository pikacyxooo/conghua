package application;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class CartController {
	@FXML private ImageView productImg;  //��ƷͼƬ
	@FXML private Label productTitle;    //��Ʒ����
	@FXML private Text price;     //�۸�
	@FXML private Text choiceNum;    //ѡ�е���Ʒ��������
	@FXML private Text productType;  //��Ʒ������
	@FXML private Hyperlink collectProduct;
	@FXML private Text totalPrice;   //ѡ�е���Ʒ�۸�
	@FXML private Button payBtn;    //֧����ť
}
