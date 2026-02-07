package exercise2;

import java.util.ArrayList;



public class Main {
	
	public static void main(String[] args) {

	
	ArrayList<SmartDevices> homeHub = new ArrayList<>();
	
	
	SmartLight living = new SmartLight("living");
	SmartLight kitchen = new SmartLight("kitchen");
	SmartThermostat hallwaythem = new SmartThermostat("Alexa");
	
	System.out.println("Turning on Living Room Light and Hallway Thermostat...");
    living.turnOn();
    hallwaythem.turnOn();

    
    kitchen.setLevel(75);   

    
    homeHub.add(hallwaythem);
    homeHub.add(living);
    homeHub.add(kitchen);
    
    for (int i = 0; i < homeHub.size(); i++) {
    	SmartDevices p = homeHub.get(i);
		p.performSelfDiagnostic();
    }
    // Print total activeDevicesCount
    


	
	

	
	
  }
}
