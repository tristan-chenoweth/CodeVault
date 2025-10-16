import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Arc;

import javafx.stage.Stage;


public class smiley_face extends Application
{
	public void start(Stage primaryStage)
	{
		// Setting up pane and scene

		Pane pane = new Pane();
		Scene scene = new Scene(pane, 1000, 1000);


		// Setting up base of face

		Circle face = new Circle();
		face.setCenterX (500);
		face.setCenterY (500);
		face.setRadius (200);
		face.setStroke(Color.BLACK);

		Color faceFill = Color.YELLOW;
		face.setFill(faceFill);

		pane.getChildren().add(face);

		// Setting up mouth

		Arc mouth = new Arc(500.0, 500.0, 150, 150, 180, 180);
		mouth.setStroke(Color.BLACK);

		Color mouthFill = Color.BLACK;
		mouth.setFill(mouthFill);

		pane.getChildren().add(mouth);

		// Adjustment for mouth

		Circle faceAdj = new Circle();
		faceAdj.setCenterX (500);
		faceAdj.setCenterY (500);
		faceAdj.setRadius (125);

		Color faceAdjFill = Color.YELLOW;
		faceAdj.setFill(faceAdjFill);

		pane.getChildren().add(faceAdj);


		// Setting up left eye

		Circle leftEye = new Circle();
		leftEye.setCenterX (425);
		leftEye.setCenterY (425);
		leftEye.setRadius (50);
		leftEye.setStroke(Color.BLACK);

		Color leftEyeFill = Color.BLACK;
		leftEye.setFill(leftEyeFill);

		pane.getChildren().add(leftEye);

		// Setting up left eye pupil

		Circle leftEyePupil = new Circle();
		leftEyePupil.setCenterX (425);
		leftEyePupil.setCenterY (405);
		leftEyePupil.setRadius (12.5);

		Color leftEyePupilFill = Color.WHITE;
		leftEyePupil.setFill(leftEyePupilFill);

		pane.getChildren().add(leftEyePupil);

		// Setting up right eye

		Circle rightEye = new Circle();
		rightEye.setCenterX (575);
		rightEye.setCenterY (425);
		rightEye.setRadius (50);
		rightEye.setStroke(Color.BLACK);

		Color rightEyeFill = Color.BLACK;
		rightEye.setFill(rightEyeFill);

		pane.getChildren().add(rightEye);

		// Setting up right eye pupil

		Circle rightEyePupil = new Circle();
		rightEyePupil.setCenterX (555);
		rightEyePupil.setCenterY (425);
		rightEyePupil.setRadius (12.5);

		Color rightEyePupilFill = Color.WHITE;
		rightEyePupil.setFill(rightEyePupilFill);

		pane.getChildren().add(rightEyePupil);

		// Setting up nose

		Circle nose = new Circle();
		nose.setCenterX (500);
		nose.setCenterY (500);
		nose.setRadius (25);
		nose.setStroke(Color.BLACK);

		Color noseFill = Color.BLACK;
		nose.setFill(noseFill);

		pane.getChildren().add(nose);

		// Showing window with contents

		primaryStage.setScene(scene);
		primaryStage.setTitle("Smiley Face");
		primaryStage.show();

	}


}