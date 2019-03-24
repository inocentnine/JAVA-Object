package lab1;

public class WaterVehicle extends Vehicle{
	private double weight;//可载重
	WaterVehicle(){
		
	}
	WaterVehicle(double weight){
		this.weight=weight;
	}
	WaterVehicle(int wheel,double capacity,double weight){
		this.weight=weight;
		setCapacity(capacity);
		setSpeed(speed);
	}
	public void run() {
		System.out.println("WaterVehicle速度为"+this.speed);
	}
	public void stop() {
		System.out.println("WaterVehicle已停止运行");
	}
	public double getWeight() {
		return weight;
	}
}
