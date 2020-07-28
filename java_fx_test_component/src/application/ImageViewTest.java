package application;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ImageViewTest extends Application {
	// event �߻� ��, ���� ����(����)�Ǵ� component���� ����� ����

	@Override
	public void start(Stage primaryStage) {
		// ����(����)�Ǵ� component ���� ��, final�� �߰�
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 400, 400);

		// Image image =new
		// Image(getClass().getResource("/images/bone2.JPG").toString());
		ImageView view = new ImageView("/images/bone2.JPG");
		
//		// size ����
//		view.setFitWidth(300);
//		view.setFitHeight(100);
		
		//��Ⱦ�� ����
		view.setPreserveRatio(true);
		
		//scroll �߰�
		ScrollPane scrp = new ScrollPane();
		scrp.setContent(view);

		root.setCenter(scrp); // BorderPane�� ���

//		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		primaryStage.setTitle("ImageViewTest Scroll Test");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
