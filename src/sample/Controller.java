package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    public TextField proizvod1;
    public TextField cijena1;
    public TextField proizvod2;
    public TextField cijena2;
    public TextField proizvod3;
    public TextField cijena3;
    public Label ukupno;

    public void ispis(ActionEvent actionEvent) {
        String proizvod=proizvod1.getText()+", "+proizvod2.getText()+", "+proizvod3.getText();
        int cijene=Integer.parseInt(cijena1.getText()) + Integer.parseInt(cijena2.getText()) + Integer.parseInt(cijena3.getText());
        String a=Integer.toString(cijene);
        proizvod+=" "+a;
        ukupno.setText(proizvod);
    }

}
