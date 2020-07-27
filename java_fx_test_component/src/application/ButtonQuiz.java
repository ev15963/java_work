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
		
		//�α��� ��ư�� ������ �� ó���� ����...
		LoginBtn.addEventHandler(MouseEvent.MOUSE_PRESSED, e-> {
			//���â �߿� ������ ����� �� �ִ� ��ü ����
			Alert alert = new Alert(AlertType.INFORMATION);
			
			//������� ���� �Է� ���� ��
			if(id.equals(IdTXT.getText()) && pw.equals(pwTXT.getText())) {
				alert.setTitle("����!!");
				alert.setHeaderText(IdTXT.getText() + "�� !");
				alert.setContentText("�α��� �Ǿ����ϴ�!");
			} else {
				alert.setTitle("���!!");
				alert.setHeaderText("�α��� �õ�!");
				alert.setContentText("���� �α׸� �� �� �����ϴ�.!");
			}
			alert.show(); //�ϼ��� ���â ���!!
		});	//������� �α׸� ��ư �̺�Ʈ ó�� �κ�...
		
			hb.getChildren().addAll(vb, LoginBtn);
			
			primaryStage.setTitle("�α��� üũ");
			primaryStage.setScene(new Scene(hb));
			primaryStage.show();

	
}
	
	public static void main(String[] args) {
		launch(args);
	}

// // ~~Pane���� ������ Ŭ������ �θ� : Pane.class
// Pane canvas = new Pane();
// Button btn = new Button("test");
//
// canvas.getChildren().add(btn);canvas.setPrefSize(500,400);
//
// primaryStage.setTitle("Button Test");
//}
//
}
