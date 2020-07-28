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
		TableColumn<Album, Integer> releaseColumn = new TableColumn<Album, Integer>("Release Year");
		releaseColumn.setMinWidth(170);
		
		//Album�� ��������� mapping
		titleColumn.setCellValueFactory(new PropertyValueFactory<Album, String>("title"));
		//titleColumn�� Album�� String ������ "title"�� ����
		
		artistColumn.setCellValueFactory(new PropertyValueFactory<Album, String>("artist"));
		//artistColumn�� Album�� String ������ "artist"�� ����
		
		releaseColumn.setCellValueFactory(new PropertyValueFactory<Album, Integer>("release"));
		//releaseColumn�� Album�� String ������ "release"�� ����
		
		//table�� �߰��� ������ �غ�
		//ArrayList�� ������ ������ ����ϴ� Java FX�� observableArrayList		
		ObservableList<Album> albums = FXCollections.observableArrayList();
		albums.add(new Album("�ʸ� �����","After Taste",2020));
		albums.add(new Album("Diary","Choyoon",2020));
		albums.add(new Album("��Ģ��","glow",2020));
		albums.add(new Album("5���� ����","HEY HUN(������)",2020));
		albums.add(new Album("Bird (Prod. ������)","J.yung",2020));
		albums.add(new Album("�޷�����","JD",2020));
		albums.add(new Album("���� �Ǵ� �� ","L.NDN(����)",2020));
		albums.add(new Album("��Ƽ�� (City pop)","Levan (����)",2020));
		
		//table�� ������ �߰�
		table.setItems(albums);
		
		//table�� ������ �߰�
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
