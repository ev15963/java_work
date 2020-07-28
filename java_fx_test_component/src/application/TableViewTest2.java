package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TableViewTest2 extends Application{

	@Override
	public void start(Stage primaryStage) {
		BorderPane root = new BorderPane();
		
		/**표형태로 데이터를 출력하는 component
		 * TableView<Object> table = new TableView<Object>();
		 * **/
		
		//표형태로 데이터를 출력하는 component
		TableView<Album> table = new TableView<Album>();
		
		/**table 열(칼럼)의 구성
		 * TableColumn<Object, String> titleColumn = new TableColumn <Object, String>("컬럼명");
		 */
		
		
		//table 열(컬럼)의 구성 : Generic 추가
		//titleColumn에는 Album 객체의 String값이 삽입될 예정
		TableColumn<Album, String> titleColumn = new TableColumn<Album, String>("Title");
		titleColumn.setMinWidth(100); //컬럼의 최소 크기

		//artistColumn에는 Album 객체의 String값이 삽입될 예정
		TableColumn<Album, String> artistColumn = new TableColumn<Album, String>("Artist");
		artistColumn.setMinWidth(150);

		//releaseColumn에는 Album 객체의 String값이 삽입될 예정
		TableColumn<Album, Integer> releaseColumn = new TableColumn<Album, Integer>("Release Year");
		releaseColumn.setMinWidth(170);
		
		//Album의 멤버변수와 mapping
		titleColumn.setCellValueFactory(new PropertyValueFactory<Album, String>("title"));
		//titleColumn과 Album의 String 변수인 "title"과 매핑
		
		artistColumn.setCellValueFactory(new PropertyValueFactory<Album, String>("artist"));
		//artistColumn과 Album의 String 변수인 "artist"과 매핑
		
		releaseColumn.setCellValueFactory(new PropertyValueFactory<Album, Integer>("release"));
		//releaseColumn과 Album의 String 변수인 "release"과 매핑
		
		//table에 추가할 데이터 준비
		//ArrayList와 동일한 역할을 담당하는 Java FX의 observableArrayList		
		ObservableList<Album> albums = FXCollections.observableArrayList();
		albums.add(new Album("너를 기억해","After Taste",2020));
		albums.add(new Album("Diary","Choyoon",2020));
		albums.add(new Album("반칙왕","glow",2020));
		albums.add(new Album("5월의 왈츠","HEY HUN(헤이훈)",2020));
		albums.add(new Album("Bird (Prod. 강유정)","J.yung",2020));
		albums.add(new Album("달려볼까","JD",2020));
		albums.add(new Album("남이 되던 날 ","L.NDN(런던)",2020));
		albums.add(new Album("시티팝 (City pop)","Levan (레반)",2020));
		
		//table에 데이터 추가
		table.setItems(albums);
		
		//table에 열들을 추가
		table.getColumns().addAll(titleColumn, artistColumn, releaseColumn);
		
		root.setCenter(table);
		
		Scene scene = new Scene(root, 400, 400);
		
		primaryStage.setTitle("TableView Test");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
