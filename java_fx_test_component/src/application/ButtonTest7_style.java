package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ButtonTest7_style extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		// ~~Pane���� ������ Ŭ������ �θ� : Pane.class
		Pane canvas = new Pane();
		Button btn = new Button("test/�׽�Ʈ"); // �󺧹�ư

		btn.setPrefWidth(400);
		btn.setPrefHeight(40);

		// ���̾ƿ� ���� ��ư ��ġ ���� �޼���
		btn.setLayoutX(20);
		btn.setLayoutY(20);

		btn.setStyle("-fx-font: 44 arial; -fx-base: #b6e7c9;"); //��Ʈũ������, ��Ʈ����
		
//		// ��ư ���ο� �۾� ��� �̹����� ����ϱ� ���� ImageView ��ü ����
//		btn.addEventHandler(MouseEvent.MOUSE_ENTERED, e ->{
//			ImageView iv2 = new ImageView("/images/SmileReRe.png");
//			btn.setGraphic(iv2);
//		});
//
//		btn.addEventFilter(MouseEvent.MOUSE_EXITED_TARGET, e-> {
//			ImageView iv = new ImageView("/images/search.PNG");
//			btn.setGraphic(iv);
//		});
		
		canvas.getChildren().add(btn);
		canvas.setPrefSize(500, 150);
		
		primaryStage.setTitle("Button Test");
		primaryStage.setScene(new Scene(canvas));
		primaryStage.show();
	

		// �̺�Ʈ �ڵ鷯 ��ü ���� : ������Ʈ ���� �̺�Ʈ ���� ����� �� ����..
		// ActionEvent: ���� ���������� ���Ǵ� �̺�Ʈ
		// ���콺 ���ʹ�ư Ŭ�� ��, �̺�Ʈ �߻�

		// EventHandler<ActionEvent> eh = new EventHandler<ActionEvent>() {
		// @Override

		// �̺�Ʈ�� ���� ǥ����(Java 1.8���� ����)���� ����
		// MOUSE_PRESSED : ���콺 ���� ��ư�� �������� �̺�Ʈ �߻�
		// MOUSE_RELEASED : ���콺 ���� ��ư�� ���ȴ� �������� �̺�Ʈ �߻�
		// MOUSE_ENTERED : �ش� ������Ʈ�� ���콺 Ŀ���� �����ϸ� �̺�Ʈ �߻�
		// MOUSE_EXITED : �ش� ������Ʈ�� ���콺 Ŀ���� �����ߴٰ� ���� ������ �̺�Ʈ
		// MOUSE_MOVED : �ش� ������Ʈ�� ���콺Ŀ���� �����̸� �̺�Ʈ �߻�
		// MOUSE_DRAGGED : �ش� ������Ʈ�� �巡���� �� �̺�Ʈ �߻�
//		btn.addEventHandler(MouseEvent.MOUSE_PRESSED, e -> {
//			Alert alert = new Alert(AlertType.INFORMATION); // ���â ��ü
//			// Alert alert = new Alert(AlertType.ERROR); // ���â ��ü
//			// Alert alert = new Alert(AlertType.CONFIRMATION); // ���â ��ü
//			// Alert alert = new Alert(AlertType.WARNING); // ���â ��ü
//			alert.setTitle("���");
//			alert.setHeaderText("���ٽ� ��ư�̺�Ʈ");
//			alert.setContentText("��ư�� Ŭ���߽��ϴ�.");
//			alert.show();
//		});// �̺�Ʈ �ڵ鷯 ��ü ���� �ڵ� ����

		// �̺�Ʈ �ڵ鷯 ��ü ���� �ڵ� ����
		// btn.setOnAction(eh);

//		canvas.getChildren().add(btn);
//		canvas.setPrefSize(500, 400);
//
//		primaryStage.setTitle("Button Test");
//		primaryStage.setScene(new Scene(canvas));
//		primaryStage.show();
	}

}
