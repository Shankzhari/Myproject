package coreJava;

import java.util.Calendar;

public class CalenderDemo {

	public static void main(String[] args) {

		
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		

		
	}

}
