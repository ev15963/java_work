package com.lsw.ui;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Pagination;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Callback;


public class MainView extends Application{

	public MainView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start(Stage stage) throws Exception { //생성자
		/** Root Node 객체생성 및 기본설정*/
		BorderPane load = new BorderPane(); //상하좌우
		load.setPadding(new Insets(10));
		
		//scene에 최종 레이아웃을 전달
		//최종 레이아웃 : 가장 바깥 쪽 레이아웃
		Scene scence = new Scene(load, 600, 400);
		stage.setScene(scence);
		//////////////////////////////////////////////여기까지 기본화면 
		
		/** Pagination 객체 생성 */
		Pagination pagination = new Pagination(4); //페이지수
		load.setCenter(pagination);
		
		
		/**Pagination 스타일 변경 - 페이지 버튼 컨트롤 디자인 변경 */
		pagination.getStyleClass().add(Pagination.STYLE_CLASS_BULLET);
		
		
		/**각 버튼을 클릭하거나 좌우 화살표 버튼을 클릭했을 때 */
		/**Pagination 페이지별 화면구성을 위한 pageFactory 속성 변경 */
		pagination.setPageFactory(new Callback<Integer, Node>() {

			@Override
			public Node call(Integer param) {
				/**인덱스별 페이지 로직처리*/
				//반환할 레이아웃 객체
				BorderPane p = new BorderPane();
				if(param==0) {
					
				}else if(param==1) {
					
				}else if(param==2) {
					
				} else {
					
				}
				return null;
			}
		});
		
		
		stage.show();
		
	}

}
