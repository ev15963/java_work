package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ButtonQuiz extends Application {

	TextField IdTXT = new TextField();
	TextField pwTXT = new TextField();
	Button LoginBtn = new Button("Login");

	String id = "admin";
	String pw = "1234";

	@Override
	public void start(Stage primaryStage) throws Exception{
		
		VBox vb = new VBox(15);
		HBox hb = new HBox(-10);
		
		vb.getChildren().addAll(IdTXT,pwTXT);
		vb.setPrefSize(180, 150);
		
		IdTXT.setPrefSize(150, 60);
		pwTXT.setPrefSize(150, 60);
		
		LoginBtn.setPrefSize(70, 135);
		
		//로그인 버튼을 눌렀을 때 처리할 내용...
		LoginBtn.addEventHandler(MouseEvent.MOUSE_PRESSED, e-> {
			//경고창 중에 정보를 출력할 수 있는 객체 생성
			Alert alert = new Alert(AlertType.INFORMATION);
			
			//멤버변수 값과 입력 값을 비교
			if(id.equals(IdTXT.getText()) && pw.equals(pwTXT.getText())) {
				alert.setTitle("성공!!");
				alert.setHeaderText(IdTXT.getText() + "님 !");
				alert.setContentText("로그인 되었습니다!");
			} else {
				alert.setTitle("경고!!");
				alert.setHeaderText("로그인 시도!");
				alert.setContentText("아직 로그린 할 수 없습니다.!");
			}
			alert.show(); //완성된 경고창 출력!!
		});	//여기까지 로그린 버튼 이벤트 처리 부분...
		
			hb.getChildren().addAll(vb, LoginBtn);
			
			primaryStage.setTitle("로그인 체크");
			primaryStage.setScene(new Scene(hb));
			primaryStage.show();

	
}
	
	public static void main(String[] args) {
		launch(args);
	}

// // ~~Pane으로 끝나는 클래스의 부모 : Pane.class
// Pane canvas = new Pane();
// Button btn = new Button("test");
//
// canvas.getChildren().add(btn);canvas.setPrefSize(500,400);
//
// primaryStage.setTitle("Button Test");
//}
//
}
