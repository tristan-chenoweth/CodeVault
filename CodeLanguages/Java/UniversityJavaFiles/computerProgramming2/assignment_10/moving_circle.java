import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

import javafx.scene.input.MouseEvent;
import javafx.scene.input.KeyEvent;

public class moving_circle extends Application
{
	public void start(Stage primaryStage)
	{
		Circle circle = new Circle();

		circle.setCenterX (300);
		circle.setCenterY (300);
		circle.setRadius(50.0);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.BLACK);

		Pane pane = new Pane();
		pane.getChildren().add(circle);

		pane.setOnKeyPressed(e -> keyHandler(e, circle));

		Scene scene = new Scene(pane, 600, 600);

		primaryStage.setScene(scene);
		primaryStage.setTitle("Move Circle");
		primaryStage.show();

		pane.requestFocus();
	}

	public void keyHandler(KeyEvent e, Circle circle)
	{
		switch(e.getCode())
		{
			case UP:
				circle.setCenterY(circle.getCenterY() - 5);
				break;

			case DOWN:
				circle.setCenterY(circle.getCenterY() + 5);
				break;

			case LEFT:
				circle.setCenterX(circle.getCenterX() - 5);
				break;

			case RIGHT:
				circle.setCenterX(circle.getCenterX() + 5);
				break;

			default:
				System.out.println("Error " + e.getCode() + " not accepted");
				break;
		}
	}
}