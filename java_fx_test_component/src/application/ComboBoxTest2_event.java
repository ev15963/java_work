package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ComboBoxTest2_event extends Application {
	private ComboBox<String> familyCombo;
	private ComboBox<String> styleCombo;
	private ComboBox<Integer> sizeCombo;
	private Text text;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane(); // �߰�

		HBox hbox = new HBox();

		// �߰�
		text = new Text();
		text.setText("ABCDEFGHIJKLNMOPQRSTUVWXYZ \n" + "abcdefghijklnmopqrstuvwxyz \n 0123456789");
		root.setTop(hbox);
		root.setCenter(text);

		Scene scene = new Scene(root, 400, 400);

		// font family�� �����ϴ� combobox
		ObservableList<String> families = FXCollections.observableArrayList("Serif", "SansSerif", "Monospaced",
				"Dialog", "DialogInput");
		familyCombo = new ComboBox<String>(families); // ������ ���� ���ڿ����� ���ڿ�����..
		familyCombo.setEditable(true);
		familyCombo.getSelectionModel().select("�۾�ü"); // �޺��ڽ��� �⺻����

		// font style�� �����ϴ� combobox
		ObservableList<String> styles = FXCollections.observableArrayList("Plain", "Bold", "Italic", "BoldItalic");
		styleCombo = new ComboBox<String>(styles);
		styleCombo.getSelectionModel().selectFirst();

		// font size�� �����ϴ� combobox
		ObservableList<Integer> sizes = FXCollections.observableArrayList(8, 12, 16, 20, 24);

		sizeCombo = new ComboBox<Integer>(sizes);
		sizeCombo.getSelectionModel().select(1);

		hbox.getChildren().addAll(familyCombo, styleCombo, sizeCombo);
		// ----------------------------------------------------------------------
		// Event ó�� �߰�
		EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				String family = familyCombo.getValue();
				String style = styleCombo.getValue();
				Integer size = sizeCombo.getValue();

				// ���� �����Ǿ� ���� ������, �⺻���� �̿�
				if (family == null || style.isEmpty()) {
					family = "Serif";
				}
				if (style == null || family.isEmpty()) {
					style = "Plain";
				}
				if (size == null) {
					size = 12;
				}

				// style�� FontWeight ��ü�� FontPosture ��ü�� ǥ��
				FontPosture posture = FontPosture.REGULAR;
				FontWeight weight = FontWeight.MEDIUM;
				switch (style) {
				case "Bold":
					weight = FontWeight.BOLD;
					break;
				case "Italic":
					posture = FontPosture.ITALIC;
					break;
				case "BoldItalic":
					weight = FontWeight.BOLD;
					break;
				default:
				}

				// font�� �����ϰ�, ���ڿ��� ����
				Font font = Font.font(family, weight, posture, size);
				text.setFont(font);
			} // handle() END
		}; // EventHandler END

		//event handler ���
		familyCombo.setOnAction(handler);
		styleCombo.setOnAction(handler);
		sizeCombo.setOnAction(handler);
		
		primaryStage.setTitle("ComboBox Test");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
