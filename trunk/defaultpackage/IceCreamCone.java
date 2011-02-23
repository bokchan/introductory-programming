package defaultpackage;


public class IceCreamCone {
	
	private double radius;
	private double side ;
	public IceCreamCone(double radius, double side) {
		this.radius = radius;
		this.side = side;
	} 
	
	public double getArea() {
		return Math.PI * radius * side;
		
	} 
	
	public double getVolume() {
		
		double ab = Math.pow(radius, 2)+ Math.pow(side, 2);
		double height = Math.sqrt(ab);
		double volume =  Math.PI * 1/3 * Math.pow(radius, 2) * height;
		return volume;
		
	}
}
