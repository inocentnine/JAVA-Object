package lab1;

public class Teacher extends Person{
	private String title;//ְ��
	private String department;//����
	
	Teacher(int num,String n,char s,int a,String t,String d){
		this.setNumber(num);
		this.setName(n);
		this.setSex(s);
		this.setAge(a);
		this.setTitle(t);
		this.setDepartment(d);
	}
	
	
	public void display() {
		System.out.println("����ʦ�ı�ţ�"+this.number);
		System.out.println("����ʦ��������"+this.name);
		System.out.println("����ʦ���Ա�"+this.sex);
		System.out.println("����ʦ�����䣺"+this.age);
		System.out.println("����ʦ��ְ�ƣ�"+this.title);
		System.out.println("����ʦ�Ĳ��ţ�"+this.department);
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
