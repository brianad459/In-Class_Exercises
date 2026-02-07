package exercise2;

public class SmartThermostat extends SmartDevices implements Adjustable {

	
	private int tempature; 
	
	public SmartThermostat(String deviceName) {
		super(deviceName);
		this.isOn = false;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void turnOn() {
		System.out.println("HVAC System Starting...");
		super.turnOn();
		
		
	}

	@Override
	public void turnOff() {
		super.turnOff();
	}

	@Override
	public void setLevel(int level) {
		if (level < 60 || level > 80) {
			System.out.println("Invalid temp" + level);
			return;
		}
		
		this.tempature = level;
		System.out.println("Temp set to:" + tempature);
		
	}

	@Override
	void performSelfDiagnostic() {
		// TODO Auto-generated method stub
		System.out.println("zzrunning diagnostics" );

	}

}
