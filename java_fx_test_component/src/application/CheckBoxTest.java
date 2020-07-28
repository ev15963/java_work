package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class CheckBoxTest extends Application {
	@Override
	public void start(Stage primaryStage) {
		VBox vb=new VBox(10);
		
		CheckBox chk1=new CheckBox("üũ1");
		CheckBox chk2=new CheckBox("üũ2");
		
		Button btn= new Button("üũ");
		btn.setOnAction(e-> {
			if(chk1.isSelected()) {
				System.out.println("Box1 : Chcked!");
			}
			if(chk2.isSelected()) {
				System.out.println("Box2 : Chcked!");
			}
		});
		
		vb.getChildren().addAll(chk1, chk2,btn);
		vb.setPrefSize(300, 200);
		
		primaryStage.setTitle("Ckbx test");;
		primaryStage.setScene(new Scene(vb));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
