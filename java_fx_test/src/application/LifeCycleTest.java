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
	
	//start 재정의 필수
	@Override
	public void start(Stage primaryStage) throws Exception { //시작
		System.out.println(Thread.currentThread().getName()+ ":start()");
		primaryStage.show();
		
	}
	@Override
	public void stop() throws Exception { //종료 (재정의 선택사항)
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
