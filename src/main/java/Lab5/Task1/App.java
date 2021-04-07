package Lab5.Task1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResource("../../main.fxml"));
        stage.setTitle("Проста форма");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
