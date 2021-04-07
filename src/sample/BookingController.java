package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.FixedWidth;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BookingController extends CommonMethods implements Initializable {

    @FXML
    private TextField fxName;
    @FXML
    private TextField fxEmail;
    @FXML
    private TextField fxCCNo;

    private Booking booking;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void newBooking(User user, TravelPackage travelPackage, int ccinfo) {
        booking = new Booking(user, travelPackage, ccinfo);

    }
    public void removeBooking() {
        //
    }


}
