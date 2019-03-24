package lab1;

public class TestContainer {

	public static void main(String[] args) {
		Container cube=new Cube(5);
		Container sphere=new Sphere(5);
		Container cylinder=new Cylinder(5,8);
		System.out.println("正方体的表面积是："+cube.surface_area()
		+"\n"+"正方体的体积是："+cube.volume());
		System.out.println("球的表面积是："+sphere.surface_area()
		+"\n"+"球的体积是："+sphere.volume());
		System.out.println("圆柱体的表面积是："+cylinder.surface_area()
		+"\n"+"圆柱体的体积是："+cylinder.volume());
	}

}
