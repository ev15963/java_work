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
		BorderPane root = new BorderPane(); // 추가

		HBox hbox = new HBox();

		// 추가
		text = new Text();
		text.setText("ABCDEFGHIJKLNMOPQRSTUVWXYZ \n" + "abcdefghijklnmopqrstuvwxyz \n 0123456789");
		root.setTop(hbox);
		root.setCenter(text);

		Scene scene = new Scene(root, 400, 400);

		// font family를 지정하는 combobox
		ObservableList<String> families = FXCollections.observableArrayList("Serif", "SansSerif", "Monospaced",
				"Dialog", "DialogInput");
		familyCombo = new ComboBox<String>(families); // 들어오는 값이 문자열인지 숫자열인지..
		familyCombo.setEditable(true);
		familyCombo.getSelectionModel().select("글씨체"); // 콤보박스의 기본설정

		// font style을 지정하는 combobox
		ObservableList<String> styles = FXCollections.observableArrayList("Plain", "Bold", "Italic", "BoldItalic");
		styleCombo = new ComboBox<String>(styles);
		styleCombo.getSelectionModel().selectFirst();

		// font size를 지정하는 combobox
		ObservableList<Integer> sizes = FXCollections.observableArrayList(8, 12, 16, 20, 24);

		sizeCombo = new ComboBox<Integer>(sizes);
		sizeCombo.getSelectionModel().select(1);

		hbox.getChildren().addAll(familyCombo, styleCombo, sizeCombo);
		// ----------------------------------------------------------------------
		// Event 처리 추가
		EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				String family = familyCombo.getValue();
				String style = styleCombo.getValue();
				Integer size = sizeCombo.getValue();

				// 값이 설정되어 있지 않으면, 기본값이 이용
				if (family == null || style.isEmpty()) {
					family = "Serif";
				}
				if (style == null || family.isEmpty()) {
					style = "Plain";
				}
				if (size == null) {
					size = 12;
				}

				// style을 FontWeight 객체와 FontPosture 객체로 표시
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

				// font를 생성하고, 문자열에 적용
				Font font = Font.font(family, weight, posture, size);
				text.setFont(font);
			} // handle() END
		}; // EventHandler END

		//event handler 등록
		familyCombo.setOnAction(handler);
		styleCombo.setOnAction(handler);
		sizeCombo.setOnAction(handler);
		
		primaryStage.setTitle("ComboBox Test");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
