package hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root,1280,720,Color.DARKGREEN);

        Image icon = new Image("40.png");
        stage.getIcons().add(icon);
        stage.setTitle("Cards");
        stage.setResizable(false);

        Text instructions = new Text();
        instructions.setText("Click the pile to draw four new random cards");
        instructions.setX(50);
        instructions.setY(50);
        instructions.setFont(Font.font(50));
        instructions.setFill(Color.WHITE);

        Image deck = new Image("cards/backCard.png");
        ImageView deckView = new ImageView(deck);
        Button b = new Button("", deckView);
        deckView.setX(300);
        deckView.setY(300);

        root.getChildren().add(instructions);
        root.getChildren().add(deckView);
        stage.setScene(scene);
        stage.show();
    }
}