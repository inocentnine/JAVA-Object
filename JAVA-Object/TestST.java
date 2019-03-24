package lab1;
import java.util.*;

public class TestST {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//学生
		System.out.println("请输入学生的编号、姓名、性别、年龄、系别、成绩：");
		int snumber=input.nextInt();
		String sname=input.next();
		char ssex=input.next().charAt(0);
		int sage=input.nextInt();
		String sdept=input.next();
		double grade=input.nextDouble();
		Student_7 student=new Student_7(snumber,sname,ssex,sage,sdept,grade);
		student.display();
		
		//老师
		System.out.println("请输入老师的编号、姓名、性别、年龄、职称、部门：");
		int tnumber=input.nextInt();
		String tname=input.next();
		char tsex=input.next().charAt(0);
		int tage=input.nextInt();
		String ttitle=input.next();
		String tdept=input.next();
		Teacher teacher=new Teacher(tnumber,tname,tsex,tage,ttitle,tdept);
		
		teacher.display();
	}

}
