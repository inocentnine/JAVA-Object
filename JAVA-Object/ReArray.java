package lab1;

public class ReArray extends MyArray{
	//MyArray a = new MyArray(5);
	public void reArray() {
		MyArray a = new MyArray(5);
		a.init();
		for(int i=0;i < a.length / 2;i++){
			int temp = a.alist[i];
			a.alist[i] = a.alist[a.length - 1 -i];
			a.alist[a.length - 1 -i] = temp;
		}
		System.out.print("倒置后的数组为；");
		for(int i = 0;i < a.length;i++){
			System.out.print("\t"+a.alist[i]);
		}
	}
}
