package pack1;

public class Quadratic {

	public static void main(String[] args) {
    qe qe =new qe(3,4,2);
    System.out.println("Quadratic Function Executing");
    System.out.println(qe.getDiscriminant());
    System.out.println(qe.getR1());
    System.out.println(qe.getR2());
    
	}

}
class qe{
	private double a;
	private double b;
	private double c;
	public qe(double a , double b , double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public qe() {
		System.out.println("Enter Coefficients Please :)");
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public double getDiscriminant() {
		return Math.pow(b, 2) - 4*a*c ;
	}
	public String getR1() {
		double discriminant = getDiscriminant();
		double root1=discriminant > 0 ? (-b + Math.pow((discriminant),1/2)) / (2 * a) : 0;
		 return "Root 1 is : " + root1;
	}
	public String getR2() {
		double discriminant = getDiscriminant();
		double root2= discriminant > 0 ? (-b - Math.pow((discriminant),1/2)) / (2 * a): 0;
		 return "Root 2 is : " + root2;

	}
}