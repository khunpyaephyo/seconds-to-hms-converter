package com.asg.app;

public class Application {

	public static void main(String[] args) {
		SecondsToHMSConverter converter = new SecondsToHMSConverter();
		converter.convert(3600);
	}
	
}
