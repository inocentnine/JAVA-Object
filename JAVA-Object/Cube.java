package lab1;

public class Cube extends Container{

	public Cube(double radius) {
		super(radius);
		this.radius=radius;
	}

	@Override
	double surface_area() {
		return 6*radius*radius;
	}

	@Override
	double volume() {
		return radius*radius*radius;
	}

}
