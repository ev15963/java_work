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

	// item을 list 형태로 등록할 경우
	private ObservableList<String> items = FXCollections.observableArrayList("Red", "Green", "Yellow", "Magenta", "Cyan",
			"Black", "White");

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox();

		// ListView 객체 생성 시, ObservableList 타입 객체 전달
		ListView<String> list = new ListView<String>(items);
		// 또는
		// ListView<String> list= new ListView<String>();
		// list.setItems(items);


	ChangeListener<String> change = new ChangeListener<String>() {

		@Override
		public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
			System.out.println("기존선택값=>"+oldValue);
			System.out.println("신규선택값=>"+newValue);
			
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
