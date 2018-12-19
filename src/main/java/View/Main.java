package View;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


// SOLID
// Algorytme- complex is 1 algo, simpel is 2
// Multithreading
// Pattern

public class Main extends Application
{

    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("View.PokemonGUI"));
        primaryStage.setTitle("FXML Welcome");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public Main(String[] args)
    {
        launch(args);
    }
}
