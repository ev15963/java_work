package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TableViewTest extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
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
		TableColumn<Album, String> releaseColumn = new TableColumn<Album, String>("Release Year");
		releaseColumn.setMinWidth(170);
		
		//table에 열들을 추가
		table.getColumns().addAll(titleColumn, artistColumn, releaseColumn);
		
		root.setCenter(table);
		
		Scene scene = new Scene(root, 400, 400);
		
		primaryStage.setTitle("TableView Test");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		
	}

}
