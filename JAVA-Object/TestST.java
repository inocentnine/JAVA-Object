package lab1;
import java.util.*;

public class TestST {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//ѧ��
		System.out.println("������ѧ���ı�š��������Ա����䡢ϵ�𡢳ɼ���");
		int snumber=input.nextInt();
		String sname=input.next();
		char ssex=input.next().charAt(0);
		int sage=input.nextInt();
		String sdept=input.next();
		double grade=input.nextDouble();
		Student_7 student=new Student_7(snumber,sname,ssex,sage,sdept,grade);
		student.display();
		
		//��ʦ
		System.out.println("��������ʦ�ı�š��������Ա����䡢ְ�ơ����ţ�");
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
