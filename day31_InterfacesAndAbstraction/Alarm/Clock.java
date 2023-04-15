package day31_InterfacesAndAbstraction.Alarm;

import java.time.LocalTime;

public class Clock implements Alarm {

	public void showCurrentTime() {
		
		System.out.println("Current time of Clock: " + LocalTime.now());
	}
	@Override
	public void setAlarm() {
		System.out.println("Clock is setting up alarm");
	}
	
}
