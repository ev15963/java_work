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
		// ~~Pane으로 끝나는 클래스의 부모 : Pane.class
		Pane canvas = new Pane();
		Button btn = new Button(); //라벨버튼
		
		btn.setPrefWidth(120);
		btn.setPrefHeight(40);
		
		//레이아웃 내에 버튼 위치 변경 메서드
		btn.setLayoutX(90);
		btn.setLayoutY(80);
		
		// 버튼 내부에 글씨 대신 이미지를 출력하기 위한 ImageView 객체 생성
		ImageView iv = new ImageView("/images/SmileReRe.png");
		
		// 버튼 내부에 글씨 대신 이미지로 설정하는 메서드
		btn.setGraphic(iv);
		
		canvas.getChildren().add(btn);
		canvas.setPrefSize(500, 400);
		
		primaryStage.setTitle("Button Test");
		primaryStage.setScene(new Scene(canvas));
		primaryStage.show();
	}


}
