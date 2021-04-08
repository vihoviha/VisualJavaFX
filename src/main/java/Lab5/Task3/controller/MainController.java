package Lab5.Task3.controller;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private ComboBox comb;
    @FXML
    private ChoiceBox choiceB;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> iceCreamVariants = FXCollections
                .observableArrayList("Пломбір", "Шоколадне", "Ванільне");
        comb.setItems(iceCreamVariants);
        comb.setValue(iceCreamVariants.get(0));

        ObservableList<String> JamVariants = FXCollections
                .observableArrayList("Полуничний", "Банановий", "Яблучний", "Апельсиновий","Грушевий");
        choiceB.setItems(JamVariants);
        choiceB.setValue(JamVariants.get(0));

    }
}
