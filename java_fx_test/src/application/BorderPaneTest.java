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
		//컨테이너
		
		Button [] btn = new Button[5];
		//컨테이너에 배치할 버튼 배열
		
		String [] strBtn = { "Top", "Center", "Bottom", "Left", "Right"};
		//버튼에 들어갈 각 버튼의 텍스트 배열이다.
		
		for(int i=0;i<5;i++) {
			btn[i] =new Button(strBtn[i]);
		}
		//반복문을 사용하여 각 버튼에 이름을 넣어주세요.
		
		borderPane.setTop(btn[0]); //BorderPane 객체의 배치 메서드(컴포넌트)
		borderPane.setAlignment(btn[0], Pos.TOP_CENTER);
		
		borderPane.setCenter(btn[1]);
		borderPane.setAlignment(btn[2], Pos.BOTTOM_CENTER);
		
		HBox hb = new HBox();
		borderPane.getChildren().add(btn[2]);
		borderPane.getChildren().add(btn[3]);
		borderPane.getChildren().add(btn[4]);
		borderPane.setBottom(hb);
		//border 컨테이너의 각 부분에 위치할 버튼 지정
		
		primaryStage.setTitle("BorderPaneFx"); //윈도우 창 제목설정 메서드
		Scene scene=new Scene(borderPane,300,100); //레이아웃객체 W H
		primaryStage.setScene(scene); //스테이지에 씬 설정
		primaryStage.show(); //스테이지 출력.. (이 메서드 생략 시,
							// 사용자 화면이 보이지 않음!!
	}

}
