package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import main.Main;
import model.Chocolate;

public class itemController {
    @FXML
    private Label NameLable;

    @FXML
    private Label PieceLabel;

    @FXML
    private ImageView Img;

    private Chocolate chocolate;
    private model.Chocolate Chocolate;

    public void setData(Chocolate chocolate) {


        this.Chocolate = chocolate;
        java.awt.Label nameLabel = null;
        nameLabel.setText(chocolate.getName());
        java.awt.Label priceLabile;
        priceLabile = null;
        priceLabile.setText(chocolate.getName());
        priceLabile.setText(Main.CURRENCY + chocolate.getPrice());
        Image image = new Image(getClass().getResourceAsStream(chocolate.getImgSrc()));
        Img.setImage(image);
    }

}