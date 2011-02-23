package ch3;

abstract class Shape {
	public abstract double area();
	public abstract double perimeter();
	
	public Shape() {}
	
	public abstract static class Builder {}
	
	public abstract void draw();
}
