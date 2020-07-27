package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ButtonTest3_Size_Pos extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		// ~~Pane으로 끝나는 클래스의 부모 : Pane.class
		Pane canvas = new Pane();
		Button btn = new Button("test");
		
		btn.setPrefWidth(120);
		btn.setPrefHeight(40);
		
		//레이아웃 내에 버튼 위치 변경 메서드
		btn.setLayoutX(90);
		btn.setLayoutY(80);
		
		canvas.getChildren().add(btn);
		canvas.setPrefSize(500, 400);
		
		primaryStage.setTitle("Button Test");
		primaryStage.setScene(new Scene(canvas));
		primaryStage.show();
	}



}
