package com.fenbi.yjsj.pojo;

public class Gdp {

	private int id;
	private int year;
	private double value;

	public Gdp() {
		super();
	}

	public Gdp(int id, int year, double value) {
		super();
		this.id = id;
		this.year = year;
		this.value = value;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

}
