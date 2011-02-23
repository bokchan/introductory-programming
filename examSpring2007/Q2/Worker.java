package examSpring2007.Q2;

public class Worker {
	Remote r; 

	void passRemote(Remote r) {
		this.r = r;
	}
	void doJob() {
		r.up(10);
		r.left(90);
		r.down(10);
	}
}
