package ch5;

public class PowerGenerator {
	private double powerFactor; 
	private double power;
	public PowerGenerator(double powerFactor) {
		this.powerFactor = powerFactor;
		
	}
	
	public double nextPower() {
		return Math.pow(powerFactor, power );
		
	}

	public double getPowerFactor() {
		return powerFactor;
	}
	
	

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public void setPowerFactor(double powerFactor) {
		this.powerFactor = powerFactor;
	}
}
