import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import javafx.stage.Stage;

public class random_circles extends Application
{
	public void start(Stage primaryStage)
	{

		Pane pane = new Pane();
		Scene scene = new Scene(pane, 1000, 1000);

		for (int i = 0; i < 100; i++){

			Circle circle = new Circle();
			circle.setCenterX (Math.random() * 1000);
			circle.setCenterY (Math.random() * 1000);
			circle.setRadius (Math.random() * 90.0 + 10.0);
			circle.setStroke(Color.BLACK);

			Color fillColor = new Color (Math.random(), Math.random(), Math.random(), 0.5);
			circle.setFill(fillColor);

			pane.getChildren().add(circle);
		}

		primaryStage.setScene(scene);
		primaryStage.setTitle("Circle Practice");
		primaryStage.show();

	}
}