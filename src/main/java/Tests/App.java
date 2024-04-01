package Tests;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/DemandeStage.fxml"));
    @Override
    public void start(Stage stage) throws Exception {
//        Parent parent = FXMLLoader.load(getClass().getResource("/Fxml/DemandeStage.fxml"));
        Parent parent = loader.load();
        Scene scene = new Scene(parent);
        stage.setTitle("hello world !");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
