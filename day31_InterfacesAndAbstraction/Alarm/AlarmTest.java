package day31_InterfacesAndAbstraction.Alarm;

import java.util.ArrayList;

public class AlarmTest {

	public static void main(String[] args) {

//		Alarm alarm = new Alarm(); // Cannot Instantiate like this
		
		Iphone pro14Max = new Iphone();
		pro14Max.call("123");
		pro14Max.attendingZoomMeeting();
		pro14Max.message("7034735839", "Irfan");
		
		
		pro14Max.setAlarm();
		
		Alexa alexa1 = new Alexa();
		alexa1.alexaWhatTimeIsIt();
		
		
		Clock clock1 = new Clock();
		clock1.setAlarm();
		clock1.showCurrentTime();
		//-------------------------------
		
		Alarm callAlexa = new Alexa();
//		callAlexa.alexaWhatTimeIsIt(); // You cannot call the method from Alexa class if you overriding the signature method
		
		Alarm iphone13 = new Iphone();
		Alarm clock2 = new Clock();
		
		callAlexa.setAlarm();
		iphone13.setAlarm();
		clock2.setAlarm();
		System.out.println("-----------------");
		ArrayList<Alarm> list = new ArrayList<>();
		
		list.add(pro14Max);    
		list.add(alexa1);
		list.add(clock1);
		
		list.add(callAlexa);
		list.add(iphone13);
		list.add(clock2);
		
		
		for(Alarm eachAlarm : list) {
			eachAlarm.setAlarm();
		}
		
		
		
		
		
		
		
		
	}

}
