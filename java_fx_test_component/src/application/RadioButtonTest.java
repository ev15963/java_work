package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class RadioButtonTest extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception{
		VBox vb = new VBox();
		
		final ToggleGroup group= new ToggleGroup();

		RadioButton rb1 = new RadioButton();
		rb1.setText("홈");			//사용자에게 보여주는 글씨
		rb1.setUserData("HOME");	//내부적으로 처리할 글씨(예. 서버전송데이터)
		rb1.setToggleGroup(group);	//반드시 하나의 ToggleGroup에 추가되어야함
		
		RadioButton rb2 = new RadioButton();
		rb2.setText("캘린더");
		rb2.setUserData("Calendar");
		rb2.setToggleGroup(group);

		RadioButton rb3 = new RadioButton();
		rb3.setText("연락처");
		rb3.setUserData("Contacts");
		rb3.setToggleGroup(group);
		
		rb2.setSelected(true); //기본적으로 선택힝 버튼 설정
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
