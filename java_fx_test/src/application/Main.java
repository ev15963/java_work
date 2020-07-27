package application;
	


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
			Label helloLabel = new Label("Hello World 내용");
			
			StackPane root = new StackPane();
			root.getChildren().add(helloLabel);
			
			Scene scene = new Scene(root, 300, 200);
			
			stage.setTitle("Hello World 제목");
			stage.setScene(scene);
			stage.show();
//			scene.getStylesheets().add(getClass().getResource().toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
