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
	public void start(Stage stage) throws Exception { // 생성자
		/** Root Node 객체생성 및 기본설정 */
		BorderPane load = new BorderPane(); // 상하좌우
		load.setPadding(new Insets(10));

		// scene에 최종 레이아웃을 전달
		// 최종 레이아웃 : 가장 바깥 쪽 레이아웃
		Scene scence = new Scene(load, 600, 400);
		stage.setScene(scence);
		////////////////////////////////////////////// 여기까지 기본화면

		/** Pagination 객체 생성 */
		Pagination pagination = new Pagination(4); // 페이지수
		load.setCenter(pagination);

		/** Pagination 스타일 변경 - 페이지 버튼 컨트롤 디자인 변경 */
		pagination.getStyleClass().add(Pagination.STYLE_CLASS_BULLET);

		/** 각 버튼을 클릭하거나 좌우 화살표 버튼을 클릭했을 때 */
		/** Pagination 페이지별 화면구성을 위한 pageFactory 속성 변경 */
		pagination.setPageFactory(new Callback<Integer, Node>() {

			@Override
			public Node call(Integer param) {
				/** 인덱스별 페이지 로직처리 */
				// 반환할 레이아웃 객체
				BorderPane p = new BorderPane();
				if (param == 0) {
					/** 인덱스가 0일 경우의 페이지 처리 로직 구간 */
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
//					titleColum.setMinWidth(100); // 컬럼의 최소 크기
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
					/** 인덱스가 1일 경우의 처리 */
					p.setStyle("-fx-background-color:pink");

					Button b = new Button("테스트2");
					b.setPrefSize(100, 30); // 버튼 크기
					p.setBottom(b);
				} else if (param == 2) {
					/** 인덱스가 2일 경우 페이지 로직 처리 */
					p.setStyle("-fx-background-color:orage");

					TextField text = new TextField("테스트3");
					text.setPrefSize(100, 30);
					p.setBottom(text);

				} else {
					/** 인덱스가 3일 경우 페이지 로직 처리 */
					p.setStyle("-fx-background-color:cyan");
					HBox hbox = new HBox();
					TextField text1 = new TextField("테스트4");
					text1.setPrefSize(100, 30);
					TextField text2 = new TextField("테스트4");
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
