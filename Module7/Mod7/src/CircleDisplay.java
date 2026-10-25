/*
Andrew Estrada
Module 7.2
CSD-420
10/25/26
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Objects;

public class CircleDisplay extends Application {

    @Override
    public void start(Stage primaryStage) {

        Circle circle1 = new Circle(40);
        Circle circle2 = new Circle(40);
        Circle circle3 = new Circle(40);
        Circle circle4 = new Circle(40);

        circle1.getStyleClass().add("plaincircle");
        circle2.getStyleClass().add("plaincircle");

        circle3.setId("redcircle");
        circle4.setId("greencircle");

        HBox root = new HBox(15);
        root.getChildren().addAll(circle1, circle2, circle3, circle4);

        Scene scene = new Scene(root, 400, 120);
        scene.getStylesheets().add(
                Objects.requireNonNull(getClass().getResource("styles.css")).toExternalForm()
        );

        primaryStage.setTitle("Mod 7 Circles");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
