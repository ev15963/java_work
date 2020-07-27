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
	private Label titleLb = new Label("제목입니다.");
	private Button helpBtn = new Button("?");
	
	private Label idLb = new Label("ID: ");
	private TextField idTf = new TextField();
	private Label passLb = new Label("PASS : ");
	private TextField passTf = new TextField();
	
	private Button regBtn = new Button("Register");
	private Button loginBtn = new Button("Login");
	private Button closeBtn = new Button("Close");
	/** 여기까지는 컴포넌트들을 멤버 변수로 선언**/
	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) {
		//상하좌우, 가운데 배치 레이아웃
		BorderPane layout = new BorderPane();
		
		/**Top Area**/
		//가로로 배치하는 레이아웃
		HBox top = new HBox();
		titleLb.setTextFill(Paint.valueOf("white")); //글씨색변경
		top.getChildren().add(titleLb);
		
		//다른 컴퍼넌트 위로 배치하는 레이아웃
		StackPane attachHelp = new StackPane();
		attachHelp.getChildren().add(helpBtn);
		attachHelp.setAlignment(Pos.CENTER_RIGHT);
		HBox.setHgrow(attachHelp, Priority.ALWAYS);
		top.getChildren().add(attachHelp);
		
		layout.setTop(top);
		top.setStyle("-fx-background-color: green");
		BorderPane.setMargin(top, new Insets(5,5,5,5));
		/** 여기까지 Top Area **/
		
		/** Center Area **/
		//행과 열 형태로 배치하는 레이아웃
		GridPane center = new GridPane();
		center.add(idLb, 0, 0);
		center.add(idTf, 1, 0);
		center.add(passLb, 0, 1);
		center.add(passTf, 1, 1);
		
		layout.setCenter(center);
		center.setStyle("-fx-background-color: yellow");
		BorderPane.setMargin(center, new Insets(5,5,5,5));
		
		/**여기까지 Bottom Area**/
		
		layout.setStyle("-fx-background-color: black");
		Scene scene = new Scene(layout, 300, 200);
		stage.setScene(scene);
		stage.show();
		
		/**Bottom Area**/
		//왼쪽에서 오른쪽으로 배치하는 레이아웃 (크기에 따라 자동 줄바꿈)
		FlowPane bottom = new FlowPane();
		bottom.getChildren().addAll(regBtn, loginBtn, closeBtn);
		
		layout.setBottom(bottom);
		bottom.setStyle("-fx-background-color: blue");
		BorderPane.setMargin(bottom, new Insets(5,5,5,5));
	}

}
