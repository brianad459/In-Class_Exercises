package exercise2;

public class SmartLight extends SmartDevices implements Adjustable {

	private int brightness; 
	
	
	public SmartLight(String deviceName) {
		super(deviceName);
		brightness = 0;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void turnOn() {
		super.turnOn();
		
	}

	@Override
	public void turnOff() {
		super.turnOff();
		
	}
	
	@Override
	public void performSelfDiagnostic() {
		System.out.println("Checking LED health");
	}
	

	@Override
	public void setLevel(int level) {
		if (isOn == false) {
			System.out.println("Cannont adjust: Device is OFF" );

		}
	}
		
}

	

	

