package lab1;

public class TPoint {
	private double x;
	private double y;
	private double z;
	public TPoint(){
		
	}
	public TPoint(double x,double y,double z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public double getZ() {
		return this.z;
	}
	public void setX(double a) {
		this.x=a;
	}
	public void setY(double b) {
		this.y=b;
	}
	public void setZ(double c) {
		this.z=c;
	}
	//��������֮��ľ���
	public double distance(double x1,double y1,double z1,double x2,double y2,double z2) {
		return Math.pow((Math.sqrt(Math.abs(x1-x2))+Math.sqrt(Math.abs(y1-y2))+Math.sqrt(Math.abs(z1-z2))),2);
	}
	//�ƶ��������
	public TPoint direction(String d,TPoint p) {
		if(d.charAt(0)=='L') {//����
			p.x=p.x-Integer.parseInt(d.substring(1));
		}
		if(d.charAt(0)=='R') {//����
			p.x=p.x+Integer.parseInt(d.substring(1));
		}
		if(d.charAt(0)=='F') {//ǰ��
			p.y=p.y+Integer.parseInt(d.substring(1));
		}
		if(d.charAt(0)=='B') {//����
			p.y=p.y-Integer.parseInt(d.substring(1));
		}
		if(d.charAt(0)=='U') {//����
			p.z=p.z+Integer.parseInt(d.substring(1));
		}
		if(d.charAt(0)=='D') {//����
			p.z=p.z-Integer.parseInt(d.substring(1));
		}
		return p;
	}
}
