package lab1;

public class WaterVehicle extends Vehicle{
	private double weight;//������
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
		System.out.println("WaterVehicle�ٶ�Ϊ"+this.speed);
	}
	public void stop() {
		System.out.println("WaterVehicle��ֹͣ����");
	}
	public double getWeight() {
		return weight;
	}
}
