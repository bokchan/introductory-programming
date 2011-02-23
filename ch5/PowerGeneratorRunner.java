package ch5;

public class PowerGeneratorRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PowerGenerator pg = new PowerGenerator(10);
		
		for (int i= 0; i< 13; i++) {
			System.out.println(pg.nextPower());
			pg.setPower(i);
		}
	}

}
