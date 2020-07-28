package application;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuBarTest4 extends Application {
	// event 발생 후, 값이 변경(추출)되는 component들은 멤버로 선언

	@Override
	public void start(Stage primaryStage) {
		// 변경(추출)되는 component 선언 시, final를 추가
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 400, 400);
		
		root.setPrefSize(300, 100);
		
		MenuBar bar = new MenuBar();
		root.setTop(bar);
		
		//Menu 추가
		Menu fileMenu=new Menu("_File");
		
		//fileMenu("_File")d에 item 추가
		MenuItem openItem = new MenuItem("_Open");
		MenuItem exitItem=new MenuItem("_Exit");
		
		// event 추가 : CTRL+X 누를 경우, Application 종료
		exitItem.setAccelerator(KeyCombination.keyCombination("CTRL+X"));
		exitItem.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// Application 종료 처리
				Platform.exit();
			}
			
		});
		
		fileMenu.getItems().addAll(openItem, exitItem);
		
		Menu editMenu = new Menu("_Edit");
		
		//editMenu("_Edit") 에 sub menu 추가
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
