package lab1;

public class Teacher extends Person{
	private String title;//职称
	private String department;//部门
	
	Teacher(int num,String n,char s,int a,String t,String d){
		this.setNumber(num);
		this.setName(n);
		this.setSex(s);
		this.setAge(a);
		this.setTitle(t);
		this.setDepartment(d);
	}
	
	
	public void display() {
		System.out.println("该老师的编号："+this.number);
		System.out.println("该老师的姓名："+this.name);
		System.out.println("该老师的性别："+this.sex);
		System.out.println("该老师的年龄："+this.age);
		System.out.println("该老师的职称："+this.title);
		System.out.println("该老师的部门："+this.department);
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}
}
