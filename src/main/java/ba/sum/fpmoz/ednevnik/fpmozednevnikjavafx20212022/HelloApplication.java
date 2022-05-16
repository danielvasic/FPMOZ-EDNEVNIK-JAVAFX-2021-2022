package ba.sum.fpmoz.ednevnik.fpmozednevnikjavafx20212022;

import ba.sum.fpmoz.ednevnik.fpmozednevnikjavafx20212022.model.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try {
            Table.create(User.class);
            Table.create(Course.class);
            Table.create(Grade.class);
            Table.create(Hour.class);
            Table.create(Mark.class);
            Table.create(Enrollment.class);
        } catch (SQLException e) {
            System.out.println("Nastala je greška:" + e.getMessage());
        }

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}