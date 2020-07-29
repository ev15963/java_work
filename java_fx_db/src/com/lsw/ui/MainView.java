package com.lsw.ui;

import com.lsw.db.DataBaseClass;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Pagination;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Callback;

public class MainView extends Application {

	private DataBaseClass dbc=null;
	public static String[] field_names;
	
	public MainView() {
		dbc=new DataBaseClass();
	}


	@Override
	public void start(Stage stage) throws Exception { // ������
		/** Root Node ��ü���� �� �⺻���� */
		BorderPane load = new BorderPane(); // �����¿�
		load.setPadding(new Insets(10));

		// scene�� ���� ���̾ƿ��� ����
		// ���� ���̾ƿ� : ���� �ٱ� �� ���̾ƿ�
		Scene scence = new Scene(load, 600, 400);
		stage.setScene(scence);
		////////////////////////////////////////////// ������� �⺻ȭ��

		/** Pagination ��ü ���� */
		Pagination pagination = new Pagination(4); // ��������
		load.setCenter(pagination);

		/** Pagination ��Ÿ�� ���� - ������ ��ư ��Ʈ�� ������ ���� */
		pagination.getStyleClass().add(Pagination.STYLE_CLASS_BULLET);

		/** �� ��ư�� Ŭ���ϰų� �¿� ȭ��ǥ ��ư�� Ŭ������ �� */
		/** Pagination �������� ȭ�鱸���� ���� pageFactory �Ӽ� ���� */
		pagination.setPageFactory(new Callback<Integer, Node>() {

			@Override
			public Node call(Integer param) {
				/** �ε����� ������ ����ó�� */
				// ��ȯ�� ���̾ƿ� ��ü
				BorderPane p = new BorderPane();
				if (param == 0) {
					/** �ε����� 0�� ����� ������ ó�� ���� ���� */
					TableView table=new TableView();
					
					dbc.connect_db();
					dbc.selectAll("cafe_table");
					int field_total=field_names.length;
					TableColumn titleColumn =null;
					
					for(int f=0;f<field_total;f++) {
						titleColumn = new TableColumn(field_names[f]);
						titleColumn.setMinWidth(100);
						table.getColumns().add(titleColumn);
					}
					
//					TableView table = new TableView();
//					TableColumn titleColum = new TableColumn("Title");
//					titleColum.setMinWidth(100); // �÷��� �ּ� ũ��
//					table.getColumns().add(titleColum);
//
//					TableColumn artistColumn = new TableColumn("Artist");
//					artistColumn.setMinWidth(150);
//					table.getColumns().add(artistColumn);
//
//					TableColumn releaseColumn = new TableColumn("Release Year");
//					releaseColumn.setMinWidth(170);
//					table.getColumns().add(releaseColumn);

					p.setCenter(table);
					
				} else if (param == 1) {
					/** �ε����� 1�� ����� ó�� */
					p.setStyle("-fx-background-color:pink");

					Button b = new Button("�׽�Ʈ2");
					b.setPrefSize(100, 30); // ��ư ũ��
					p.setBottom(b);
				} else if (param == 2) {
					/** �ε����� 2�� ��� ������ ���� ó�� */
					p.setStyle("-fx-background-color:orage");

					TextField text = new TextField("�׽�Ʈ3");
					text.setPrefSize(100, 30);
					p.setBottom(text);

				} else {
					/** �ε����� 3�� ��� ������ ���� ó�� */
					p.setStyle("-fx-background-color:cyan");
					HBox hbox = new HBox();
					TextField text1 = new TextField("�׽�Ʈ4");
					text1.setPrefSize(100, 30);
					TextField text2 = new TextField("�׽�Ʈ4");
					text2.setPrefSize(100, 30);

					hbox.getChildren().addAll(text1, text2);
					p.setBottom(hbox);
				}
				return p;
			}
		});

		stage.show();

	}

}
