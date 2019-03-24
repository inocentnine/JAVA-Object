package lab1;
import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		//输入一个整数
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int p = input.nextInt();
		if(p<=0) {
			System.exit(0);
		}
		else if(p==1) {
			System.out.println(p+"既不是素数也不是合数");
		}
		else {
			if(isPrimeNumber(p)) {
				System.out.println(p+"是素数");
			}
			else {
				System.out.println(p+"不是素数");
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
