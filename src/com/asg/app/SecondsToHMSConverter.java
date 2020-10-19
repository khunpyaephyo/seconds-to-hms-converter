package com.asg.app;

public class SecondsToHMSConverter {

	public void convert(int seconds) {
		
		if(seconds < 0) {
			System.out.println("Invalid value");
			return;
		}
		
		int hourValue = seconds / 3600;
		int minuteValue = (seconds%3600) / 60;
		int secondValue = seconds%60;
		
		String result = String.format("%02d:%02d:%02d" , hourValue , minuteValue , secondValue);
				
		
		System.out.println(result);
		
	}
	
}
