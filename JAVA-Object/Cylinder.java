package lab1;

public class Cylinder extends Container{
	private double h;
	
	public Cylinder(double radius,double h) {
		super(radius);
		this.radius=radius;
		this.h=h;
	}

	@Override
	double surface_area() {
		return 2*Math.PI*radius*radius+2*Math.PI*radius*h;
	}

	@Override
	double volume() {
		return Math.PI*radius*radius*h;
	}

}
