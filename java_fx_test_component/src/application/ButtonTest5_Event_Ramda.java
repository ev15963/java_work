package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ButtonTest5_Event_Ramda extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		// ~~Pane���� ������ Ŭ������ �θ� : Pane.class
		Pane canvas = new Pane();
		Button btn = new Button(); // �󺧹�ư

		btn.setPrefWidth(120);
		btn.setPrefHeight(40);

		// ���̾ƿ� ���� ��ư ��ġ ���� �޼���
		btn.setLayoutX(90);
		btn.setLayoutY(80);

		// ��ư ���ο� �۾� ��� �̹����� ����ϱ� ���� ImageView ��ü ����
		ImageView iv = new ImageView("/images/SmileReRe.png");

		btn.setGraphic(iv);

		// �̺�Ʈ �ڵ鷯 ��ü ���� : ������Ʈ ���� �̺�Ʈ ���� ����� �� ����..
		// ActionEvent: ���� ���������� ���Ǵ� �̺�Ʈ
		// ���콺 ���ʹ�ư Ŭ�� ��, �̺�Ʈ �߻�

		EventHandler<ActionEvent> eh = new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
//				Alert alert = new Alert(AlertType.INFORMATION); // ���â ��ü
//				Alert alert = new Alert(AlertType.ERROR); // ���â ��ü
//				Alert alert = new Alert(AlertType.CONFIRMATION); // ���â ��ü
				Alert alert = new Alert(AlertType.WARNING); // ���â ��ü
				alert.setTitle("���");
				alert.setHeaderText("��ư�̺�Ʈ");
				alert.setContentText("��ư�� Ŭ���߽��ϴ�.");
				alert.show();
			}
		};// �̺�Ʈ �ڵ鷯 ��ü ���� �ڵ� ����

		// �̺�Ʈ �ڵ鷯 ��ü ���� �ڵ� ����
		btn.setOnAction(eh);

		canvas.getChildren().add(btn);
		canvas.setPrefSize(500, 400);

		primaryStage.setTitle("Button Test");
		primaryStage.setScene(new Scene(canvas));
		primaryStage.show();
	}

}
