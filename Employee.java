package pack1;

public class Employee {
	    private String eName;
		private String eJob;
		private double salary;
// Constructor:
		Employee(String eName,String eJob,double salary){
			this.eName=eName;
			this.eJob=eJob;
			this.salary=salary;
		}
		Employee(){}
//Methods:
		
		public String geteN() {
			return eName;
		}
		
		public void seteN(String eName) {
			this.eName = eName;
		}

		public String geteJ() {
			return eJob;
		}
		
		public void seteJ(String eJob) {
			this.eJob = eJob;
		}
		
		public double getS() {
			return salary;
		}
		
		public void setS(double salary) {
			this.salary = salary;
		}
		 public void raiseSalary(double percentage) {
			    salary = salary + salary * percentage / 100;
		}
}
