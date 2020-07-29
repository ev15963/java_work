package com.lsw;

import com.lsw.db.DataBaseClass;
import com.lsw.obj.CafeMember;
import com.lsw.ui.MainView;

import javafx.application.Application;

public class MainClass {

	public static void main(String[] args) {
		DataBaseClass dbc=new DataBaseClass();
		dbc.connect_db();
		showMain();
		dbc.selectAll("cafe_table");
//		CafeMember cm = new CafeMember();
		
	}
	public static void showMain() {

		/**window 화면 호출**/
		Application.launch(MainView.class);
	}
}
