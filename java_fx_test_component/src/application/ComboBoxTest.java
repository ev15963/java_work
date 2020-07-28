package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ComboBoxTest extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox root = new HBox();
		Scene scene = new Scene(root, 400, 400);
		
		//font family�� �����ϴ� combobox
		ObservableList<String> families = FXCollections.observableArrayList("Serif", 
				"SansSerif", "Monospaced", "Dialog", "DialogInput");
		ComboBox<String> familyCombo = new ComboBox<String> (families); //������ ���� ���ڿ����� ���ڿ�����..
		familyCombo.setEditable(true);
		familyCombo.getSelectionModel().select("�۾�ü"); //�޺��ڽ��� �⺻����
		
		//font style�� �����ϴ� combobox
		ObservableList<String> styles = FXCollections.observableArrayList("Plain", "Bold",
				"Italic", "BoldItalic");
		ComboBox<String> StylesCombo = new ComboBox<String>(styles);
		StylesCombo.getSelectionModel().selectFirst();
		
		//font size�� �����ϴ� combobox
		ObservableList<Integer> sizes = FXCollections.observableArrayList(8,12,16,20,24);
		
		ComboBox<Integer> sizesCombo = new ComboBox<Integer>(sizes);
		sizesCombo.getSelectionModel().select(1);
		
		root.getChildren().addAll(familyCombo, StylesCombo, sizesCombo);
		
		primaryStage.setTitle("ComboBox Test");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

}
