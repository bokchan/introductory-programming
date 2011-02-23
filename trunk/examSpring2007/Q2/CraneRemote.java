package examSpring2007.Q2;

public class CraneRemote implements Remote {
	private double x = 0;
	private double height = 0;

	
	public void up(double l) {
		// TODO Auto-generated method stub
		if (getHeight() - l >= 0) {
			setHeight(getHeight() - l);
		} else {
			// Two things can be done. The action can be refused 
			// since the difference is less than zero. Or the 
			// the height can be set to zero. 
			// This method implements the last option
			setHeight(0);
		}

	}

	public void down(double l) {
		// TODO Auto-generated method stub
		setHeight(getHeight() + l);
		

	}

	public void left(double l) {
		// TODO Auto-generated method stub
		setX(x - l);
	}

	public void right(double l) {
		// TODO Auto-generated method stub

		setX(getX() + l);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
