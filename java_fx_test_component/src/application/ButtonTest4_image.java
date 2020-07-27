package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ButtonTest4_image extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
		// ~~Pane���� ������ Ŭ������ �θ� : Pane.class
		Pane canvas = new Pane();
		Button btn = new Button(); //�󺧹�ư
		
		btn.setPrefWidth(120);
		btn.setPrefHeight(40);
		
		//���̾ƿ� ���� ��ư ��ġ ���� �޼���
		btn.setLayoutX(90);
		btn.setLayoutY(80);
		
		// ��ư ���ο� �۾� ��� �̹����� ����ϱ� ���� ImageView ��ü ����
		ImageView iv = new ImageView("/images/SmileReRe.png");
		
		// ��ư ���ο� �۾� ��� �̹����� �����ϴ� �޼���
		btn.setGraphic(iv);
		
		canvas.getChildren().add(btn);
		canvas.setPrefSize(500, 400);
		
		primaryStage.setTitle("Button Test");
		primaryStage.setScene(new Scene(canvas));
		primaryStage.show();
	}


}
