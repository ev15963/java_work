package application;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class StackGridFlowPaneTest extends Application{
	private Label titleLb = new Label("�����Դϴ�.");
	private Button helpBtn = new Button("?");
	
	private Label idLb = new Label("ID: ");
	private TextField idTf = new TextField();
	private Label passLb = new Label("PASS : ");
	private TextField passTf = new TextField();
	
	private Button regBtn = new Button("Register");
	private Button loginBtn = new Button("Login");
	private Button closeBtn = new Button("Close");
	/** ��������� ������Ʈ���� ��� ������ ����**/
	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) {
		//�����¿�, ��� ��ġ ���̾ƿ�
		BorderPane layout = new BorderPane();
		
		/**Top Area**/
		//���η� ��ġ�ϴ� ���̾ƿ�
		HBox top = new HBox();
		titleLb.setTextFill(Paint.valueOf("white")); //�۾�������
		top.getChildren().add(titleLb);
		
		//�ٸ� ���۳�Ʈ ���� ��ġ�ϴ� ���̾ƿ�
		StackPane attachHelp = new StackPane();
		attachHelp.getChildren().add(helpBtn);
		attachHelp.setAlignment(Pos.CENTER_RIGHT);
		HBox.setHgrow(attachHelp, Priority.ALWAYS);
		top.getChildren().add(attachHelp);
		
		layout.setTop(top);
		top.setStyle("-fx-background-color: green");
		BorderPane.setMargin(top, new Insets(5,5,5,5));
		/** ������� Top Area **/
		
		/** Center Area **/
		//��� �� ���·� ��ġ�ϴ� ���̾ƿ�
		GridPane center = new GridPane();
		center.add(idLb, 0, 0);
		center.add(idTf, 1, 0);
		center.add(passLb, 0, 1);
		center.add(passTf, 1, 1);
		
		layout.setCenter(center);
		center.setStyle("-fx-background-color: yellow");
		BorderPane.setMargin(center, new Insets(5,5,5,5));
		
		/**������� Bottom Area**/
		
		layout.setStyle("-fx-background-color: black");
		Scene scene = new Scene(layout, 300, 200);
		stage.setScene(scene);
		stage.show();
		
		/**Bottom Area**/
		//���ʿ��� ���������� ��ġ�ϴ� ���̾ƿ� (ũ�⿡ ���� �ڵ� �ٹٲ�)
		FlowPane bottom = new FlowPane();
		bottom.getChildren().addAll(regBtn, loginBtn, closeBtn);
		
		layout.setBottom(bottom);
		bottom.setStyle("-fx-background-color: blue");
		BorderPane.setMargin(bottom, new Insets(5,5,5,5));
	}

}
