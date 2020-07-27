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
	//라벨을 담ㅈ을 HBox 레이아웃
	


	@Override
	public void start(Stage primaryStage) throws Exception {
		hb.setPadding(new Insets(10)); //Hbox의 padding 값을 설정
		
		Label label = new Label("Search");
		Label label2 = new Label("A label");
		//라벨 객체 생성시, String 값을 넣어주면 해당값으로 텍스트가 설정
		
		hb.getChildren().addAll(label, label2);
		hb.setPrefSize(300, 200);
		
		System.out.println(label.getText());
//		label.setText("Change TEXT");
		label.setPrefSize(200, 100);
//		label.setStyle("-fx-background-color:orange;");
		
		label.setAlignment(Pos.CENTER_RIGHT); //라벨의 정렬 방식을 설정
		
		Image image = new Image(getClass().getResourceAsStream("/images/search.PNG"));
		label.setGraphic(new ImageView(image));
		
		//setTextFill() : 컴포넌트의 글씨 색상을 설정하는 메서드
		//setTextFill() 내에 색상을 직접 설정할 경우 : Color.web("#색상16진수 6개")
		//제공되는 색상을 지정할 경우 :Color.상수
		
		label.setTextFill(Color.web("#0076a3"));
		label2.setRotate(60); //라벨 회전 메서드 : 0도는 방향각도 이며, 3시 방향
								// 기본 시계방향 회전
								//각도일 경우 반시계방향으로 회전
//		label2.setTranslateX(70); //라벨의 X 좌표 변경
		label2.setTranslateY(70); //라벨의 Y 좌표 변경
		label2.setWrapText(true);
		//윈도우 크기가 작을 경우
		//줄바꿈을 해서 화면에 텍스트를 출력할 것인지 옵션
		//false을 넣어주면 화면이 작을 때, 문구가 crop(잘림)
		
		primaryStage.setTitle("Label 각종 설정 Test");
		primaryStage.setScene(new Scene(hb));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}


}
