package model;

//Luke Xiong

public class WeekTwoModel {
	
	private String message;
	
	public WeekTwoModel(String message) {
		this.message = message;
	}

	public void MethodOne(String message) {
		this.message = message;
	}
	public String printMethod() {
		System.out.println(message);
		return message;
	}
	
	public String MethodTwo() {
		return "Hi!" + message;
	}
	public int returnMessageLength() {
		return message.length();
	}
	
	
	/*
	//print message
	public String printMethod() {
		//System.out.println(message);
		return message;
	}
	//not needed?
	public String MethodTwo() {
		// TODO Auto-generated method stub
		return "Hi!" + message;
	}

	public int returnMessageLength() {
		return message.length();
	}
	*/

}
