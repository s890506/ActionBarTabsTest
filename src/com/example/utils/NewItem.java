package com.example.utils;

public class NewItem {
	
	private String Memo;
	private String Time;
	
	public NewItem(String memo,String time) {
		this.Memo=memo;
		this.Time = time;
	}
	
	public String getMemo(){
		return Memo;
	}
	
	public String getTime(){
		return Time;
	}
	
	
}
