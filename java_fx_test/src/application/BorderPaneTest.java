package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class BorderPaneTest extends Application{


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
		
//		borderPane.setTop(btn[0]); //BorderPane ��ü�� ��ġ �޼���(������Ʈ)
//		borderPane.setAlignment(btn[0], Pos.TOP_CENTER);
//		
//		borderPane.setCenter(btn[1]);
//		borderPane.setAlignment(btn[2], Pos.BOTTOM_CENTER);
//		borderPane.setCenter(btn[2]);

		FlowPane fp = new FlowPane();
		fp.getChildren().add(btn[0]);
		fp.getChildren().add(btn[1]);
		fp.getChildren().add(btn[2]);
		fp.getChildren().add(btn[3]);
		fp.getChildren().add(btn[4]);
		
//		VBox vb = new VBox();
//		vb.getChildren().add(btn[2]);
//		vb.getChildren().add(btn[3]);
//		vb.getChildren().add(btn[4]);
//		borderPane.setBottom(vb);
		
//		HBox hb = new HBox();
//		hb.getChildren().add(btn[2]);
//		hb.getChildren().add(btn[3]);
//		hb.getChildren().add(btn[4]);
//		borderPane.setBottom(hb);
//		//border �����̳��� �� �κп� ��ġ�� ��ư ����
		
		primaryStage.setTitle("BorderPaneFx"); //������ â ������ �޼���
		Scene scene=new Scene(fp,300,100); //���̾ƿ���ü W H
		primaryStage.setScene(scene); //���������� �� ����
		primaryStage.show(); //�������� ���.. (�� �޼��� ���� ��,
							// ����� ȭ���� ������ ����!!
	}
	

	public static void main(String[] args) {
		launch(args);
	}

}
