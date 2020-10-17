package com.asg.app;

public class SecondsToHMSConverter {

	public void convert(int seconds) {
		
		if(seconds < 0) {
			System.out.println("Invalid value");
			return;
		}
		
		int secondsRemained = seconds;
		int hourValue = secondsRemained / 3600;
		
		secondsRemained -= (hourValue * 3600);
		int minuteValue = (secondsRemained) / 60;
		
		secondsRemained -= (minuteValue * 60);
		int secondValue = secondsRemained;
		
		System.out.printf("%02d:%02d:%02d%n" , hourValue , minuteValue , secondValue);;
		
	}
	
}
