package com.lsw.ui;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Pagination;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Callback;


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
		
		
		/**Pagination ��Ÿ�� ���� - ������ ��ư ��Ʈ�� ������ ���� */
		pagination.getStyleClass().add(Pagination.STYLE_CLASS_BULLET);
		
		
		/**�� ��ư�� Ŭ���ϰų� �¿� ȭ��ǥ ��ư�� Ŭ������ �� */
		/**Pagination �������� ȭ�鱸���� ���� pageFactory �Ӽ� ���� */
		pagination.setPageFactory(new Callback<Integer, Node>() {

			@Override
			public Node call(Integer param) {
				/**�ε����� ������ ����ó��*/
				//��ȯ�� ���̾ƿ� ��ü
				BorderPane p = new BorderPane();
				if(param==0) {
					//�⺻ȭ��
				}else if(param==1) {
					/** �ε����� 1�� ����� ó��*/
					p.setStyle("-fx-background-color:pink");
					
					Button b = new Button("�׽�Ʈ2");
					b.setPrefSize(100, 30); //��ư ũ��
					p.setBottom(b);
				}else if(param==2) {
					
				} else {
					
				}
				return p;
			}
		});
		
		
		stage.show();
		
	}

}
