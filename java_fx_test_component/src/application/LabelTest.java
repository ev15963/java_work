package application;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LabelTest extends Application {
	HBox hb = new HBox();
	//���� �㤸�� HBox ���̾ƿ�
	


	@Override
	public void start(Stage primaryStage) throws Exception {
		hb.setPadding(new Insets(10)); //Hbox�� padding ���� ����
		
		Label label = new Label("Label Test");
		//�� ��ü ������, String ���� �־��ָ� �ش簪���� �ؽ�Ʈ�� ����
		
		hb.getChildren().addAll(label);
		hb.setPrefSize(300, 200);
		
		System.out.println(label.getText());
//		label.setText("Change TEXT");
		label.setPrefSize(200, 100);
		label.setStyle("-fx-background-color:orange;");
		
		label.setAlignment(Pos.CENTER_RIGHT); //���� ���� ����� ����
		
		primaryStage.setTitle("Label �׽�Ʈ");
		primaryStage.setScene(new Scene(hb));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
