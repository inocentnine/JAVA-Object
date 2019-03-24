package lab1;

public class Student_7 extends Person{
	private String dept;//系别
	private double grade;//成绩
	
	Student_7(int num,String n,char s,int a,String d,double g){
		this.setNumber(num);
		this.setName(n);
		this.setSex(s);
		this.setAge(a);
		this.setDept(d);
		this.setGrade(g);
	}
	
	public void display() {
		System.out.println("该学生的编号："+this.number);
		System.out.println("该学生的姓名："+this.name);
		System.out.println("该学生的性别："+this.sex);
		System.out.println("该学生的年龄："+this.age);
		System.out.println("该学生的系别："+this.dept);
		System.out.println("该学生的成绩："+this.grade);
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
