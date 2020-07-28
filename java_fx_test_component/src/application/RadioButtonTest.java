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
		rb1.setText("Ȩ");			//����ڿ��� �����ִ� �۾�
		rb1.setUserData("HOME");	//���������� ó���� �۾�(��. �������۵�����)
		rb1.setToggleGroup(group);	//�ݵ�� �ϳ��� ToggleGroup�� �߰��Ǿ����
		
		RadioButton rb2 = new RadioButton();
		rb2.setText("Ķ����");
		rb2.setUserData("Calendar");
		rb2.setToggleGroup(group);

		RadioButton rb3 = new RadioButton();
		rb3.setText("����ó");
		rb3.setUserData("Contacts");
		rb3.setToggleGroup(group);
		
		rb2.setSelected(true); //�⺻������ ������ ��ư ����
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
