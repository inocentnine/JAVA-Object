package lab1;

abstract class Container{
	protected double radius;
	
	public Container(double radius) {};
	
	abstract double surface_area();//计算表面积
	
	abstract double volume();//计算体积
}

