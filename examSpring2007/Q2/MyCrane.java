package examSpring2007.Q2;

public class MyCrane implements Crane{
	Remote r;
	public Remote getRemote() {
		// TODO Auto-generated method stub
		if (r != null) {
			return r; 
		} else {
		r = new CraneRemote();
		return r;
		} 
	} 
}
