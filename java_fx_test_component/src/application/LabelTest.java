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
	//라벨을 담ㅈ을 HBox 레이아웃
	


	@Override
	public void start(Stage primaryStage) throws Exception {
		hb.setPadding(new Insets(10)); //Hbox의 padding 값을 설정
		
		Label label = new Label("Label Test");
		//라벨 객체 생성시, String 값을 넣어주면 해당값으로 텍스트가 설정
		
		hb.getChildren().addAll(label);
		hb.setPrefSize(300, 200);
		
		System.out.println(label.getText());
//		label.setText("Change TEXT");
		label.setPrefSize(200, 100);
		label.setStyle("-fx-background-color:orange;");
		
		label.setAlignment(Pos.CENTER_RIGHT); //라벨의 정렬 방식을 설정
		
		primaryStage.setTitle("Label 테스트");
		primaryStage.setScene(new Scene(hb));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
