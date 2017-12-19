package com.adolphor.thenewboston.tutor21_22_Making_Menus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

	Stage window;
	BorderPane layout;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("menu example");

		Menu fileMenu = new Menu("File");

		MenuItem newfile = new MenuItem("New...");
		newfile.setOnAction(e -> System.out.println("Create a new file..."));
		fileMenu.getItems().add(newfile);

		fileMenu.getItems().add(new MenuItem("Open..."));
		fileMenu.getItems().add(new MenuItem("Save..."));
		fileMenu.getItems().add(new SeparatorMenuItem());
		fileMenu.getItems().add(new MenuItem("Settings..."));
		fileMenu.getItems().add(new SeparatorMenuItem());
		fileMenu.getItems().add(new MenuItem("Exist..."));

		Menu editMenu = new Menu("Edit");
		editMenu.getItems().add(new MenuItem("Cut"));
		editMenu.getItems().add(new MenuItem("Copy"));

		MenuItem paste = new MenuItem("Paste");
		paste.setOnAction(e -> System.out.println("Pasting some crap..."));
		paste.setDisable(true);
		editMenu.getItems().add(paste);

		Menu helpMenu = new Menu("Help");
		CheckMenuItem showlines = new CheckMenuItem("Show line numbers");
		showlines.setOnAction(e -> {
			if (showlines.isSelected()) {
				System.out.println("Program will now display line numbers...");
			} else {
				System.out.println("Hiding line numbers...");
			}
		});
		CheckMenuItem autoSave = new CheckMenuItem("Enable auto save");
		autoSave.setSelected(true);
		helpMenu.getItems().addAll(showlines, autoSave);

		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);

		layout = new BorderPane();
		layout.setTop(menuBar);

		Scene scene = new Scene(layout, 500, 300);
		window.setScene(scene);
		window.show();
	}
}