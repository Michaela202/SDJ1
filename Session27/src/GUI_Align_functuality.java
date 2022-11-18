import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class GUI_Align_functuality extends Application
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
  private MyActionListener myListener;

  public void start(Stage window)
  {
    window.setTitle("Align");
    myListener = new MyActionListener();

    ExitOnCancel = new CheckBox("Exit on Cancel");
    ExitOnOK = new CheckBox("Exit on OK");

    label_x = new Label("X:");
    label_y = new Label(" Y:");
    x = new TextField();
    y = new TextField();
    OK = new Button("OK");
    OK.setPrefWidth(60);
    OK.setOnAction(new MyActionListener());
    cancel = new Button("Cancel");
    cancel.setPrefWidth(60);
    cancel.setOnAction(new MyActionListener());
    clear = new Button("Clear");
    clear.setPrefWidth(60);
    clear.setOnAction(new MyActionListener());

    Pane1 = new VBox(5);
    Pane1.setAlignment(Pos.BASELINE_LEFT);
    Pane1.setPadding(new Insets(5, 10, 0, 10));

    Pane1.getChildren().add(ExitOnOK);
    Pane1.getChildren().add(ExitOnCancel);

    Pane = new GridPane();
    Pane.setAlignment(Pos.BASELINE_CENTER);
    Pane.setPadding(new Insets(5, 10, 5, 10));
    Pane.addRow(0, label_x, x);
    Pane.addRow(1, label_y, y);

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

  private class MyActionListener implements EventHandler<ActionEvent>
  {
    public void handle(ActionEvent e)
    {
      if (e.getSource() == OK && ExitOnOK.isSelected())
      {
        System.exit(0);
        // alert.showAndWait();
      }
      else if (e.getSource() == cancel && ExitOnCancel.isSelected())
      {
        System.exit(0);
      }
      else if (e.getSource() == OK && !ExitOnOK.isSelected())
      {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
            " X:" + x.getText() + "\n" + "Y:" + y.getText() + "\n"
                + "Do you really want to exit the program?", ButtonType.YES,
            ButtonType.NO);
        alert.setTitle("Exit");
        alert.setHeaderText(null);

        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES)
        {
          System.exit(0);
        }
      }
      else if (e.getSource() == clear)
      {
        x.clear();
        y.clear();
      }

    }
  }
}

