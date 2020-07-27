package application;

import javafx.application.Application;
import javafx.stage.Stage;

public class LifeCycleTest extends Application{

	public LifeCycleTest() {
		System.out.println(Thread.currentThread().getName()+": Constructor()");
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+ " : main()");
		launch(args);
	}

	@Override
	public void init() throws Exception {
		super.init();
		System.out.println(Thread.currentThread().getName()+ ":init()");
		
	}
	
	//start ������ �ʼ�
	@Override
	public void start(Stage primaryStage) throws Exception { //����
		System.out.println(Thread.currentThread().getName()+ ":start()");
		primaryStage.show();
		
	}
	@Override
	public void stop() throws Exception { //���� (������ ���û���)
		super.stop();
		System.out.println(Thread.currentThread().getName()+ ":stop()");
		
	}
//	@Override
//	public void init() throws Exception {
//		super.init();
//		System.out.println(Thread.currentThread().getName()+ ":init()");
//		
//	}

}
