package lab1;

public class MyArray{
	protected int[] alist;
	protected int length;
	
	public MyArray(){
		
	}
	
	public MyArray(int leng)
	{
		if(leng<=0)
		{
			System.out.println("error length");
    		System.exit(1);
		}
    	alist=new int [leng];
    	length=leng;
    	//System.out.println("MyArray ������Ѵ�����");
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
		System.out.print("MyArray�е�Ԫ��Ϊ��");
		for(i=0;i<length;i++)
			System.out.print(alist[i]+"\t");
		System.out.println();
	}
}

