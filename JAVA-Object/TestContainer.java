package lab1;

public class TestContainer {

	public static void main(String[] args) {
		Container cube=new Cube(5);
		Container sphere=new Sphere(5);
		Container cylinder=new Cylinder(5,8);
		System.out.println("������ı�����ǣ�"+cube.surface_area()
		+"\n"+"�����������ǣ�"+cube.volume());
		System.out.println("��ı�����ǣ�"+sphere.surface_area()
		+"\n"+"�������ǣ�"+sphere.volume());
		System.out.println("Բ����ı�����ǣ�"+cylinder.surface_area()
		+"\n"+"Բ���������ǣ�"+cylinder.volume());
	}

}
