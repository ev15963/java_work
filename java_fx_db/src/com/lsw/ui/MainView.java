package com.lsw.ui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Pagination;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

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
		
		stage.show();
		
	}

}
