package lab1;

public class NewArray {
	public static void main(String[] args)
	{
		MyArray a = new MyArray(5);
		a.init();
		a.display();
		
		SArray aa=new SArray();
		aa.sortArray();
		
		System.out.println();
		
		RArray aaa=new RArray();
		aaa.reArray();
		
		System.out.println();
		
		Ave aaaa=new Ave();
		aaaa.average();
	}
	
}

class SArray extends MyArray{
	MyArray a = new MyArray(5);
	public void sortArray() {
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

class RArray extends MyArray{
	MyArray a = new MyArray(5);
	public void reArray() {
		a.init();
		for(int i=0;i < a.length / 2;i++){
			int temp = a.alist[i];
			a.alist[i] = a.alist[a.length - 1 -i];
			a.alist[a.length - 1 -i] = temp;
		}
		System.out.print("���ú������Ϊ��");
		for(int i = 0;i < a.length;i++){
			System.out.print("\t"+a.alist[i]);
		}
	}
}

class Ave extends MyArray{
	MyArray a = new MyArray(5);
	public void average() {
		a.init();
		int sum=0;
		int ave=0;
		for(int i=0;i<a.length;i++) {
			sum+=a.alist[i];
		}
		ave=sum/a.length;
		System.out.println("�����ƽ����Ϊ��"+ave);
	}
}


