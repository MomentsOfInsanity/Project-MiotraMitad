package p1;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EventHandlerExampleS01E03 extends Application
{

    public static void main(String[] args)
    {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {

        Button button = new Button("Press to continue");
        Label label = new Label("Good Morning, Yukta!");

        EventHandler myHandler = new SimpleEventHandler(label);
        button.setOnAction(myHandler);

        primaryStage.setTitle("S01E02");

        VBox pane = new VBox(20);
        pane.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(label, button);

        primaryStage.setScene(new Scene(pane, 500, 150));
        primaryStage.show();

    }

}