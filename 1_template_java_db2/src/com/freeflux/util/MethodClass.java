package com.freeflux.util;

import com.freeflux.db.DataBaseClass;

public class MethodClass {
	DataBaseClass dbc = new DataBaseClass();
	public MethodClass() {
	}

	private String tagMethod(String uri) {

		String tag="";
		//tag ¸¸µé±â
		tag+="<!doctype html><html><head><title>Bank Data List</title></head><body><table border='1'>";
		
		return tag;
	}
	
}
