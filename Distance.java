package pack1;

public class Distance {

	public static void main(String[] args) {
               MyPoint mp=new MyPoint(0,0);
               System.out.println(mp.distance(0,0));
	}

}
class MyPoint{
	private double x;
	private double y;
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public MyPoint(){
		this(0,0);
	}
	public MyPoint(double x , double y) {
		this.x=x;
		this.y=y;
	}
	public double distance(MyPoint o) {
		return distance(o.getX(),o.getY());
	}
	public double distance(double x , double y) {
		this.x=this.x-x;
		this.y=this.y-y;
		return Math.sqrt(this.x*this.x+this.y*this.y);
	}
	
}