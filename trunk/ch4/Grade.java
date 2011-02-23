package ch4;

public class Grade {
	String grade;
	PRIMARYGRADE primaryGrade; 

	enum PRIMARYGRADE {
		A,B, C, D,F
	} 

	public double getNumericValue() {
		String strGrade;
		
		double score = 0.0;
		char[] charArray = this.grade.toCharArray();
		strGrade = String.valueOf(charArray[0]);
		score += getGradeValue(strGrade);
		
		if (charArray.length== 2) {
			String modifier;
			modifier = String.valueOf(charArray[1]);
			score += getModifierValue(modifier);
		}

		return score;
	}

	public int getGradeValue(String s) {
		if (s.toUpperCase().equals(PRIMARYGRADE.A.toString())) return 4;
		if (s.toUpperCase().equals(PRIMARYGRADE.B.toString())) return 3;
		if (s.toUpperCase().equals(PRIMARYGRADE.C.toString())) return 2;
		if (s.toUpperCase().equals(PRIMARYGRADE.D.toString())) return 1;
		if (s.toUpperCase().equals(PRIMARYGRADE.F.toString())) return 0;
		return -1;
	}

	public double getModifierValue(String s) {
		if (s.toUpperCase() != PRIMARYGRADE.F.toString()) {
			if (s == "-") {
				return -0.3;
			} else {
				return  0.3;
			}
		} else {
			return 0;
		}

	}


	public Grade(String grade) {

		this.grade = grade; 

	}
}