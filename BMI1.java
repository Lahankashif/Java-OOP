package pack1;

public class BMI1 {

	public static void main(String[] args) {
		bmi bmi1 = new bmi("Kim Yang", 18, 145, 70);
		 System.out.println("The BMI for " + bmi1.getName() + " is "
		  + bmi1.getBMI() + " " + bmi1.getStatus());
		 
		  bmi bmi2 = new bmi("Susan King", 215, 70);
		  System.out.println("The BMI for " + bmi2.getName() + " is "
		  + bmi2.getBMI() + " " + bmi2.getStatus());
	}

}
class bmi{
	private String name;
	private int age;
	private double height;
	private double weight;
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
public double getHeight() {
	return height;
}
public double getWeight() {
	return weight;
}
public static final double KILOGRAMS_PER_POUND = 0.45359237;
public static final double METERS_PER_INCH = 0.0254;

public bmi(String name, double weight, double height) {
    this(name, 20, weight, height); // Calling another constructor
}

// Constructor with name, age, weight, and height
public bmi(String name, int age, double weight, double height) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.height = height;
}
	
	
	
	 public double getBMI() {
	 double bmi = weight * KILOGRAMS_PER_POUND / 
	 ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
	 return Math.round(bmi * 100) / 100.0;
	 }
	
	 public String getStatus() {
	 double bmi = getBMI();
	 if (bmi < 18.5)
	 return "Underweight";
	 else if (bmi < 25)
	 return "Normal";
	 else if (bmi < 30)
	 return "Overweight";
	 else
	 return "Obese";
	 }
}
