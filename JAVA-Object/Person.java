package lab1;

public class Person {
	public int number;
	public String name;
	public char sex;
	public int age;
	
	Person(){}
	Person(int num,String n,char s,int a){
		this.setNumber(num);
		this.setName(n);
		this.setSex(s);
		this.setAge(a);
	}
	
	public void display() {
		System.out.println("��ţ�"+this.number);
		System.out.println("������"+this.name);
		System.out.println("�Ա�"+this.sex);
		System.out.println("���䣺"+this.age);
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
