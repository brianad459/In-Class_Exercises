package exercise2;

public abstract class SmartDevices implements Powerable {
	
	protected String deviceName;
	protected boolean isOn;
	static int activeDevicesCount; //how many devices are on
	
	
	public SmartDevices (String deviceName) {
		this.deviceName = deviceName; 
		this.isOn = false; 
		
	}
	
	abstract void performSelfDiagnostic();
	
	@Override 
	public void turnOn() {
		if(isOn == false) {
			isOn = true; 
			activeDevicesCount++;
			System.out.println("Device is turned on");
		}
		else {
			System.out.println("Device is already turned on");
		
		}

	}
	
	@Override 
	public void turnOff() {
		if(isOn == true) {
			isOn = false; 
			activeDevicesCount--;
			System.out.println("Device is turned off");
		}
		else {
			System.out.println("Device is already turned off");

		}

	}
		
	
}
