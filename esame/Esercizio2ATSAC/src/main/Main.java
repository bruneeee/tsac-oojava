package main;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Map<Integer, Integer> exceptions = new HashMap<>();
		Map<String, Double> temps = new HashMap<>();
		
		temps.put("letture", 0.0);
		temps.put("values", 0.0);
		temps.put("max", 0.0);
		temps.put("errors", 0.0);
		
		TemperatureSensor t = new TemperatureSensor();
		t.setListener(new TemperatureSensorListener(){
			@Override
			public void onSuccess(double temperature) {
				if(temps.get("max") < temperature)
					temps.replace("max", temperature);
				temps.replace("letture", temps.get("letture")+1);
				temps.replace("values", temps.get("values")+temperature);
			}
			@Override
			public void onFailed(TemperatureSensorException exception) {
				int errcode = exception.getErrorcode();
				if(!exceptions.containsKey(errcode))
					exceptions.put(errcode, 1);
				else
					exceptions.replace(errcode, exceptions.get(errcode)+1);
				temps.replace("errors", temps.get("errors") + 1);
			}		
		});
		
		for(int i=0;i<1000;i++){
			t.next();
		}
		
		double letture = temps.get("letture");
		double sValori = temps.get("values");
		double max = temps.get("max");
		double errori = temps.get("errors");
		double tMedia = sValori / letture;
		System.out.println("N Letture: " + letture);
		System.out.println("N Errori: " + errori);
		System.out.println("SommaTemp: "+ sValori);
		System.out.println("TMedia: "+ tMedia);
		System.out.println("TMax: " + max);
		
		for (HashMap.Entry<Integer, Integer> entry : exceptions.entrySet())  
		    System.out.println("Errore: " + entry.getKey()+" Ripetizioni: " + entry.getValue());
	}
}
