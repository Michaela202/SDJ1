import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.control.*;
import javafx.scene.text.*;
import org.w3c.dom.Text;

import javax.swing.*;

public class GUI_Align extends Application
{
  private Scene scene;
  private VBox Pane1;
  private VBox secondPane;
  private HBox mainPane;
  private GridPane Pane;
  private TextField x;
  private TextField y;
  private Label label_x;
  private Label label_y;
  private Button OK;
  private Button cancel;
  private Button clear;
  private CheckBox ExitOnOK;
  private CheckBox ExitOnCancel;

  public void start(Stage window)
  {
    window.setTitle("Align");
    ExitOnOK = new CheckBox("Exit on OK");
    ExitOnCancel = new CheckBox("Exit on Cancel");
    label_x = new Label("X:");
    label_y = new Label(" Y:");
    x = new TextField();
    y = new TextField();
    OK = new Button("OK");
    OK.setPrefWidth(60);
    cancel = new Button("Cancel");
    cancel.setPrefWidth(60);
    clear = new Button("Clear");
    clear.setPrefWidth(60);

    Pane1 = new VBox(5);
    Pane1.setAlignment(Pos.BASELINE_LEFT);
    Pane1.setPadding(new Insets(5, 10, 0, 10));

    Pane1.getChildren().add(ExitOnOK);
    Pane1.getChildren().add(ExitOnCancel);

    Pane = new GridPane();
    Pane.setAlignment(Pos.BASELINE_CENTER);
    Pane.setPadding(new Insets(5, 10, 5, 10));
    Pane.addRow(0,label_x,x);
    Pane.addRow(1,label_y,y);

    secondPane = new VBox(3);
    secondPane.setAlignment(Pos.BASELINE_CENTER);
    secondPane.setPadding(new Insets(5, 10, 0, 10));
    secondPane.getChildren().add(OK);
    secondPane.getChildren().add(cancel);
    secondPane.getChildren().add(clear);

    mainPane = new HBox();
    mainPane.setAlignment(Pos.BASELINE_CENTER);
    mainPane.setPadding(new Insets(5, 10, 15, 10));
    mainPane.setBackground(new Background(
        new BackgroundFill(Color.rgb(211, 211, 211), CornerRadii.EMPTY,
            Insets.EMPTY)));
    mainPane.getChildren().addAll(Pane1, Pane, secondPane);

    scene = new Scene(mainPane);
    window.setScene(scene);
    window.show();
  }
}