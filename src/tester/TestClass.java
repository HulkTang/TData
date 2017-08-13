package tester;

import java.util.Date;

public class TestClass {
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	private int number;
	private String name;
	private Date date;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackTester.test();
	}

	public TestClass(int number, String name, Date date) {
		super();
		this.number = number;
		this.name = name;
		this.date = date;
	}

}
