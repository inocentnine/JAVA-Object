package lab1;

public class SortArray extends MyArray{
	//MyArray a = new MyArray(5);
	public void sortArray() {
		MyArray a = new MyArray(5);
		a.init();
		for (int i = 0; i < a.length -1 ; i++) {
            //����Ǻ͵�һ�����ıȽϵ���
             for (int j = i+1; j < a.length; j++) {
               //����һ����ʱ�ı�����������������
                int temp ;  
                if(a.alist[i]>a.alist[j]){
                     temp =  a.alist[i];
                     a.alist[i] = a.alist[j];
                     a.alist[j] = temp;
                }
            }
		}
		System.out.print("����������Ϊ��");
		for(int i=0;i<a.length;i++)
			System.out.print("\t"+a.alist[i]);
	}
	
}
