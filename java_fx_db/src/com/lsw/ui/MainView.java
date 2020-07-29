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
	public void start(Stage stage) throws Exception { //������
		/** Root Node ��ü���� �� �⺻����*/
		BorderPane load = new BorderPane(); //�����¿�
		load.setPadding(new Insets(10));
		
		//scene�� ���� ���̾ƿ��� ����
		//���� ���̾ƿ� : ���� �ٱ� �� ���̾ƿ�
		Scene scence = new Scene(load, 600, 400);
		stage.setScene(scence);
		//////////////////////////////////////////////������� �⺻ȭ�� 
		
		/** Pagination ��ü ���� */
		Pagination pagination = new Pagination(4); //��������
		load.setCenter(pagination);
		
		stage.show();
		
	}

}
