package coreJava;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Datedemo {

	public static void main(String[] args) {
		
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		SimpleDateFormat sd = new SimpleDateFormat("M/d/y hh:mm:ss");
		
		System.out.println(d.toString());
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));

		

	}

}
