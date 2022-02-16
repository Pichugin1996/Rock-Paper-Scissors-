package com.application.rps;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("rpsgui.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 623, 572);
        stage.setTitle("RPS!");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
        Controller controller = fxmlLoader.getController();
        controller.setContr(controller);

    }


    public static void main(String[] args) {
        launch();
    }
}