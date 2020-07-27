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
		// ~~Pane으로 끝나는 클래스의 부모 : Pane.class
		Pane canvas = new Pane();
		Button btn = new Button("test/테스트"); // 라벨버튼

		btn.setPrefWidth(400);
		btn.setPrefHeight(40);

		// 레이아웃 내에 버튼 위치 변경 메서드
		btn.setLayoutX(20);
		btn.setLayoutY(20);

		btn.setStyle("-fx-font: 44 arial; -fx-base: #b6e7c9;"); //폰트크기종류, 폰트색상
		
//		// 버튼 내부에 글씨 대신 이미지를 출력하기 위한 ImageView 객체 생성
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
	

		// 이벤트 핸들러 객체 생성 : 컴포넌트 마다 이벤트 형식 변경될 수 있음..
		// ActionEvent: 가장 보편적으로 사용되는 이벤트
		// 마우스 왼쪽버튼 클릭 시, 이벤트 발생

		// EventHandler<ActionEvent> eh = new EventHandler<ActionEvent>() {
		// @Override

		// 이벤트를 람다 표현식(Java 1.8부터 가능)으로 변경
		// MOUSE_PRESSED : 마우스 왼쪽 버튼이 눌려지면 이벤트 발생
		// MOUSE_RELEASED : 마우스 왼쪽 버튼이 눌렸다 떼어지면 이벤트 발생
		// MOUSE_ENTERED : 해당 컴포넌트로 마우스 커서가 진입하면 이벤트 발생
		// MOUSE_EXITED : 해당 컴포넌트로 마우스 커서가 진입했다가 빠져 나오면 이벤트
		// MOUSE_MOVED : 해당 컴포넌트로 마우스커서가 움직이면 이벤트 발생
		// MOUSE_DRAGGED : 해당 컴포넌트를 드래그할 때 이벤트 발생
//		btn.addEventHandler(MouseEvent.MOUSE_PRESSED, e -> {
//			Alert alert = new Alert(AlertType.INFORMATION); // 경고창 객체
//			// Alert alert = new Alert(AlertType.ERROR); // 경고창 객체
//			// Alert alert = new Alert(AlertType.CONFIRMATION); // 경고창 객체
//			// Alert alert = new Alert(AlertType.WARNING); // 경고창 객체
//			alert.setTitle("경고");
//			alert.setHeaderText("람다식 버튼이벤트");
//			alert.setContentText("버튼을 클릭했습니다.");
//			alert.show();
//		});// 이벤트 핸들러 객체 생성 코드 종료

		// 이벤트 핸들러 객체 생성 코드 종료
		// btn.setOnAction(eh);

//		canvas.getChildren().add(btn);
//		canvas.setPrefSize(500, 400);
//
//		primaryStage.setTitle("Button Test");
//		primaryStage.setScene(new Scene(canvas));
//		primaryStage.show();
	}

}
