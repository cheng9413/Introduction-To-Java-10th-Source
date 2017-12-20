package BookSource.Chapter20;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.shape.Circle;

/**
 * Created by Chung Time: 上午 09:47 Date: 20-12月-2017
 */
public class MultipleBounceBall extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {

    MultipleBallPane ballPane = new MultipleBallPane();
    ballPane.setStyle("-fx-border-color: yellow");

    Button btAdd = new Button("+");
    Button btSubtract = new Button("-");
    HBox hBox = new HBox(10);
    hBox.getChildren().addAll(btAdd, btSubtract);
    hBox.setAlignment(Pos.CENTER);

    //Add or remove a ball
    btAdd.setOnAction(e->ballPane.add());
    btSubtract.setOnAction(e -> ballPane.substract());

    //Pause and resume animation
    ballPane.setOnMousePressed(e -> ballPane.pause());
    ballPane.setOnMouseReleased(e -> ballPane.play());

    //Use a scroll bar to control animation speed
    ScrollBar sbSpeed = new ScrollBar();
    sbSpeed.setMax(20);
    sbSpeed.setValue(10);
    ballPane.rateProperty().bind(sbSpeed.valueProperty());

    BorderPane pane = new BorderPane();
    pane.setCenter(ballPane);
    pane.setTop(sbSpeed);
    pane.setBottom(hBox);

    //Create a scene and place the pane in the stage
    Scene scene = new Scene(pane, 250, 150);
    primaryStage.setTitle("MutipleBounceBall");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  private class MultipleBallPane extends Pane {

    private Timeline animation;

    public MultipleBallPane() {
      //Create an animation for moving the ball
      animation = new Timeline(
          new KeyFrame(Duration.millis(50), e -> moveBall())
      );
      animation.setCycleCount(Timeline.INDEFINITE);
      animation.play();
    }

    public void add() {
      Color color = new Color(Math.random(), Math.random(), Math.random(), 0.5);
      getChildren().add(new Ball(30, 30, 20, color));
    }

    public void substract() {
      if (getChildren().size() > 0) {
        getChildren().remove(getChildren().size() - 1);
      }
    }

    public void play() {
      animation.play();
    }

    public void pause() {
      animation.pause();
    }

    public void increaseSpeed() {
      animation.setRate(animation.getRate() + 0.1);
    }

    public void decreaseSpeed() {
      animation.setRate(animation.getRate() > 0 ? animation.getRate() - 0.1 : 0);
    }

    public DoubleProperty rateProperty() {
      return animation.rateProperty();
    }

    protected void moveBall() {
      for (Node node : this.getChildren()) {
        Ball ball = (Ball) node;
        //Check boundaries
        if (ball.getCenterX() < ball.getRadius() ||
            ball.getCenterY() > getWidth() - ball.getRadius()) {
          ball.dx *= -1; //Change ball move direction
        }
        if (ball.getCenterY() < ball.getRadius() ||
            ball.getCenterX() > getWidth() - ball.getRadius()) {
          ball.dy *= -1;
        }

        //Adjust ball position
        ball.setCenterX(ball.dx + ball.getCenterX());
        ball.setCenterX(ball.dy + ball.getCenterY());


      }
    }
  }

  class Ball extends Circle {

    private double dx = 1, dy = 1;

    Ball(double x, double y, double radius, Color color) {
      super(x, y, radius);
      setFill(color);
    }
  }
}