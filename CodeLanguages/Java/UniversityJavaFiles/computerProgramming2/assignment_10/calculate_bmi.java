import java.util.*;
import java.lang.*;
import java.math.*;
import java.text.*;

import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;

import javafx.stage.Stage;

public class calculate_bmi extends Application
{
	double height_ = 0.0;
	double weight_ = 0.0;

	Label heightLabel = new Label("Height:    ");
	Label weightLabel = new Label("Weight:    ");
	Label BMI = new Label("BMI: ");

	TextField height = new TextField();
	TextField weight = new TextField();
	TextField bmiText = new TextField();

	CheckBox imperialCheck = new CheckBox("Imperial");


	public void start(Stage primaryStage)
	{
		Pane pane = new Pane();

		// V box for holding H boxes

		VBox hBoxHolder = new VBox();

			// H box for instructions

			HBox infoHolder = new HBox();

			Label info = new Label("Enter height and weight.");

			infoHolder.getChildren().add(info);

			hBoxHolder.getChildren().add(infoHolder);

			// H box for instructions side note

			HBox infoHolder2 = new HBox();

			Label info2 = new Label("(For imperial units use checkbox)");

			infoHolder2.getChildren().add(info2);

			hBoxHolder.getChildren().add(infoHolder2);

			// H box for instructions side note 2

			HBox infoHolder3 = new HBox();

			Label info3 = new Label("(Please convert imperial height into inch form)");

			infoHolder3.getChildren().add(info3);

			hBoxHolder.getChildren().add(infoHolder3);


			// H box for instructions side note 2

			HBox infoHolder4 = new HBox();

			Label info4 = new Label("(Please convert metric height into meter decimal form)");

			infoHolder4.getChildren().add(info4);

			hBoxHolder.getChildren().add(infoHolder4);


			// H box for height label and text field

			HBox heightHolder = new HBox();

			heightHolder.getChildren().add(heightLabel);
			heightHolder.getChildren().add(height);

			hBoxHolder.getChildren().add(heightHolder);

			// H box for weight label and text field

			HBox weightHolder = new HBox();

			weightHolder.getChildren().add(weightLabel);
			weightHolder.getChildren().add(weight);

			hBoxHolder.getChildren().add(weightHolder);

			// H box for BMI label and text field

			HBox BMIHolder = new HBox();

			BMIHolder.getChildren().add(BMI);
			BMIHolder.getChildren().add(bmiText);

			hBoxHolder.getChildren().add(BMIHolder);

			// H box for imperial units check box

			HBox checkBoxHolder = new HBox();

			imperialCheck.setSelected(false);

			checkBoxHolder.getChildren().add(imperialCheck);

			hBoxHolder.getChildren().add(checkBoxHolder);

			// Creating buttons and H box to hold buttons

			Button calcBMI = new Button("Calculate BMI");

			HBox buttonHolder = new HBox();

			buttonHolder.getChildren().add(calcBMI);

			hBoxHolder.getChildren().add(buttonHolder);

		// adding V box to pane

		pane.getChildren().add(hBoxHolder);

		// handling button event

		calcBMI.setOnAction( e -> calcBMIHandler(height, weight));

		// showin pane on scene

		Scene scene  = new Scene(pane, 290, 190);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Calculate BMI");
		primaryStage.show();
	}

	// button event handiling method for calculating area from radius

	public void calcBMIHandler(TextField height, TextField weight)
	{
		if (imperialCheck.isSelected())
		{
			height_ = Double.parseDouble(height.getText());
			weight_ = Double.parseDouble(weight.getText());

			double bmi_ = ((weight_ / (height_ * height_)) * 703);
			bmiText.setText(String.valueOf(bmi_));
		}

		else
		{
			height_ = Double.parseDouble(height.getText());
			weight_ = Double.parseDouble(weight.getText());

			double bmi_ = (weight_ / (height_ * height_));
			bmiText.setText(String.valueOf(bmi_));
		}
	}
}