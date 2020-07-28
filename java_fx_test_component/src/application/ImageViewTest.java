package application;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ImageViewTest extends Application {
	// event 발생 후, 값이 변경(추출)되는 component들은 멤버로 선언

	@Override
	public void start(Stage primaryStage) {
		// 변경(추출)되는 component 선언 시, final를 추가
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 400, 400);

		// Image image =new
		// Image(getClass().getResource("/images/bone2.JPG").toString());
		ImageView view = new ImageView("/images/bone2.JPG");
		
//		// size 설정
//		view.setFitWidth(300);
//		view.setFitHeight(100);
		
		//종횡비 유지
		view.setPreserveRatio(true);
		
		//scroll 추가
		ScrollPane scrp = new ScrollPane();
		scrp.setContent(view);

		root.setCenter(scrp); // BorderPane의 가운데

//		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		primaryStage.setTitle("ImageViewTest Scroll Test");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
