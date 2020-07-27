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
		//컨테이너 행과 열을 이용하여 컴포넌트를 배치하는 레이아웃
		
		Button btn = new Button("OK");
		
		gridPane.setPadding(new Insets(20));
		//레이아웃의 패딩을 설정.(padding 상하좌우 간격)
		//레이아웃과 배치되는 컴포넌트 사이 간격
		
//		 gridPane.setHgap(30);
		 
		 
		 gridPane.setHgap(50); //gap은 배치되는 컴포넌트들 사이 간격
		 gridPane.setVgap(10);
		 //레이아웃의 H V gap 설정
		 
		 //좌표 지정 방법 1 (직접 행과 열을 미리 지정)
		 GridPane.setRowIndex(btn, 0);
		 GridPane.setColumnIndex(btn, 0);
		 
		 Label label1 = new Label("Label1");
		 label1.setStyle("-fx-background-color : orange;");
		 
		 //좌표 지정 방법 2 (배치 컴포넌트의 위치를 한번에 지정);
		 GridPane.setConstraints(label1, 1, 1); // 1번 열, 1번행에 label1 배치
		 
		 gridPane.getChildren().addAll(btn, label1);
		 
		 //좌표 지정 방법 3 (컴포넌트 객체 생성과 동시에 1번행, 0번 열에 배치)
		 gridPane.add(new Button("addBtn"), 1, 0); // 가장 많이 사용되는 방법
		 
		 FlowPane fpane = new FlowPane(); //기본 왼쪽에서 오른쪽으로 배치
		 
		 //컴포넌트 객체 생성과 동시에 레이아웃의 자식으로 추가
		 fpane.getChildren().add(new Button("col(0), row(2)")); //
		 fpane.setAlignment(Pos.CENTER); //기본왼쪽 정렬을 가운데정렬로 변경
		 fpane.setStyle("-fx-background-color : black;");
		 //레이아웃의 배경을 검은 색으로 설정
		 
		  gridPane.add(fpane, 0, 2, 2, 1);
		  //자식컴포넌트, 열의 인덱스, 행의 인덱스, 열크기, 행크기
		  
		  primaryStage.setTitle("GridPanelEx"); //윈도우 제목
		  primaryStage.setScene(new Scene(gridPane,300,300)); //신배치 및 W,H
		  primaryStage.show(); //스테이지 출력
		 
	}

}
