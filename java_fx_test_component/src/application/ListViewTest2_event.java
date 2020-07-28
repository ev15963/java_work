package application;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListViewTest2_event extends Application {

	// item�� list ���·� ����� ���
	private ObservableList<String> items = FXCollections.observableArrayList("Red", "Green", "Yellow", "Magenta", "Cyan",
			"Black", "White");

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox();

		// ListView ��ü ���� ��, ObservableList Ÿ�� ��ü ����
		ListView<String> list = new ListView<String>(items);
		// �Ǵ�
		// ListView<String> list= new ListView<String>();
		// list.setItems(items);


	ChangeListener<String> change = new ChangeListener<String>() {

		@Override
		public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
			System.out.println("�������ð�=>"+oldValue);
			System.out.println("�űԼ��ð�=>"+newValue);
			
		}
		
	};
		
	list.getSelectionModel().selectedItemProperty().addListener(change);
	
	root.getChildren().add(list);

	Scene scene = new Scene(root, 200, 150);

	primaryStage.setTitle("ListView List Item Test");primaryStage.setScene(scene);primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
