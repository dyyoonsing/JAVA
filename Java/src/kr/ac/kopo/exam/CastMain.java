package kr.ac.kopo.exam;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CastMain {

	
	public static void main(String[] args) {
		
		String pattern = "yyyy-MM-dd hh:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String day = sdf.format(new Date());
		
		System.out.println(day);
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		c.set(2023, 9, 27);
		
		Date d = c.getTime();
		System.out.println(d);
		System.out.println(sdf.format(d));
		
	}
	
	

}

