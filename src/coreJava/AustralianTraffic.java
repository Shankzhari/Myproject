package coreJava;

import centralTraffic.trafficSignal;

public class AustralianTraffic implements trafficSignal{

	public static void main(String[] args) {
		
		trafficSignal a = new AustralianTraffic();
		
		a.goGreen();
		a.goRed();
		a.goYellow();

	}

	@Override
	public  void goGreen() {
		// TODO Auto-generated method stub
		System.out.println("GO Green");
	}

	@Override
	public void goRed() {
		System.out.println("GO Red");
		
		
	}

	@Override
	public void goYellow() {
		System.out.println("Go Yellow");
		
	}

}
