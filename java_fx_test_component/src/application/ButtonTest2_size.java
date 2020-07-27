package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ButtonTest2_size extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		// ~~Pane���� ������ Ŭ������ �θ� : Pane.class
		Pane canvas = new Pane();
		Button btn = new Button("test");

		// ��ư�� ũ�� ���� �޼���
		btn.setPrefWidth(120);
		btn.setPrefHeight(40);

		canvas.getChildren().add(btn);
		canvas.setPrefSize(500, 400);

		primaryStage.setTitle("Button Test");
		primaryStage.setScene(new Scene(canvas));
		primaryStage.show();
	}


}
