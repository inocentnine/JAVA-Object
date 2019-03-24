package lab1;
import java.util.Scanner;

public class Student {
	private double score;//分数
	private static double total_score;//总分
	private static int count;//人数
	
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
		System.out.println("请输入全班所有人的成绩（换行输入,输入end结束）：");
		while(!input.hasNext("end")) {//输入end完成成绩输入
			double score=input.nextDouble();
			student.account(score);
		}
		System.out.println("全班共有"+student.count+"人");
		System.out.println("全班同学的成绩之和："+student.sum());
		System.out.println("全班同学的平均分："+student.average());
	}
}
