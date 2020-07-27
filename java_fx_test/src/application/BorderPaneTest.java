package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class BorderPaneTest extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane borderPane = new BorderPane();
		//�����̳�
		
		Button [] btn = new Button[5];
		//�����̳ʿ� ��ġ�� ��ư �迭
		
		String [] strBtn = { "Top", "Center", "Bottom", "Left", "Right"};
		//��ư�� �� �� ��ư�� �ؽ�Ʈ �迭�̴�.
		
		for(int i=0;i<5;i++) {
			btn[i] =new Button(strBtn[i]);
		}
		//�ݺ����� ����Ͽ� �� ��ư�� �̸��� �־��ּ���.
		
		borderPane.setTop(btn[0]); //BorderPane ��ü�� ��ġ �޼���(������Ʈ)
		borderPane.setAlignment(btn[0], Pos.TOP_CENTER);
		
		borderPane.setCenter(btn[1]);
		borderPane.setAlignment(btn[2], Pos.BOTTOM_CENTER);
		
		HBox hb = new HBox();
		borderPane.getChildren().add(btn[2]);
		borderPane.getChildren().add(btn[3]);
		borderPane.getChildren().add(btn[4]);
		borderPane.setBottom(hb);
		//border �����̳��� �� �κп� ��ġ�� ��ư ����
		
		primaryStage.setTitle("BorderPaneFx"); //������ â ������ �޼���
		Scene scene=new Scene(borderPane,300,100); //���̾ƿ���ü W H
		primaryStage.setScene(scene); //���������� �� ����
		primaryStage.show(); //�������� ���.. (�� �޼��� ���� ��,
							// ����� ȭ���� ������ ����!!
	}

}
