package com.lsw;

import com.lsw.ui.MainView;

import javafx.application.Application;

public class MainClass {

	public static void main(String[] args) {
		showMain();
	}
	public static void showMain() {

		/**window 화면 호출**/
		Application.launch(MainView.class);
	}
}
