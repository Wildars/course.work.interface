package Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import model.Chocolate;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class market_Controller implements Initializable {
    @FXML
    private VBox ChosenChocolateCard;

    @FXML
    private Label ChocolateNameLabel;

    @FXML
    private Label ChocolatePieceLabel;

    @FXML
    private ImageView ChocolateImg;

    @FXML
    private ScrollPane scrol;

    @FXML
    private GridPane grid;

    private List<Chocolate> Chocolate = new ArrayList<>();
    private Image image;
    private MyListener myListener;
    private Object itemController;

    private List<Chocolate> getData() {
        List<Chocolate> Chocolates = new ArrayList<>();
        Chocolate Chocolate = null;

        for (int i = 0; i < 20; i++) {
            Chocolate.setName("Mars");
            Chocolate.setPrice(2.99);
            Chocolate.setImgSrc("/img/mars.jpg");
            Chocolate.setColor("6A7324");
            Chocolate.add(Chocolate);
            ;

        }

//        Chocolate = new Chocolate();
//        Chocolate.setName("Mars");
//        Chocolate.setPrice(2.99);
//        Chocolate.setImgSrc("/img/mars.png");
//        Chocolate.setColor("6A7324");
//        Chocolate.add(Chocolate);
//
//        Chocolate = new Chocolate();
//        Chocolate.setName("Bounty");
//        Chocolate.setPrice(3.99);
//        Chocolate.setImgSrc("/img/bounty.png");
//        Chocolate.setColor("A7745B");
//        Chocolate.add(Chocolate);
//
//        Chocolate = new Chocolate();
//        Chocolate.setName("Albeny");
//        Chocolate.setPrice(1.50);
//        Chocolate.setImgSrc("/img/Albeny.png");
//        Chocolate.setColor("F16C31");
//        Chocolate.add(Chocolate);
//
//        Chocolate = new Chocolate();
//        Chocolate.setName("Twix");
//        Chocolate.setPrice(0.99);
//        Chocolate.setImgSrc("/img/twix.png");
//        Chocolate.setColor("291D36");
//        Chocolate.add(Chocolate);
//        return Chocolates;
        return Chocolates;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Chocolate.addAll(getData());

        for (int i=0; i<Chocolate.size(); i++);
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/views/item"));

        itemController = fxmlLoader.getController();
        itemController.notifyAll();
    }
}


