package lab1;

public class AirVehicle extends Vehicle{
	private String kind;//���н�ͨ��������
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
		System.out.println("AirVehicle�ٶ�Ϊ"+this.speed);
	}
	public void stop() {
		System.out.println("AirVehicle��ֹͣ����");
	}
	public String getKind() {
		return kind;
	}
}
