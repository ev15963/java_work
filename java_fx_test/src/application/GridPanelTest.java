package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPanelTest extends Application{

	
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane gridPane = new GridPane();
		//�����̳� ��� ���� �̿��Ͽ� ������Ʈ�� ��ġ�ϴ� ���̾ƿ�
		
		Button btn = new Button("OK");
		
		gridPane.setPadding(new Insets(20));
		//���̾ƿ��� �е��� ����.(padding �����¿� ����)
		//���̾ƿ��� ��ġ�Ǵ� ������Ʈ ���� ����
		
//		 gridPane.setHgap(30);
		 
		 
		 gridPane.setHgap(50); //gap�� ��ġ�Ǵ� ������Ʈ�� ���� ����
		 gridPane.setVgap(10);
		 //���̾ƿ��� H V gap ����
		 
		 //��ǥ ���� ��� 1 (���� ��� ���� �̸� ����)
		 GridPane.setRowIndex(btn, 0);
		 GridPane.setColumnIndex(btn, 0);
		 
		 Label label1 = new Label("Label1");
		 label1.setStyle("-fx-background-color : orange;");
		 
		 //��ǥ ���� ��� 2 (��ġ ������Ʈ�� ��ġ�� �ѹ��� ����);
		 GridPane.setConstraints(label1, 1, 1); // 1�� ��, 1���࿡ label1 ��ġ
		 
		 gridPane.getChildren().addAll(btn, label1);
		 
		 //��ǥ ���� ��� 3 (������Ʈ ��ü ������ ���ÿ� 1����, 0�� ���� ��ġ)
		 gridPane.add(new Button("addBtn"), 1, 0); // ���� ���� ���Ǵ� ���
		 
		 FlowPane fpane = new FlowPane(); //�⺻ ���ʿ��� ���������� ��ġ
		 
		 //������Ʈ ��ü ������ ���ÿ� ���̾ƿ��� �ڽ����� �߰�
		 fpane.getChildren().add(new Button("col(0), row(2)")); //
		 fpane.setAlignment(Pos.CENTER); //�⺻���� ������ ������ķ� ����
		 fpane.setStyle("-fx-background-color : black;");
		 //���̾ƿ��� ����� ���� ������ ����
		 
		  gridPane.add(fpane, 0, 2, 2, 1);
		  //�ڽ�������Ʈ, ���� �ε���, ���� �ε���, ��ũ��, ��ũ��
		  
		  primaryStage.setTitle("GridPanelEx"); //������ ����
		  primaryStage.setScene(new Scene(gridPane,300,300)); //�Ź�ġ �� W,H
		  primaryStage.show(); //�������� ���
		 
	}

}
