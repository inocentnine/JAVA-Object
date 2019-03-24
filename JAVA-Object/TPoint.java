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
	//计算两点之间的距离
	public double distance(double x1,double y1,double z1,double x2,double y2,double z2) {
		return Math.pow((Math.sqrt(Math.abs(x1-x2))+Math.sqrt(Math.abs(y1-y2))+Math.sqrt(Math.abs(z1-z2))),2);
	}
	//移动点的坐标
	public TPoint direction(String d,TPoint p) {
		if(d.charAt(0)=='L') {//左移
			p.x=p.x-Integer.parseInt(d.substring(1));
		}
		if(d.charAt(0)=='R') {//右移
			p.x=p.x+Integer.parseInt(d.substring(1));
		}
		if(d.charAt(0)=='F') {//前移
			p.y=p.y+Integer.parseInt(d.substring(1));
		}
		if(d.charAt(0)=='B') {//后移
			p.y=p.y-Integer.parseInt(d.substring(1));
		}
		if(d.charAt(0)=='U') {//上移
			p.z=p.z+Integer.parseInt(d.substring(1));
		}
		if(d.charAt(0)=='D') {//下移
			p.z=p.z-Integer.parseInt(d.substring(1));
		}
		return p;
	}
}
