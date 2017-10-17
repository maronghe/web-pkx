package com.dl.neusoft;

public class Datas {
	private String hum ;

	private String temp ;

	private int id ;
	
	private String yali;
	
	public String getYali() {
		return yali;
	}

	public void setYali(String yali) {
		this.yali = yali;
	}

	public String getHum() {
		return hum;
	}

	public void setHum(String hum) {
		this.hum = hum;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "temp="+temp+",hum="+hum+",yali="+yali;
	}

}
