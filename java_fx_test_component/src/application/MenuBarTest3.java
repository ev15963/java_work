package application;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuBarTest3 extends Application {
	// event �߻� ��, ���� ����(����)�Ǵ� component���� ����� ����

	@Override
	public void start(Stage primaryStage) {
		// ����(����)�Ǵ� component ���� ��, final�� �߰�
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 400, 400);
		
		root.setPrefSize(300, 100);
		
		MenuBar bar = new MenuBar();
		root.setTop(bar);
		
		//Menu �߰�
		Menu fileMenu=new Menu("_File");
		
		//fileMenu("_File")d�� item �߰�
		MenuItem openItem = new MenuItem("_Open");
		MenuItem exitItem=new MenuItem("_Exit");
		fileMenu.getItems().addAll(openItem, exitItem);
		
		Menu editMenu = new Menu("_Edit");
		
		//editMenu("_Edit") �� sub menu �߰�
		Menu submenu=new Menu("SubMenu");
		submenu.getItems().addAll(new MenuItem("Sub Item1"), new MenuItem("Sub Item2"));
		editMenu.getItems().add(submenu);
		
		bar.getMenus().addAll(fileMenu, editMenu);

		primaryStage.setTitle("ImageViewTest Scroll Test");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
