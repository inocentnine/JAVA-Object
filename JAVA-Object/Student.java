package lab1;
import java.util.Scanner;

public class Student {
	private double score;//����
	private static double total_score;//�ܷ�
	private static int count;//����
	
	//Student(){}
	
	public void account(double score) {
		this.score=score;
		this.total_score+=score;
		this.count+=1;
	}
	
	public static double sum() {
		return total_score;
	}
	
	public static double average() {
		return total_score/count;
	}
	
	public static void main(String[] args) {
		Student student=new Student();
		Scanner input = new Scanner(System.in);
		System.out.println("������ȫ�������˵ĳɼ�����������,����end��������");
		while(!input.hasNext("end")) {//����end��ɳɼ�����
			double score=input.nextDouble();
			student.account(score);
		}
		System.out.println("ȫ�๲��"+student.count+"��");
		System.out.println("ȫ��ͬѧ�ĳɼ�֮�ͣ�"+student.sum());
		System.out.println("ȫ��ͬѧ��ƽ���֣�"+student.average());
	}
}
