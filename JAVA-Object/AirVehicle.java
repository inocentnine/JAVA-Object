package lab1;

public class AirVehicle extends Vehicle{
	private String kind;//空中交通工具类型
	AirVehicle(){
		
	}
	AirVehicle(String kind){
		this.kind=kind;
	}
	AirVehicle(int wheel,double capacity,String kind){
		this.kind=kind;
		setCapacity(capacity);
		setSpeed(speed);
	}
	public void run() {
		System.out.println("AirVehicle速度为"+this.speed);
	}
	public void stop() {
		System.out.println("AirVehicle已停止运行");
	}
	public String getKind() {
		return kind;
	}
}
