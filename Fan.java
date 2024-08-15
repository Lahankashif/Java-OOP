package pack1;

public class Fan {
	public static void main (String args[]) {
		work w = new work(true,work.medium,"yellow",15);
		System.out.println(w.toString());
//		w.setOn(true);
//        w.setSpeed(w.fast);
//        w.setColor("yellow");
//        w.setRadius(10);
//        System.out.println(w.toString());
		
	}
}
class work{
	public final static int slow = 1;
	public final static int medium = 2;
	public final static int fast = 3;
    private int speed;
    private boolean on ;
    private double radius;
    private String color;
    public String toString() {
    	if (on==true) {
    		return "Speed is : "+speed+ "\tColor is : "+color+"\tRadius is : "+radius;
    	}
    	else {
    		return "Fan is Off" + "\tColor is : "+color+"\tRadius is : "+radius      ;
    	}
    }
//	public int getSpeed() {
//		return speed;
//	}
//	public void setSpeed(int speed) {
//		this.speed = speed;
//	}
//	public boolean isOn() {
//		return on;
//	}
//	public void setOn(boolean on) {
//		this.on = on;
//	}
//	public double getRadius() {
//		return radius;
//	}
//	public void setRadius(double radius) {
//		this.radius = radius;
//	}
//	public String getColor() {
//		return color;
//	}
//	public void setColor(String color) {
//		this.color = color;
//	}
	public work(){
		this.on = false;
	    this.radius = 5;
	    this.color = "black";
	}
	public work(boolean on , int speed , String color , int radius) {
		this();
		this.on=on;
		this.speed=speed;
		
	}
}