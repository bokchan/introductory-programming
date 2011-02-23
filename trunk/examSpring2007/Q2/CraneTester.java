package examSpring2007.Q2;

public class CraneTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCrane k = new MyCrane();
		Worker w = new Worker();
		w.passRemote(k.getRemote());
		w.doJob();
		
		CraneRemote r = (CraneRemote) k.getRemote();
		System.out.println(r.getHeight());
		System.out.println(r.getX());

	}

}
