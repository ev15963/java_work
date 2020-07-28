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
		
		final FileChooser chooser = new FileChooser(); //파일을 선택할 수 있는
		//걸러내는 객체을 얻음					//한글 가능  
		FileChooser.ExtensionFilter filter 
		= new FileChooser.ExtensionFilter("Image", "*.jpg", "*.gif", "*.png");
		chooser.getExtensionFilters().add(filter);
		
		MenuBar bar = new MenuBar();
		root.setTop(bar); //상단에 Menubar 배치
		
		//MenuBar의 위치할 menu 생성
		Menu fileMenu = new Menu("_File");

		//Menu("_File")에 해당하는 item 생성
		MenuItem openItem = new MenuItem("_Open");
				
		//MenuItem("_Open")클릭시,
		openItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				//FileChooser 출력후, 선택한 파일의 경로 반환
				File file = chooser.showOpenDialog(primaryStage);
				if (file != null) {
					//파일의 경로를 이용하여 ImageView에 출력
					Image image = new Image(file.toURI().toString());
					view.setImage(image); //image view에 set
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
