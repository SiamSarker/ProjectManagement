package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Grad System");
        primaryStage.setScene(new Scene(root, 585, 496));
        primaryStage.show();
    }

//  task

    // take 3 input from text field then show some in another

    public static void main(String[] args) {
        launch(args);
    }
}
