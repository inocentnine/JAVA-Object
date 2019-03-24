package lab1;
import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		//����һ������
		Scanner input=new Scanner(System.in);
		System.out.println("������һ��������");
		int p = input.nextInt();
		if(p<=0) {
			System.exit(0);
		}
		else if(p==1) {
			System.out.println(p+"�Ȳ�������Ҳ���Ǻ���");
		}
		else {
			if(isPrimeNumber(p)) {
				System.out.println(p+"������");
			}
			else {
				System.out.println(p+"��������");
			}
		}
	}
	
	public static boolean isPrimeNumber(int number) {
		//Judge the number
		for(int div=2;(div*div)<=number;div++) {
			if (number % div == 0) {
				return false;
			}
		}
		return true;
		
	}

}
