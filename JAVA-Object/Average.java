package lab1;

public class Average extends MyArray{
	//MyArray a = new MyArray(5);
	public void average() {
		MyArray a = new MyArray(5);
		a.init();
		int sum=0;
		int ave=0;
		for(int i=0;i<a.length;i++) {
			sum+=a.alist[i];
		}
		ave=sum/a.length;
		System.out.println("数组的平均数为："+ave);
	}
}
