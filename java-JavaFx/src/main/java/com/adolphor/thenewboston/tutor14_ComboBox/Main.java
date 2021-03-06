package com.adolphor.thenewboston.tutor14_ComboBox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

  Stage window;
  Scene scene;
  Button button;

  ComboBox<String> comboBox;

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    window = primaryStage;
    window.setTitle("ComboBox example");

    button = new Button("Click me");

    comboBox = new ComboBox<>();
    comboBox.getItems().addAll(
        "Good will hunting",
        "St. Vincent",
        "BlackHat"
    );

    comboBox.setEditable(true); // 可编辑
    comboBox.setPromptText("What's your favorite movie?"); // prompt text

    button.setOnAction(e -> System.out.println(comboBox.getValue()));
    comboBox.setOnAction(e -> System.out.println("User selected is : " + comboBox.getValue()));

    VBox layout = new VBox(10);
    layout.setPadding(new Insets(20, 20, 20, 20));
    layout.getChildren().addAll(comboBox, button);

    scene = new Scene(layout, 500, 300);
    window.setScene(scene);
    window.show();

  }
}
