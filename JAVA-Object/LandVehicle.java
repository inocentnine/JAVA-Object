package lab1;

public class LandVehicle extends Vehicle{
	private int wheel;//���Ӹ���
	LandVehicle(){
		
	}
	LandVehicle(int wheel){
		this.wheel=wheel;
	}
	LandVehicle(int wheel,double capacity,double speed){
		this.wheel=wheel;
		setCapacity(capacity);
		setSpeed(speed);
	}
	public int getWheel() {
		return this.wheel;
	}
	
	public void run() {
		System.out.println("LandVehicle�ٶ�Ϊ"+this.speed);
	}
	public void stop() {
		System.out.println("LandVehicle��ֹͣ����");
	}
}
