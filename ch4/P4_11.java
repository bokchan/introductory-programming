package ch4;

public class P4_11 {
	
	public P4_11() {}
	/**
	 * 
	 * @param month 
	 * @return
	 */
	public String getSeason (int month, int day) {
		String season;
		if (month < 4) {
			season = "Winter";
		} else if (3 < month && month < 7) {
			season = "Spring";
		} else if (6 < month && month < 10){
			season = "Summer";
		} else {
			season= "Autumn";
		}

		if (month % 3 == 0 && day >= 21) {
			
			if (season == "Winter") {
				 season = "Spring" ;
			}  else if (season == "Spring") { 
				season = "Summer";
			} else if (season == "Summer") {
				System.out.print("hello");
				season = "Autumn";
			} else {
				season = "Winter";
			}
		}

		return season ; 
	} 
}

