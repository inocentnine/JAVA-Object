package lab1;

public class Sphere extends Container{

	public Sphere(double radius) {
		super(radius);
		this.radius=radius;
	}

	@Override
	double surface_area() {
		return 4*Math.PI*radius*radius;
	}

	@Override
	double volume() {
		return (4/3)*Math.PI*radius*radius*radius;
	}

}
