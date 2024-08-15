package pack1;

public class Circle {
    double r ;
    
    public double getArea() {
    	double a= Math.PI * r * r ;
    	return a;
    }
    
    public void setR(double r) {
    	this.r=r;
    }
    
// constructors
public Circle(double r) {
	this.r=r;
	
}
}
