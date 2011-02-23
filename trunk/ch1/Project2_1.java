package ch1;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Project2_1 {
	public static void main (String[] args) {
	
		
		GregorianCalendar cal = new GregorianCalendar(2010, Calendar.SEPTEMBER, 12);
		cal.add(Calendar.DAY_OF_MONTH, 100);
		
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH) + 
				"/" + cal.get(Calendar.MONTH) + "/" + cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		cal.set(1980, Calendar.JUNE, 2);

		System.out.println(cal.get(Calendar.DAY_OF_MONTH) + 
				"/" + cal.get(Calendar.MONTH) + "/" + cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));

		cal.add(Calendar.DAY_OF_MONTH, 20000);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH) + 
				"/" + cal.get(Calendar.MONTH) + "/" + cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
				
		
		
		
	}

	// 
	
	
	 
	
	
}
