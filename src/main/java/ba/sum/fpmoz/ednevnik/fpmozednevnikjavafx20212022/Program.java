package ba.sum.fpmoz.ednevnik.fpmozednevnikjavafx20212022;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;


import java.io.IOException;

public class Program extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Program.class.getResource("intro-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        stage.setTitle("Dobrodošli na sustav!");

        stage.setScene(scene);
        stage.show();
    }

    public static void swapScene (Stage stage, String viewName, String title){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Program.class.getResource(viewName));
            Scene scene = new Scene(fxmlLoader.load(), 350, 270);
            scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
            stage.setTitle(title);
            stage.setScene(scene);
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("Nastala je pogreška: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch();
    }
}