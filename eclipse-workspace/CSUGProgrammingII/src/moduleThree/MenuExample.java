package moduleThree;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class MenuExample extends Application {
	
	/**
	 * @author Cindy Cao
	 * @param text box to display the menu results, and a box root
	 * Purpose: to create a menu and when each menu is being clicked, certain actions will be triggered.
	 */

    private TextArea textBox;
    private VBox root;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Menu Example");

        // Create the actual menu list
        Menu menu = new Menu("Options");
        MenuItem menuItem1 = new MenuItem("Print Date and Time");
        MenuItem menuItem2 = new MenuItem("Write Text to log.txt");
        MenuItem menuItem3 = new MenuItem("Change Background Color");
        MenuItem menuItem4 = new MenuItem("Exit");

        // Add menu items to the menu
        menu.getItems().addAll(menuItem1, menuItem2, menuItem3, menuItem4);

        // Create MenuBar and add the menu to it
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu);

        // Create a TextArea (TextBox equivalent in JavaFX)
        textBox = new TextArea();
        textBox.setPrefHeight(100);
        textBox.setPromptText("Action results will appear here...");

        // Create the root layout
        root = new VBox();
        root.getChildren().addAll(menuBar, textBox);

        // Create Scene and set it to the stage
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);

        // Add Event Handlers for each menu item
        menuItem1.setOnAction(event -> handlePrintDateTime());
        menuItem2.setOnAction(event -> handleWriteToFile());
        menuItem3.setOnAction(event -> handleChangeBackgroundColor());
        menuItem4.setOnAction(event -> handleExit());

        primaryStage.show();
    }

    // Handle Menu Item 1: Print Date and Time
    private void handlePrintDateTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        textBox.setText(dtf.format(now));
    }

    // Handle Menu Item 2: Write Text to log.txt
    private void handleWriteToFile() {
        String content = textBox.getText();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt"))) {
            writer.write(content);
            textBox.appendText("\nText written to log.txt");
        } catch (IOException e) {
            textBox.appendText("\nError writing to file.");
        }
    }

    // Handle Menu Item 3: Change Background Color to Random Green Hue
    private void handleChangeBackgroundColor() {
        Random rand = new Random();
        // Generate a random hue in the green color range (100° to 140° on the color wheel)
        double hue = 100 + rand.nextDouble() * 40;
        String colorString = String.format("-fx-background-color: hsb(%.2f, 100%%, 100%%);", hue);
        root.setStyle(colorString);
        textBox.appendText("\nBackground changed to green hue: " + hue);
    }

    // Handle Menu Item 4: Exit Application
    private void handleExit() {
        System.exit(0);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
