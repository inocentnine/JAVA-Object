package lab1;

public class Vehicle {
	public double capacity;//�ؿ���
	public double speed;//�ٶ�
	
	public Vehicle(){
		
	}
	public Vehicle(double c,double s){
		this.capacity=c;
		this.speed=s;
	}
	
	public double getCapacity() {
		return this.capacity;
	}
	public double getSpeed() {
		return this.speed;
	}
	public void setCapacity(double c) {
		this.capacity=c;
	}
	public void setSpeed(double s) {
		this.speed=s;
	}
	
	public void run() {
		//System.out.println("�ٶ�Ϊ"+this.speed);
	}
	public void stop() {
		//System.out.println("Vehicle��ֹͣ����");
	}
}
