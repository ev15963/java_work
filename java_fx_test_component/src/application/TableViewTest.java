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
		
		/**ǥ���·� �����͸� ����ϴ� component
		 * TableView<Object> table = new TableView<Object>();
		 * **/
		
		//ǥ���·� �����͸� ����ϴ� component
		TableView<Album> table = new TableView<Album>();
		
		/**table ��(Į��)�� ����
		 * TableColumn<Object, String> titleColumn = new TableColumn <Object, String>("�÷���");
		 */
		
		
		//table ��(�÷�)�� ���� : Generic �߰�
		//titleColumn���� Album ��ü�� String���� ���Ե� ����
		TableColumn<Album, String> titleColumn = new TableColumn<Album, String>("Title");
		titleColumn.setMinWidth(100); //�÷��� �ּ� ũ��

		//artistColumn���� Album ��ü�� String���� ���Ե� ����
		TableColumn<Album, String> artistColumn = new TableColumn<Album, String>("Artist");
		artistColumn.setMinWidth(150);

		//releaseColumn���� Album ��ü�� String���� ���Ե� ����
		TableColumn<Album, String> releaseColumn = new TableColumn<Album, String>("Release Year");
		releaseColumn.setMinWidth(170);
		
		//table�� ������ �߰�
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
