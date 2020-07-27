package application;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LabelTest2_image extends Application {
	HBox hb = new HBox();
	//���� �㤸�� HBox ���̾ƿ�
	


	@Override
	public void start(Stage primaryStage) throws Exception {
		hb.setPadding(new Insets(10)); //Hbox�� padding ���� ����
		
		Label label = new Label("Search");
		Label label2 = new Label("A label");
		//�� ��ü ������, String ���� �־��ָ� �ش簪���� �ؽ�Ʈ�� ����
		
		hb.getChildren().addAll(label, label2);
		hb.setPrefSize(300, 200);
		
		System.out.println(label.getText());
//		label.setText("Change TEXT");
		label.setPrefSize(200, 100);
//		label.setStyle("-fx-background-color:orange;");
		
		label.setAlignment(Pos.CENTER_RIGHT); //���� ���� ����� ����
		
		Image image = new Image(getClass().getResourceAsStream("/images/search.PNG"));
		label.setGraphic(new ImageView(image));
		
		//setTextFill() : ������Ʈ�� �۾� ������ �����ϴ� �޼���
		//setTextFill() ���� ������ ���� ������ ��� : Color.web("#����16���� 6��")
		//�����Ǵ� ������ ������ ��� :Color.���
		
		label.setTextFill(Color.web("#0076a3"));
		label2.setRotate(60); //�� ȸ�� �޼��� : 0���� ���Ⱒ�� �̸�, 3�� ����
								// �⺻ �ð���� ȸ��
								//������ ��� �ݽð�������� ȸ��
//		label2.setTranslateX(70); //���� X ��ǥ ����
		label2.setTranslateY(70); //���� Y ��ǥ ����
		label2.setWrapText(true);
		//������ ũ�Ⱑ ���� ���
		//�ٹٲ��� �ؼ� ȭ�鿡 �ؽ�Ʈ�� ����� ������ �ɼ�
		//false�� �־��ָ� ȭ���� ���� ��, ������ crop(�߸�)
		
		primaryStage.setTitle("Label ���� ���� Test");
		primaryStage.setScene(new Scene(hb));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}


}
