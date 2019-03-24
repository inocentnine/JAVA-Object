package lab1;

public class Vehicle {
	public double capacity;//载客量
	public double speed;//速度
	
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
		//System.out.println("速度为"+this.speed);
	}
	public void stop() {
		//System.out.println("Vehicle已停止运行");
	}
}
