package defaultpackage;

public class Month {

	private int month;
	public enum MONTHS {January, February, March, April, May, June, July, August, September, October, November, December};
	public Month(int month) {
		this.month = month;		
	}
	
	 public String getName(){
		 switch (month-1) {
		 case  0 : return MONTHS.January.toString();
		 case  1 : return MONTHS.February.toString();
		 case  2 : return MONTHS.March.toString();
		 case  3 : return MONTHS.April.toString();
		 case  4 : return MONTHS.May.toString();
		 case  5 : return MONTHS.June.toString();
		 case  6 : return MONTHS.July.toString();
		 case  7 : return MONTHS.August.toString();
		 case  8 : return MONTHS.September.toString();
		 case  9 : return MONTHS.October.toString();
		 case  10 : return MONTHS.November.toString();
		 case  11 : return MONTHS.December.toString();
		 }
		return "Unknown";
	}
	
}
