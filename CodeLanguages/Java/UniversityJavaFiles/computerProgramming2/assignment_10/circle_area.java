import java.util.*;
import java.lang.*;
import java.math.*;
import java.text.*;

import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


import javafx.stage.Stage;

public class circle_area extends Application
{
	double area_ = 0.0;
	double radius_ = 0.0;

	Label radiusLabel = new Label("Radius: ");
	Label areaLabel = new Label("Area:    ");

	TextField radius = new TextField();
	TextField area = new TextField();


	public void start(Stage primaryStage)
	{
		Pane pane = new Pane();

		// V box for holding H boxes

		VBox hBoxHolder = new VBox();

			// H box for instructions

			HBox infoHolder = new HBox();

			Label info = new Label("Enter either a area or a radius.");

			infoHolder.getChildren().add(info);

			hBoxHolder.getChildren().add(infoHolder);

			// H box for instructions side note

			HBox infoHolder2 = new HBox();

			Label info2 = new Label("(Use appropriate button for calculation)");

			infoHolder2.getChildren().add(info2);

			hBoxHolder.getChildren().add(infoHolder2);

			// H box for radius label and text field

			HBox radiusHolder = new HBox();

			radiusHolder.getChildren().add(radiusLabel);
			radiusHolder.getChildren().add(radius);

			hBoxHolder.getChildren().add(radiusHolder);

			// H box for area label and text field

			HBox areaHolder = new HBox();

			areaHolder.getChildren().add(areaLabel);
			areaHolder.getChildren().add(area);

			hBoxHolder.getChildren().add(areaHolder);

			// Creating buttons and H box to hold buttons

			Button calcArea = new Button("Calculate Area");
			Button calcRadius = new Button("Calculate Radius");

			HBox buttonHolder = new HBox();

			buttonHolder.getChildren().add(calcArea);
			buttonHolder.getChildren().add(calcRadius);

			hBoxHolder.getChildren().add(buttonHolder);

		// adding V box to pane

		pane.getChildren().add(hBoxHolder);

		// handling button event

		calcArea.setOnAction( e -> calcAreaHandler(radius, area));
		calcRadius.setOnAction( e -> calcRadiusHandler(radius, area));

		// showin pane on scene

		Scene scene  = new Scene(pane, 210, 110);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Calculate Area/Radius of a Circle");
		primaryStage.show();
	}

	// button event handiling method for calculating area from radius

	public void calcAreaHandler(TextField radiusIn, TextField areaIn)
	{
		radius_ = Double.parseDouble(radiusIn.getText());
		area_ = (Math.PI * (radius_ * radius_));
		area.setText(Double.toString(area_));
	}

	// button event handiling method for calculating radius from area

	public void calcRadiusHandler(TextField radiusIn, TextField areaIn)
	{
		area_ = Double.parseDouble(areaIn.getText());
		radius_ = (Math.sqrt(area_/Math.PI));
		radius.setText(Double.toString(radius_));
	}
}