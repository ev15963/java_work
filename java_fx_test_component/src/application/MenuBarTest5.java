package application;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuBarTest5 extends Application {
	// event �߻� ��, ���� ����(����)�Ǵ� component���� ����� ����

	@Override
	public void start(Stage primaryStage) {
		// ����(����)�Ǵ� component ���� ��, final�� �߰�
		BorderPane root = new BorderPane();
		
		root.setPrefSize(300, 100);
		
		MenuBar bar = new MenuBar();
		root.setTop(bar);
		
		//Menu �߰�
		Menu fileMenu=new Menu("_File");
		
		//fileMenu("_File")d�� item �߰�
		MenuItem openItem = new MenuItem("_Open");
		MenuItem exitItem=new MenuItem("_Exit");
		
		// event �߰� : CTRL+X ���� ���, Application ����
		exitItem.setAccelerator(KeyCombination.keyCombination("CTRL+X"));
		exitItem.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// Application ���� ó��
				Platform.exit();
			}
			
		});
		
		fileMenu.getItems().addAll(openItem, exitItem);
		
		Menu editMenu = new Menu("_Edit");
		
		//editMenu("_Edit") �� sub menu �߰�
		Menu submenu=new Menu("SubMenu");
		submenu.getItems().addAll(new MenuItem("Sub Item1"), new MenuItem("Sub Item2"));
		editMenu.getItems().add(submenu);
		
		bar.getMenus().addAll(fileMenu, editMenu);

		
		//popup �޴� (contextmenu) �߰�
		final ContextMenu popup=new ContextMenu();
		popup.getItems().addAll(new MenuItem("popup1"), new MenuItem("popup2"));
		
		bar.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				// mouse ������ Ŭ�� ��, �˾� �޴� ǥ��
				if(event.getButton()== MouseButton.SECONDARY) {
					popup.show(bar, event.getSceneX(), event.getSceneY());
				}
				
			}
			
		}); //setOnMouseClicked() END

//		Scene scene = new Scene(root);

	}
	
	

	public static void main(String[] args) {
		launch(args);
	}
}