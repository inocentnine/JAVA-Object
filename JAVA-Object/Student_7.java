package lab1;

public class Student_7 extends Person{
	private String dept;//ϵ��
	private double grade;//�ɼ�
	
	Student_7(int num,String n,char s,int a,String d,double g){
		this.setNumber(num);
		this.setName(n);
		this.setSex(s);
		this.setAge(a);
		this.setDept(d);
		this.setGrade(g);
	}
	
	public void display() {
		System.out.println("��ѧ���ı�ţ�"+this.number);
		System.out.println("��ѧ����������"+this.name);
		System.out.println("��ѧ�����Ա�"+this.sex);
		System.out.println("��ѧ�������䣺"+this.age);
		System.out.println("��ѧ����ϵ��"+this.dept);
		System.out.println("��ѧ���ĳɼ���"+this.grade);
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
}
