package application;

import java.io.File;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FileChooserTest extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 400, 400);
		final ImageView view = new ImageView();
		root.setCenter(view);
		
		final FileChooser chooser = new FileChooser(); //������ ������ �� �ִ�
		//�ɷ����� ��ü�� ����					//�ѱ� ����  
		FileChooser.ExtensionFilter filter 
		= new FileChooser.ExtensionFilter("Image", "*.jpg", "*.gif", "*.png");
		chooser.getExtensionFilters().add(filter);
		
		MenuBar bar = new MenuBar();
		root.setTop(bar); //��ܿ� Menubar ��ġ
		
		//MenuBar�� ��ġ�� menu ����
		Menu fileMenu = new Menu("_File");

		//Menu("_File")�� �ش��ϴ� item ����
		MenuItem openItem = new MenuItem("_Open");
				
		//MenuItem("_Open")Ŭ����,
		openItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				//FileChooser �����, ������ ������ ��� ��ȯ
				File file = chooser.showOpenDialog(primaryStage);
				if (file != null) {
					//������ ��θ� �̿��Ͽ� ImageView�� ���
					Image image = new Image(file.toURI().toString());
					view.setImage(image); //image view�� set
				}
			}
		}); //setOnAction() END
		
		 fileMenu.getItems().add(openItem);
		 bar.getMenus().add(fileMenu);
		 
		 primaryStage.setTitle("FileChooser Test");
		 primaryStage.setScene(scene);
		 primaryStage.show();
	}

}
