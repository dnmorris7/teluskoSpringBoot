package com.davidonus.demo;

//model object

public class Alien {

	private int aid;
	private String aname;
	private String lang;
	
	
	
	public Alien() {
		this.aid = 1;
		this.aname = "Hello Worlder";
		this.lang = "Java";
	}
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	
}
