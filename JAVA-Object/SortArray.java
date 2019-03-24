package lab1;

public class SortArray extends MyArray{
	//MyArray a = new MyArray(5);
	public void sortArray() {
		MyArray a = new MyArray(5);
		a.init();
		for (int i = 0; i < a.length -1 ; i++) {
            //这个是和第一个数的比较的数
             for (int j = i+1; j < a.length; j++) {
               //定义一个临时的变量，用来交换变量
                int temp ;  
                if(a.alist[i]>a.alist[j]){
                     temp =  a.alist[i];
                     a.alist[i] = a.alist[j];
                     a.alist[j] = temp;
                }
            }
		}
		System.out.print("排序后的数组为；");
		for(int i=0;i<a.length;i++)
			System.out.print("\t"+a.alist[i]);
	}
	
}
