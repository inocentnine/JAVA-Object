# JAVA-Object

  1、熟悉在Eclipse环境下开发java应用，编译执行“java实验（第三周）.rar”中的代码。
  
  2、编写程序，设计一个判别素数的函数，每次在主函数中输入一个整数，调用这个判别函数，并输出是否为素数的信息，当某次输入的整数是小于等于0的数时退出该程序。
  
  3、定义一个二维坐标内的点类DPoint，模拟实现对点的坐标的设置、读取，在坐标上移动点及计算两个点之间的距离的功能。
  
  4、在3的基础上，定义一个三维坐标内的点类TPoint，模拟实现对点的坐标的设置、读取，在坐标上移动点及计算两个点之间的距离的功能。 
  
  5、声明一个交通工具类，描述它们的一些特性，由此派生出陆地交通工具类、空中交通工具类、及水上交通工具类，并编写成员函数描述它的一些基本功能。
  
  6、声明一个Student类，在该类中包括一个数据成员score（分数）、两个静态数据成员total_score（总分）和count（学生人数）；还包括一个成员函数
account（）用于设置分数、累计学生的成绩之和、累计学生人数，一个静态成员函数sum（）用于返回学生的成绩之和，另一个静态成员函数average（）用于求全部成绩的平均值。在main函数中，输入某班同学的成绩，并调用上述函数求出全班同学的成绩之和和平均分。

  7、编写一个学生和教师的数据输入和显示程序。学生数据有编号、姓名、性别、年龄、系别和成绩，教师数据有编号、姓名、性别、年龄、职称和部门。要求将编号、姓名、性别、年龄的输入和显示设计成一个类Person，并作为学生类Student和教师类Teacher的基类。
  
  8、按要求阅读、编辑、编译、调试和运行以下程序。
  
（1）阅读、编辑、编译、调试和运行以下程序，并写出程序运行结果。

public class MyArray{

public MyArray(int leng)

{

		if(leng<=0)
		
		{
		
			System.out.println("error length");
			
    		System.exit(1);
		
}

    	alist=new int [leng];
	
    	length=leng;
	
    	System.out.println("MyArray 类对象已创建。");
	
}

public void init()

{

		int i;
		
		for(i=0;i<length;i++)
		
		alist[i] = length - i;
		
}

public void display()

{

		int i;
		
		System.print("MyArray中的元素为：");
		
		for(i=0;i<length;i++)
		
			System.out.print(“\t d”, alist[i]);
			
		System.out.println();
	
}

protected int *alist;

protected int length;

}

public class ArrayTest

{

public static void main()

{

		MyArray a = new MyArray(5);
		
		a.input();
		
		a.display();
		
}

}


（2）声明一个类SortArray继承类MyArray，在该类中定义一个函数，具有将数组中元素从小到大进行排序的功能。

【提示】：请注意编写继承类的构造函数、析构函数，以及修改主函数。

（3）声明一个类ReArray继承类MyArray，在该类中定义一个函数，即有将数组中的元素进行倒置的功能。

【提示】：请注意编写继承类的构造函数、析构函数，以及修改主函数。

（4）声明一个类Average继承类MyArray，在该类中定义一个函数，即有将输入的整数进行求平均值的功能。

【提示】：请注意编写基继承类的构造函数、析构函数，以及修改主函数。

（5）声明一个NewArray类，复用已有类SortArray，ReArray和Average的代码，使得NewArray对象同时具有排序、倒置和求平均值的功能。

  9、给出下面的抽象基类container。
  
abstract class Container{

protected double radius;

public Container(double radius);

abstact double surface_area();

abstract	double volume();

};

  建立3个继承Container的派生类Cube、Sphere与Cylinder，让每一个派生类都包含抽象函数surface_area（）和volume（），分别用来计算正方体、球体和圆柱体的表面积及体积。
