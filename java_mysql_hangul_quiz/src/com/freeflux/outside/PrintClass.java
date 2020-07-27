package com.freeflux.outside;

import java.io.FileWriter;

import com.freeflux.MainClass;
import com.freeflux.db.DataBaseClass;

public class PrintClass {

	public class MakeHTML(){
	DataBaseClass dbc = new DataBaseClass();
	MainClass mc =  new MainClass();
	FileWriter fw = new FileWriter(dbc.quiz1(quiz_db));
	}
}
