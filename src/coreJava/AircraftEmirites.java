package coreJava;

public class AircraftEmirites extends continentalTraffic{

	public static void main(String[] args) {
		
		
		AircraftEmirites a = new AircraftEmirites();
		a.bodyColor();
		a.SafetyGuidelines();
		a.EmergencyGuidelines();

	}

	@Override
	public void bodyColor() {
		System.out.println("bodyColor is red");
		
	}

}
