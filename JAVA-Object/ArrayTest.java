package lab1;

public class ArrayTest {
	public static void main(String[] args)
	{
		MyArray a = new MyArray(5);
		a.init();
		a.display();
		
		SortArray aa=new SortArray();
		aa.sortArray();
		
		System.out.println();
		
		ReArray aaa=new ReArray();
		aaa.reArray();
		
		System.out.println();
		
		Average aaaa=new Average();
		aaaa.average();
	}
}