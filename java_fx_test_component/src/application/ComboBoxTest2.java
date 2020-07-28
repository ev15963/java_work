package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ComboBoxTest2 extends Application{
	private ComboBox<String> familyCombo;
	private ComboBox<String> styleCombo;
	private ComboBox<Integer> sizeCombo;
	private Text text;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane(); //추가
		
		HBox hbox = new HBox();
		
		//추가
		text=new Text();
		text.setText("ABCDEFGHIJKLNMOPQRSTUVWXYZ \n"
				+"abcdefghijklnmopqrstuvwxyz \n 0123456789");
		root.setTop(hbox);
		root.setCenter(text);
		
		Scene scene = new Scene(root, 400, 400);
		
		//font family를 지정하는 combobox
		ObservableList<String> families = FXCollections.observableArrayList("Serif", 
				"SansSerif", "Monospaced", "Dialog", "DialogInput");
		ComboBox<String> familyCombo = new ComboBox<String> (families); //들어오는 값이 문자열인지 숫자열인지..
		familyCombo.setEditable(true);
		familyCombo.getSelectionModel().select("글씨체"); //콤보박스의 기본설정
		
		//font style을 지정하는 combobox
		ObservableList<String> styles = FXCollections.observableArrayList("Plain", "Bold",
				"Italic", "BoldItalic");
		ComboBox<String> StylesCombo = new ComboBox<String>(styles);
		StylesCombo.getSelectionModel().selectFirst();
		
		//font size를 지정하는 combobox
		ObservableList<Integer> sizes = FXCollections.observableArrayList(8,12,16,20,24);
		
		ComboBox<Integer> sizesCombo = new ComboBox<Integer>(sizes);
		sizesCombo.getSelectionModel().select(1);
		
		hbox.getChildren().addAll(familyCombo, StylesCombo, sizesCombo);
		
		primaryStage.setTitle("ComboBox Test");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

}
