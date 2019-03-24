package lab1;

public class DPoint {
	private double x;
	private double y;
	public DPoint(){
		
	}
	public DPoint(double x,double y){
		this.x=x;
		this.y=y;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public void setX(double a) {
		this.x=a;
	}
	public void setY(double b) {
		this.y=b;
	}
	//��������֮��ľ���
	public double distance(double x1,double y1,double x2,double y2) {
		return Math.pow((Math.sqrt(Math.abs(x1-x2))+Math.sqrt(Math.abs(y1-y2))),2);
	}
	//�ƶ��������
	public DPoint direction(String d,DPoint p) {
		if(d.charAt(0)=='L') {//����
			p.x=p.x-Integer.parseInt(d.substring(1));
		}
		if(d.charAt(0)=='R') {//����
			p.x=p.x+Integer.parseInt(d.substring(1));
		}
		if(d.charAt(0)=='U') {//����
			p.y=p.y+Integer.parseInt(d.substring(1));
		}
		if(d.charAt(0)=='D') {//����
			p.y=p.y-Integer.parseInt(d.substring(1));
		}
		return p;
	}
}
